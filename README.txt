Overview
========
Ajax Push JSF shows you how to update client JSF components dynamically from the
server (no HttpServletRequest / FacesContext needed) using Ajax Push.

It is not a demonstration of what Atmosphere Comet framework can do (of which
there are many!) but how to do the most common use case of Ajax Push / Reverse
Ajax in JSF applications.

ICEfaces is the most straightforward here using its Push Renderer API.

In PrimeFaces 2.x, Atmosphere framework is used to "emulate" the p:push and
"broken" PrimeFaces CometContext implementation. It's broken because it requires
a FacesContext to push!

Setup
=====
Get at least GlassFish 3.1.

add: comet-support-enabled="true to the http element in
/opt/glassfish3/glassfish/domains/domain1/config/domain.xml :

          <protocol name="http-listener-1">
            <http header-buffer-length="8192" 
forced-response-type="text/plain; charset=iso-8859-1" 
default-virtual-server="server" max-connections=
"250" server-name="" default-response-type="text/plain; 
charset=iso-8859-1" comet-support-enabled="true>
              <file-cache enabled="false"></file-cache>
            </http>

or via Admin UI > Configurations > server-config > Network Config > Protocols
	> http-listener-1 > HTTP > Comet Support

Start GlassFish web server and database (`asadmin start-database`) then deploy.
This project requires the default Derby Database (JNDI path: `jdbc/__default`)
unless you change it in `src/main/resources/META-INF/persistence.xml`

Then open your browser to:
http://localhost:8080/jsfajaxpush-primefaces/

It should update automatically with a new article every few seconds.

In Firebug or Google Chrome, open the JavaScript Developer console to see
log messages.

Technologies
============
This project uses the following technologies:

- EJB 3.1 (provided by Java EE container)
- JSF 2.x (provided by Java EE container)
- CDI 1.x
- JPA 2.x
- PrimeFaces 2.x
- Atmosphere for Ajax Push
- Atmosphere jQuery plugin for client
- EMF Ecore
- Texo plugin required to generate JPA entity classes


Created by Hendy Irawan
http://www.hendyirawan.com/