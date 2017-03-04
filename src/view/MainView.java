package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel mainPane, upperPane, lowerPane, rightPane;
	private JButton returnBtn, cancelBtn, calculateBtn, exampleOneBtn, exampleTwoBtn, exampleThreeBtn, exampleOwnBtn;
	
	public MainView() {	
		//erstellt alle sichtbaren Elemente
		createVisibles();
		
		//fügt dem Frame die Panel hinzu und den Paneln alle sichtbaren Elemente
		add(mainPane);
		mainPane.add(upperPane, BorderLayout.CENTER);
		mainPane.add(lowerPane, BorderLayout.SOUTH);
		upperPane.add(rightPane, BorderLayout.EAST);
		
		lowerPane.add(Box.createHorizontalGlue());
		lowerPane.add(calculateBtn);
		lowerPane.add(Box.createHorizontalStrut(35));
		lowerPane.add(cancelBtn);
		lowerPane.add(Box.createHorizontalStrut(35));
		lowerPane.add(returnBtn);
		lowerPane.add(Box.createHorizontalGlue());
		
		rightPane.add(Box.createVerticalGlue());
		rightPane.add(exampleOneBtn);
		rightPane.add(Box.createVerticalStrut(20));
		rightPane.add(exampleTwoBtn);
		rightPane.add(Box.createVerticalStrut(20));
		rightPane.add(exampleThreeBtn);
		rightPane.add(Box.createVerticalStrut(20));
		rightPane.add(exampleOwnBtn);
		rightPane.add(Box.createVerticalGlue());
		
		//definiert die Panels
		//Umrandung		
		upperPane.setBorder(BorderFactory.createEtchedBorder());
		lowerPane.setBorder(BorderFactory.createEtchedBorder());
		rightPane.setBorder(BorderFactory.createEtchedBorder());
		
		//Größe
		lowerPane.setPreferredSize(new Dimension(mainPane.getWidth(), 50));
		rightPane.setPreferredSize(new Dimension(150, upperPane.getHeight()));
		
		//setzt die standard Schließen-Operation, Sichtbarkeit und Größe des Fensters
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
		setSize(600, 600);
	}
	
	//initialisiert die sichtbaren Elemente
	public void createVisibles() {
		mainPane = new JPanel();
		mainPane.setLayout(new BorderLayout());
		
		upperPane = new JPanel();
		upperPane.setLayout(new BorderLayout());
		
		lowerPane = new JPanel();
		lowerPane.setLayout(new BoxLayout(lowerPane, BoxLayout.LINE_AXIS));
		
		rightPane = new JPanel();
		rightPane.setLayout(new BoxLayout(rightPane, BoxLayout.PAGE_AXIS));
		
		returnBtn = new JButton("Zurück");
		cancelBtn = new JButton("Löschen");
		calculateBtn = new JButton("Berechnen");
		exampleOneBtn = new JButton("Beispiel 1");
		exampleTwoBtn = new JButton("Beispiel 2");
		exampleThreeBtn = new JButton("Beispiel 3");
		exampleOwnBtn = new JButton("Eigenes");
		
		//definiert die Buttons
		Dimension maxSizeButtons = new Dimension(150, 40);
		Font buttonFont = new Font("Arial", Font.PLAIN, 21);
				
		returnBtn.setMaximumSize(maxSizeButtons);
		cancelBtn.setMaximumSize(maxSizeButtons);
		calculateBtn.setMaximumSize(maxSizeButtons);
		exampleOneBtn.setMaximumSize(maxSizeButtons);
		exampleTwoBtn.setMaximumSize(maxSizeButtons);
		exampleThreeBtn.setMaximumSize(maxSizeButtons);
		exampleOwnBtn.setMaximumSize(maxSizeButtons);
		
		returnBtn.setFont(buttonFont);
		cancelBtn.setFont(buttonFont);
		calculateBtn.setFont(buttonFont);
		exampleOneBtn.setFont(buttonFont);
		exampleTwoBtn.setFont(buttonFont);
		exampleThreeBtn.setFont(buttonFont);
		exampleOwnBtn.setFont(buttonFont);
	}
	
	//zeigt das Panel
	public void showMainFrame(String calcCase) {
		//zeigt den Titel auf Basis der ausgewählten Operation an
		setTitle(calcCase);
		
		//setzt die Sichtbarkeiten
		mainPane.setVisible(true);
		setVisible(true);
	}
	
	//Get-Methode für die Buttons
	public JButton getReturnBtn() {
		return returnBtn;
	}
	
	public JButton getCancelBtn() {
		return cancelBtn;
	}
	
	public JButton getCalculateBtn() {
		return calculateBtn;
	}
	
	public JButton getExampleOneBtn() {
		return exampleOneBtn;
	}
	
	public JButton getExampleTwoBtn() {
		return exampleTwoBtn;
	}
	
	public JButton getExampleThreeBtn() {
		return exampleThreeBtn;
	}
	
	public JButton getExampleOwnBtn() {
		return exampleOwnBtn;
	}
}
