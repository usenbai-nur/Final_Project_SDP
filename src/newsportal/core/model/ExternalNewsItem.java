package newsportal.core.model;

public class ExternalNewsItem {
    private final String headline;
    private final String body;
    private final String source;
    private final String category; // freeform

    public ExternalNewsItem(String headline, String body, String source, String category) {
        this.headline = headline;
        this.body = body;
        this.source = source;
        this.category = category;
    }

    public String getHeadline() { return headline; }
    public String getBody() { return body; }
    public String getSource() { return source; }
    public String getCategory() { return category; }
}
