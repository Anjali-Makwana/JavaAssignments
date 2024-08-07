package module_3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class RegistrationForm extends JFrame {

    private JTextField idField, nameField, addressField, contactField;
    private JRadioButton maleButton, femaleButton;
    private JButton registerButton, updateButton, deleteButton, resetButton, refreshButton, exitButton;
    private JTable dataTable;
    private DefaultTableModel tableModel;
    private int selectedRow = -1;
    private ButtonGroup genderGroup;
    private Connection connection;

    public RegistrationForm() {
       
    	// Initialize database connection
        initializeDB();

        setTitle("Registration Form");
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(6, 2, 5, 5));

        formPanel.add(new JLabel("ID:"));
        idField = new JTextField();
        formPanel.add(idField);

        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        formPanel.add(genderPanel);

        formPanel.add(new JLabel("Address:"));
        addressField = new JTextField();
        formPanel.add(addressField);

        formPanel.add(new JLabel("Contact:"));
        contactField = new JTextField();
        formPanel.add(contactField);

        // Create button panel
        JPanel buttonPanel = new JPanel(new FlowLayout());

        registerButton = new JButton("Register");
        buttonPanel.add(registerButton);

        updateButton = new JButton("Update");
        buttonPanel.add(updateButton);

        deleteButton = new JButton("Delete");
        buttonPanel.add(deleteButton);

        resetButton = new JButton("Reset");
        buttonPanel.add(resetButton);

        exitButton = new JButton("Exit");
        buttonPanel.add(exitButton);

        // Create table
        String[] columns = {"S.No", "ID", "Name", "Gender", "Address", "Contact"};
        tableModel = new DefaultTableModel(columns, 0);
        dataTable = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(dataTable);

        // Create refresh button
        refreshButton = new JButton("Refresh Table");
        
        // Create main panel for form and buttons
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(formPanel);
        mainPanel.add(buttonPanel);

        add(mainPanel, BorderLayout.NORTH);
        add(tableScrollPane, BorderLayout.CENTER);
        add(refreshButton, BorderLayout.SOUTH);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();
                String gender = maleButton.isSelected() ? "Male" : "Female";
                String address = addressField.getText();
                String contact = contactField.getText();

                if (id.isEmpty() || name.isEmpty() || address.isEmpty() || contact.isEmpty()) {
                    JOptionPane.showMessageDialog(RegistrationForm.this, "Please fill all fields.");
                    return;
                }

                try {
                    String query = "INSERT INTO registrations (id, name, gender, address, contact) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement statement = connection.prepareStatement(query);
                    statement.setInt(1, Integer.parseInt(id));
                    statement.setString(2, name);
                    statement.setString(3, gender);
                    statement.setString(4, address);
                    statement.setString(5, contact);
                    statement.executeUpdate();

                    loadTableData();
                    clearForm();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedRow != -1) {
                    String id = idField.getText();
                    String name = nameField.getText();
                    String gender = maleButton.isSelected() ? "Male" : "Female";
                    String address = addressField.getText();
                    String contact = contactField.getText();

                    try {
                        String query = "UPDATE registrations SET name=?, gender=?, address=?, contact=? WHERE id=?";
                        PreparedStatement statement = connection.prepareStatement(query);
                        statement.setString(1, name);
                        statement.setString(2, gender);
                        statement.setString(3, address);
                        statement.setString(4, contact);
                        statement.setInt(5, Integer.parseInt(id));
                        statement.executeUpdate();

                        loadTableData();
                        clearForm();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedRow != -1) {
                    String id = tableModel.getValueAt(selectedRow, 1).toString();
                    try {
                        String query = "DELETE FROM registrations WHERE id=?";
                        PreparedStatement statement = connection.prepareStatement(query);
                        statement.setInt(1, Integer.parseInt(id));
                        statement.executeUpdate();

                        loadTableData();
                        clearForm();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadTableData();
            }
        });

        // Table selection listener
        dataTable.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && dataTable.getSelectedRow() != -1) {
                selectedRow = dataTable.getSelectedRow();
                idField.setText(tableModel.getValueAt(selectedRow, 1).toString());
                nameField.setText(tableModel.getValueAt(selectedRow, 2).toString());
                String gender = tableModel.getValueAt(selectedRow, 3).toString();
                if (gender.equals("Male")) {
                    maleButton.setSelected(true);
                } else {
                    femaleButton.setSelected(true);
                }
                addressField.setText(tableModel.getValueAt(selectedRow, 4).toString());
                contactField.setText(tableModel.getValueAt(selectedRow, 5).toString());
            }
        });

        // Load initial data
        loadTableData();
    }

    private void initializeDB() {
        try {
            String url = "jdbc:mysql://localhost:3306/anjalidb";
            String username = "root";
            String password = "root";

            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadTableData() {
        SwingUtilities.invokeLater(() -> {
            try {
                tableModel.setRowCount(0);
                String query = "SELECT * FROM registrations";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                int serialNo = 1;
                while (resultSet.next()) {
                    Object[] row = {
                        serialNo++,
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("gender"),
                        resultSet.getString("address"),
                        resultSet.getString("contact")
                    };
                    tableModel.addRow(row);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }

    private void clearForm() {
        idField.setText("");
        nameField.setText("");
        genderGroup.clearSelection();
        addressField.setText("");
        contactField.setText("");
        dataTable.clearSelection();
        selectedRow = -1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistrationForm form = new RegistrationForm();
            form.setVisible(true);
        });
    }
}
