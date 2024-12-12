package observer_pattern;

public class NewsObserver implements Observer {
	
	private String latestNews;

	@Override
	public void update(String news) {
		this.latestNews = news;
		System.out.println("");
	}

}
