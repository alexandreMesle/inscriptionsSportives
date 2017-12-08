package junit;

import static org.junit.Assert.*;
import org.junit.Test;

import app.Competition;
import app.Inscriptions;
import app.Personne;

public class HibernateTest {
	
	@Test
	public void testInsertionPrenom() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		Competition flechettes = inscriptions.createCompetition("League of Legends World Championship", null, false);
	}

}
