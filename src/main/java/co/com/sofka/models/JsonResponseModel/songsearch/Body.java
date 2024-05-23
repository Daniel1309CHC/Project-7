package co.com.sofka.models.JsonResponseModel.songsearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Body{
	private List<TrackListItem> track_list;

	public List<TrackListItem> getTrack_list(){
		return track_list;
	}
}