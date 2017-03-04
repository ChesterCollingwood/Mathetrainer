package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;
	private JButton divisionBtn, fractionBtn, percentBtn;
	private JPanel mainPane, divisionPane, fractionPane, percentPane;
	
	public View() {
		//erstellt alle sichtbaren Elemente
		createVisibles();
		
		//fügt die Panels dem Frame hinzu, zeigt erstmal nur das Main Panel
		add(mainPane);
	/*	add(divisionPane);
		add(percentPane);
		add(fractionPane);
		
		divisionPane.setVisible(false);
		percentPane.setVisible(false);
		fractionPane.setVisible(false);
		*/
		//legt das Layout des Main Panels fest
		mainPane.setLayout(new FlowLayout());
		
		//fügt die Buttons dem main Pane hinzu
		mainPane.add(divisionBtn);
		mainPane.add(fractionBtn);
		mainPane.add(percentBtn);
		
		//setzt die standard Schließen-Operation, Sichtbarkeit und Größe des Fensters
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 350);
	}
	
	public void createVisibles() {
		Dimension buttonDimension = new Dimension(380, 100);
		Font buttonFont = new Font("Arial", Font.PLAIN, 30);
		
		//Panels
		mainPane = new JPanel();
		mainPane.setOpaque(false);
		
		divisionPane = new JPanel();
		divisionPane.setOpaque(false);
		
		percentPane = new JPanel();
		percentPane.setOpaque(false);
		
		fractionPane = new JPanel();
		fractionPane.setOpaque(false);
		
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
	
	//Get Methoden für die Panels und die Buttons, zur Verknüpfung im Controller
	public JPanel getMainPane() {
		return mainPane;
	}
	
	public JPanel getDivisionPane() {
		return divisionPane;
	}
	
	public JPanel getFractionPane() {
		return fractionPane;
	}
	
	public JPanel getPercentPane() {
		return percentPane;
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
