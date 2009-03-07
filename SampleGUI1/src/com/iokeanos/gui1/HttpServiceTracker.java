package com.iokeanos.gui1;

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
            httpService.registerResources("/helloworld.html", "/helloworld.html", null);
            httpService.registerServlet("/helloworld", new HelloWorldServlet(), null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return httpService;
    }
    public void removedService(ServiceReference reference, Object service) {
        HttpService httpService = (HttpService) service;
        httpService.unregister("/helloworld.html");
        httpService.unregister("/helloworld");
        super.removedService(reference, service);
    }
}
