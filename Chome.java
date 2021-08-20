package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Chome {

	private JFrame frmClientHome;

	/**
	 * Launch the application.
	 */
	public static void Client() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chome window = new Chome();
					window.frmClientHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Chome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClientHome = new JFrame();
		frmClientHome.setTitle("Client Home");
		frmClientHome.setBounds(100, 100, 1121, 711);
		frmClientHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClientHome.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Registration for Booking ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Booking bk=new Booking();
				bk.Book();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(99, 131, 241, 137);
		frmClientHome.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Package");
		btnNewButton_1.setBackground(new Color(128, 0, 0));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(431, 131, 241, 137);
		frmClientHome.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mehedi Artist");
		btnNewButton_2.setBackground(new Color(128, 0, 0));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(768, 131, 241, 137);
		frmClientHome.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Photographer");
		btnNewButton_3.setBackground(new Color(128, 0, 0));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(99, 361, 241, 137);
		frmClientHome.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Log Out");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm=new Home();
				hm.main(null);
			}
		});
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(936, 588, 106, 30);
		frmClientHome.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Chome.class.getResource("/images/event-management.jpg")));
		lblNewLabel.setBounds(0, 0, 1107, 674);
		frmClientHome.getContentPane().add(lblNewLabel);
	}

}
