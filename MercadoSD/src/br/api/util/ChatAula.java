package br.api.util;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ChatAula extends UnicastRemoteObject implements IChatAula{

	public ChatAula() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 613416731236786L;

	@Override
	public void sendMessage(Message msg) throws RemoteException {
		Message.setListMessage(msg);
	}

	@Override
	public List<Message> retrieveMessage() throws RemoteException {
		return Message.getListMessage();
	}
		

}
