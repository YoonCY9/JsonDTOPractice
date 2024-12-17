package yoon.JSONDTO;

public record Products(String id,
                       String name,
                       String brand,
                       int price,
                       boolean inStock,
                       PhoneInformation specs) {
}
