package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrangChu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChu frame = new TrangChu();
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
	public TrangChu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00CDNH CHU VI V\u00C0 DI\u1EC6N T\u00CDCH ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(82, 0, 267, 23);
		contentPane.add(lblNewLabel);
		
//		JButton btnHinhChuNhat = new JButton("H\u00CCNH CH\u1EEE NH\u1EACT");
//		btnHinhChuNhat.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				HinhChuNhat hcn = new HinhChuNhat();
//				hcn.setVisible(true);
//			}
//		});
//		btnHinhChuNhat.setBounds(0, 85, 134, 23);
//		contentPane.add(btnHinhChuNhat);
//		
//		JButton btnHinhTamGiac = new JButton("H\u00CCNH TAM GI\u00C1C");
//		btnHinhTamGiac.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				HinhTamGiac htg = new HinhTamGiac();
//				htg.setVisible(true);
//			}
//		});
//		btnHinhTamGiac.setBounds(132, 85, 128, 23);
//		contentPane.add(btnHinhTamGiac);
//		
//		JButton btnHinhTron = new JButton("H\u00CCNH TR\u00D2N");
//		btnHinhTron.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				HinhTron hTron = new HinhTron();
//				hTron.setVisible(true);
//			}
//		});
//		btnHinhTron.setBounds(260, 85, 115, 23);
//		contentPane.add(btnHinhTron);
//		
//		JButton btnHinhThang = new JButton("H\u00CCNH THANG");
//		btnHinhThang.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				HinhThang hinhThang = new HinhThang();
//				hinhThang.setVisible(true);
//			}
//		});
//		btnHinhThang.setBounds(374, 85, 115, 23);
//		contentPane.add(btnHinhThang);
	}

}
