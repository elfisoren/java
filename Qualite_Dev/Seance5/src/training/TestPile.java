package training;


import static org.junit.Assert.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPile {

    private Pile pile;
    
    @BeforeEach
    public void setVariable() {
    	Pile pile =new Pile(3);
    }
    
    @Test
    public void casLimite() {
    	pile.empiler(5);
    	pile.empiler(0);
    	pile.empiler(0);
    	assertFalse(pile.estVide());
    	
    }
    @Test
    public void testEstVide() {
    	assertTrue(pile.estVide());
    }
    
    @Test
    public void testDepilerQuandVide() {
        // Vérifier que la pile est initialement vide
        assertTrue(pile.estVide());

        try {
            // Tenter de dépiler un élément d'une pile vide doit échouer
            pile.depiler();
            fail("Une RuntimeException était attendue car la pile est vide");
        } catch (RuntimeException e) {
            assertEquals("La pile est vide", e.getMessage());
        }
    }
};