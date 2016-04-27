package org.sturrock;

import java.util.HashSet;
import java.util.Set;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import com.google.common.util.concurrent.Service;


/**
 * As per
 * http://stackoverflow.com/questions/30956334/when-adding-dependency-cdi-
 * deployment-failure-unsatisfied-dependencies-for-typ
 * 
 *
 */
public class DummyServicesProducer {
	@Produces
	public static Set<Service> getDummyServices(InjectionPoint injectionPoint) {
		return new HashSet<>();
	}
}
