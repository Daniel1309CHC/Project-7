package co.com.sofka.models.JsonResponseModel.artistsearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtistListItem{
	private Artist artist;

	public Artist getArtist(){
		return artist;
	}

	@Override
	public String toString() {
		return "ArtistListItem{" +
				"artist=" + artist +
				'}';
	}
}
