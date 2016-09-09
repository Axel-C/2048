import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Case extends JPanel {
	public int number ;
	
	public Case(int number){
		setBackground(Color.WHITE);
		setSize(50, 50);
		JLabel label = new JLabel(""+ number);
		add(label);
	}
	
	public void set(int number){
		this.number = number ; 
	}
	
	
}
