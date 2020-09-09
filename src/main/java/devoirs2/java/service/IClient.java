package devoirs2.java.service;

import devoirs2.java.model.Client;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IClient extends Remote {
    public List<Client> allClients() throws RemoteException;
    public void ajouterClient(Client cli) throws RemoteException;
    public void modifClient(Client cli) throws RemoteException;
    public Client findById(int id) throws RemoteException;
    public Client findByCni(String cni) throws RemoteException;

}
