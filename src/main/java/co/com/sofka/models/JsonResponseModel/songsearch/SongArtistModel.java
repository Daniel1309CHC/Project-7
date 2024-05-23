package co.com.sofka.models.JsonResponseModel.songsearch;


public class SongArtistModel {
    private String songName;
    private String artistName;


    public SongArtistModel(String artistName, String songName) {
        this.songName = songName;
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
