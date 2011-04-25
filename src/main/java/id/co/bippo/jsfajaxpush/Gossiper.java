/**
 * 
 */
package id.co.bippo.jsfajaxpush;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.atmosphere.cpr.Broadcaster;
import org.atmosphere.cpr.BroadcasterFactory;
import org.atmosphere.cpr.DefaultBroadcaster;

/**
 * @author ceefour
 * Observes when an {@link Article} has been created and publishes it to
 * all JSF web browser clients using Ajax Push.
 */
@ApplicationScoped
public class Gossiper {
	public void gotNews(@Observes ArticleCreatedEvent event) {
		Broadcaster broadcaster = BroadcasterFactory.getDefault().lookup(DefaultBroadcaster.class, "news", true);
		// use the article toString() so it can be logged by jQuery client
		broadcaster.broadcast(event.article.toString());
	}
}
