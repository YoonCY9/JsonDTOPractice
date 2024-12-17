package yoon.JSONDTO;

import java.util.List;

public record RestaurantReview(String restaurantName,
                               String reviewer,
                               double rating,
                               String visitDate,
                               String review,
                               List<String> photos,
                               MenuInformation menu)
                                                        {
}
