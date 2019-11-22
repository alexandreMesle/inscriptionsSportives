package testUnitaire;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import org.junit.Test;

import inscriptions.Competition;
import inscriptions.Inscriptions;
import junit.framework.TestCase;

public class testCompetition extends TestCase{

	@Test
	public void testSetNomCompetition() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		String nomCompetition = "java";
		LocalDate date = LocalDate.now();
		Competition competition = inscriptions.createCompetition("Mondial de fléchettes", date, false);
		competition.setNom(nomCompetition);
		assertEquals(competition.getNom(), nomCompetition);
	}
	
	@Test
	public void testGetNomCompetition() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		String nomCompetition = "java";
		LocalDate date = LocalDate.now();
		Competition competition = inscriptions.createCompetition(nomCompetition, date, false);
		assertEquals(competition.getNom(), nomCompetition);
	}
	
	
	@Test
	public void testSetDateCloture() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		String nomCompetition = "java";
		LocalDate date = LocalDate.now();
		Competition competition = inscriptions.createCompetition("Mondial de fléchettes", date, false);
		assertEquals(competition.getDateCloture(), date);	
	}
	
	@Test
	public void testGetDateCloture() {
		Inscriptions inscriptions = Inscriptions.getInscriptions();
		String nomCompetition = "java";
		LocalDate localDate2 = LocalDate.of(2017, Month.MAY, 15);		
		Competition competition = inscriptions.createCompetition("Mondial de fléchettes", localDate2, false);
		competition.setDateCloture(localDate2);
		assertEquals(competition.getDateCloture(), localDate2);	
	}

	
}
