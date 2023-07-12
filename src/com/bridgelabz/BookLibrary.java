package com.bridgelabz;

import java.util.PriorityQueue;

public class BookLibrary implements Comparable<BookLibrary> {
    private String title;
    private int publishedYear;
    private String author;

    public BookLibrary(String title, String author,int publishedYear) {
        this.title = title;
        this.author=author;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    @Override
    public int compareTo(BookLibrary other) {
        return publishedYear - other.publishedYear;
    }

    @Override
    public String toString() {
        return "BookLibrary{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }

    public static void main(String[] args) {
        PriorityQueue<BookLibrary> bookQueue = new PriorityQueue<>();
        bookQueue.add(new BookLibrary("Wings of Fire", "A.P.J.Abdul kalam",1999));
        bookQueue.add(new BookLibrary("The Secret", "Rhonda Byrne",2006));
        bookQueue.add(new BookLibrary("The Power of your Subconscious mind", "Joseph Murphy",1963));

        while (!bookQueue.isEmpty()) {
            System.out.println(bookQueue.remove());
        }
    }
}
