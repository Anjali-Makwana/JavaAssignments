package com.mps.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mps.model.User;
import com.mps.util.DBConnection;

public class UserDAO {

    public void addUser(User user) throws SQLException {
        Connection con = DBConnection.getConnection();
        String query = "INSERT INTO users (fname, lname, email, mobile) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, user.getFname());
        ps.setString(2, user.getLname());
        ps.setString(3, user.getEmail());
        ps.setString(4, user.getMobile());
        ps.executeUpdate();
    }

    public User getUserByEmail(String email) throws SQLException {
        Connection con = DBConnection.getConnection();
        String query = "SELECT * FROM users WHERE email = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            User user = new User();
            user.setUid(rs.getInt("uid"));
            user.setFname(rs.getString("fname"));
            user.setLname(rs.getString("lname"));
            user.setEmail(rs.getString("email"));
            user.setMobile(rs.getString("mobile"));
            return user;
        }
        return null;
    }
}