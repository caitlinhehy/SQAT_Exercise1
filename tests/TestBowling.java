import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testStory1() {
		//Arrange
		BowlingGame frames = new BowlingGame();
		frames.add(2);
		frames.add(4);

		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "40 - 30", score);		
	}
	
	@Test
	public void testUpdateEndOfDay_ConjuredMana_Quality_10() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Conjured Mana", 10, 10) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemBrie = items.get(0);
		assertEquals(9, itemBrie.getQuality());
	}

}
