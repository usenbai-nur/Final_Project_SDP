package newsportal.adapter;

import newsportal.core.model.Article;
import newsportal.core.model.BaseArticle;
import newsportal.core.model.ExternalNewsItem;
import newsportal.core.model.Category;

import java.util.ArrayList;
import java.util.List;

// Adapter: converts ExternalNewsItem to local Article (BaseArticle)
public class ExternalNewsAdapter {
    private final ExternalNewsProvider provider;

    public ExternalNewsAdapter(ExternalNewsProvider provider) {
        this.provider = provider;
    }

    public List<Article> fetchAsArticles() {
        List<ExternalNewsItem> items = provider.fetchLatest();
        List<Article> articles = new ArrayList<>();
        for (ExternalNewsItem e : items) {
            BaseArticle a = new BaseArticle(e.getHeadline(), e.getBody(), e.getSource(), parseCategory(e.getCategory()));
            // tag by source
            a.addTag("source:" + e.getSource().toLowerCase());
            articles.add(a);
        }
        return articles;
    }

    private Category parseCategory(String c) {
        if (c == null) return Category.GENERAL;
        try {
            return Category.valueOf(c.toUpperCase());
        } catch (IllegalArgumentException ex) {
            return Category.GENERAL;
        }
    }
}
