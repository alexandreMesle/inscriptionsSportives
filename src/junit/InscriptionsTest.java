package junit;

import static org.junit.Assert.assertTrue;
import java.time.LocalDate;
import org.junit.Test;
import app.Competition;
import app.Inscriptions;
import app.Personne;

public class InscriptionsTest {
	
	
	@Test
	public void testGetPersonnes() {
		Inscriptions inscription = Inscriptions.getInscriptions();
		Personne Personne1 = inscription.createPersonne("d", "e", "f");
		assertTrue(inscription.getPersonnes().contains(Personne1));
	}
	
	@Test
	public void testGetCompetitions() {
		Inscriptions inscription = Inscriptions.getInscriptions();
		Competition compet = inscription.createCompetition("a", LocalDate.now().plusDays(10), true);
		Competition compet1 = inscription.createCompetition("b", LocalDate.now().plusDays(10), true);
		assertTrue(inscription.getCompetitions().contains(compet));
		assertTrue(inscription.getCompetitions().contains(compet1));
	}

}
