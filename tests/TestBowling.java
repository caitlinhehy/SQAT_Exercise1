import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testStory2() {
		BowlingGame frames = new BowlingGame();
		frames.add(2);
		frames.add(4);
		int frameScore;
		assertEquals("Tie score incorrect", "6", framescore);		
	}
	
	@Test
	public void testStory4() {
		BowlingGame frames = new BowlingGame();
		frames.add(1);
		frames.add(5);
		frames.add(3);
		frames.add(6);
		frames.add(7);
		frames.add(2);
		frames.add(3);
		frames.add(6);
		frames.add(4);
		frames.add(4);
		frames.add(5);
		frames.add(3);
		frames.add(3);
		frames.add(3);
		frames.add(4);
		frames.add(5);
		frames.add(8);
		frames.add(1);
		frames.add(2);
		frames.add(6);
		int frameScore;
		assertEquals("Tie score incorrect", "81", gamescore);		
	}
	
	@Test
	public void testStory5() {
		BowlingGame frames = new BowlingGame();
		frames.add(10);
		frames.add(0);
		frames.add(3);
		frames.add(6);
		frames.add(7);
		frames.add(2);
		frames.add(3);
		frames.add(6);
		frames.add(4);
		frames.add(4);
		frames.add(5);
		frames.add(3);
		frames.add(3);
		frames.add(3);
		frames.add(4);
		frames.add(5);
		frames.add(8);
		frames.add(1);
		frames.add(2);
		frames.add(6);
		int frameScore;
		assertEquals("Tie score incorrect", "94", gamescore);		
	}
	
	@Test
	public void testStory6() {
		BowlingGame frames = new BowlingGame();
		frames.add(1);
		frames.add(9);
		frames.add(4);
		frames.add(6);
		frames.add(7);
		frames.add(2);
		frames.add(3);
		frames.add(6);
		frames.add(4);
		frames.add(4);
		frames.add(5);
		frames.add(3);
		frames.add(3);
		frames.add(3);
		frames.add(4);
		frames.add(5);
		frames.add(8);
		frames.add(1);
		frames.add(2);
		frames.add(6);
		int frameScore;
		assertEquals("Tie score incorrect", "88", gamescore);		
	}
	
	@Test
	public void testStory9() {
		BowlingGame frames = new BowlingGame();
		frames.add(10);
		frames.add(0);
		frames.add(10);
		frames.add(0);
		frames.add(7);
		frames.add(2);
		frames.add(3);
		frames.add(6);
		frames.add(4);
		frames.add(4);
		frames.add(5);
		frames.add(3);
		frames.add(3);
		frames.add(3);
		frames.add(4);
		frames.add(5);
		frames.add(8);
		frames.add(1);
		frames.add(2);
		frames.add(6);
		int frameScore;
		assertEquals("Tie score incorrect", "112", gamescore);		
	}
	


}
