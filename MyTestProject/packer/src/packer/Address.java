package packer;

/**
 *
 * @author Vasili
 */
public class Address {
    private String street;
    private String suburb;
    private String city;
    private String postcode;
    private Coordinates coordinates;

    public Address(String street, String suburb, String city, String postcode, Coordinates coordinates) {
        this.street = street;
        this.suburb = suburb;
        this.city = city;
        this.postcode = postcode;
        this.coordinates = coordinates;
    }
    /**
     * Added @override annotation to help prevent errors
     * @return Returns Address details
     */
    @Override
    public String toString() {
        return 
                street + "\n" +
                suburb + "\n" +
                city + "\n" +
                postcode;
    }
    /**
     * @return the coordinates
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    
}
