package com.epam.tools;

import java.net.InetAddress;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Anton_Varanovich
 */

@ManagedBean
@SessionScoped
public class CheckHostname {
    
    private String hostname;
    
    public String getHostname() {
        
        try {
            
            hostname = InetAddress.getLocalHost().getHostName();
            
        } catch(Exception exception) {
            
            System.err.println(exception);
            
        }
         
        return hostname;
        
    }
    
}
