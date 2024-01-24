
import java.util.Date;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class RequestListener implements ServletRequestListener, ServletContextListener {
    public RequestListener() {
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("App Initialized");
    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        // ServletRequest request = servletRequestEvent.getServletRequest();
        Date date = new Date();
        System.out.println("Request initialized " + date);
    }
}
