import javax.swing.JFrame;

public class Main {
	public static Grid grid = new Grid(4, 4);
	public static JFrame window = new Window();
	
	

	public static void main(String[] args) {
		 grid.put(new Case(2), 2, 3);
		 grid.refreshUI();
		

	}

}
