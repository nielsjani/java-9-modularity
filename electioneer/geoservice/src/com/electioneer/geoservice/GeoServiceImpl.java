package com.electioneer.geoservice;

import static com.electioneer.geoservice.LocationData.locationData;

public class GeoServiceImpl implements GeoService {
    @Override
    public LocationData getLocation(String x, String y) {
        if(x.equals("1")) {
            return locationData()
                    .withMunicipality("Boortmeerbeekegem")
                    .withRegion("VLAANDEREN")
                    .withCountry("Belgium")
                    .withPlanet("Earth");
        }
        if(x.equals("2")) {
            return locationData()
                    .withMunicipality("Visé")
                    .withRegion("WALLONIE")
                    .withCountry("Belgique")
                    .withPlanet("Terre");
        }
        if(y.equals("3")) {
            return locationData()
                    .withMunicipality("AAAOOOIIUUEE + 23")
                    .withRegion("¨¨***[)àç!")
                    .withCountry("___       ___     _____   _           _")
                    .withPlanet("///\\\\///\\;;;,;;,,=====++++~~~~~~~~~%%%ù´´ °26");
        }
        return locationData()
                .withMunicipality("Leuven")
                .withRegion("VLAANDEREN")
                .withCountry("Belgium")
                .withPlanet("Earth");
    }
}
