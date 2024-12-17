package yoon.JSONDTO;

import java.util.List;

public record Books(String title,
                    String author,
                    int publishYear,
                    int pages,
                    List<String> genres) {
}
