import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook onion;
	private GradeBook garlic;

	@BeforeEach
	void setUp() throws Exception {

		onion = new GradeBook(5);
		garlic = new GradeBook(5);


		onion.addScore(3);
		onion.addScore(2);

		garlic.addScore(9);
		garlic.addScore(1);

	}

	@AfterEach
	void tearDown() throws Exception {

		onion = null;
		garlic = null;

	}

	@Test
	void testAddScore() {
		assertTrue(onion.toString().equals("3.0 2.0 "));
		assertTrue(garlic.toString().equals("9.0 1.0 "));
		assertEquals(2, onion.getScoreSize(), .001);
		assertEquals(2, garlic.getScoreSize(), .001);
	}

	@Test
	void testSum() {
		assertEquals(5, onion.sum(), .0001);
		assertEquals(10, garlic.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(2, onion.minimum(), .001);
		assertEquals(1, garlic.minimum(), .001);
	}

	@Test
	void testFinalScore() {

		assertEquals(3, onion.finalScore(), .001);
		assertEquals(9, garlic.finalScore(), .001);

	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, onion.getScoreSize(), .001);
		assertEquals(2, garlic.getScoreSize(), .001);
	}

	@Test
	void testToString() {
		assertTrue(onion.toString().equals("3.0 2.0 "));
		assertTrue(garlic.toString().equals("9.0 1.0 "));
	}

}
