package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connectionDB.DAO;
import view.sign_in;
import view.sign_up;

public class sign_in_controller {
	private sign_in signInView;

	public sign_in_controller(sign_in signInView) {
		this.signInView = signInView;
		addListeners(); // Gọi phương thức này để thêm sự kiện cho các nút
	}

	// Thêm các sự kiện cho các nút
	private void addListeners() {
		signInView.getBtnDangNhap().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dangNhap(); // Gọi hàm xử lý khi nhấn nút Đăng Nhập
			}
		});

		signInView.getBtnDangKy().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dangKy(); // Gọi hàm xử lý khi nhấn nút Đăng Ký
			}
		});

		signInView.getBtnThoat().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				thoat(); // Gọi hàm xử lý khi nhấn nút Thoát
			}
		});
	}

	// Các phương thức xử lý sự kiện
	private void dangNhap() {
		String username = signInView.getTextTK().getText();
		String password = new String(signInView.getTextMK().getPassword());

		// Thực hiện logic đăng nhập ở đây
		if (username.isEmpty() || password.isEmpty()) {
			JOptionPane.showMessageDialog(signInView, "Tài khoản hoặc mật khẩu không được bỏ trống!");
			return;
		}
		String checkLogin = "select Username, Password from Login where Username = ? and Password = ?";
		try {
			PreparedStatement pt = DAO.getConnection().prepareStatement(checkLogin);
			pt.setString(1, username);
			pt.setString(2, password);
			ResultSet rs = pt.executeQuery();
			if (rs.next()) {
				JOptionPane.showMessageDialog(signInView, "Đăng nhập thành công!");
			} else {
				JOptionPane.showMessageDialog(signInView, "Sai tài khoản hoặc mật khẩu!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void dangKy() {
		sign_up signUpView = new sign_up(); // Tạo một đối tượng sign_up
		new sign_up_controller(signUpView); // Gọi controller cho sign_up
		signUpView.setVisible(true); // Hiển thị form đăng ký
		signInView.dispose(); // Đóng form hiện tại
	}

	private void thoat() {
		System.exit(0); // Thoát ứng dụng
	}
}
