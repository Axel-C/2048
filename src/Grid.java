import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

public class Grid extends JPanel{
	private int width ;
	private int height ;
	Case grid[][] ;
	
	public Grid(int width , int height) {
		this.width = width ;
		this.height = height ;
		grid = new Case[width][height] ;
		setLayout(new GridLayout(height, width));
		for(int i = 0 ; i <  height ; i++ ){
			for(int j = 0 ; j < width ; j++){
				grid[j][i] = new Case(0);
			}
		}
		
		
		
	}
	
	public boolean put(Case c ,int x , int y){
		if(x < width && y < height){
			grid[x][y] = c ;
			
			return true ;
		}
		return false ;
	}
	
	public void refreshUI(){
		for(int i = 0 ; i <  height ; i++ ){
			for(int j = 0 ; j < width ; j++){
				add(grid[j][i]);
			}
		}
		updateUI();
	}
	
	public void randomCase(int number){
		List<Case> possibleCase = new ArrayList();
		for(int i = 0 ; i <  height ; i++ ){
			for(int j = 0 ; j < width ; j++){
				if(grid[j][i].number == 0){
					possibleCase.add(grid[j][i]);
				}
			}
		}
		int r = new Random().nextInt(possibleCase.size());
		possibleCase.get(r).set(number);
	}

}
