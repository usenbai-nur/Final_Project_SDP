package newsportal.core.model;

import java.time.LocalDateTime;
import java.util.List;

public interface Article {
    String getId();
    String getTitle();
    String getContent();
    String getAuthor();
    Category getCategory();
    LocalDateTime getCreatedAt();
    int getViews();
    void incrementViews();
    List<String> getTags();
    double getRating();
    List<String> getComments();

    void addTag(String tag);
    void addComment(String comment);
    void addRating(double rating);
}
