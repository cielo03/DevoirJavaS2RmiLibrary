package devoirs2.java.service;

import devoirs2.java.model.Entree;
import devoirs2.java.model.Produit;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

public interface IEntree extends Remote {
    public List<Entree> allEntrees() throws RemoteException;
    public List<Entree> allEntreesByDesc(String des) throws RemoteException;
    public void ajouterEntree(Entree e) throws RemoteException;
    public Entree findById(int id) throws RemoteException;
    public List<Entree> findAllById(int id) throws RemoteException;

}
