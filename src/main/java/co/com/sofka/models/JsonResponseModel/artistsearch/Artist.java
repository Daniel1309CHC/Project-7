package co.com.sofka.models.JsonResponseModel.artistsearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist{

	private String updated_time;
	private String artist_name;
	private String artist_twitter_url;
	private int artist_rating;
	private String artist_country;
	private int artist_id;
	private String artist_mbid;

	public String getUpdated_time(){
		return updated_time;
	}

	public String getArtist_name(){
		return artist_name;
	}

	public String getArtist_twitter_url(){
		return artist_twitter_url;
	}

	public int getArtist_rating(){
		return artist_rating;
	}

	public String getArtist_country(){
		return artist_country;
	}

	public int getArtist_id(){
		return artist_id;
	}

	public String getArtist_mbid(){
		return artist_mbid;
	}

	@Override
	public String toString() {
		return "Artist{" +
				"updatedTime='" + updated_time + '\'' +
				", artistName='" + artist_name + '\'' +
				", artistTwitterUrl='" + artist_twitter_url + '\'' +
				", artistRating=" + artist_rating +
				", artistCountry='" + artist_country + '\'' +
				", artistId=" + artist_id +
				", artistMbid='" + artist_mbid + '\'' +
				'}';
	}
}