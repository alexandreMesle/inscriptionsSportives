package app;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Query;

/**
 * Représente une personne physique pouvant s'inscrire à  une compétition.
 */

@Entity
@Table(name = "personne")
public class Personne extends Candidat
{
    //private static final long serialVersionUID = 4434646724271327254L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_p")
    private int id_p;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "mail")
    private String mail;
    private Set<Equipe> equipes;
    
    Personne(Inscriptions inscriptions, String nom, String prenom, String mail)
    {
        super(inscriptions, nom);
        this.prenom = prenom;
        this.mail = mail;
        equipes = new TreeSet<>();
    }
    
    public Personne()
    {
        super();
    }
    
    /**
     * Retourne le prÃ©nom de la personne.
     * @return
     */
    
    public String getPrenom()
    {
        return prenom;
    }
    
    /**
     * Modifie le prÃ©nom de la personne.
     * @param prenom
     */
    
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }
    
    /**
     * Retourne l'adresse Ã©lectronique de la personne.
     * @return
     */
    
    public String getMail()
    {
        return mail;
    }
    
    /**
     * Modifie l'adresse Ã©lectronique de la personne.
     * @param mail
     */
    
    public void setMail(String mail)
    {
        this.mail = mail;
    }
    
    /**
     * Retoure les Ã©quipes dont cette personne fait partie.
     * @return
     */
    
    public Set<Equipe> getEquipes()
    {
        return Collections.unmodifiableSet(equipes);
    }
    
    boolean add(Equipe equipe)
    {
        return equipes.add(equipe);
    }
    
    boolean remove(Equipe equipe)
    {
        return equipes.remove(equipe);
    }
    
    @Override
    public void delete()
    {
        super.delete();
        for (Equipe e : equipes)
            e.remove(this);
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " membre de " + equipes.toString();
    }
}
