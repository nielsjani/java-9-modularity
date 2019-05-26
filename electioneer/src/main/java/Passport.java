public class Passport {
    private String id;
    private String hologramData;
    private String locationData;
    private String personalData;

    public static Passport passport(){
        return new Passport();
    }

    public String getId() {
        return id;
    }

    public Passport withId(String id) {
        this.id = id;
        return this;
    }

    public String getHologramData() {
        return hologramData;
    }

    public Passport withHologramData(String hologramData) {
        this.hologramData = hologramData;
        return this;
    }

    public String getLocationData() {
        return locationData;
    }

    public Passport withLocationData(String locationData) {
        this.locationData = locationData;
        return this;
    }

    public String getPersonalData() {
        return personalData;
    }

    public Passport withPersonalData(String personalData) {
        this.personalData = personalData;
        return this;
    }
}
