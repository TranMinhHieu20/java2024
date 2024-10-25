package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connectionDB.DAO;
import view.sign_in;
import view.sign_up;

public class sign_up_controller {
	public sign_up signUpView;

	public sign_up_controller(sign_up signUpView) {
		this.signUpView = signUpView;
		addListeners();
	}

	// Thêm sự kiện cho các btn sign_up
	private void addListeners() {
		signUpView.getBtnDangKy().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dangKy();
			}
		});

		signUpView.getBtnDangNhap().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dangNhap();
			}
		});

		signUpView.getBtnThoat().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				thoat();
			}
		});
	}

	// Xử lý sự kiện cho nút đăng ký
	private void dangKy() {
		String username = signUpView.textTK.getText();
		String password = new String(signUpView.textMK.getPassword());
		String selectRole = (String) signUpView.roleComboBox.getSelectedItem();

		// Kiểm tra không được để trống
		if (username.isEmpty() || password.isEmpty() || selectRole.isEmpty()) {
			JOptionPane.showMessageDialog(signUpView, "Tài khoản, mật khẩu hoặc chức vụ không được để trống");
			return;
		}

		// Kiểm tra tài khoản đã tồn tại
		String checkUser = "SELECT Username FROM Login WHERE Username = ?";
		try (Connection conn = DAO.getConnection(); PreparedStatement check = conn.prepareStatement(checkUser)) {

			check.setString(1, username);
			ResultSet rs = check.executeQuery();
			if (rs.next()) {
				JOptionPane.showMessageDialog(signUpView, "Tài khoản đã tồn tại!");
				return;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(signUpView, "Có lỗi xảy ra khi kiểm tra tài khoản!", "Lỗi",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Đăng ký tài khoản
		String insertSQL = "INSERT INTO Login (Username, Password, role) VALUES (?, ?, ?)";
		try (Connection conn = DAO.getConnection(); PreparedStatement pt = conn.prepareStatement(insertSQL)) {

			pt.setString(1, username);
			pt.setString(2, password); // Mã hóa mật khẩu trước khi lưu
			pt.setString(3, selectRole);
			int cnt = pt.executeUpdate();
			if (cnt != 0) {
				JOptionPane.showMessageDialog(signUpView, "Đăng ký thành công!");
				signUpView.textTK.setText("");
				signUpView.textMK.setText("");
			} else {
				JOptionPane.showMessageDialog(signUpView, "Đăng ký thất bại!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(signUpView, "Có lỗi xảy ra trong quá trình đăng ký!", "Lỗi",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	// Xử lý sự kiện cho nút đăng nhập
	private void dangNhap() {
		sign_in _sign_in = new sign_in();
		new sign_in_controller(_sign_in); // Gọi controller cho sign_in
		_sign_in.setVisible(true);
		signUpView.dispose();
	}

	// Thoát
	private void thoat() {
		System.exit(0);
	}
}
