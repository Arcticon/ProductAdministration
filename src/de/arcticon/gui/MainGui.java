package de.arcticon.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import de.arcticon.clients.Client;
import de.arcticon.connection.ConnectionHandler;

public class MainGui extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public MainGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea ta_01 = new JTextArea();
		ta_01.setEditable(false);
		//txtrAsdf.setText("");
		contentPane.add(ta_01, BorderLayout.CENTER);
		
		JButton btnTest = new JButton("Test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConnectionHandler ch = new ConnectionHandler();
				Connection con = ch.buildConnection("62.75.209.133", "Github", "github", "github");
				Statement stmt = ch.buildStatement(con);
				ResultSet rs = ch.buildResultSet(stmt, "Select * From Clients");
				
				ta_01.setText("");
				
				try {
					while(rs.next()){
						ta_01.setText(ta_01.getText() + new Client(rs.getShort(1),rs.getString(1),rs.getString(2)).toString() + "\n");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		});
		contentPane.add(btnTest, BorderLayout.NORTH);
		
	}

}
