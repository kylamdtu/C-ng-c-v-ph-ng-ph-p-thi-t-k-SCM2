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

public class HinhTamGiac extends JFrame {

	private JPanel contentPane;
	private JTextField txtCanhDay;
	private JTextField txtDuongCao;
	private JTextField txtCanhBen1;
	private JTextField txtCanhBen2;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					HinhTamGiac frame = new HinhTamGiac();
//					frame.setVisible(false);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public HinhTamGiac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHnhCh = new JLabel("H\u00CCNH TAM GI\u00C1C");
		lblHnhCh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHnhCh.setHorizontalAlignment(SwingConstants.CENTER);
		lblHnhCh.setBounds(91, 11, 262, 30);
		contentPane.add(lblHnhCh);
		
		JLabel lblNewLabel = new JLabel("C\u1EA1nh \u0111\u00E1y");
		lblNewLabel.setBounds(32, 65, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0110\u01B0\u1EDDng cao");
		lblNewLabel_1.setBounds(32, 116, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Di\u1EC7n t\u00EDch:");
		lblNewLabel_2.setBounds(32, 174, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Chu vi:");
		lblNewLabel_3.setBounds(260, 174, 60, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCanhDay = new JTextField();
		txtCanhDay.setBounds(120, 62, 86, 20);
		contentPane.add(txtCanhDay);
		txtCanhDay.setColumns(10);
		
		txtDuongCao = new JTextField();
		txtDuongCao.setBounds(120, 113, 86, 20);
		contentPane.add(txtDuongCao);
		txtDuongCao.setColumns(10);
		
		JLabel lblDienTich = new JLabel("0");
		lblDienTich.setBounds(93, 174, 46, 14);
		contentPane.add(lblDienTich);
		
		JLabel lblChuVi = new JLabel("0");
		lblChuVi.setBounds(320, 174, 46, 14);
		contentPane.add(lblChuVi);
		
		JButton btnTinh = new JButton("T\u00CDNH");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblDienTich.setText((double)(Integer.parseInt(txtCanhDay.getText())*Integer.parseInt(txtDuongCao.getText()))/2+"");

				lblChuVi.setText(Integer.parseInt(txtCanhBen1.getText())+Integer.parseInt(txtCanhBen2.getText())+Integer.parseInt(txtCanhDay.getText())+"");
			}
		});
		btnTinh.setBounds(173, 215, 89, 23);
		contentPane.add(btnTinh);
		
		JLabel lblCnhBn = new JLabel("C\u1EA1nh b\u00EAn 1");
		lblCnhBn.setBounds(216, 65, 80, 14);
		contentPane.add(lblCnhBn);
		
		txtCanhBen1 = new JTextField();
		txtCanhBen1.setColumns(10);
		txtCanhBen1.setBounds(292, 59, 86, 20);
		contentPane.add(txtCanhBen1);
		
		JLabel lblCnhBn_1 = new JLabel("C\u1EA1nh b\u00EAn 2");
		lblCnhBn_1.setBounds(216, 116, 80, 14);
		contentPane.add(lblCnhBn_1);
		
		txtCanhBen2 = new JTextField();
		txtCanhBen2.setColumns(10);
		txtCanhBen2.setBounds(292, 110, 86, 20);
		contentPane.add(txtCanhBen2);
	}

}
