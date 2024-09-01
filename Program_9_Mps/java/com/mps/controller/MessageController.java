package com.mps.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mps.dao.MessageDAO;
import com.mps.model.Message;

@WebServlet("/MessageController")
public class MessageController extends HttpServlet {

    private MessageDAO messageDAO;

    public void init() {
        messageDAO = new MessageDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String msg = request.getParameter("msg");
        int uid = Integer.parseInt(request.getParameter("uid"));

        Message message = new Message();
        message.setFrom(from);
        message.setTo(to);
        message.setMsg(msg);
        message.setUid(uid);

        try {
            messageDAO.addMessage(message);
            RequestDispatcher dispatcher = request.getRequestDispatcher("MessageView.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
