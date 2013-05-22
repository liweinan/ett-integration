package io.ett.ws;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class ETTIntegrationApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();

	public ETTIntegrationApplication() {
		classes.add(MockedServlet.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
