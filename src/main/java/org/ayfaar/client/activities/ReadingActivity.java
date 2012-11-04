package org.ayfaar.client.activities;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import org.ayfaar.client.ClientFactory;
import org.ayfaar.client.model.Book;
import org.ayfaar.client.model.BookUtility;

/**
 * Created with IntelliJ IDEA.
 * User: yurec
 * Date: 04.11.12
 * Time: 22:41
 * To change this template use File | Settings | File Templates.
 */
public class ReadingActivity extends MGWTAbstractActivity {

    private ClientFactory clientFactory;

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        ReadingView view = clientFactory.getReadingView();

        Place place = clientFactory.getPlaceController().getWhere();

        if (place instanceof ReadingPlace) {
            ReadingPlace readingPlace = (ReadingPlace) place;

            Book book = BookUtility.getBookById(readingPlace.getId());

            view.setBook(book);

        }

        panel.setWidget(view);
    }

    public ReadingActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }
}
