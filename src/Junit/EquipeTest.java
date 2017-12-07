package Junit;

import static org.junit.Assert.*;
import org.junit.Test;
import app.*;

public class EquipeTest {
	
	@Test
	public void testGetMembres() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		Personne Personne = inscriptions.createPersonne("a", "b", "c");
		Personne Personne1 = inscriptions.createPersonne("c", "d", "e");
		Equipe Equipe = inscriptions.createEquipe("d");
		Equipe.add(Personne);
		Equipe.add(Personne1);
		int size = Equipe.getMembres().size();
		assertTrue(Equipe.getMembres().contains(Personne));
		assertTrue(Equipe.getMembres().contains(Personne1));
		assertEquals(size,Equipe.getMembres().size());

	}
}
