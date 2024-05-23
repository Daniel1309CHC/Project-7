package co.com.sofka.models.JsonResponseModel.songsearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackListItem{
	private Track track;

	public Track getTrack(){
		return track;
	}
}
