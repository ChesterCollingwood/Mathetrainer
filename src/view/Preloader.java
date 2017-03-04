package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Preloader extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton divisionBtn, percentBtn, fractionBtn;
	private JPanel preloadPane;

	public Preloader() {
		createVisibles();
		setTitle("Mathetrainer");
		
		add(preloadPane);
		
		preloadPane.add(divisionBtn);
		preloadPane.add(fractionBtn);
		preloadPane.add(percentBtn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 350);
	}
	
	public void createVisibles() {
		Dimension buttonDimension = new Dimension(380, 100);
		Font buttonFont = new Font("Arial", Font.PLAIN, 30);
		
		//Panel
		preloadPane = new JPanel();
		preloadPane.setLayout(new FlowLayout());
		
		//Buttons
		divisionBtn = new JButton("Division üben");
		percentBtn = new JButton("Prozentrechnung üben");
		fractionBtn = new JButton("Bruchrechnung üben");
		
		divisionBtn.setPreferredSize(buttonDimension);
		percentBtn.setPreferredSize(buttonDimension);
		fractionBtn.setPreferredSize(buttonDimension);
		
		divisionBtn.setFont(buttonFont);
		percentBtn.setFont(buttonFont);
		fractionBtn.setFont(buttonFont);
	}
	
	public JButton getDivisionBtn() {
		return divisionBtn;
	}
	
	public JButton getFractionBtn() {
		return fractionBtn;
	}
	
	public JButton getPercentBtn() {
		return percentBtn;
	}
}
