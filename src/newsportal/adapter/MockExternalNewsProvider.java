package newsportal.adapter;

import newsportal.core.model.ExternalNewsItem;

import java.util.ArrayList;
import java.util.List;

// Simulates an external provider returning different schema
public class MockExternalNewsProvider implements ExternalNewsProvider {

    @Override
    public List<ExternalNewsItem> fetchLatest() {
        List<ExternalNewsItem> list = new ArrayList<>();
        list.add(new ExternalNewsItem("Global Tech Breakthrough", "A new chip arrives...", "TechWire", "TECH"));
        list.add(new ExternalNewsItem("Local Team Wins", "The local team won 3-1...", "SportsDaily", "SPORTS"));
        list.add(new ExternalNewsItem("Elections Update", "New polls show...", "PoliNews", "POLITICS"));
        return list;
    }
}
