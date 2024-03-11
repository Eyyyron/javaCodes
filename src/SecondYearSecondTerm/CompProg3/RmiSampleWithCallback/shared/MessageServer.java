package SecondYearSecondTerm.CompProg3.RmiSampleWithCallback.shared;

import java.rmi.*;

public interface MessageServer extends Remote {
	// method to log in to the chat system (msgCallback is used
	// as a callback and session manager/identifier)
	public void login(MessageCallback msgCallback)
			throws RemoteException, UserExistsException,
			AlreadyLoggedInException;

	// method to broadcast a message to all logged in clients
	// using msgCallback as session manager/identifier
	public void broadcast(MessageCallback msgCallback, String msg)
			throws RemoteException, NotLoggedInException;

	// method to logout from the chat system using msgCallback as
	// the session manager/identifier
	public void logout(MessageCallback msgCallback)
			throws RemoteException, NotLoggedInException;
}