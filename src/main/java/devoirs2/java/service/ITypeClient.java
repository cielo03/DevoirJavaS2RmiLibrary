package devoirs2.java.service;

import devoirs2.java.model.TypeClient;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ITypeClient extends Remote {
    public List<TypeClient> allTypeClients() throws RemoteException;
    public TypeClient findById(int id) throws RemoteException;
}
