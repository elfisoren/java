package training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestGestionEntier {

	private GestionEntier I1;
	
	
	
	@BeforeEach
	void setVariable() {
		I1 = new GestionEntier(2,0,5);
	}
	
	@Test
	void TestIncrémentationMax() {
		
		I1.incrementer();
		I1.incrementer();
		I1.incrementer();
		assertTrue(I1.getValeur()==5);
	}
	@Test
	void TestDécrémentation() {
		I1.decrementer();
		assertEquals(I1.getValeur(),1);
	}
	@Test
	void TestDécréEchec() {
		I1.decrementer();
		assertFalse(I1.getValeur()==2);
	}
	@Test
	void TestIncréEchec() {
	I1.incrementer();
	assertTrue(I1.getValeur()==3);
	}
	
}

