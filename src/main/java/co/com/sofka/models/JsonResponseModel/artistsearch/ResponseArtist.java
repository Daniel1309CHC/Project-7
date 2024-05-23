package co.com.sofka.models.JsonResponseModel.artistsearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseArtist {

	private Message message;
	public Message getMessage(){
		return message;
	}

	@Override
	public String toString() {
		return "Response{" +
				"message=" + message +
				'}';
	}
}
