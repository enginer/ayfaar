
package org.ayfaar.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import org.ayfaar.client.activities.HomeActivity;
import org.ayfaar.client.activities.ReadingActivity;
import org.ayfaar.client.activities.ReadingPlace;


/**
 * 
 */
public class PhoneActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	public PhoneActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
        if (place instanceof ReadingPlace) {
            return new ReadingActivity(clientFactory);
        }
		return new HomeActivity(clientFactory);
	}
}
