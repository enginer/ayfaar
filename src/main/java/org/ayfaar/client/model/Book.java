package org.ayfaar.client.model;

/**
 * Created with IntelliJ IDEA.
 * User: yurec
 * Date: 03.11.12
 * Time: 22:44
 * To change this template use File | Settings | File Templates.
 */
public class Book {

    private String name;
    private String id;
    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
