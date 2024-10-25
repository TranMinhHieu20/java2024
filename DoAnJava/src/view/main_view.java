////package view;
////
////import java.awt.EventQueue;
////import java.awt.event.ActionEvent;
////import java.awt.event.ActionListener;
////
////import javax.swing.JButton;
////import javax.swing.JFrame;
////import javax.swing.JLabel;
////import javax.swing.JPanel;
////
////import controller.sign_in_controller;
////
////public class main_view extends JFrame {
////	private JPanel contentPane;
////	private JButton btnManageProducts;
////	private JButton btnViewOrders;
////	private JButton btnLogout;
////
////	public main_view() {
////		setTitle("Giao Diện Chính");
////		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////		setBounds(100, 100, 600, 400);
////		contentPane = new JPanel();
////		setContentPane(contentPane);
////		contentPane.setLayout(null);
////
////		JLabel lblTitle = new JLabel("Giao Diện Chính");
////		lblTitle.setBounds(250, 30, 150, 30);
////		contentPane.add(lblTitle);
////
////		btnManageProducts = new JButton("Quản Lý Sản Phẩm");
////		btnManageProducts.setBounds(200, 100, 200, 30);
////		contentPane.add(btnManageProducts);
////
////		btnViewOrders = new JButton("Xem Đơn Hàng");
////		btnViewOrders.setBounds(200, 150, 200, 30);
////		contentPane.add(btnViewOrders);
////
////		btnLogout = new JButton("Đăng Xuất");
////		btnLogout.setBounds(200, 200, 200, 30);
////		contentPane.add(btnLogout);
////
////		// Sự kiện khi nhấn nút đăng xuất
////		btnLogout.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent e) {
////
////				sign_in _sign_in = new sign_in();
////				new sign_in_controller(_sign_in);
////				_sign_in.setVisible(true);
////				main_view.this.dispose();
////
////			}
////		});
////	}
////
////	public static void main(String[] args) {
////		EventQueue.invokeLater(new Runnable() {
////			public void run() {
////				try {
////					main_view frame = new main_view();
////					frame.setVisible(true);
////				} catch (Exception e) {
////					e.printStackTrace();
////				}
////			}
////		});
////	}
////}
//package view;
//
//import java.awt.EventQueue;
//import java.awt.Font;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//
//public class main_view extends JFrame {
//
//	private static final long serialVersionUID = 1L;
//	private JPanel contentPane;
//
//	public main_view(String role) {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 600, 400);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setLocationRelativeTo(null);
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//
//		JLabel lblWelcome = new JLabel("Chào mừng đến với phần mềm quản lý bán hàng");
//		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 16));
//		lblWelcome.setBounds(50, 30, 500, 30);
//		contentPane.add(lblWelcome);
//
//		if ("admin".equals(role)) {
//			createAdminInterface();
//		} else {
//			createUserInterface();
//		}
//
//		setResizable(false);
//		setVisible(true);
//	}
//
//	private void createAdminInterface() {
//		JLabel lblAdmin = new JLabel("Giao diện Admin");
//		lblAdmin.setFont(new Font("Tahoma", Font.BOLD, 18));
//		lblAdmin.setBounds(50, 70, 200, 30);
//		contentPane.add(lblAdmin);
//
//		JButton btnManageProducts = new JButton("Quản lý sản phẩm");
//		btnManageProducts.setBounds(50, 120, 200, 30);
//		contentPane.add(btnManageProducts);
//
//		JButton btnManageOrders = new JButton("Quản lý hóa đơn");
//		btnManageOrders.setBounds(50, 160, 200, 30);
//		contentPane.add(btnManageOrders);
//
//		JButton btnManageCustomers = new JButton("Quản lý khách hàng");
//		btnManageCustomers.setBounds(50, 200, 200, 30);
//		contentPane.add(btnManageCustomers);
//
//		JButton btnViewReport = new JButton("Xem báo cáo doanh thu");
//		btnViewReport.setBounds(50, 240, 200, 30);
//		contentPane.add(btnViewReport);
//
//		JButton btnLogout = new JButton("Đăng xuất");
//		btnLogout.setBounds(400, 300, 100, 30);
//		contentPane.add(btnLogout);
//	}
//
//	private void createUserInterface() {
//		JLabel lblUser = new JLabel("Giao diện Người dùng");
//		lblUser.setFont(new Font("Tahoma", Font.BOLD, 18));
//		lblUser.setBounds(50, 70, 200, 30);
//		contentPane.add(lblUser);
//
//		JButton btnViewProducts = new JButton("Xem sản phẩm");
//		btnViewProducts.setBounds(50, 120, 200, 30);
//		contentPane.add(btnViewProducts);
//
//		JButton btnViewOrders = new JButton("Xem hóa đơn");
//		btnViewOrders.setBounds(50, 160, 200, 30);
//		contentPane.add(btnViewOrders);
//
//		JButton btnUpdateProfile = new JButton("Cập nhật thông tin cá nhân");
//		btnUpdateProfile.setBounds(50, 200, 200, 30);
//		contentPane.add(btnUpdateProfile);
//
//		JButton btnLogout = new JButton("Đăng xuất");
//		btnLogout.setBounds(400, 300, 100, 30);
//		contentPane.add(btnLogout);
//	}
//
//	public static void main(String[] args) {
//		EventQueue.invokeLater(() -> {
//			try {
//				// Thay đổi role thành "admin" hoặc "user" tùy thuộc vào đăng nhập
//				String role = "admin"; // hoặc "user"
//				new main_view(role);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		});
//	}
//}
