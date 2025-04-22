package Question01_5;

import java.lang.reflect.Array;
import java.util.Random;

public  class News implements INews {
   private int ID;
   private String Title;
   private String PublishDate;
   private String Author;
   private String Content;
   private float AverageRate;
   private int[] rates = new int[5];

    public News(int ID, String Title, String PublishDate, String Author, String Content, float AverageRate) {
        this.ID = ID;
        this.Title = Title;
        this.PublishDate = PublishDate;
        this.Author = Author;
        this.Content = Content;
        this.AverageRate = AverageRate;
    }
    public News() {}
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public int[] getRates() {
        return rates;
    }

    public void setRates(int[] rates) {
        this.rates = rates;
    }

    @Override
    public float Calculate() {
        Random rand = new Random();
rates[0] = rand.nextInt(10) +1;
rates[1] = rand.nextInt(10) +1;
rates[2] =rand.nextInt(10) +1;
int sum = rates[0] + rates[1] + rates[2];
        AverageRate =  (float) sum / 3;
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println("title: " + Title);
        System.out.println("publishDate: " + PublishDate);
        System.out.println("author: " + Author);
        System.out.println("content: " + Content);
        System.out.println("averageRate: " + AverageRate);
    }


}
