package co.com.sofka.models.JsonResponseModel.artistsearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Body{
	private List<ArtistListItem> artist_list;

	public List<ArtistListItem> getArtist_list(){
		return artist_list;
	}

	@Override
	public String toString() {
		return "Body{" +
				"artistList=" + artist_list +
				'}';
	}
}