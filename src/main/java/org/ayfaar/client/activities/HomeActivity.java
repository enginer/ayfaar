package org.ayfaar.client.activities;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedEvent;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedHandler;
import org.ayfaar.client.ClientFactory;
import org.ayfaar.client.model.Book;
import org.ayfaar.client.model.BookUtility;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yurec
 * Date: 03.11.12
 * Time: 22:39
 * To change this template use File | Settings | File Templates.
 */
public class HomeActivity extends MGWTAbstractActivity {

    private ClientFactory clientFactory;
    private List<Book> currentModel;

    public HomeActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        HomeView view = clientFactory.getHomeView();

        currentModel = BookUtility.getSortedList();

        view.render(currentModel);

        addHandlerRegistration(view.getList().addCellSelectedHandler(new CellSelectedHandler() {
            @Override
            public void onCellSelected(CellSelectedEvent cellSelectedEvent) {

                Book book = currentModel.get(cellSelectedEvent.getIndex());

                clientFactory.getPlaceController().goTo(new ReadingPlace(book.getId()));
            }
        }));

        panel.setWidget(view);
    }
}
