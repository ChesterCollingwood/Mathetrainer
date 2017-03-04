package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel divisionPane, fractionPane, percentPane;
	
	public MainView() {	
		
		
		//setzt die standard Schließen-Operation, Sichtbarkeit und Größe des Fensters
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(600, 6000);
	}
	
	public void createVisibles() {
		divisionPane = new JPanel();
		fractionPane = new JPanel();
		percentPane = new JPanel();
	}
}
