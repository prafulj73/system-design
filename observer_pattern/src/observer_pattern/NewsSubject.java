package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class NewsSubject {
	
	private List<Observer> observers = new ArrayList<>();
	private String news;
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void nupdateAll() {
		for(Observer observer: observers) {
			observer.update(news);
		}
	}
	
	public void setNews(String latestNews) {
		this.news = latestNews;
		nupdateAll();
	}
	
}
