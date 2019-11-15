package inscriptions;

import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Représente une Equipe. C'est-à-dire un ensemble de personnes pouvant 
 * s'inscrire à une compétition.
 * 
 */

public class Equipe extends Candidat 
{
	private static final long serialVersionUID = 4147819927233466035L;
	private SortedSet<Personne> membres = new TreeSet<>();

	
	
	Equipe(Inscriptions inscriptions, String nom)
	{
		super(inscriptions, nom);
	}

	/**
	 * Retourne l'ensemble des personnes formant l'équipe.
	 */
	
	public SortedSet<Personne> getMembres()
	{
		return Collections.unmodifiableSortedSet(membres);
	}
	
	/**
	 * Ajoute une personne dans l'équipe.
	 * @param membre
	 * @return
	 */

	public boolean add(Personne membre)
	{
		membre.add(this);
		return membres.add(membre);
	}

	/**
	 * Supprime une personne de l'équipe. 
	 * @param membre
	 * @return
	 */
	
	public boolean remove(Personne membre)
	{
		membre.remove(this);
		return membres.remove(membre);
	}

	/**
	 * Retourne les personnes que l'on peut ajouter dans cette équipe.
	 * @return les personnes que l'on peut ajouter dans cette équipe.
	 */
	
	public Set<Personne> getPersonnesAAjouter()
	{
		// TODO retourner les personnes que l'on peut ajouter dans cette équipe.
		SortedSet<Personne> non_membres = new TreeSet<>();
		for(Personne p : inscriptions.getPersonnes())
			if(!(getMembres().contains(p)))
				non_membres.add(p);
		return Collections.unmodifiableSortedSet(non_membres);
	}
	
	@Override
	public void delete()
	{
		super.delete();
	}
	
	@Override
	public String toString()
	{
		return "Equipe " + super.toString();
	}
}
