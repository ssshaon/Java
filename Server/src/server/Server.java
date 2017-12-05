\/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

/**
 *
 * @author Shaon
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        String clientSentence;
        String capitalizedSentence;
        
        ServerSocket welcomeSocket = new ServerSocket(6789);
        
        while(true){
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient = new BufferedReader( new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            
            clientSentence = inFromClient.readLine();
            capitalizedSentence = clientSentence.toUpperCase()+'\n';
            
            outToClient.writeBytes(capitalizedSentence);
                    
        
        }
        
        
        
        // TODO code application logic here
    }

    private static Reader InputStreamReader(InputStream inputStream) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Reader OutputStreamReader(OutputStream outputStream) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
\