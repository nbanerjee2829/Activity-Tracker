package signIn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import java.awt.List;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.Scrollbar;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class ProfilePage2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfilePage2 frame = new ProfilePage2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProfilePage2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 224, 715);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(22, 32, 131, 31);
		panel.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(0, 0, 0));
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEmail.setBounds(22, 76, 131, 31);
		panel.add(lblEmail);
		
		Button AddDevice = new Button("Add Device");
		AddDevice.setForeground(new Color(0, 0, 0));
		AddDevice.setFont(new Font("Dialog", Font.PLAIN, 15));
		AddDevice.setBounds(29, 613, 166, 31);
		panel.add(AddDevice);
		AddDevice.setBackground(new Color(250, 128, 114));
		
		Button Import = new Button("Import");
		Import.setFont(new Font("Dialog", Font.PLAIN, 15));
		Import.setForeground(new Color(0, 0, 0));
		Import.setBackground(new Color(250, 128, 114));
		Import.setBounds(29, 662, 166, 31);
		panel.add(Import);
		
		JLabel lblSearchFriends = new JLabel("Search Friends");
		lblSearchFriends.setForeground(new Color(0, 0, 0));
		lblSearchFriends.setFont(new Font("Arial", Font.BOLD, 13));
		lblSearchFriends.setBounds(0, 244, 131, 24);
		panel.add(lblSearchFriends);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setBounds(0, 269, 212, 31);
		panel.add(textField);
		textField.setColumns(10);
		
		Button Search = new Button("Search");
		Search.setForeground(Color.BLACK);
		Search.setFont(new Font("Dialog", Font.PLAIN, 15));
		Search.setBackground(new Color(250, 128, 114));
		Search.setBounds(0, 306, 117, 31);
		panel.add(Search);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(ProfilePage2.class.getResource("/images/2345.jpg")));
		lblNewLabel_1.setBounds(-301, 0, 525, 715);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(78, 0, 46, 14);
		panel.add(lblNewLabel_3);
		
		JCheckBox addedButton = new JCheckBox("");
		addedButton.setBounds(6, 0, 97, 23);
		addedButton.setVisible(false);
		addedButton.setSelected(false);
		panel.add(addedButton);
		
		JCheckBox addedButton1 = new JCheckBox("");
		addedButton1.setBounds(6, 0, 97, 23);
		addedButton1.setVisible(false);
		addedButton1.setSelected(false);
		panel.add(addedButton1);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(224, 0, 663, 156);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Button DataButton1 = new Button("Import Data");
		DataButton1.setForeground(Color.WHITE);
		DataButton1.setFont(new Font("Kristen ITC", Font.BOLD, 15));
		DataButton1.setBackground(new Color(250, 128, 114));
		DataButton1.setBounds(766, 163, 95, 35);
		DataButton1.setVisible(false);
		contentPane.add(DataButton1);
		
		Button DataButton = new Button("Import Data");
		DataButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addedButton.setSelected(true);
				addedButton1.setSelected(true);
				DataButton.setVisible(false);
				JOptionPane.showMessageDialog(null, "Import Success");
			}
		});
		DataButton.setForeground(Color.WHITE);
		DataButton.setFont(new Font("Kristen ITC", Font.BOLD, 15));
		DataButton.setBackground(new Color(250, 128, 114));
		DataButton.setBounds(461, 455, 196, 60);
		DataButton.setVisible(false);
		contentPane.add(DataButton);
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setBounds(230, 223, 647, 226);
		//lblNewLabel_4.setIcon(new ImageIcon(ProfilePage2.class.getResource("/images/Walking.JPG")));
		lblNewLabel_4.setVisible(false);
		contentPane.add(lblNewLabel_4);
		
		
		Button Walking = new Button("Walking");
		Walking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Walking.setBackground(new Color(255,88,79));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Walking.setBackground(new Color(255, 228, 181));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (addedButton.isSelected() == true) {
					lblNewLabel_4.setVisible(true);
					lblNewLabel_4.setIcon(new ImageIcon(ProfilePage2.class.getResource("/images/Walking.JPG")));
					DataButton1.setVisible(true);
				}else
					DataButton.setVisible(true);
					
			}
		});
		Walking.setBounds(32, 21, 102, 99);
		panel_1.add(Walking);
		Walking.setFont(new Font("Kristen ITC", Font.BOLD, 15));
		Walking.setBackground(new Color(255, 228, 181));
		
		Button Biking = new Button("Biking");
		Biking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Biking.setBackground(new Color(255,88,79));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Biking.setBackground(new Color(255, 228, 181));
			}
			public void mouseClicked(MouseEvent arg0) {
				if (addedButton1.isSelected() == true) {
					lblNewLabel_4.setVisible(true);
					lblNewLabel_4.setIcon(new ImageIcon(ProfilePage2.class.getResource("/images/Biking.JPG")));
					DataButton1.setVisible(true);
				}else
					DataButton.setVisible(true);
			}
		});
		Biking.setFont(new Font("Kristen ITC", Font.BOLD, 15));
		Biking.setBackground(new Color(255, 228, 181));
		Biking.setBounds(165, 21, 102, 99);
		panel_1.add(Biking);
		
		Button AddActivity = new Button("+");
		AddActivity.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				AddActivity.setBackground(new Color(255,88,79));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				AddActivity.setBackground(new Color(255, 228, 181));
			}
		});
		AddActivity.setFont(new Font("Kristen ITC", Font.BOLD, 23));
		AddActivity.setBackground(new Color(255, 228, 181));
		AddActivity.setBounds(300, 21, 102, 99);
		panel_1.add(AddActivity);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setOrientation(Scrollbar.HORIZONTAL);
		scrollbar.setBounds(0, 135, 663, 21);
		scrollbar.setVisible(false);
		panel_1.add(scrollbar);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(ProfilePage2.class.getResource("/images/666.jpg")));
		lblNewLabel_2.setBounds(-132, 0, 827, 155);
		panel_1.add(lblNewLabel_2);
		


		

	}
}
