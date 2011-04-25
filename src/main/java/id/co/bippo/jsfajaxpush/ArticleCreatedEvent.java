package id.co.bippo.jsfajaxpush;

/**
 * @author ceefour
 * Published when {@link Article} is created.
 */
public class ArticleCreatedEvent {
	public Article article;
	public ArticleCreatedEvent(Article article) {
		this.article = article;
	}
}
