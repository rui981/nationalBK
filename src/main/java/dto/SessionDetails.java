package dto;

import com.fasterxml.jackson.annotation.JsonInclude;

public class SessionDetails {

	private boolean sucess;
	private String session_id;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String status_message;
	
	public boolean isSucess() {
		return sucess;
	}
	public void setSucess(boolean sucess) {
		this.sucess = sucess;
	}
	public String getSession_id() {
		return session_id;
	}
	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}
	public String getStatus_message() {
		return status_message;
	}
	public void setStatus_message(String status_message) {
		this.status_message = status_message;
	}
	
	
}
