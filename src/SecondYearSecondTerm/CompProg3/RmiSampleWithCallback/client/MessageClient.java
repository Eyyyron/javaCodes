package SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.shared.MessageServer;
import SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.shared.User;
import SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.shared.AlreadyLoggedInException;
import SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.shared.UserExistsException;

public class MessageClient {
	public static void main(String[] args) {
		try {
			Registry reg = LocateRegistry.getRegistry("localhost");
			MessageServer msgServer = (MessageServer) reg.lookup("msgserver");
			Scanner kbd = new Scanner(System.in);
			String input = "";
			MessageCallbackImpl mci = null;
			User user = new User();

			while (true) {
				try {
					do {
						System.out.print("type your name: ");
						input = kbd.nextLine();
					} while (input.equals(""));
					user.setName(input);
					mci = new MessageCallbackImpl(user);
//					UnicastRemoteObject.exportObject(mci);
					msgServer.login(mci);
					break;
				} catch (AlreadyLoggedInException e) {
					System.out.println(e.getMessage());
					break;
				} catch (UserExistsException e) {
					System.out.println(e.getMessage());
				}
			}

			System.out.println("chat away!!!!\n");
			while (true) {
				input = kbd.nextLine();
				if (!input.equals("exit")) {
					msgServer.broadcast(mci, input);
				} else {
					msgServer.logout(mci);
					break;
				}
			}
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}