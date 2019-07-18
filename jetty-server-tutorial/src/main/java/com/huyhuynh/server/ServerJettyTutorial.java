package com.huyhuynh.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.webapp.WebAppContext;

public class ServerJettyTutorial {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Server theServer = new Server(7070);
		
		HandlerCollection handler = new HandlerCollection();
		WebAppContext webappct = new WebAppContext();
		webappct.setResourceBase("src/main/webapp");
		webappct.setContextPath("/serverjetty");
		webappct.setDefaultsDescriptor("src/main/webdefault/webdefault.xml");
		handler.addHandler(webappct);
		
		theServer.setHandler(handler);
		theServer.start();
		theServer.join();

	}

}
