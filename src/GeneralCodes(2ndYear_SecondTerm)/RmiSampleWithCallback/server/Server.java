package SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.server;

import java.rmi.registry.*;
import SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.shared.MessageServer;

public class Server {
	public static void main(String[] args) {
		try {
			MessageServer servant = new MessageServerImpl();
			Registry reg = LocateRegistry.createRegistry(1099);
			reg.rebind("msgserver",servant);
			System.out.println("message server running...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}