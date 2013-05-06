package edu.neumont.csc380.routes;

import org.apache.camel.builder.RouteBuilder;

public class HelloServerRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("jms:queue:games").to("tTTGameService");
	}
}
