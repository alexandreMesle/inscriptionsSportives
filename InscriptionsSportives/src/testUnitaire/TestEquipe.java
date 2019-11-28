package testUnitaire;

import static org.junit.Assert.*;

import org.junit.Test;

import inscriptions.Equipe;
import inscriptions.Inscriptions;

public class TestEquipe {

	@Test
	public void testDelete() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		String nomEquipe = "java";
		Equipe equipe = inscriptions.createEquipe(nomEquipe);
		equipe.delete();
		assertEquals(!(inscriptions.getEquipes().contains(equipe)),true);
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquipe() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMembres() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddPersonne() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		Equipe equipe = inscriptions.createEquipe("java");
		Personne personne = inscriptions.createPersonne("Joueur", "Un", "mail");
		equipe.add(personne);
		assertEquals(equipe.getMembres().contains(personne),true);
	}

	@Test
	public void testRemovePersonne() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		Equipe equipe = inscriptions.createEquipe("java");
		Personne personne = inscriptions.createPersonne("J", "1", "mail");
		equipe.add(personne);
		equipe.remove(personne);
		assertEquals(!(equipe.getMembres().contains(personne)),true);
	}

	@Test
	public void testGetPersonnesAAjouter() {
		fail("Not yet implemented");
	}

}
