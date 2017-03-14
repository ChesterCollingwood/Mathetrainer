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
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel mainPane, upperPane, rightPane, childPane;
	private JButton returnBtn, cancelBtn, calculateBtn, generateBtn;
	private JTextField firstNumber, secondNumber, result, rest, fractionUpperFirst, fractionLowerFirst,
						fractionUpperResult, fractionLowerResult, plusPane, equalsPane, restPane, 
						percentPane, percentResult, textPane;
	private Dimension textFields = new Dimension(50,20);
	
	public MainView() {	
		//erstellt alle sichtbaren Elemente
		createVisibles();
		
		//fÃ¼gt dem Frame die Panel hinzu und den Paneln alle sichtbaren Elemente
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
		
		childPane = new JPanel();
		
		returnBtn = new JButton("Zurück");
		cancelBtn = new JButton("Löschen");
		calculateBtn = new JButton("Auswerten");
		generateBtn = new JButton("Generieren");
		
		plusPane = new JTextField("/");
		equalsPane = new JTextField("=");
		restPane = new JTextField("Rest");
		percentPane = new JTextField("Wieviel % ?");
		
		firstNumber = new JTextField("");
		secondNumber = new JTextField("");
		result = new JTextField("");
		percentResult = new JTextField("");
		rest = new JTextField("");
		
		textPane = new JTextField("von");
		
		fractionUpperFirst = new JTextField("");
		fractionLowerFirst = new JTextField("");
		fractionUpperResult = new JTextField("");
		fractionLowerResult = new JTextField("");
		
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
	
	//Elemente für die jeweilige Operation
	public void elementsForDivision() {
		childPane = new JPanel();
		upperPane.add(childPane);
		
		firstNumber.setPreferredSize(textFields);
		plusPane.setPreferredSize(textFields);
		secondNumber.setPreferredSize(textFields);
		equalsPane.setPreferredSize(textFields);
		result.setPreferredSize(textFields);
		restPane.setPreferredSize(textFields);
		rest.setPreferredSize(textFields);
		
		
		plusPane.setHorizontalAlignment(SwingConstants.CENTER);
		equalsPane.setHorizontalAlignment(SwingConstants.CENTER);
		firstNumber.setHorizontalAlignment(SwingConstants.CENTER);
		secondNumber.setHorizontalAlignment(SwingConstants.CENTER);
		result.setHorizontalAlignment(SwingConstants.CENTER);
		restPane.setHorizontalAlignment(SwingConstants.CENTER);
		rest.setHorizontalAlignment(SwingConstants.CENTER);
		
		plusPane.setEditable(false);
		equalsPane.setEditable(false);
		restPane.setEditable(false);
		
		childPane.add(firstNumber);
		childPane.add(plusPane);
		childPane.add(secondNumber);
		childPane.add(equalsPane);
		childPane.add(result);
		childPane.add(restPane);
		childPane.add(rest);
		
		childPane.revalidate();
		childPane.repaint();
	}
	
	public void elementsForFraction() {
		childPane = new JPanel();
		upperPane.add(childPane);
		
		fractionUpperFirst.setPreferredSize(textFields);
		fractionLowerFirst.setPreferredSize(textFields);
		fractionUpperResult.setPreferredSize(textFields);
		fractionLowerResult.setPreferredSize(textFields);
		equalsPane.setPreferredSize(textFields);
		
		fractionUpperFirst.setHorizontalAlignment(SwingConstants.CENTER);
		fractionLowerFirst.setHorizontalAlignment(SwingConstants.CENTER);
		fractionUpperResult.setHorizontalAlignment(SwingConstants.CENTER);
		fractionLowerResult.setHorizontalAlignment(SwingConstants.CENTER);
		equalsPane.setHorizontalAlignment(SwingConstants.CENTER);
		
		childPane.add(fractionUpperFirst);
		childPane.add(new JSeparator());
		childPane.add(fractionLowerFirst);
		
		childPane.add(equalsPane);
		
		childPane.add(fractionUpperResult);
		childPane.add(new JSeparator());
		childPane.add(fractionLowerResult);
		
		childPane.revalidate();
		childPane.repaint();
	}
	
	public void elementsForPercent() {
		childPane = new JPanel();
		upperPane.add(childPane);

		firstNumber.setPreferredSize(textFields);
		percentPane.setPreferredSize(new Dimension(100, 20));
		secondNumber.setPreferredSize(textFields);
		percentResult.setPreferredSize(textFields);
		textPane.setPreferredSize(textFields);
		
		percentPane.setHorizontalAlignment(SwingConstants.CENTER);
		firstNumber.setHorizontalAlignment(SwingConstants.CENTER);
		secondNumber.setHorizontalAlignment(SwingConstants.CENTER);
		percentResult.setHorizontalAlignment(SwingConstants.CENTER);
		textPane.setHorizontalAlignment(SwingConstants.CENTER);
		
		percentPane.setEditable(false);
		firstNumber.setEditable(false);
		secondNumber.setEditable(false);
		textPane.setEditable(false);
		
		childPane.add(firstNumber);
		childPane.add(textPane);
		childPane.add(secondNumber);
		childPane.add(percentPane);
		childPane.add(percentResult);

		childPane.revalidate();
		childPane.repaint();
	}
	
	//Entfernt das Panel mit den Elementen der jeweiligen Operation
	public void removeChildPanes() {
		upperPane.remove(childPane);
	}
	
	//zeigt den jeweiligen JDialog und fügt die spezifischen Elemente dem Panel hinzu
	public void showFraction() {
		JOptionPane.showMessageDialog(this, "Hier befindest du dich in der Kategorie Brüche kürzen.\nDu kannst dir selbst eine Aufgabe "
				+ "ausdenken oder eine Übungsaufgabe erstellen lassen.\nDie Brüche gehen bis zu einem Nenner von 25. "
				+ "Es sind nur ganze Zahlen und keine Sonderzeichen erlaubt.", "Allgemeine Information", JOptionPane.INFORMATION_MESSAGE, null);
		elementsForFraction();
	}
	
	public void showDivision() {
		JOptionPane.showMessageDialog(this, "Hier befindest du dich in der Kategorie Division mit Rest.\n"
				+ "Du kannst dir selbst eine Aufgabe  ausdenken oder eineein Beispielaufgabe erstellen lassen.\n"
				+ "Die Division geht bis zu einem Dividenden von 100. Außerdem sind auch hier nur ganze Zahlen erlaubt.\n"
				+ "Es sind keine Sonderzeichen erlaubt.","Allgemeine Information", JOptionPane.INFORMATION_MESSAGE, null);
		elementsForDivision();
	}
	
	public void showPercent() {
		JOptionPane.showMessageDialog(this, "Hier befindest du dich in der Kategorie Prozentrechnung.\n"
				+ "Du kannst dir selbst eine Aufgabe  ausdenken oder eines der vorhandenen Beispiele nehmen.\n"
				+ "Die Prozentrechnung ist für Ganze Zahlen von 1 bis 100.\n"
				+ "Das Ergebnis muss auf zwei Dezimalstellen gerundet angegeben werden.\n"
				+ "Es sind keine Sonderzeichen wie erlaubt.","Allgemeine Information", JOptionPane.INFORMATION_MESSAGE, null);
		elementsForPercent();
	}
	
	
	public void showRight() {
		JOptionPane.showMessageDialog(this, "Richtig!", "Auswertung", JOptionPane.INFORMATION_MESSAGE, null);
	}
	
	public void showWrong() {
		JOptionPane.showMessageDialog(this, "Leider falsch!" , "Auswertung", JOptionPane.INFORMATION_MESSAGE, null);
	}
	
	
	
	
	
	//Methode für den Cancel-Button
	public void deleteAll() {
		firstNumber.setText("");
		secondNumber.setText("");
		result.setText("");
		percentResult.setText("");
		rest.setText("");
		
		fractionUpperFirst.setText("");
		fractionLowerFirst.setText("");
		fractionUpperResult.setText("");
		fractionLowerResult.setText("");
	}
	
	//Get- und Set-Methoden
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
		
		public JTextField getFirstNumber() {
			return firstNumber;
		}
		
		public JTextField getSecondNumber() {
			return secondNumber;
		}
		
		public JTextField getFractionUpperFirst() {
			return fractionUpperFirst;
		}
		
		public JTextField getFractionLowerFirst() {
			return fractionLowerFirst;
		}
		
		public JTextField getFractionUpperResult() {
			return fractionUpperResult;
		}
		
		public JTextField getFractionLowerResult() {
			return fractionLowerResult;
		}
		
		public JTextField getResult() {
			return result;
		}
		
		public JTextField getPercentResult() {
			return percentResult;
		}
		
		public JTextField getRest() {
			return rest;
		}
		
		public void setFirstNumber(int generatedFirstNumber) {
			firstNumber.setText(String.valueOf(generatedFirstNumber));
		}
		
		public void setSecondNumber(int generatedSecondNumber) {
			secondNumber.setText(String.valueOf(generatedSecondNumber));
		}
		
		public void setFractionUpperFirst(int generatedFractionUpperFirst) {
			fractionUpperFirst.setText(String.valueOf(generatedFractionUpperFirst));
		}
		
		public void setFractionLowerFirst(int generatedFractionLowerFirst) {
			fractionLowerFirst.setText(String.valueOf(generatedFractionLowerFirst));
		}
		
		public void setFractionUpperResult(int generatedFractionUpperResult) {
			fractionUpperFirst.setText(String.valueOf(generatedFractionUpperResult));
		}
		
		public void setFractionLowerResult(int generatedFractionLowerResult) {
			fractionLowerFirst.setText(String.valueOf(generatedFractionLowerResult));
		}
		
		public void setResult(int generatedResult) {
			result.setText(String.valueOf(generatedResult));
		}
		
		public void setPercentResult(double d) {
			percentResult.setText(String.valueOf(d));
		}
}
