package devoirs2.java.service;

import devoirs2.java.model.Profile;
import devoirs2.java.model.TypeClient;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IProfile extends Remote {
    public List<Profile> allProfile() throws RemoteException;
    public Profile findById(int id) throws RemoteException;
}
