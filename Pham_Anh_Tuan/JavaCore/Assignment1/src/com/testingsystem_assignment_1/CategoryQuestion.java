package com.testingsystem_assignment_1;

public class CategoryQuestion {
    int categoryId;
    String categoryName;

    public CategoryQuestion(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "CategoryQuestion{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
