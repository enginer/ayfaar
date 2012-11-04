package org.ayfaar.client.activities;

import com.google.gwt.user.client.ui.IsWidget;
import org.ayfaar.client.model.Book;

/**
 * Created with IntelliJ IDEA.
 * User: yurec
 * Date: 04.11.12
 * Time: 22:42
 * To change this template use File | Settings | File Templates.
 */
public interface ReadingView extends IsWidget {
    void setBook(Book book);
}
