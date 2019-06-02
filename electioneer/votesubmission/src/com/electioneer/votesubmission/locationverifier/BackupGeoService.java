package com.electioneer.votesubmission.locationverifier;

import com.electioneer.geoservice.api.GeoService;
import com.electioneer.geoservice.api.LocationData;

import static com.electioneer.geoservice.api.LocationData.locationData;

public class BackupGeoService implements GeoService {

    @Override
    public LocationData getLocation(String x, String y) {
        System.out.println("Calling the backup geo service!");
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
