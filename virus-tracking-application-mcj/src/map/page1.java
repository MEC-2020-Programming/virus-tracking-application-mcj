package map;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class page1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page1 frame = new page1();
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
	public page1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 25, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("country");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(30, 464, 100, 70);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Total Cases:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(469, 431, 161, 64);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Total Deaths:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(469, 526, 161, 58);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Total Recovered:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(428, 615, 223, 50);
		contentPane.add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(157, 481, 200, 50);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(615, 443, 150, 50);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(615, 535, 150, 50);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(615, 620, 150, 50);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("New Cases:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(803, 443, 132, 36);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Active Cases:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(803, 533, 150, 44);
		contentPane.add(lblNewLabel_6);

		textField_4 = new JTextField();
		textField_4.setBounds(945, 443, 150, 50);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(945, 535, 150, 50);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JButton btnNewButton_1 = new JButton("Sort By Total Cases");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showpage sl = new showpage();
				sl.setVisible(true);
				try {
					Hashmap.read();
					sl.gettest().append(Hashmap.print(Hashmap.Csort(Hashmap.TotalCases)));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Steinberg Chord Sym Sans Serif", Font.BOLD, 20));
		btnNewButton_1.setBounds(884, 633, 249, 37);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Sort By New Cases");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showpage sl = new showpage();
				sl.setVisible(true);
				try {
					Hashmap.read();
					sl.gettest().append(Hashmap.print(Hashmap.Csort(Hashmap.NewCases)));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Steinberg Chord Sym Sans Serif", Font.BOLD, 20));
		btnNewButton_2.setBounds(884, 696, 249, 36);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Hashmap.read();
					// Hashmap For TotalCases:
					Map<String, Integer> TCMap = Hashmap.Csort(Hashmap.TotalCases);
					// Hashmap For NewCases:
					Map<String, Integer> NCMap = Hashmap.Csort(Hashmap.NewCases);
					// Hashmap For TotalDeaths:
					Map<String, Integer> TDMap = Hashmap.Csort(Hashmap.TotalDeaths);
					// Hashmap For TotalRecovered:
					Map<String, Integer> TRMap = Hashmap.Csort(Hashmap.TotalRecovered);
					// Hashmap For ActiveCases:
					Map<String, Integer> ACMap = Hashmap.Csort(Hashmap.ActiveCases);
					String input = textField.getText();
					// int length = map.size();
					if (Hashmap.TotalCases.containsKey("\"" + input + "\"")) {
						textField_1.setText(Hashmap.TotalCases.get("\"" + input + "\"").toString());
						textField_2.setText(Hashmap.TotalDeaths.get("\"" + input + "\"").toString());
						textField_3.setText(Hashmap.TotalRecovered.get("\"" + input + "\"").toString());
						textField_4.setText(Hashmap.NewCases.get("\"" + input + "\"").toString());
						textField_5.setText(Hashmap.ActiveCases.get("\"" + input + "\"").toString());

					} else {
						JOptionPane.showMessageDialog(null, "Country Not Found!");
					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(98, 605, 150, 50);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(page1.class.getResource("/icons/map.jpg")));
		lblNewLabel_4.setBounds(0, -15, 1200, 800);
		contentPane.add(lblNewLabel_4);

	}
}
