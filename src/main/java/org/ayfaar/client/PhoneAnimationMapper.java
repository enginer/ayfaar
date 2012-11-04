
package org.ayfaar.client;

import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.mvp.client.Animation;
import com.googlecode.mgwt.mvp.client.AnimationMapper;
import org.ayfaar.client.activities.HomePlace;
import org.ayfaar.client.activities.ReadingPlace;

/**
 * 
 */
public class PhoneAnimationMapper implements AnimationMapper {

	@Override
	public Animation getAnimation(Place oldPlace, Place newPlace) {
        if (oldPlace instanceof ReadingPlace && newPlace instanceof HomePlace) {
            return Animation.SLIDE_REVERSE;
        }
		return Animation.SLIDE;
	}

}
