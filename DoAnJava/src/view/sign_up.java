package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.sign_up_controller;

public class sign_up extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textTK;
	public JPasswordField textMK;
	public JButton btnDangKy, btnDangNhap, btnThoat;
	public JComboBox<String> roleComboBox;
	private JLabel lblNewLabel_1_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sign_up frame = new sign_up();
					frame.setVisible(true);
					new sign_up_controller(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public sign_up() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);

		JLabel lblNewLabel = new JLabel("Đăng Ký");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(308, 44, 136, 30);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Tài Khoản");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(66, 99, 100, 24);
		contentPane.add(lblNewLabel_1);

		textTK = new JTextField();
		textTK.setBounds(247, 99, 354, 24);
		contentPane.add(textTK);
		textTK.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Mật Khẩu");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(66, 164, 100, 24);
		contentPane.add(lblNewLabel_1_1);

		textMK = new JPasswordField();
		textMK.setBounds(247, 164, 354, 24);
		contentPane.add(textMK);

		btnDangKy = new JButton("Đăng Ký");
		btnDangKy.setForeground(new Color(0, 255, 0));
		btnDangKy.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDangKy.setBounds(66, 251, 121, 35);
		contentPane.add(btnDangKy);

		btnDangNhap = new JButton("Đăng Nhập");
		btnDangNhap.setForeground(new Color(0, 128, 0));
		btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDangNhap.setBounds(275, 251, 129, 35);
		contentPane.add(btnDangNhap);

		btnThoat = new JButton("Thoát");
		btnThoat.setForeground(new Color(255, 0, 0));
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnThoat.setBounds(480, 251, 121, 35);
		contentPane.add(btnThoat);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 316, 687, 2);
		contentPane.add(separator);

		roleComboBox = new JComboBox<>(new String[] { "", "user", "admin" });
		roleComboBox.setBounds(247, 218, 100, 22);
		contentPane.add(roleComboBox);

		lblNewLabel_1_2 = new JLabel("Vai trò");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(66, 218, 100, 24);
		contentPane.add(lblNewLabel_1_2);
	}

	// Các phương thức getter
	public JButton getBtnDangKy() {
		return btnDangKy;
	}

	public JButton getBtnDangNhap() {
		return btnDangNhap;
	}

	public JButton getBtnThoat() {
		return btnThoat;
	}

	public JTextField getTextField() {
		return textTK;
	}

	public JPasswordField getPasswordField() {
		return textMK;
	}

	public JComboBox<String> selectRole() {
		return roleComboBox;
	}
}
