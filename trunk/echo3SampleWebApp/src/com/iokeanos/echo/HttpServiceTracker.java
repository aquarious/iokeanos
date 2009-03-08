package com.iokeanos.echo;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;
import org.osgi.util.tracker.ServiceTracker;
public class HttpServiceTracker extends ServiceTracker{
    public HttpServiceTracker(BundleContext context) {
        super(context, HttpService.class.getName(), null);
    }
    public Object addingService(ServiceReference reference) {
        HttpService httpService = (HttpService) context.getService(reference);
        try {
        	 
        	HelloWorldServlet mainApp = new HelloWorldServlet(context);
            httpService.registerServlet(Activator.START, mainApp, null, null); 
             
            ResetServlet rServlet = new ResetServlet();
            httpService.registerServlet(Activator.RESET, rServlet, null, null); 
             
        } catch (Exception e) {
            e.printStackTrace();
        }
        return httpService;
    }
    
    public void removedService(ServiceReference reference, Object service) {
        HttpService httpService = (HttpService) service;
        httpService.unregister(Activator.START);
        httpService.unregister(Activator.RESET);
        super.removedService(reference, service);
    }
}
