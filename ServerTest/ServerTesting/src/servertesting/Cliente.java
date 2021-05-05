package servertesting;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
        
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian Diaz
 */
public class Cliente {
    
    public static void main(String [] args)
    {       
            final String HOST = "127.0.0.1";
            final int PUERTO = 1020;
            DataInputStream in;
            DataOutputStream out;
            
            
        try {
            Socket socketCliente = new Socket(HOST, PUERTO);
            in = new DataInputStream(socketCliente.getInputStream());
            out = new DataOutputStream(socketCliente.getOutputStream());
                
            for(int i = 2; i > 1; i++){
                Scanner entrada = new Scanner(System.in);
                out.writeUTF(entrada.nextLine());
                     
                String mensaje = in.readUTF();
                
                System.out.println(mensaje);
                socketCliente.close();
                
            }
            
        } catch (IOException ex) {
            //Logger.getLogger(ServerTesting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
