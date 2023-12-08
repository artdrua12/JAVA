
import java.util.Date;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener {
    public RequestListener() {
    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        // ServletRequest request = servletRequestEvent.getServletRequest();
        Date date = new Date();
        System.out.println("Request initialized " + date);
    }
}
