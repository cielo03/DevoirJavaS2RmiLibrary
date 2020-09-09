package devoirs2.java.service;

import devoirs2.java.model.Client;
import devoirs2.java.model.Commande;
import devoirs2.java.model.Utilisateur;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IUtilisateur extends Remote {

    public List<Utilisateur> allUtilisateur() throws RemoteException;
    public void ajouterUtilisateur(Utilisateur cli) throws RemoteException;
    public void modifUtilisateur(Utilisateur cli) throws RemoteException;
    public void deleteUtilisateur(Utilisateur cmd) throws RemoteException;
    public Utilisateur findById(int id) throws RemoteException;
    public List<Utilisateur> allUsersByEtat() throws RemoteException;
    public Utilisateur findByLogin(String login) throws RemoteException;

}
