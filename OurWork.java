package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OurWork {

	private JFrame frmOurWork;

	/**
	 * Launch the application.
	 */
	public static void Work() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OurWork window = new OurWork();
					window.frmOurWork.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OurWork() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOurWork = new JFrame();
		frmOurWork.getContentPane().setBackground(new Color(128, 0, 0));
		frmOurWork.setTitle("Our Work");
		frmOurWork.setBounds(100, 100, 1132, 780);
		frmOurWork.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOurWork.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wedding Event");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(28, 10, 159, 27);
		frmOurWork.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(OurWork.class.getResource("/images/wedding-event-management-500x500.jpg")));
		lblNewLabel_1.setBounds(28, 62, 383, 306);
		frmOurWork.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(OurWork.class.getResource("/images/event-management-500x500.jpg")));
		lblNewLabel_2.setBounds(541, 62, 394, 306);
		frmOurWork.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm=new Home();
				hm.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(962, 570, 85, 21);
		frmOurWork.getContentPane().add(btnNewButton);
	}
}
