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
		//erstellt alle sichtbaren Elemente
		createVisibles();
		
		setTitle("Mathetrainer");
		
		//fügt das Panel dem Frame hinzu und die Buttons dem Panel
		add(preloadPane);
		
		preloadPane.add(divisionBtn);
		preloadPane.add(fractionBtn);
		preloadPane.add(percentBtn);
		
		//setzt die standard Schließen-Operation, Sichtbarkeit und Größe des Fensters
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 350);
	}
	
	//erstellt eine Dimension und einen Font für die Buttons, initialisiert das Panel und die Buttons
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
	
	//Get-Methoden für die Buttons
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
