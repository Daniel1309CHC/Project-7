package co.com.sofka.models.JsonResponseModel.songsearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Track{
	private String updated_time;
	private String track_share_url;
	private PrimaryGenres primary_genres;
	private List<Object> track_name_translation_list;
	private String artist_name;
	private int commontrack_id;
	private int artist_id;
	private int explicit;
	private int num_favourite;
	private int track_rating;
	private int has_richsync;
	private int track_id;
	private int instrumental;
	private String album_name;
	private int restricted;
	private int has_subtitles;
	private int album_id;
	private int has_lyrics;
	private String track_edit_url;
	private String track_name;

	public String getUpdated_time(){
		return updated_time;
	}

	public String getTrack_share_url(){
		return track_share_url;
	}

	public PrimaryGenres getPrimary_genres(){
		return primary_genres;
	}

	public List<Object> getTrack_name_translation_list(){
		return track_name_translation_list;
	}

	public String getArtist_name(){
		return artist_name;
	}

	public int getCommontrack_id(){
		return commontrack_id;
	}

	public int getArtist_id(){
		return artist_id;
	}

	public int getExplicit(){
		return explicit;
	}

	public int getNum_favourite(){
		return num_favourite;
	}

	public int getTrack_rating(){
		return track_rating;
	}

	public int getHas_richsync(){
		return has_richsync;
	}

	public int getTrack_id(){
		return track_id;
	}

	public int getInstrumental(){
		return instrumental;
	}

	public String getAlbum_name(){
		return album_name;
	}

	public int getRestricted(){
		return restricted;
	}

	public int getHas_subtitles(){
		return has_subtitles;
	}

	public int getAlbum_id(){
		return album_id;
	}

	public int getHas_lyrics(){
		return has_lyrics;
	}

	public String getTrack_edit_url(){
		return track_edit_url;
	}

	public String getTrack_name(){
		return track_name;
	}
}