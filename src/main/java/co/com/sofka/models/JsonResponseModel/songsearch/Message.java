package co.com.sofka.models.JsonResponseModel.songsearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message{
	private Header header;
	private Body body;

	public Header getHeader(){
		return header;
	}

	public Body getBody(){
		return body;
	}
}
