package devoirs2.java.service;

import devoirs2.java.model.Client;
import devoirs2.java.model.Commande;
import devoirs2.java.model.Produit;
import devoirs2.java.model.Utilisateur;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ICommande extends Remote {
    public List<Commande> allCommandes() throws RemoteException;
    public List<Commande> allCommandesByEtat() throws RemoteException;
    public void ajouterCommande(Commande cmd) throws RemoteException;
    public void modifCommande(Commande cmd) throws RemoteException;
    public void deleteCommande(Commande cmd) throws RemoteException;
    public Commande findById(int id) throws RemoteException;
    public Commande findByNum(String num) throws RemoteException;
    public int generNum() throws RemoteException;
}
