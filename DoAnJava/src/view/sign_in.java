package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class sign_in extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textTK;
	public JPasswordField textMK;
	public JButton btnDangNhap, btnDangKy, btnThoat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sign_in frame = new sign_in();
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
	public sign_in() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);

		JLabel lblNewLabel = new JLabel("Đăng Nhập");
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

		// Gán giá trị trực tiếp cho biến thành viên thay vì tạo biến cục bộ mới
		btnDangKy = new JButton("Đăng Ký");
		btnDangKy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnDangKy.setForeground(new Color(0, 255, 0));
		btnDangKy.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDangKy.setBounds(275, 251, 121, 35);
		contentPane.add(btnDangKy);

		btnDangNhap = new JButton("Đăng Nhập"); // Gán đúng cho biến thành viên
		btnDangNhap.setForeground(new Color(0, 128, 0));
		btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDangNhap.setBounds(66, 251, 129, 35);
		contentPane.add(btnDangNhap);

		btnThoat = new JButton("Thoát");
		btnThoat.setForeground(new Color(255, 0, 0));
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnThoat.setBounds(480, 251, 121, 35);
		contentPane.add(btnThoat);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 316, 687, 2);
		contentPane.add(separator);
	}

	public JButton getBtnDangNhap() {
		return btnDangNhap;
	}

	public JButton getBtnDangKy() {
		return btnDangKy;
	}

	public JButton getBtnThoat() {
		return btnThoat;
	}

	public JTextField getTextTK() {
		return textTK;
	}

	public JPasswordField getTextMK() {
		return textMK;
	}
}
