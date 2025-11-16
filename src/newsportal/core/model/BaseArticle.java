package newsportal.core.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BaseArticle implements Article {
    private final String id;
    private String title;
    private String content;
    private String author;
    private Category category;
    private LocalDateTime createdAt;
    private int views;

    private final List<String> tags = new ArrayList<>();
    private final List<String> comments = new ArrayList<>();
    private double totalRating = 0.0;
    private int ratingCount = 0;

    public BaseArticle(String title, String content, String author, Category category) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = category;
        this.createdAt = LocalDateTime.now();
        this.views = 0;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public Category getCategory() {
        return category;
    }

    @Override
    public java.time.LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public int getViews() {
        return views;
    }

    @Override
    public void incrementViews() {
        views++;
    }

    @Override
    public List<String> getTags() {
        return tags;
    }

    @Override
    public double getRating() {
        if (ratingCount == 0) return 0.0;
        return totalRating / ratingCount;
    }

    @Override
    public List<String> getComments() {
        return comments;
    }

    @Override
    public void addTag(String tag) {
        tags.add(tag);
    }

    @Override
    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public void addRating(double rating) {
        totalRating += rating;
        ratingCount++;
    }

    public void setTitle(String title) { this.title = title; }
    public void setContent(String content) { this.content = content; }
    public void setAuthor(String author) { this.author = author; }
    public void setCategory(Category category) { this.category = category; }
}
