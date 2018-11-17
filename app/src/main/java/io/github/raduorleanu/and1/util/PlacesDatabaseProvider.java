package io.github.raduorleanu.and1.util;

import io.github.raduorleanu.and1.database_mock.PlacesDbMock;
import io.github.raduorleanu.and1.interfaces.IDatabasePlaceAdapter;

public class PlacesDatabaseProvider {

    public static IDatabasePlaceAdapter placesDatabase;

    public static IDatabasePlaceAdapter getPlacesDatabase() {
        if(placesDatabase == null) {
            placesDatabase = new PlacesDbMock();
            return placesDatabase;
        }
        return placesDatabase;
    }

}