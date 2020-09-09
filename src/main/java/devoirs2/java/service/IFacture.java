package devoirs2.java.service;

import devoirs2.java.model.Facture;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IFacture extends Remote {
    public List<Facture> allFactures() throws RemoteException;
    public void ajouterFacture(Facture cmd) throws RemoteException;
    public void modifFacture(Facture cmd) throws RemoteException;
    public void deleteFacture(Facture cmd) throws RemoteException;
    public Facture findById(int id) throws RemoteException;
    public Facture findByNum(String num) throws RemoteException;
    public int maxiNum() throws RemoteException;
}
