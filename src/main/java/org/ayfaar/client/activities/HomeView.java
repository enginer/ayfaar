package org.ayfaar.client.activities;

import com.google.gwt.user.client.ui.IsWidget;
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
public interface HomeView extends IsWidget {
    public void render(List<Book> books);
    public HasCellSelectedHandler getList();
}
