package org.ayfaar.client.activities;

import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.CellList;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;
import org.ayfaar.client.model.Book;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yurec
 * Date: 03.11.12
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 */
public class HomeViewGwtImpl implements HomeView {

    private LayoutPanel main;
    private CellList<Book> cellList;

    public HomeViewGwtImpl() {
        main = new LayoutPanel();

        HeaderPanel headerPanel = new HeaderPanel();
        headerPanel.setCenter("Books");
        main.add(headerPanel);

        cellList = new CellList<Book>(new BookCell());
        cellList.setRound(true);
        main.add(cellList);
    }

    @Override
    public void render(List<Book> books) {
        cellList.render(books);
    }

    @Override
    public HasCellSelectedHandler getList() {
        return cellList;
    }

    @Override
    public Widget asWidget() {
        return main;
    }
}
