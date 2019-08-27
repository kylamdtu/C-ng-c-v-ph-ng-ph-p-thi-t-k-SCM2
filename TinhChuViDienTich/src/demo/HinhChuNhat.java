package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HinhChuNhat extends JFrame {

	private JPanel contentPane;
	private JTextField txtChieuCao;
	private JTextField txtChieuRong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HinhChuNhat frame = new HinhChuNhat();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HinhChuNhat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHnhCh = new JLabel("H\u00CCNH CH\u1EEE NH\u1EACT");
		lblHnhCh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHnhCh.setHorizontalAlignment(SwingConstants.CENTER);
		lblHnhCh.setBounds(91, 11, 262, 30);
		contentPane.add(lblHnhCh);
		
		JLabel lblNewLabel = new JLabel("Chi\u1EC1u cao");
		lblNewLabel.setBounds(32, 65, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chi\u1EC1u r\u1ED9ng");
		lblNewLabel_1.setBounds(32, 116, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Di\u1EC7n t\u00EDch:");
		lblNewLabel_2.setBounds(32, 174, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Chu vi:");
		lblNewLabel_3.setBounds(260, 174, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		txtChieuCao = new JTextField();
		txtChieuCao.setBounds(114, 59, 86, 20);
		contentPane.add(txtChieuCao);
		txtChieuCao.setColumns(10);
		
		txtChieuRong = new JTextField();
		txtChieuRong.setBounds(114, 110, 86, 20);
		contentPane.add(txtChieuRong);
		txtChieuRong.setColumns(10);
		
		JLabel lblDienTich = new JLabel("0");
		lblDienTich.setBounds(93, 174, 46, 14);
		contentPane.add(lblDienTich);
		
		JLabel lblChuVi = new JLabel("0");
		lblChuVi.setBounds(320, 174, 46, 14);
		contentPane.add(lblChuVi);
		
		JButton btnTinh = new JButton("T\u00CDNH");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblDienTich.setText(Integer.parseInt(txtChieuCao.getText())*Integer.parseInt(txtChieuRong.getText())+"");

				lblChuVi.setText((Integer.parseInt(txtChieuCao.getText())+Integer.parseInt(txtChieuRong.getText()))*2+"");
			}
		});
		btnTinh.setBounds(173, 215, 89, 23);
		contentPane.add(btnTinh);
	}

}
