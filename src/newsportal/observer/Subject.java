package newsportal.observer;

import newsportal.core.model.Article;

public interface Subject {
    void register(String category, Observer observer);
    void unregister(String category, Observer observer);
    void notify(String category, Article article);
}
