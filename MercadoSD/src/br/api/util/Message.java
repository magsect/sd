package br.api.util;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Message implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String user;
	private String message;
	
	//private String userAndMessage;
	
	private static List<Message> lstMessage = new ArrayList<Message>();
	
	public Message(String user, String message) {
		this.user = user;
		this.message = message;
	}
	
//	public Message(String userAndMessage) {
//		this.userAndMessage = userAndMessage;
//	}
	public static List<Message> getListMessage(){
		return lstMessage;
	}
	
//	public String getUserAndMessage() {
//		return userAndMessage;
//	}
//	public void setUserAndMessage(String userAndMessage) {
//		this.userAndMessage = userAndMessage;
//	}
	public static void setListMessage(Message msg) {
		lstMessage.add(msg);
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
