package map;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class showpage extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	protected Object gettext;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	// the test area that will show the output
	public JTextArea gettest() {
		return this.textArea;
	}

	public void setlabel(String s) {
		this.lblNewLabel.setText(s);
	}

	public showpage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 849, 798);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// place a scrollbar to the test area
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 780, 500);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 156, 825, 595);
		contentPane.add(scrollPane_1);

		textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 25));
		lblNewLabel.setBounds(0, 10, 445, 92);
		contentPane.add(lblNewLabel);

	}
}