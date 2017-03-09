package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel mainPane, upperPane, rightPane;
	private JButton returnBtn, cancelBtn, calculateBtn, generateBtn;
	
	public MainView() {	
		//erstellt alle sichtbaren Elemente
		createVisibles();
		
		//fügt dem Frame die Panel hinzu und den Paneln alle sichtbaren Elemente
		add(mainPane);
		mainPane.add(upperPane, BorderLayout.CENTER);
		upperPane.add(rightPane, BorderLayout.EAST);
		
		rightPane.add(Box.createVerticalGlue());
		rightPane.add(generateBtn);
		rightPane.add(Box.createVerticalStrut(20));
		rightPane.add(calculateBtn);
		rightPane.add(Box.createVerticalStrut(20));
		rightPane.add(cancelBtn);
		rightPane.add(Box.createVerticalStrut(20));
		rightPane.add(returnBtn);
		rightPane.add(Box.createVerticalGlue());
		
		
		//definiert die Panels
		//Umrandung		
		upperPane.setBorder(BorderFactory.createEtchedBorder());
		rightPane.setBorder(BorderFactory.createEtchedBorder());
		
		//Größe
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
		
		rightPane = new JPanel();
		rightPane.setLayout(new BoxLayout(rightPane, BoxLayout.PAGE_AXIS));
		
		returnBtn = new JButton("Zurück");
		cancelBtn = new JButton("Löschen");
		calculateBtn = new JButton("Berechnen");
		generateBtn = new JButton("Generieren");
		
		//definiert die Buttons
		Dimension maxSizeButtons = new Dimension(150, 40);
		Font buttonFont = new Font("Arial", Font.PLAIN, 21);
				
		returnBtn.setMaximumSize(maxSizeButtons);
		cancelBtn.setMaximumSize(maxSizeButtons);
		calculateBtn.setMaximumSize(maxSizeButtons);
		generateBtn.setMaximumSize(maxSizeButtons);
		
		returnBtn.setFont(buttonFont);
		cancelBtn.setFont(buttonFont);
		calculateBtn.setFont(buttonFont);
		generateBtn.setFont(buttonFont);
	}
	
	//zeigt das Panel
	public void showMainFrame(String calcCase) {
		//zeigt den Titel auf Basis der ausgewählten Operation an
		setTitle(calcCase);
		
		//setzt die Sichtbarkeiten
		mainPane.setVisible(true);
		setVisible(true);
		
		if (calcCase.contains("Division")) {
			showDivision();
		}
		else if (calcCase.contains("Bruchrechnung")) {
			showFraction();
		}
		else if (calcCase.contains("Prozentrechnung")) {
			showPercent();
		}
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
	
	public JButton getGenerateBtn() {
		return generateBtn;
	}
	
	//zeigt den jeweiligen JDialog und fügt die spezifischen Elemente dem Panel hinzu
	public void showFraction() {
		JOptionPane.showMessageDialog(this, "Hier befindest du dich in der Kategorie Brüche kürzen.\nDu kannst dir selbst eine Aufgabe "
				+ "ausdenken oder eines der vorhandenen Beispiele nehmen.\nDie Brüche gehen bis zu einem Nenner von 20. "
				+ "Es sind keine Sonderzeichen erlaubt.", "Allgemeine Information", JOptionPane.INFORMATION_MESSAGE, null);
	}
	
	public void showDivision() {
		JOptionPane.showMessageDialog(this, "Hier befindest du dich in der Kategorie Division.\n"
				+ "Du kannst dir selbst eine Aufgabe  ausdenken oder eines der vorhandenen Beispiele nehmen.\n"
				+ "Die Division geht bis zu einem Teiler von 100. Außerdem sind auch hier nur ganze Zahlen erlaubt.\n"
				+ "Es sind keine Sonderzeichen erlaubt.","Allgemeine Information", JOptionPane.INFORMATION_MESSAGE, null);
	}
	
	public void showPercent() {
		JOptionPane.showMessageDialog(this, "Hier befindest du dich in der Kategorie Prozentrechnung.\n"
				+ "Du kannst dir selbst eine Aufgabe  ausdenken oder eines der vorhandenen Beispiele nehmen.\n"
				+ "Die Prozentrechnung ist für Ganze Zahlen von 1 bis 100.\n"
				+ "Es sind keine Sonderzeichen wie erlaubt.","Allgemeine Information", JOptionPane.INFORMATION_MESSAGE, null);
	}
}
