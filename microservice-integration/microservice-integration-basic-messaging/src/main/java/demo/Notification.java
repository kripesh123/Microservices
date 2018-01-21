package demo;

import java.io.Serializable;
import java.util.Date;

public class Notification implements Serializable{
	
	private String id;
	private final String message;
	private final Date date;
	
	public Notification(String id, String message, Date date) {super();
		this.id = id;
		this.message = message;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Notification [id=" + id + ", message=" + message + ", date=" + date + "]";
	}
	
	
}
