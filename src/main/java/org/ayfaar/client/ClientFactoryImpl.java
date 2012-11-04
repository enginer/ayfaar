/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.ayfaar.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import org.ayfaar.client.activities.HomeView;
import org.ayfaar.client.activities.HomeViewGwtImpl;
import org.ayfaar.client.activities.ReadingView;
import org.ayfaar.client.activities.ReadingViewGwtImpl;

/**
 * @author Daniel Kurka
 * 
 */
public class ClientFactoryImpl implements ClientFactory {

	private EventBus eventBus;
	private PlaceController placeController;
    private HomeViewGwtImpl homeView;
    private ReadingViewGwtImpl readingView;

    public ClientFactoryImpl() {
		eventBus = new SimpleEventBus();

		placeController = new PlaceController(eventBus);

	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

    @Override
    public HomeView getHomeView() {
        if (homeView == null) {
            homeView = new HomeViewGwtImpl();
        }
        return homeView;
    }

    @Override
    public ReadingView getReadingView() {
        if (readingView == null) {
            readingView = new ReadingViewGwtImpl();
        }
        return readingView;
    }

}
