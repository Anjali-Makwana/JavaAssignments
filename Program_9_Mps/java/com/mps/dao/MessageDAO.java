package com.mps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mps.model.Message;
import com.mps.util.DBConnection;

public class MessageDAO {

    public void addMessage(Message message) throws SQLException {
        Connection con = DBConnection.getConnection();
        String query = "INSERT INTO messages (`from`, `to`, msg, uid) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, message.getFrom());
        ps.setString(2, message.getTo());
        ps.setString(3, message.getMsg());
        ps.setInt(4, message.getUid());
        ps.executeUpdate();
    }
}
