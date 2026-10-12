import java.rmi.*;

public interface Helloo extends Remote {
    String sayHello(String name) throws RemoteException;
}