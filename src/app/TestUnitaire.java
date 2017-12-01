package app;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import org.junit.Test;

class TestsJUnit {
	
	private LocalDate ld = LocalDate.now();
	private Inscriptions inscriptions = Inscriptions.getInscriptions();
	private Competition competition = new Competition(inscriptions,"League Of Legends World Championships",ld,true);
	private Equipe equipe = new Equipe (inscriptions,"Ginette");
	private Personne personne = new Personne (inscriptions,"Mesle","Alexandre","lepurificateur@godlike.com");
	
	@Test
	public void testCompetition()
	{
		assertEquals("Date de clôture de la compétition : ",LocalDate.now(), competition.getDateCloture());
		assertEquals("Nom de la compétition : ","League Of Legends World Championships", competition.getNom());		
	}
	
	@Test
	public void testEquipe()
	{
		assertEquals("Membres de l'équipe : ", equipe.getMembres(), equipe.getMembres());
	}
	
	@Test
	public void testPersonne()
	{
		assertEquals("Mail : ", "lepurificateur@godlike.com", personne.getMail());
		assertEquals("Prénom : ", "Alexandre", personne.getPrenom());
		assertEquals("Nom : ", "Mesle", personne.getNom());
	}
}