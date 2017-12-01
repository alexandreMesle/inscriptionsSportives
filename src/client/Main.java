/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import app.Inscriptions;
/**
 *
 * @author eight
 */
public class Main {
    public static void main(String[] args){
        Inscriptions inscriptions = Inscriptions.getInscriptions();
        System.out.println(inscriptions);
//        Inscriptions inscriptions = Inscriptions.getInscriptions();
//        Competition flechettes = inscriptions.createCompetition("Mondial de fléchettes", null, false);
//        Personne tony = inscriptions.createPersonne("Tony", "Dent de plomb", "azerty"),
//        boris = inscriptions.createPersonne("Boris", "le Hachoir", "ytreza");
//        flechettes.add(tony);
//        Equipe lesManouches = inscriptions.createEquipe("Les Manouches");
//        lesManouches.add(boris);
//        lesManouches.add(tony);
//        System.out.println(inscriptions);
//        lesManouches.delete();
//        System.out.println(inscriptions);
//        try
//        {
//            inscriptions.sauvegarder();
//        }
//        catch (IOException e)
//        {
//            System.out.println("Sauvegarde impossible." + e);
//        }
    }
}
