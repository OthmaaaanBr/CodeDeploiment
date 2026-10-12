import java.rmi.registry.*;
import java.rmi.Naming;

public class Server {
    public static void main(String[] args) throws Exception {
        HelloImpl obj = new HelloImpl();
        LocateRegistry.createRegistry(1099);
        Naming.rebind("rmi://localhost/Hello", obj);
        System.out.println("Serveur prêt !");
    }
}