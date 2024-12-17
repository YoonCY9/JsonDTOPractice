package yoon.JSONDTO;

public record MovieBookingInformation(String movieTitle,
                                      Where theater,
                                      String showtime,
                                      MovieSeat seats
                                      ) {
}
