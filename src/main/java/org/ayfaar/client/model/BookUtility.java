package org.ayfaar.client.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yurec
 * Date: 03.11.12
 * Time: 22:47
 * To change this template use File | Settings | File Templates.
 */
public class BookUtility {
    private static List<Book> list;
    private static Map<String, Book> map;

    public static List<Book> getSortedList() {
        init();
        return list;
    }

    private static void init() {
        if (list == null) {
            list = new ArrayList<Book>();

            Book book = new Book();
            book.setName("BDK10p1");
            book.setId("101023200856-c6ae1e90095a4aa9aa72e0e9cf04383e");
            book.setPages(272);
//            book.setPages(272);
            list.add(book);

            book = new Book();
            book.setName("BDK10p2");
            book.setId("101027055029-20e6e1ed123d4da79397386f44466fb8");
            book.setPages(191);
            list.add(book);

            map = new HashMap<String, Book>();

            for (Book b : list) {
                map.put(b.getId(), b);
            }

        }
    }

    public static Book getBookById(String id) {
        return map.get(id);
    }
}
