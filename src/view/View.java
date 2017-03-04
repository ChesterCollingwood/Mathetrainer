package view;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
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
		add(divisionPane);
		add(percentPane);
		add(fractionPane);
		
		divisionPane.setVisible(false);
		percentPane.setVisible(false);
		fractionPane.setVisible(false);
		
		//fügt die Buttons dem main Pane hinzu
		mainPane.add(divisionBtn);
		mainPane.add(fractionBtn);
		mainPane.add(percentBtn);
		
		//setzt die standard Schließen-Operation, Sichtbarkeit und Größe des Fensters
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 400);
	}
	
	public void createVisibles() {
		//Panels
		mainPane = new JPanel();
		divisionPane = new JPanel();
		fractionPane = new JPanel();
		percentPane = new JPanel();
		
		//Buttons
		divisionBtn = new JButton("Division üben");
		fractionBtn = new JButton("Brüche üben");
		percentBtn = new JButton("Prozentrechnung üben");
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
}
