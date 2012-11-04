package org.ayfaar.client.activities;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.googlecode.mgwt.ui.client.widget.celllist.Cell;
import org.ayfaar.client.model.Book;

/**
 * Created with IntelliJ IDEA.
 * User: yurec
 * Date: 04.11.12
 * Time: 21:57
 * To change this template use File | Settings | File Templates.
 */
public class BookCell implements Cell<Book> {

    private static Template TEMPLATE = GWT.create(Template.class);

    public interface Template extends SafeHtmlTemplates {
        @SafeHtmlTemplates.Template("<div>{0}</div>")
        SafeHtml content(String cellContent);
    }

    @Override
    public void render(SafeHtmlBuilder safeHtmlBuilder, Book book) {
        SafeHtml content = TEMPLATE.content(book.getName());
        safeHtmlBuilder.append(content);
    }

    @Override
    public boolean canBeSelected(Book book) {
        return true;
    }
}
