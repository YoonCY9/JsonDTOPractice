package yoon.JSONDTO.Trip;

import java.util.List;

public record TripPackage(String packageName,
                          String destination,
                          TripDuration duration,
                          int price,
                          boolean includesFlights,
                          Accommodation accommodation,
                          Itinerary itinerary,
                          int maxParticipants,
                          List<String> availableDates) {

    public record TripDuration(int nights, int days) {
    }
    public record Accommodation(String hotelName, String roomType){
    }
    public record Itinerary(List<ItineraryInformation> itinerary){
    }
    public record ItineraryInformation(int day, List<String> activities)  {
    }
}
