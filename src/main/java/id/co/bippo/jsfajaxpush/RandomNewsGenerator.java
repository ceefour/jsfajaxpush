/**
 * 
 */
package id.co.bippo.jsfajaxpush;

import java.util.Calendar;
import java.util.Random;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class RandomNewsGenerator {

	private Logger log = LoggerFactory.getLogger(getClass());
	@Inject private ArticleRepository articleRepo;
	private String[] names = new String[]{ "Arty", "Melissa", "John", "Sue", "Cindy", "Jessica",
			"Mark", "Gus", "Paul", "Joko", "Hendy", "Ibrahim", "Yudha", "Andreas" };
	private String[] verbs = new String[]{ "kisses", "hugs", "wants", "hates", "likes",
			"throws", "loves", "tames" };
	private String[] places = new String[]{ "the park", "Paris", "Bandung", "Jakarta", "Kediri",
			"Bali", "Moscow", "India", "Istanbul", "Finland", "a hotel", "a bridge" };
	
	@Schedule(hour="*", minute="*", second="*/5")
	public void generateArticle() {
		Article article = new Article();
		Random random = new Random();
		article.setSubject(names[random.nextInt(names.length)]);
		article.setVerb(verbs[random.nextInt(verbs.length)]);
		article.setTarget(names[random.nextInt(names.length)]);
		article.setPlace(places[random.nextInt(places.length)]);
		Calendar calendar = Calendar.getInstance();
		calendar.set(1961 + random.nextInt(50), random.nextInt(12), 1 + random.nextInt(28));
		article.setHappenedAt(calendar.getTime());
		log.info("Generating: {}", article);
		articleRepo.createArticle(article);
	}
}
