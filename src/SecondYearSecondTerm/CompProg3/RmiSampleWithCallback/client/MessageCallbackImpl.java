package SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.client;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.shared.MessageCallback;
import SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.shared.User;

public class MessageCallbackImpl extends UnicastRemoteObject
		implements MessageCallback, Serializable {
	private User user;

	public MessageCallbackImpl(User user) throws RemoteException {
		this.user = user;
	}

	public User getUser() throws RemoteException {
		return user;
	}

	// All methods below are printing messages to the console
	// although these methods can also be used to modify the
	// contents of the client's GUI elements
	public void loginCall(User user) throws RemoteException {
		System.out.println(user.getName() + " logged in...");
	}

	public void broadcastCall(User user, String msg) throws RemoteException {
		System.out.println("[" + user.getName() + "]: " + msg);
	}

	public void logoutCall(User user) throws RemoteException  {
		System.out.println(user.getName() + " logged out...");
	}
}