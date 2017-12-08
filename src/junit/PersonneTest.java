package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import app.Competition;
import app.Equipe;
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
	
	@Test
	public void testGetMail() {
		Inscriptions inscription = Inscriptions.getInscriptions();
		Personne Personne = inscription.createPersonne("a", "b", "c");
		String m = Personne.getMail();
		assertEquals("c",m);
	}
	@Test
	
	public void testSetMail() {
		Inscriptions inscription = Inscriptions.getInscriptions();
		Personne Personne = inscription.createPersonne("a", "b", "c");
		Personne.setMail("d");
		String m = Personne.getMail();
		assertEquals("d",m);
	}
	
	@Test
	public void testGetEquipes() {
		Inscriptions inscri = Inscriptions.getInscriptions();
		Personne Personne = inscri.createPersonne("a", "b", "c");
		Equipe Equipe = inscri.createEquipe("1");
		Equipe Equipe1 = inscri.createEquipe("2");
		Equipe.add(Personne);
		Equipe1.add(Personne);
		assertTrue(Personne.getEquipes().contains(Equipe));
		assertTrue(Personne.getEquipes().contains(Equipe1));
	}
	
	@Test
	public void testToString() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		Personne Personne = inscriptions.createPersonne("a", "b", "c");
		assertNotNull(Personne.toString());

				
	}


	
	
}
