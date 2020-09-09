package devoirs2.java.service;

import devoirs2.java.model.Produit;
import devoirs2.java.model.Sortie;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ISortie extends Remote {
    public List<Sortie> allSorties() throws RemoteException;
    public void ajouterSOrtie(Sortie s) throws RemoteException;
    public void modifSortie(Sortie s) throws RemoteException;
    public void deleteSortie(Sortie s) throws RemoteException;
    public Sortie findById(int id) throws RemoteException;
}
