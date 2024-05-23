package co.com.sofka.models.JsonResponseModel.artistsearch;

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

	@Override
	public String toString() {
		return "Message{" +
				"header=" + header +
				", body=" + body +
				'}';
	}
}
