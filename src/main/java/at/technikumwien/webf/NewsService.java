package at.technikumwien.webf;

import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class NewsService {
	public List<News> getAllNews() {
		// TODO Implement reading of data from Database
		return Arrays.asList(
				new News("Title 1", "Text 1"),
				new News("Title 2", "Text 2")
				);
	}
}
