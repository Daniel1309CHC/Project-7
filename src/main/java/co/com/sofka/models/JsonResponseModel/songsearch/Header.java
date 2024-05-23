package co.com.sofka.models.JsonResponseModel.songsearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Header{
	private int status_code;
	private Object execute_time;
	private int available;

	public int getStatus_code(){
		return status_code;
	}

	public Object getExecute_time(){
		return execute_time;
	}

	public int getAvailable(){
		return available;
	}
}
