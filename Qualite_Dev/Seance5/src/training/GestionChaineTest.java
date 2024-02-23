package training;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GestionChaineTest {

	private GestionChaine S1;

	@BeforeEach
	public void setChaine() {
		S1=new GestionChaine("Valou",10);
	}
	@Test
	public void TestAjouter() {
		S1.ajouter("sh");
		assertEquals(S1.getValeur(),"Valoush");
	}
	//@Test(expected = RuntimeExeption.class)
	//public void TestAjouteEchec() {
	//	S1.ajouter("shetteeeeeee");
	//}
	@Test
	public void ajouterLimite() {
		S1.ajouter("12345");
		assertEquals(10,S1.getValeur().length());
}
	
}
