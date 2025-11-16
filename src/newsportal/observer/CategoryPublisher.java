package newsportal.observer;

import newsportal.core.model.Article;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryPublisher implements Subject {
    private final Map<String, List<Observer>> observersMap = new HashMap<>();
    @Override
    public synchronized void register(String category, Observer observer) {
        observersMap.computeIfAbsent(category.toUpperCase(), k -> new ArrayList<>()).add(observer);
    }
    @Override
    public synchronized void unregister(String category, Observer observer) {
        List<Observer> list = observersMap.get(category.toUpperCase());
        if (list != null) {
            list.removeIf(o -> o.getId().equals(observer.getId()));
        }
    }
    @Override
    public synchronized void notify(String category, Article article) {
        List<Observer> list = observersMap.get(category.toUpperCase());
        if (list == null) return;
        String message = String.format("New article in %s: %s (by %s)", category, article.getTitle(), article.getAuthor());
        for (Observer o : new ArrayList<>(list)) {
            o.update(message);
        }
    }
}
