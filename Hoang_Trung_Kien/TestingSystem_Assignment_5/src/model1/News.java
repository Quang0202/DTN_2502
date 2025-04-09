package model1;

import java.util.Scanner;

public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public News() {
    }

    public News(int id, String title) {
        this.id = id;
        this.title = title;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public void Display() {
        System.out.println("Title: " + title);
        System.out.println("Publish date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Average rate: " + averageRate);
    }

    @Override
    public float Calculate() {
        int[] Rates = new int[3];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int r : Rates) {
            System.out.println("Nhap danh gia: ");
            r = scanner.nextInt();
            sum += r;
        }
        averageRate = (float) sum/3;
        return (float) sum /3;
    }
}
