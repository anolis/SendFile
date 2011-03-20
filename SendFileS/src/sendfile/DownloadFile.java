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
import java.net.DatagramPacket;
import java.net.InetAddress;
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
    DatagramPacket out;
    InetAddress ADDRESS;
    int PORT;
    
    public DownloadFile(Socket connection){
        this.connection = connection;
        this.ADDRESS = connection.getInetAddress();
        this.PORT = connection.getPort();
    }
    
    private void SetupInput(){
        try {
            byte[] buf = new byte[256];
            buf = "mode1".getBytes();
            in = new ObjectInputStream(connection.getInputStream());
            out = new DatagramPacket(buf,buf.length,ADDRESS,PORT);
            
        } catch (IOException ex) {
            Logger.getLogger(DownloadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void RecieveName(){
        BufferedReader fileNameReader = null;
        try {
            String filename;
            fileNameReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
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
