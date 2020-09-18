/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.application;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.ext.RuntimeDelegate;

/**
 * The class to hold the function for the creation of a server that is used
 * for the REST API
 *
 * @author Admin
 */
public class TreciasDarbas {

    /**
     * The function that creates the server which is used for the REST API
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        URI uri = UriBuilder.fromUri("http://localhost/").port(9999).build();
        HttpServer server = HttpServer.create(new InetSocketAddress(uri.getPort()), 0);
        
        HttpHandler handler = RuntimeDelegate.getInstance()
                .createEndpoint(new TripsApplication(), HttpHandler.class);
        
        server.createContext(uri.getPath(), handler);
        
        server.start();
    }
    
    
}
