package newsportal.factory;

import newsportal.core.model.Article;
import newsportal.core.model.ArticleType;
import newsportal.core.model.BaseArticle;
import newsportal.core.model.Category;

public class SimpleArticleFactory implements ArticleFactory {

    @Override
    public Article createArticle(ArticleType type, String title, String content, String author, String category) {
        // For demo: all types use BaseArticle but could create specialized subclasses
        BaseArticle article = new BaseArticle(title, content, author, parseCategory(category));
        // add some type-specific initializations
        switch (type) {
            case BREAKING:
                article.addTag("breaking");
                break;
            case PREMIUM:
                article.addTag("premium");
                break;
            case TECH:
                article.addTag("tech");
                break;
            case SPORTS:
                article.addTag("sports");
                break;
            case POLITICS:
                article.addTag("politics");
                break;
            case OPINION:
                article.addTag("opinion");
                break;
            default:
                break;
        }
        return article;
    }

    private Category parseCategory(String categoryStr) {
        if (categoryStr == null) return Category.GENERAL;
        try {
            return Category.valueOf(categoryStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            return Category.GENERAL;
        }
    }
}
