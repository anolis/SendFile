/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sendfile;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public void RecieveName(){
        BufferedReader fileNameReader = null;
        try {
            String filename;
            fileNameReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            out.print("send");
            this.RecieveFile((String)fileNameReader.readLine());
        } catch (IOException ex) {
            Logger.getLogger(DownloadFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileNameReader.close();
            } catch (IOException ex) {
                Logger.getLogger(DownloadFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void RecieveFile(String filename){
        
        try {
            FileOutputStream s = new FileOutputStream(filename);
        } catch (IOException ex) {
            Logger.getLogger(DownloadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
