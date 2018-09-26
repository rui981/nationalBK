package dto;

public class Token {

	private boolean sucess;
	private String expires_at;
	private String request_token;
	public boolean isSucess() {
		return sucess;
	}
	public void setSucess(boolean sucess) {
		this.sucess = sucess;
	}
	public String getExpires_at() {
		return expires_at;
	}
	public void setExpires_at(String expires_at) {
		this.expires_at = expires_at;
	}
	public String getRequest_token() {
		return request_token;
	}
	public void setRequest_token(String request_token) {
		this.request_token = request_token;
	}
	
	
	
}
