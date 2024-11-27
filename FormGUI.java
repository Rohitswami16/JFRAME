package org.eclipse.wb.swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import java.awt.Button;

public class RegistrationForm extends JFrame {

		private static final long serialVersionUID = 1L;
		private static final ComboBoxModel Skillset = null;
		private JPanel contentPane;
		private JTextField textFieldFirstName;
	    private JTextField textFieldAge;
	    private JTextField textFieldEmail;
	    private JPasswordField passwordField;
	    private JTextField textFieldDOB;
	    private JTextField textFieldTime;
	    private JTextField textFieldUrl;
	    private JComboBox<String> comboBoxSkill;
	    private JSlider volumeSlider;
	    private JButton btnSelectColor;
	    private JColorChooser colorChooser;
	    private JLabel lblSelectedFile;
	    private JFileChooser fileChooser;
	    private JTextArea textAreaFeedback;
	    private JComboBox<String> comboBoxCity;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm frame = new RegistrationForm();
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
	public RegistrationForm() {
		setTitle("User Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel FirstName = new JLabel("First Name:");
        FirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        FirstName.setBounds(20, 20, 100, 30);
        contentPane.add(FirstName);

        textFieldFirstName = new JTextField();
        textFieldFirstName.setBounds(150, 20, 250, 30);
        contentPane.add(textFieldFirstName);
        textFieldFirstName.setColumns(10);

        JLabel Age = new JLabel("Age:");
        Age.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Age.setBounds(20, 60, 100, 30);
        contentPane.add(Age);

        textFieldAge = new JTextField();
        textFieldAge.setBounds(150, 60, 250, 30);
        contentPane.add(textFieldAge);
        textFieldAge.setColumns(10);
        
        JLabel Email = new JLabel("Email:");
        Email.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Email.setBounds(20, 100, 100, 30);
        contentPane.add(Email);

        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(150, 100, 250, 30);
        contentPane.add(textFieldEmail);
        textFieldEmail.setColumns(10);

        JLabel Password = new JLabel("Password:");
        Password.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Password.setBounds(20, 140, 100, 30);
        contentPane.add(Password);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 140, 250, 30);
        contentPane.add(passwordField);
        
        JLabel DOB = new JLabel("DOB:");
        DOB.setFont(new Font("Tahoma", Font.PLAIN, 16));
        DOB.setBounds(20, 180, 132, 30);
        contentPane.add(DOB);

        textFieldDOB = new JTextField();
        textFieldDOB.setBounds(150, 180, 250, 30);
        contentPane.add(textFieldDOB);
        textFieldDOB.setColumns(10);

        JLabel Time = new JLabel("Time:");
        Time.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Time.setBounds(20, 220, 150, 30);
        contentPane.add(Time);

        textFieldTime = new JTextField();
        textFieldTime.setBounds(150, 220, 250, 30);
        contentPane.add(textFieldTime);
        textFieldTime.setColumns(10);
        
        JLabel Url = new JLabel("URL:");
        Url.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Url.setBounds(20, 260, 150, 30);
        contentPane.add(Url);
        
        textFieldUrl = new JTextField();
        textFieldUrl.setColumns(10);
        textFieldUrl.setBounds(150, 260, 170, 30);
        contentPane.add(textFieldUrl);
        
        JLabel Skills = new JLabel("Select your Skill:");
        Skills.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Skills.setBounds(20, 300, 150, 30);
        contentPane.add(Skills);

        String[] skills = { "Java", "Python", "MongoDB", "Node.js" };
        comboBoxSkill = new JComboBox<>(skills);
        comboBoxSkill.setFont(new Font("Tahoma", Font.PLAIN, 16));
        comboBoxSkill.setSelectedIndex(0);
        comboBoxSkill.setBounds(150, 300, 250, 30);
        contentPane.add(comboBoxSkill);
        
        JLabel Gender = new JLabel("Gender:");
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Gender.setBounds(20, 340, 100, 30);
        contentPane.add(Gender);

        JRadioButton Male = new JRadioButton("Male");
        Male.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Male.setBounds(150, 340, 78, 30);
        contentPane.add(Male);

        JRadioButton Female = new JRadioButton("Female");
        Female.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Female.setBounds(230, 340, 90, 30);
        contentPane.add(Female);

        JRadioButton Other = new JRadioButton("Other");
        Other.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Other.setBounds(330, 340, 80, 30);
        contentPane.add(Other);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(Male);
        genderGroup.add(Female);
        genderGroup.add(Other);

        JLabel lblColor = new JLabel("Select Color:");
        lblColor.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblColor.setBounds(20, 385, 150, 30);
        contentPane.add(lblColor);

        btnSelectColor = new JButton("Select Color");
        btnSelectColor.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnSelectColor.setBounds(150, 385, 150, 30);
        contentPane.add(btnSelectColor);

        colorChooser = new JColorChooser();

        btnSelectColor.addActionListener(e -> {
            Color color = JColorChooser.showDialog(null, "Choose Color", Color.BLACK);
            contentPane.setBackground(color);
        });

        JLabel lblFile = new JLabel("Upload your file:");
        lblFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblFile.setBounds(20, 424, 150, 30);
        contentPane.add(lblFile);

        JButton btnChooseFile = new JButton("Choose File");
        btnChooseFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnChooseFile.setBounds(150, 424, 150, 30);
        contentPane.add(btnChooseFile);

        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("PDF Files", "pdf"));

        btnChooseFile.addActionListener(e -> {
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
            	lblSelectedFile.setText(fileChooser.getSelectedFile().getName());
            }
        });
        
        JLabel lblCity = new JLabel("Select your city:");
        lblCity.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblCity.setBounds(20, 471, 150, 30);
        contentPane.add(lblCity);

        String[] cities = { "Select City", "Bengaluru", "Pune", "Hyderabad", "Mumbai" };
        comboBoxCity = new JComboBox<>(cities);
        comboBoxCity.setFont(new Font("Tahoma", Font.PLAIN, 16));
        comboBoxCity.setBounds(150, 471, 220, 30);
        contentPane.add(comboBoxCity);

        JLabel lblFeedback = new JLabel("Write your feedback:");
        lblFeedback.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblFeedback.setBounds(20, 512, 180, 30);
        contentPane.add(lblFeedback);

        textAreaFeedback = new JTextArea();
        textAreaFeedback.setBounds(20, 553, 537, 100);
        contentPane.add(textAreaFeedback);
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnSubmit.setBounds(78, 681, 150, 30);
        contentPane.add(btnSubmit);
        
        JButton btnReset = new JButton("RESET");
        btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnReset.setBounds(306, 681, 150, 30);
        contentPane.add(btnReset);
        
        btnSubmit.addActionListener(e -> {
            String firstName = textFieldFirstName.getText();
            String age = textFieldAge.getText();
            String email = textFieldEmail.getText();
            String password = new String(passwordField.getPassword());
            String dob = textFieldDOB.getText();
            String time = textFieldTime.getText();
            String url = textFieldUrl.getText();
            String skill = (String) comboBoxSkill.getSelectedItem();
            String gender = Male.isSelected() ? "Male" : Female.isSelected() ? "Female" : "Other";
            int volume = volumeSlider.getValue();
            String file = lblSelectedFile.getText();
            String city = (String) comboBoxCity.getSelectedItem();
            String feedback = textAreaFeedback.getText();

           
            if (firstName.isEmpty() || age.isEmpty() || email.isEmpty() || password.isEmpty() || dob.isEmpty() || city.equals("Select City")) {
                JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Submitted Successfully!");
            }
        });
        
	}
}
