package newsportal.factory;

import newsportal.core.model.Article;
import newsportal.core.model.ArticleType;

public interface ArticleFactory {
    Article createArticle(ArticleType type, String title, String content, String author, String category);
}
