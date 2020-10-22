package us.abstracta.opencard.Data;

public class RegisterData {
    private final String city;
    private final String postcode;
    private final String country;
    private final String region;
    private final String password;

    public RegisterData(String city, String postcode, String country, String region, String password) {
        this.city = city;
        this.postcode = postcode;
        this.country = country;
        this.region = region;
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getPassword() {
        return password;
    }
}
