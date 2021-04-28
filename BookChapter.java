/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.ArrayList;

/**
 *
 * @author ReileyMeeks
 */
public class BookChapter {
    private int linesPerPage;
    private ArrayList<Page> pages;
    private String title;
    private String author;

    public int getLinesPerPage() {
        return linesPerPage;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setLinesPerPage(int linesPerPage) {
        this.linesPerPage = linesPerPage;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookChapter(int lines) {
        this.linesPerPage = lines;
    }

    public BookChapter(int lines, ArrayList<Page> p) {
        this.linesPerPage = lines;
        this.pages = p;
    }

    public BookChapter(int lines, ArrayList<Page> p, String t, String a) {
        this.linesPerPage = lines;
        this.pages = p;
        this.title = t;
        this.author = a;
    }

    @Override
    public String toString() {
        return
        "Title: " + this.title + '\n' +
        "Author: " + this.author + '\n' +
        "Pages: " + this.pages.size() + '\n' +
        "Lines per page: " + this.linesPerPage + '\n' + '\n';
    }
}
