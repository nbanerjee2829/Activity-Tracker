package signIn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.UIManager;
import java.awt.TextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JProgressBar;
import java.awt.Label;

public class Home extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	int xx,xy;
	private JTextField Username_f;
	private Manager manager = new Manager();
	/**
	 *
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setUndecorated(false);
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
	public Home() {
		setResizable(false);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 750);
		contentPane = new JPanel();
		
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 304, 715);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ACTIVITY TRACKER");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Jokerman", Font.BOLD, 22));
		lblNewLabel.setBounds(24, 542, 280, 53);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		
		
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx=e.getX();
				xy=e.getY();
			}
		});
		lblNewLabel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x=arg0.getXOnScreen();
				int y= arg0.getYOnScreen();
				Home.this.setLocation(x-xx,y-xy);
			}
		});
		
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/images/222.jpg")));
		lblNewLabel_1.setBounds(0, 0, 341, 459);
		panel.add(lblNewLabel_1);
		
		//SIGN IN BUTTON
		Button login = new Button("Log In");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				String user = Username_f.getText();
				String pas = passwordField.getPassword().toString();
				boolean b = manager.accessUser(user, pas);
				
				if(b == true) {
					JFrame signin = new ProfilePage2();
					signin.setVisible(true);
					setVisible(false);
				}
				else {
					System.out.print("error");
					JOptionPane.showMessageDialog(null, "Invalid username or password");
				}

			}
		});
		login.setFont(new Font("Dialog", Font.BOLD, 15));
		login.setForeground(new Color(255, 255, 255));
		login.setBackground(new Color(250, 128, 114));
		login.setBounds(449, 447, 196, 50);
		contentPane.add(login);
		
		Username_f = new JTextField();
		Username_f.setBounds(435, 267, 221, 32);
		contentPane.add(Username_f);
		Username_f.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Password");
		passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
		passwordField.setBounds(435, 369, 221, 32);
		contentPane.add(passwordField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.BOLD, 13));
		lblUsername.setBounds(435, 230, 87, 24);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 13));
		lblPassword.setBounds(435, 332, 87, 24);
		contentPane.add(lblPassword);
		
		Button signUp = new Button("Sign up");
		signUp.setBackground(new Color(250, 128, 114));
		signUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFrame signUp = new Registration();
				signUp.setVisible(true);
				setVisible(false);
			}
		});
		signUp.setFont(new Font("Dialog", Font.BOLD, 12));
		signUp.setForeground(new Color(255, 255, 255));
		signUp.setBounds(798, 20, 79, 24);
		contentPane.add(signUp);
		
		JLabel lblNewUser = new JLabel("New User?");
		lblNewUser.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewUser.setBounds(722, 28, 70, 16);
		contentPane.add(lblNewUser);
		
		Label label = new Label("Forgot Password ?");
		
		label.setFont(new Font("Dialog", Font.PLAIN, 11));
		label.setBounds(498, 509, 123, 24);
		contentPane.add(label);
	}
}
