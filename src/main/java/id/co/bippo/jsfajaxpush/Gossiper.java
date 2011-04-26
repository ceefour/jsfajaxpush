/**
 * 
 */
package id.co.bippo.jsfajaxpush;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.icefaces.application.PortableRenderer;
import org.icefaces.application.PushRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ceefour
 * Observes when an {@link Article} has been created and publishes it to
 * all JSF web browser clients using Ajax Push.
 */
@ApplicationScoped
public class Gossiper {
	private Logger log = LoggerFactory.getLogger(getClass());
	private PortableRenderer renderer;
	
	public void gotNews(@Observes ArticleCreatedEvent event) {
		log.debug("Push rendering 'news', article created: {}", event.article);
		if (renderer == null) {
			log.warn("ICEpush PortableRenderer is not yet available. No push performed.");
			return;
		}
		renderer.render("news");
	}

	public synchronized void setRenderer(PortableRenderer renderer) {
		log.info("ICEpush PortableRenderer set to {}", renderer);
		this.renderer = renderer;
	}

	public synchronized PortableRenderer getRenderer() {
		return renderer;
	}
}
