package yoon.JSONDTO;

import java.util.List;

public record MusicAlbumInformation(List<Artist> artists,
                                    String id,
                                    List<Image> images,
                                    String name,
                                    String release_date,
                                    int total_tracks,
                                    String type) {

    public record Artist(String id, String name){
    }
    public record Image(int height, String url, String width) {
    }
}
