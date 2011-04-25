/**
 * 
 */
package id.co.bippo.jsfajaxpush;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.atmosphere.annotation.Suspend;
import org.atmosphere.cpr.AtmosphereResourceEventListener;
import org.atmosphere.cpr.Broadcaster;
import org.atmosphere.jersey.Broadcastable;

/**
 * @author ceefour
 *
 */
@Path("/pubsub/{topic}")
@Produces("text/plain;charset=UTF-8")
public class PubSubResource {

	private @PathParam("topic") Broadcaster topic;

	/**
	 * Suspend the response, and register a {@link AtmosphereResourceEventListener}
	 * that get notified when events occurs like client disconnection, broadcast
	 * or when the response get resumed.
	 *
	 * @return A {@link Broadcastable} used to broadcast events.
	 */
	@GET
	@Suspend(/*listeners = {EventsLogger.class}*/)
	public Broadcastable subscribe() {
		return new Broadcastable(topic);
	}
	
	/**
	 * Create a new {@link Broadcastable}.
	 *
	 * @param obj
	 * @return
	 */
	Broadcastable broadcast(Object obj) {
		return new Broadcastable(obj, topic);
	}	
	
}
