package frontend;

import backend.Exercise1;
import model1.News;

import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {
        Exercise1 e = new Exercise1();
        ArrayList<News> news = new ArrayList<>();
        e.MyNews(news);
    }
}
