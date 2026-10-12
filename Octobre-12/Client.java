import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Helloo comp = (Helloo) registry.lookup("Hello");
            String response = comp.sayHello("Monde");
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}