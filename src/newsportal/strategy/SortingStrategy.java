package newsportal.strategy;

import newsportal.core.model.Article;
import java.util.List;

public interface SortingStrategy {
    List<Article> sort(List<Article> articles);
}
