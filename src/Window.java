import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		add(Main.grid , BorderLayout.CENTER);
		
		//                            MENU
		JPanel menu = new JPanel() ;
		menu.setLayout(new BoxLayout(menu, BoxLayout.X_AXIS));
		JButton newGame = new JButton("New Game");
		newGame.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Main.newGame();
				
			}
		});
		menu.add(newGame);
		add(menu , BorderLayout.SOUTH);
		
		
		setVisible(true);
		
		
	}
	
	
	
}
