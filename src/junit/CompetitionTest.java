package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import app.Competition;
import app.Equipe;
import app.Inscriptions;
import app.Personne;

public class CompetitionTest {
	
	@Test
	public void testGetNom() {
		app.Inscriptions inscriptions = app.Inscriptions.getInscriptions(); 
		Competition compet = inscriptions.createCompetition("Tournoi de fléchettes", null, true);
		assertEquals("Tournoi de fléchettes", compet.getNom());
	}

	@Test
	public void testSetNom() {
		app.Inscriptions inscriptions = app.Inscriptions.getInscriptions(); 
		Competition compet = inscriptions.createCompetition("gertrude", null, true);
		compet.setNom("gertrude");
		assertEquals("gertrude", compet.getNom());
	}
	
	@Test
	public void testGetCandidats() {
		Inscriptions inscription = Inscriptions.getInscriptions();
		Competition compet = inscription.createCompetition("testCompet", LocalDate.now(), false);
		Personne aby = inscription.createPersonne("ha", "oh", "eh");
		Personne Thresh = inscription.createPersonne("ha", "oh", "eh");
		compet.add(aby);
		compet.add(Thresh);
		assertTrue(compet.getCandidats().contains(aby));
		assertTrue(compet.getCandidats().contains(Thresh));
	}
	
	@Test
	public void testAddPersonne() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		Competition compet = inscriptions.createCompetition("test", null, false);
		Personne personne = inscriptions.createPersonne("test", "prenom", "mail");
		compet.add(personne);
		assertTrue(compet.getCandidats().contains(personne));
	}
	
	@Test
	public void testAddEquipe() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		LocalDate date = LocalDate.now().plusDays(20);
		Competition c = inscriptions.createCompetition("test", date, true);
		Personne p1 = inscriptions.createPersonne("test", "prenom", "mail");
		Personne p2 = inscriptions.createPersonne("test", "prenom", "mail");
		Personne p3 = inscriptions.createPersonne("test", "prenom", "mail");
		Equipe e1 = inscriptions.createEquipe("testTeam");
		Equipe e2 = inscriptions.createEquipe("testTeam");
		e1.add(p1);
		e2.add(p2);
		e2.add(p3);
		c.add(e1);
		c.add(e2);
		int sizeBefore = inscriptions.getCandidats().size();
		Equipe eq = inscriptions.createEquipe("Thresh");
		Personne Personne = inscriptions.createPersonne("test", "test", "mail");
		eq.add(Personne);
		c.add(eq);
		assertTrue(inscriptions.getCandidats().contains(eq));
		int sizeAfter = inscriptions.getCandidats().size();
		assertEquals(sizeBefore+1,sizeAfter);
	}
	

	

}
