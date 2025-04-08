package com.company.backend.TestingSystem5;

import java.util.Arrays;

public class News implements INews{
    // ID (int), Title (String), PublishDate (String), Author (String),
    //Content (String) và AverageRate (float).
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rates;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public int[] getRates() {
        return rates;
    }

    public void setRates(int[] rates) {
        this.rates = rates;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Publish date: " + getPublishDate());
        System.out.println("Author: " + getAuthor());
        System.out.println(getContent());
        System.out.println("Average rate: " + getAverageRate());
    }

    @Override
    public float Calculate() {
        this.averageRate = Arrays.stream(rates).sum() / rates.length;
        return getAverageRate();
    }
}
