import javax.swing.JFrame;

public class Main {
	public static Grid grid = new Grid(4, 4);
	public static JFrame window = new Window();
	
	

	public static void main(String[] args) {
		grid.randomCase(2);
		grid.randomCase(4);
		 grid.refreshUI();
		

	}
	
	public static void newGame(){
		grid = new Grid(4, 4);
		grid.randomCase(2);
		grid.randomCase(4);
		 grid.refreshUI();
	}

}
