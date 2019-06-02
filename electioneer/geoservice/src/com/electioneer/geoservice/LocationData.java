package com.electioneer.geoservice;

public class LocationData {
    private String municipality;
    private String region;
    private String country;
    private String planet;

    public static LocationData locationData() {
        return new LocationData();
    }

    public String getMunicipality() {
        return municipality;
    }

    public LocationData withMunicipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public LocationData withRegion(String region) {
        this.region = region;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public LocationData withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPlanet() {
        return planet;
    }

    public LocationData withPlanet(String planet) {
        this.planet = planet;
        return this;
    }
}
