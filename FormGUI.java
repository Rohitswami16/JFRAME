package gui;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.time.LocalTime;

public class FormGUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldFirstName;
    private JTextField textFieldAge;
    private JTextField textFieldEmail;
    private JPasswordField passwordField;
    private JTextField textFieldDOB;
    private JTextField textFieldTime;
    private JTextField textFieldURL;
    private JComboBox<String> comboBoxCity;
    private JTextArea textAreaFeedback;
    private JComboBox<String> comboBoxSkill;
    private JSlider volumeSlider;
    private JButton btnSelectColor;
    private JFileChooser fileChooser;
    private JLabel lblSelectedFile;
    private JColorChooser colorChooser;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FormGUI frame = new FormGUI();
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
    public FormGUI() {
        setTitle("User Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 800);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 239, 213));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Labels and input fields
        JLabel lblFirstName = new JLabel("First Name:");
        lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblFirstName.setBounds(20, 20, 100, 30);
        contentPane.add(lblFirstName);

        textFieldFirstName = new JTextField();
        textFieldFirstName.setBounds(150, 20, 250, 30);
        contentPane.add(textFieldFirstName);
        textFieldFirstName.setColumns(10);

        JLabel lblAge = new JLabel("Age:");
        lblAge.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblAge.setBounds(20, 60, 100, 30);
        contentPane.add(lblAge);

        textFieldAge = new JTextField();
        textFieldAge.setBounds(150, 60, 250, 30);
        contentPane.add(textFieldAge);
        textFieldAge.setColumns(10);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblEmail.setBounds(20, 100, 100, 30);
        contentPane.add(lblEmail);

        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(150, 100, 250, 30);
        contentPane.add(textFieldEmail);
        textFieldEmail.setColumns(10);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblPassword.setBounds(20, 140, 100, 30);
        contentPane.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 140, 250, 30);
        contentPane.add(passwordField);

        JLabel lblDOB = new JLabel("DOB (dd-mm-yyyy):");
        lblDOB.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblDOB.setBounds(20, 180, 150, 30);
        contentPane.add(lblDOB);

        textFieldDOB = new JTextField();
        textFieldDOB.setBounds(180, 180, 220, 30);
        contentPane.add(textFieldDOB);
        textFieldDOB.setColumns(10);

        JLabel lblTime = new JLabel("Time (hh:mm):");
        lblTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblTime.setBounds(20, 220, 150, 30);
        contentPane.add(lblTime);

        textFieldTime = new JTextField();
        textFieldTime.setBounds(180, 220, 220, 30);
        contentPane.add(textFieldTime);
        textFieldTime.setColumns(10);

        JLabel lblURL = new JLabel("URL:");
        lblURL.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblURL.setBounds(20, 260, 100, 30);
        contentPane.add(lblURL);

        textFieldURL = new JTextField();
        textFieldURL.setBounds(150, 260, 250, 30);
        contentPane.add(textFieldURL);
        textFieldURL.setColumns(10);

        JLabel lblSkills = new JLabel("Select your Skill:");
        lblSkills.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblSkills.setBounds(20, 300, 150, 30);
        contentPane.add(lblSkills);

        String[] skills = { "Java", "Python", "MongoDB", "Node.js" };
        comboBoxSkill = new JComboBox<>(skills);
        comboBoxSkill.setBounds(180, 300, 220, 30);
        contentPane.add(comboBoxSkill);

        JLabel lblGender = new JLabel("Gender:");
        lblGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblGender.setBounds(20, 340, 100, 30);
        contentPane.add(lblGender);

        JRadioButton rdbtnMale = new JRadioButton("Male");
        rdbtnMale.setBounds(150, 340, 70, 30);
        contentPane.add(rdbtnMale);

        JRadioButton rdbtnFemale = new JRadioButton("Female");
        rdbtnFemale.setBounds(230, 340, 90, 30);
        contentPane.add(rdbtnFemale);

        JRadioButton rdbtnOther = new JRadioButton("Other");
        rdbtnOther.setBounds(330, 340, 80, 30);
        contentPane.add(rdbtnOther);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rdbtnMale);
        genderGroup.add(rdbtnFemale);
        genderGroup.add(rdbtnOther);

        JLabel lblVolume = new JLabel("Select Volume:");
        lblVolume.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblVolume.setBounds(20, 380, 150, 30);
        contentPane.add(lblVolume);

        volumeSlider = new JSlider(0, 100);
        volumeSlider.setBounds(180, 380, 220, 30);
        contentPane.add(volumeSlider);

        JLabel lblColor = new JLabel("Select Color:");
        lblColor.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblColor.setBounds(20, 420, 150, 30);
        contentPane.add(lblColor);

        btnSelectColor = new JButton("Select Color");
        btnSelectColor.setBounds(180, 420, 150, 30);
        contentPane.add(btnSelectColor);

        colorChooser = new JColorChooser();

        btnSelectColor.addActionListener(e -> {
            Color color = JColorChooser.showDialog(null, "Choose Color", Color.BLACK);
            contentPane.setBackground(color);
        });

        JLabel lblFile = new JLabel("Upload your file:");
        lblFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblFile.setBounds(20, 460, 150, 30);
        contentPane.add(lblFile);

        JButton btnChooseFile = new JButton("Choose File");
        btnChooseFile.setBounds(180, 460, 150, 30);
        contentPane.add(btnChooseFile);

        lblSelectedFile = new JLabel("No file chosen");
        lblSelectedFile.setBounds(350, 460, 250, 30);
        contentPane.add(lblSelectedFile);

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
        lblCity.setBounds(20, 500, 150, 30);
        contentPane.add(lblCity);

        String[] cities = { "Select City", "New York", "Los Angeles", "Chicago", "Houston" };
        comboBoxCity = new JComboBox<>(cities);
        comboBoxCity.setBounds(180, 500, 220, 30);
        contentPane.add(comboBoxCity);

        JLabel lblFeedback = new JLabel("Write your feedback:");
        lblFeedback.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblFeedback.setBounds(20, 540, 180, 30);
        contentPane.add(lblFeedback);

        textAreaFeedback = new JTextArea();
        textAreaFeedback.setBounds(20, 580, 600, 100);
        contentPane.add(textAreaFeedback);

        // Submit Button
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnSubmit.setBounds(180, 700, 150, 30);
        contentPane.add(btnSubmit);

        btnSubmit.addActionListener(e -> {
            String firstName = textFieldFirstName.getText();
            String age = textFieldAge.getText();
            String email = textFieldEmail.getText();
            String password = new String(passwordField.getPassword());
            String dob = textFieldDOB.getText();
            String time = textFieldTime.getText();
            String url = textFieldURL.getText();
            String skill = (String) comboBoxSkill.getSelectedItem();
            String gender = rdbtnMale.isSelected() ? "Male" : rdbtnFemale.isSelected() ? "Female" : "Other";
            int volume = volumeSlider.getValue();
            String file = lblSelectedFile.getText();
            String city = (String) comboBoxCity.getSelectedItem();
            String feedback = textAreaFeedback.getText();

            // Basic validation
            if (firstName.isEmpty() || age.isEmpty() || email.isEmpty() || password.isEmpty() || dob.isEmpty() || city.equals("Select City")) {
                JOptionPane.showMessageDialog(null, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Submitted Successfully!");
            }
        });
    }
}
