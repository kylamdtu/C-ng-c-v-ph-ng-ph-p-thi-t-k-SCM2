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

public class HinhThang extends JFrame {

	private JPanel contentPane;
	private JTextField txtDayA;
	private JTextField txtDayB;
	private JTextField txtChieuCao;
	private JTextField txtCanhBen1;
	private JTextField txtCanhBen2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HinhThang frame = new HinhThang();
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
	public HinhThang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHnhCh = new JLabel("H\u00CCNH THANG");
		lblHnhCh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHnhCh.setHorizontalAlignment(SwingConstants.CENTER);
		lblHnhCh.setBounds(91, 11, 262, 30);
		contentPane.add(lblHnhCh);
		
		JLabel lblNewLabel = new JLabel(" \u0110\u00E1y a");
		lblNewLabel.setBounds(32, 65, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0110\u00E1y b");
		lblNewLabel_1.setBounds(32, 116, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Di\u1EC7n t\u00EDch:");
		lblNewLabel_2.setBounds(32, 182, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Chu vi:");
		lblNewLabel_3.setBounds(260, 182, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		txtDayA = new JTextField();
		txtDayA.setBounds(93, 62, 86, 20);
		contentPane.add(txtDayA);
		txtDayA.setColumns(10);
		
		txtDayB = new JTextField();
		txtDayB.setBounds(93, 113, 86, 20);
		contentPane.add(txtDayB);
		txtDayB.setColumns(10);
		
		JLabel lblDienTich = new JLabel("0");
		lblDienTich.setBounds(93, 182, 46, 14);
		contentPane.add(lblDienTich);
		
		JLabel lblChuVi = new JLabel("0");
		lblChuVi.setBounds(320, 182, 46, 14);
		contentPane.add(lblChuVi);
		
		JButton btnTinh = new JButton("T\u00CDNH");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblDienTich.setText((double)(Integer.parseInt(txtDayA.getText())+Integer.parseInt(txtDayB.getText()))*Integer.parseInt(txtChieuCao.getText())/2+"");

				lblChuVi.setText((Integer.parseInt(txtDayA.getText())+Integer.parseInt(txtDayB.getText())+Integer.parseInt(txtCanhBen1.getText())+Integer.parseInt(txtCanhBen2.getText()))+"");
			}
		});
		btnTinh.setBounds(173, 215, 89, 23);
		contentPane.add(btnTinh);
		
		JLabel lblChiuCao = new JLabel(" Chi\u1EC1u cao");
		lblChiuCao.setBounds(219, 62, 86, 14);
		contentPane.add(lblChiuCao);
		
		txtChieuCao = new JTextField();
		txtChieuCao.setColumns(10);
		txtChieuCao.setBounds(306, 59, 86, 20);
		contentPane.add(txtChieuCao);
		
		JLabel lblCnhBn = new JLabel("C\u1EA1nh b\u00EAn 1");
		lblCnhBn.setBounds(219, 113, 86, 14);
		contentPane.add(lblCnhBn);
		
		txtCanhBen1 = new JTextField();
		txtCanhBen1.setColumns(10);
		txtCanhBen1.setBounds(306, 110, 86, 20);
		contentPane.add(txtCanhBen1);
		
		JLabel lblCnhBn_1 = new JLabel("C\u1EA1nh b\u00EAn 2");
		lblCnhBn_1.setBounds(219, 157, 86, 14);
		contentPane.add(lblCnhBn_1);
		
		txtCanhBen2 = new JTextField();
		txtCanhBen2.setColumns(10);
		txtCanhBen2.setBounds(306, 154, 86, 20);
		contentPane.add(txtCanhBen2);
	}

}
