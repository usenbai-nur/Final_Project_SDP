package newsportal.strategy;

import newsportal.core.model.Article;
import java.util.List;

public class NewsSorter {
    private SortingStrategy strategy;
    public NewsSorter(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    public List<Article> sort(List<Article> articles) {
        if (strategy == null) return articles;
        return strategy.sort(articles);
    }
}
