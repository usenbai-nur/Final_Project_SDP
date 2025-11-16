package newsportal.adapter;

import newsportal.core.model.ExternalNewsItem;

import java.util.List;

public interface ExternalNewsProvider {
    List<ExternalNewsItem> fetchLatest();
}
