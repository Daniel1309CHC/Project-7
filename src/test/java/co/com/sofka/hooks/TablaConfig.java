package co.com.sofka.hooks;

import co.com.sofka.models.JsonResponseModel.songsearch.SongArtistModel;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class TablaConfig {
    @DataTableType
    public SongArtistModel datos(Map<String,String> info){
        return new SongArtistModel(
                info.get("artistName"),
                info.get("songName")

        );
    }
}
