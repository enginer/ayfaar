package org.ayfaar.client.activities;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.ScrollPanel;
import com.googlecode.mgwt.ui.client.widget.WidgetList;
import org.ayfaar.client.model.Book;

/**
 * Created with IntelliJ IDEA.
 * User: yurec
 * Date: 04.11.12
 * Time: 22:42
 * To change this template use File | Settings | File Templates.
 */
public class ReadingViewGwtImpl implements ReadingView {

    private LayoutPanel main;
    private HTML content;
    private Book book;
    private WidgetList list;

    public ReadingViewGwtImpl() {
        main = new LayoutPanel();

        ScrollPanel sp = new ScrollPanel();
        list = new WidgetList();
        sp.add(list);
        main.add(sp);

        content = new HTML();
        main.add(content);
    }

    @Override
    public Widget asWidget() {
        return main;
    }

    @Override
    public void setBook(Book book) {
        this.book = book;

        for (int page=1; page < book.getPages(); page++) {
            Image img = new Image("http://image.issuu.com/"+book.getId()+"/jpg/page_"+page+".jpg");
            list.add(img);
        }

    }
}
