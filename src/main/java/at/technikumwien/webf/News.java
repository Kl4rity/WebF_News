package at.technikumwien.webf;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_news")
public class News {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; // Standardwert: Null
	@Column(length=100, nullable=false)
	private String title;
	@Column(length=100, nullable=false)
	private String text;
	
	public News() {
		super();
	}

	public News(String title, String text) {
		super();
		this.title = title;
		this.text = text;
	}

	public News(Long id, String title, String text) {
		super();
		this.id = id;
		this.title = title;
		this.text = text;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", text=" + text + "]";
	}
}
