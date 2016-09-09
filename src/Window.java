import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	
	public Window() {
		setTitle("2048");
		setSize(500, 500);
		setLayout(new BorderLayout());
		
		//                            GRILLE
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(4, 4));
		add(grid , BorderLayout.CENTER);
		
		//                            MENU
		JPanel menu = new JPanel() ;
		menu.setLayout(new BoxLayout(menu, BoxLayout.X_AXIS));
		menu.add(new JButton("Nouvelle Partie"));
		add(menu , BorderLayout.SOUTH);
		
		
		setVisible(true);
		
		
	}
	
	
}
