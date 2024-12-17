package yoon.JSONDTO;

import java.util.List;

public record MusicTrack(String title,
                         String artist,
                         String album,
                         String duration,
                         String releaseDate,
                         List<String> genres,
                         MusicInformation features
                         ) {
}
