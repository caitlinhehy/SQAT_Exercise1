import java.util.ArrayList;
import java.util.List;

//Finish time:16.12
//ID:143

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){
		int[] frames = new int[2];
		int firstThrow = frames[0];
		int secondThrow = frames[1];
		int framescore = 0;
		int gamescore = 0;
		int i;
		for(i=0;i<frames.length;i++){
			framescore = framescore+frames[i];
		}
		int[] games = new int[20];
		for(i=0;i<frames.length;i++){
			games.add(frames);
		}
		for(i=0;i<games.length;i++){
			if(firstThrow ==10){
				if(next.frame(secondThrow == 0)){
					framescore = 10+next.frame(firstThrow)+next.next(firstThrow);
				}
				else framescore = 10+next.frame(framescore);
			}
			if(firstThrow != 0 || firstThrow+secondThrow == 10){
				if()
				framescore = 10+next.frame(firstThrow);
			}
			gamescore = gamescore+games[i];
		}
			
	}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		return 0;
	}
}
