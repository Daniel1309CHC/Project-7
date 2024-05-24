package co.com.sofka.stepdefinitions.servicerest;

public class Constants {
    public final static String PATH_KEY_SONG_NAME = "$.message.body.track_list[0].track";
    public final static String PATH_KEY_ARTIST_NAME = "message.body.artist_list[0].artist";

    public final static String MM_RS = "4a8257482b7cbe3a2a5729430988517c";
    public final static String ROOT_URL_MUSIXMATCH = "https://api.musixmatch.com/ws/1.1/";

    public final static String PARAM_NAME_ARTIST = "q_artist";
    public final static String PARAM_NAME_SONG = "q_track";
    public final static String PARAM_API_KEY = "apikey";

    public final static String UTIL_BAR = "******************************************";
    public final static String UTIL_ANSWER_CODE = "el codigo de respuesta";

}
