package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Choice;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Booking {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void Book() {                                                                                                                                                                                              
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking window = new Booking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1125, 764);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(219, 112, 147));
		panel.setBounds(0, 0, 1111, 75);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(33, 162, 83, 31);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(184, 162, 229, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gender");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(33, 226, 83, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton female = new JRadioButton("Female");
		female.addActionListener(new ActionListener() {
			private AbstractButton male;

			public void actionPerformed(ActionEvent e) {
				if(female.isSelected())
				{
					male.setSelected(false);
				}
			}
		});
		female.setFont(new Font("Tahoma", Font.PLAIN, 15));
		female.setBounds(310, 232, 103, 21);
		frame.getContentPane().add(female);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(33, 300, 83, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(184, 309, 310, 165);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Contact No");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(33, 518, 103, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(184, 518, 229, 31);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Event Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(554, 162, 145, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Event Venue");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(554, 226, 119, 31);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(746, 226, 229, 46);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Start Date");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setBounds(554, 340, 119, 31);
		frame.getContentPane().add(lblNewLabel_6);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(746, 340, 212, 31);
		frame.getContentPane().add(dateChooser);
		
		JLabel lblNewLabel_7 = new JLabel("End Date");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_7.setBounds(554, 439, 119, 31);
		frame.getContentPane().add(lblNewLabel_7);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(746, 439, 212, 31);
		frame.getContentPane().add(dateChooser_1);
		
		JRadioButton male = new JRadioButton("Male");
		male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(male.isSelected())
				{
					female.setSelected(false);
				}
			}
		}
			);
		male.setFont(new Font("Tahoma", Font.PLAIN, 15));
		male.setBounds(191, 236, 103, 21);
		frame.getContentPane().add(male);
		
		JLabel lblNewLabel_8 = new JLabel("Mehedi Artist");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8.setBounds(554, 518, 131, 31);
		frame.getContentPane().add(lblNewLabel_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Wedding Party", "Birthday Party", "Mehendi ", "Cultuaral Program", "Receiption"}));
		comboBox.setBounds(746, 162, 212, 31);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"None", "Mehedi arts by shima", "Mehedi arts by Jinia", "Mehedi Artist Nowrin"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setBounds(746, 518, 212, 31);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_9 = new JLabel("Photographer");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_9.setBounds(554, 583, 145, 31);
		frame.getContentPane().add(lblNewLabel_9);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"None", "Photoland BD", "Art maker Photography", "Dream Wedding Bangladesh"}));
		comboBox_2.setBounds(746, 583, 212, 31);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(56, 657, 93, 31);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_10 = new JLabel("Booking");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_10.setBounds(478, 85, 276, 55);
		frame.getContentPane().add(lblNewLabel_10);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chome ch=new Chome();
				ch.Client();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(957, 657, 85, 29);
		frame.getContentPane().add(btnNewButton_1);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
