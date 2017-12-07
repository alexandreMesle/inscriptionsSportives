package Junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import app.Inscriptions;
import app.Personne;

public class PersonneTest {
	@Test
	public void testGetPrenom() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		Personne Personne = inscriptions.createPersonne("a", "b", "c");
		String inscription = Personne.getPrenom();
		assertEquals("b",inscription);
		}

	@Test
	public void testSetPrenom() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		Personne Personne = inscriptions.createPersonne("a", "b", "c");
		Personne.setPrenom("d");
		String inscription = Personne.getPrenom();
		assertEquals("d",inscription);
	}
	
	
}
