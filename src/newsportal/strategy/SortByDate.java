package newsportal.strategy;

import newsportal.core.model.Article;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByDate implements SortingStrategy {
    @Override
    public List<Article> sort(List<Article> articles) {
        List<Article> copy = new ArrayList<>(articles);
        copy.sort(Comparator.comparing(Article::getCreatedAt).reversed());
        return copy;
    }
}
