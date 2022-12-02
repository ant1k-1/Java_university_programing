package new_pracs.practice_13.task3;

import java.util.StringTokenizer;

public class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String building;
    String apartment;

    public Address(String address, boolean token){
        int counter = 0;
        if (!token){
            String[] addresses = address.split(", ");
            country = addresses[0];
            region = addresses[1];
            city = addresses[2];
            street = addresses[3];
            house = addresses[4];
            building = addresses[5];
            apartment = addresses[6];
        } else {
            StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
            country = tokenizer.nextToken();
            region = tokenizer.nextToken();
            city = tokenizer.nextToken();
            street = tokenizer.nextToken();
            house = tokenizer.nextToken();
            building = tokenizer.nextToken();
            apartment = tokenizer.nextToken();
        }
        country = country.replace(" ", "");
        region = region.replace(" ", "");
        city = city.replace(" ", "");
        street = street.replace(" ", "");
        house = house.replace(" ", "");
        building = building.replace(" ", "");
        apartment = apartment.replace(" ", "");
    }

    @Override
    public String toString() {
        return "Country: " + country + " " +
                "Region: " + region + " " +
                "City: " + city + " " +
                "Street: " + street + " " +
                "House: " + house + " " +
                "Corpus: " + building + " " +
                "Apartment: " + apartment;
    }
}
