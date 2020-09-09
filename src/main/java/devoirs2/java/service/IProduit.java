package devoirs2.java.service;

import devoirs2.java.model.Produit;
import devoirs2.java.model.Utilisateur;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IProduit extends Remote {
    public List<Produit> allProduits() throws RemoteException;
    public List<Produit> allProduitsByEtat() throws RemoteException;
    public void ajouterProduit(Produit pro) throws RemoteException;
    public void modifProduit(Produit pro) throws RemoteException;
    public void deleteProduit(Produit pro) throws RemoteException;
    public Produit findById(int id) throws RemoteException;
    public Produit findByDesc(String desc) throws RemoteException;
}

