package com.entity;

import java.util.Scanner;

public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private Float averageRate;
    private int[] Rates = new int[3];

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

    public Float getAverageRate() {
        return averageRate;
    }

    public void inputRates(Scanner sc) {
        System.out.println("Enter 3 rates:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Rate " + (i + 1) + ": ");
            Rates[i] = sc.nextInt();
        }
        sc.nextLine(); // consume leftover newline
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Publish Date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Average Rate: " + averageRate);
    }

    @Override
    public Float calculate() {
        int sum = 0;
        for (int rate : Rates) {
            sum += rate;
        }
        averageRate = (float) sum / Rates.length;
        return averageRate;
    }


}
