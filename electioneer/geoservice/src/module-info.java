import com.electioneer.geoservice.api.GeoService;
import com.electioneer.geoservice.impl.GeoServiceImpl;

module com.electioneer.geoservice {
    exports com.electioneer.geoservice.api;
    //Oops! Seems like someone forgot to provide :s
//    provides GeoService with GeoServiceImpl;
}