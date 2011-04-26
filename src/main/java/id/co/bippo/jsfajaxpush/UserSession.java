package id.co.bippo.jsfajaxpush;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.inject.Inject;
import javax.inject.Named;

import org.icefaces.application.PortableRenderer;
import org.icefaces.application.PushRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named @SessionScoped
public class UserSession implements Serializable, PhaseListener {

	private Logger log = LoggerFactory.getLogger(getClass());
	private static final long serialVersionUID = 1L;
	private long lastArticleId = -1; 
	@Inject private ArticleRepository articleRepository;
	@Inject private Gossiper gossiper;
	
	@PostConstruct public void init() {
		// will be used by {@link Gossiper}
		if (gossiper.getRenderer() == null) {
			PortableRenderer renderer = PushRenderer.getPortableRenderer();
			gossiper.setRenderer(renderer);
		}
		PushRenderer.addCurrentSession("news");
		try {
			lastArticleId = articleRepository.getLastArticle().getId();
			log.info("Last article ID is {}", lastArticleId);
		} catch (Exception e) {
			log.info("No last article. Reason: {}", e.getMessage());
		}
	}

	@Override
	public void afterPhase(PhaseEvent event) { }

	@Override
	public void beforePhase(PhaseEvent event) {
		List<Article> articles = articleRepository.findArticlesAfter(lastArticleId);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		int startIdx = 0;
		// only show last 5 articles
		if (articles.size() > 5)
			startIdx = articles.size() - 5;
		for (int i = startIdx; i < articles.size(); i++) {
			Article article = articles.get(i);
			// TODO: How to CSS style the summary & detail ?!? PrimeFaces got this right
			facesContext.addMessage(null, new FacesMessage(String.format("%s %s", article.getSubject(), article.getVerb()),
					String.format(" On %s, %s %s %s in %s.",
							new SimpleDateFormat("EEE, MMM d, ''yy").format(article.getHappenedAt()),
							article.getSubject(), article.getVerb(), article.getTarget(),
							article.getPlace())));
			lastArticleId = article.getId();
		}
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RENDER_RESPONSE;
	}

}
