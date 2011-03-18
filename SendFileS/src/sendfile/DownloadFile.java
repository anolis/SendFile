/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sendfile;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anolis
 */
public class DownloadFile {
    
    Socket connection;
    ObjectInputStream in;
    PrintWriter out;
    public DownloadFile(Socket connection){
        this.connection = connection;
        
    }
    
    private void SetupInput(){
        try {
            in = new ObjectInputStream(connection.getInputStream());
            out = new PrintWriter(new OutputStreamWriter(connection.getOutputStream()));
        } catch (IOException ex) {
            Logger.getLogger(DownloadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void RecieveFile(){
        out.
        File s;
        
    }

}
