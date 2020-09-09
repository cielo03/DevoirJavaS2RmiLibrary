package devoirs2.java.service;

import devoirs2.java.model.Client;
import devoirs2.java.model.DetailsCommande;
import devoirs2.java.model.Produit;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IDetailsCommande extends Remote {

    public List<DetailsCommande> allDetails() throws RemoteException;
    public List<DetailsCommande> detailsByCmd(int id) throws RemoteException;
    public void ajouterDetail(DetailsCommande detail) throws RemoteException;
    public void modifDetail(DetailsCommande detail) throws RemoteException;
    public void deleteDetailsCommande(DetailsCommande detail) throws RemoteException;
    public DetailsCommande findById(int id) throws RemoteException;

}
