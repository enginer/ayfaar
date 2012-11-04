package org.ayfaar.client.activities;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * Created with IntelliJ IDEA.
 * User: yurec
 * Date: 04.11.12
 * Time: 22:30
 * To change this template use File | Settings | File Templates.
 */
public class ReadingPlace extends Place {

    private String id;

    public ReadingPlace(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static class HomePlaceTokenizer implements PlaceTokenizer<ReadingPlace> {

        @Override
        public ReadingPlace getPlace(String s) {
            return new ReadingPlace(s);
        }

        @Override
        public String getToken(ReadingPlace readingPlace) {
            return readingPlace.getId();
        }
    }
}
