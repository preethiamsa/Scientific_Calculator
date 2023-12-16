package preethi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	Double firstnum;
	Double secondnum;
	Double res;
	String Operation;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Serif", Font.BOLD, 20));
		textField.setBounds(10, 11, 333, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText(firstnum.toString());
			}
		});
		btnNewButton.setBounds(10, 73, 69, 58);
		contentPane.add(btnNewButton);
		
		JButton btnDel = new JButton("EXP");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText(firstnum.toString());
			}
		});
		btnDel.setFont(new Font("Serif", Font.PLAIN, 16));
		btnDel.setBounds(76, 73, 69, 58);
		contentPane.add(btnDel);
		
		JButton btnSin = new JButton("SIN");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText(firstnum.toString());
			}
		});
		btnSin.setFont(new Font("Serif", Font.PLAIN, 16));
		btnSin.setBounds(143, 73, 69, 58);
		contentPane.add(btnSin);
		
		JButton btnCos = new JButton("COS");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText(firstnum.toString());
			}
		});
		btnCos.setFont(new Font("Serif", Font.PLAIN, 16));
		btnCos.setBounds(209, 73, 69, 58);
		contentPane.add(btnCos);
		
		JButton btnTan = new JButton("TAN");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText(firstnum.toString());
			}
		});
		btnTan.setFont(new Font("Serif", Font.PLAIN, 16));
		btnTan.setBounds(274, 73, 69, 58);
		contentPane.add(btnTan);
		
		JButton btnx = new JButton("1/X");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = 1/(Double.parseDouble(textField.getText()));
				textField.setText(firstnum.toString());
			}
		});
		btnx.setFont(new Font("Serif", Font.PLAIN, 12));
		btnx.setBounds(10, 129, 69, 58);
		contentPane.add(btnx);
		
		JButton btnLog = new JButton("LOG");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Math.log(Double.parseDouble(textField.getText()));
				textField.setText(firstnum.toString());
			}
		});
		btnLog.setFont(new Font("Serif", Font.PLAIN, 14));
		btnLog.setBounds(76, 129, 69, 58);
		contentPane.add(btnLog);
		
		JButton btnSinh = new JButton("SINH");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText(firstnum.toString());
			}
		});
		btnSinh.setFont(new Font("Serif", Font.PLAIN, 13));
		btnSinh.setBounds(143, 129, 69, 58);
		contentPane.add(btnSinh);
		
		JButton btnCosh = new JButton("COSH");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText(firstnum.toString());
			}
		});
		btnCosh.setFont(new Font("Serif", Font.PLAIN, 13));
		btnCosh.setBounds(209, 129, 69, 58);
		contentPane.add(btnCosh);
		
		JButton btnTanh = new JButton("TANH");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText(firstnum.toString());
			}
		});
		btnTanh.setFont(new Font("Serif", Font.PLAIN, 12));
		btnTanh.setBounds(274, 129, 69, 58);
		contentPane.add(btnTanh);
		
		JButton btnNewButton_9_1 = new JButton("X^Y");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				Operation = "X^Y";
			}
		});
		btnNewButton_9_1.setFont(new Font("Serif", Font.PLAIN, 11));
		btnNewButton_9_1.setBounds(10, 185, 69, 58);
		contentPane.add(btnNewButton_9_1);
		
		JButton btnNewButton_9_2 = new JButton("%");
		btnNewButton_9_2.setFont(new Font("Serif", Font.PLAIN, 14));
		btnNewButton_9_2.setBounds(76, 185, 69, 58);
		contentPane.add(btnNewButton_9_2);
		
		JButton btnNewButton_7_1 = new JButton("C");
		btnNewButton_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_7_1.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_7_1.setBounds(143, 185, 69, 58);
		contentPane.add(btnNewButton_7_1);
		
		JButton btnNewButton_8_1 = new JButton("\uF0E7");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str = textField.getText();
				if(str.length()>0) {
				StringBuilder strb = new StringBuilder(str);
				strb.deleteCharAt(str.length()-1);
				textField.setText(strb.toString());
				}
				
			}
		});
		btnNewButton_8_1.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_8_1.setBounds(209, 185, 69, 58);
		contentPane.add(btnNewButton_8_1);
		
		JButton btnNewButton_9_3 = new JButton("+");
		btnNewButton_9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				Operation = "+";
				
			}
		});
		btnNewButton_9_3.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_9_3.setBounds(274, 185, 69, 58);
		contentPane.add(btnNewButton_9_3);
		
		JButton btnNewButton_7_1_1 = new JButton("8");
		btnNewButton_7_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btnNewButton_7_1_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_7_1_1.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_7_1_1.setBounds(143, 240, 69, 58);
		contentPane.add(btnNewButton_7_1_1);
		
		JButton btnNewButton_8_1_1 = new JButton("9");
		btnNewButton_8_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btnNewButton_8_1_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_8_1_1.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_8_1_1.setBounds(209, 240, 69, 58);
		contentPane.add(btnNewButton_8_1_1);
		
		JButton btnNewButton_9_3_1 = new JButton("-");
		btnNewButton_9_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				Operation = "-";
			}
		});
		btnNewButton_9_3_1.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_9_3_1.setBounds(274, 240, 69, 58);
		contentPane.add(btnNewButton_9_3_1);
		
		JButton btnNewButton_9_2_1 = new JButton("7");
		btnNewButton_9_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btnNewButton_9_2_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_9_2_1.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_9_2_1.setBounds(76, 240, 69, 58);
		contentPane.add(btnNewButton_9_2_1);
		
		JButton btnNewButton_9_1_1 = new JButton("x^3");
		btnNewButton_9_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum =(Double.parseDouble(textField.getText()));
				firstnum = firstnum * firstnum * firstnum;
				textField.setText(firstnum.toString());
			}
		});
		btnNewButton_9_1_1.setFont(new Font("Serif", Font.PLAIN, 14));
		btnNewButton_9_1_1.setBounds(10, 240, 69, 58);
		contentPane.add(btnNewButton_9_1_1);
		
		JButton btnNewButton_7_1_2 = new JButton("5");
		btnNewButton_7_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btnNewButton_7_1_2.getText();
				textField.setText(num);
			}
		});
		btnNewButton_7_1_2.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_7_1_2.setBounds(143, 294, 69, 58);
		contentPane.add(btnNewButton_7_1_2);
		
		JButton btnNewButton_8_1_2 = new JButton("6");
		btnNewButton_8_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btnNewButton_8_1_2.getText();
				textField.setText(num);
			}
		});
		btnNewButton_8_1_2.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_8_1_2.setBounds(209, 294, 69, 58);
		contentPane.add(btnNewButton_8_1_2);
		
		JButton btnNewButton_9_3_2 = new JButton("*");
		btnNewButton_9_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				Operation = "*";
			}
		});
		btnNewButton_9_3_2.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_9_3_2.setBounds(274, 294, 69, 58);
		contentPane.add(btnNewButton_9_3_2);
		
		JButton btnNewButton_9_2_2 = new JButton("4");
		btnNewButton_9_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btnNewButton_9_2_2.getText();
				textField.setText(num);
			}
		});
		btnNewButton_9_2_2.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_9_2_2.setBounds(76, 294, 69, 58);
		contentPane.add(btnNewButton_9_2_2);
		
		JButton btnNewButton_9_1_2 = new JButton("x^2");
		btnNewButton_9_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum =(Double.parseDouble(textField.getText()));
				firstnum = firstnum * firstnum;
				textField.setText(firstnum.toString());
			}
		});
		btnNewButton_9_1_2.setFont(new Font("Serif", Font.PLAIN, 14));
		btnNewButton_9_1_2.setBounds(10, 294, 69, 58);
		contentPane.add(btnNewButton_9_1_2);
		
		JButton btnNewButton_7_1_3 = new JButton(".");
		btnNewButton_7_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btnNewButton_7_1_3.getText();
				textField.setText(num);
			}
		});
		btnNewButton_7_1_3.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_7_1_3.setBounds(143, 404, 69, 58);
		contentPane.add(btnNewButton_7_1_3);
		
		JButton btnNewButton_8_1_3 = new JButton("=");
		btnNewButton_8_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnum = Double.parseDouble(textField.getText());
				if(Operation == "+") {
					res = firstnum + secondnum;
				    ans = String.format("%.2f",res);
				    textField.setText(ans);
				}
				else if(Operation == "-") {
					res = firstnum - secondnum;
				    ans = String.format("%.2f",res);
				    textField.setText(ans);
				}
				else if(Operation == "*") {
					res = firstnum * secondnum;
				    ans = String.format("%.2f",res);
				    textField.setText(ans);
				}
				else if(Operation == "/") {
					res = firstnum / secondnum;
				    ans = String.format("%.2f",res);
				    textField.setText(ans);
				}
				else if(Operation == "X^Y") {
					res = (double)1;
				    for(int i = 0;i<secondnum;i++) {
						res = firstnum * res;
						
					}
					textField.setText(res.toString());
				}
				    	
			}
		});
		btnNewButton_8_1_3.setFont(new Font("Serif", Font.BOLD, 21));
		btnNewButton_8_1_3.setBounds(209, 404, 134, 58);
		contentPane.add(btnNewButton_8_1_3);
		
		JButton btnNewButton_9_3_3 = new JButton("/");
		btnNewButton_9_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				Operation = "/";
			}
		});
		btnNewButton_9_3_3.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_9_3_3.setBounds(274, 348, 69, 58);
		contentPane.add(btnNewButton_9_3_3);
		
		JButton btnNewButton_9_2_3 = new JButton("0");
		btnNewButton_9_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btnNewButton_9_2_3.getText();
				textField.setText(num);
			}
		});
		btnNewButton_9_2_3.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_9_2_3.setBounds(76, 404, 69, 58);
		contentPane.add(btnNewButton_9_2_3);
		
		JButton btnNewButton_9_1_3 = new JButton("+/-");
		btnNewButton_9_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = (Double.parseDouble(textField.getText()))*(-1);
				textField.setText(firstnum.toString());
			}
		});
		btnNewButton_9_1_3.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_9_1_3.setBounds(10, 404, 69, 58);
		contentPane.add(btnNewButton_9_1_3);
		
		JButton btnNewButton_9_2_3_1 = new JButton("1");
		btnNewButton_9_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btnNewButton_9_2_3_1.getText();
				textField.setText(num);
			}
			
		});
		btnNewButton_9_2_3_1.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_9_2_3_1.setBounds(76, 348, 69, 58);
		contentPane.add(btnNewButton_9_2_3_1);
		
		JButton btnNewButton_9_1_3_1 = new JButton("n!");
		btnNewButton_9_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
			    res = (double) 1;
				while(firstnum !=0) {
					res = firstnum * res;
					firstnum--;
				}
				textField.setText(res.toString());
			}
		});
		btnNewButton_9_1_3_1.setFont(new Font("Serif", Font.PLAIN, 14));
		btnNewButton_9_1_3_1.setBounds(10, 348, 69, 58);
		contentPane.add(btnNewButton_9_1_3_1);
		
		JButton btnNewButton_7_1_3_1 = new JButton("2");
		btnNewButton_7_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btnNewButton_7_1_3_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_7_1_3_1.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_7_1_3_1.setBounds(143, 348, 69, 58);
		contentPane.add(btnNewButton_7_1_3_1);
		
		JButton btnNewButton_8_1_3_1 = new JButton("3");
		btnNewButton_8_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+ btnNewButton_8_1_3_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_8_1_3_1.setFont(new Font("Serif", Font.BOLD, 16));
		btnNewButton_8_1_3_1.setBounds(209, 348, 69, 58);
		contentPane.add(btnNewButton_8_1_3_1);
	}
}
