package com.vti.entity;


public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rates = new int[3];

    public int getId() {
        return id;
    }

    public float getAverageRate() {
        return averageRate;
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

    public int[] getRates() {
        return rates;
    }

    public void setRates(int[] rates) {
        this.rates = rates;
    }

    // a) In thông tin
    @Override
    public void Display() {
        System.out.println("Title: " + title);
        System.out.println("Publish Date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Average Rate: " + averageRate);
    }

    // b) Tính trung bình đánh giá
    @Override
    public float Calculate() {
        int sum = 0;
        for (int rate : rates) {
            sum += rate;
        }
        averageRate = (float) sum / rates.length;
        return averageRate;
    }
}
