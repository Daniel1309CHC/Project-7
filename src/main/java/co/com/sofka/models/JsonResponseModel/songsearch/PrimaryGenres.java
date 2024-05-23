package co.com.sofka.models.JsonResponseModel.songsearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PrimaryGenres{
	private List<Object> musicGenreList;

	public List<Object> getMusicGenreList(){
		return musicGenreList;
	}
}