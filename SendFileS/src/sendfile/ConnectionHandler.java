/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sendfile;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anolis
 */
public class ConnectionHandler {

    private final int PORT = 4545;
    ServerSocket sConnection;

    public ConnectionHandler() {
        try {
            sConnection = new ServerSocket(PORT);
            while(true){
                new DownloadFile(sConnection.accept());
            }
        } catch (IOException ex) {
            Logger.getLogger(ConnectionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
