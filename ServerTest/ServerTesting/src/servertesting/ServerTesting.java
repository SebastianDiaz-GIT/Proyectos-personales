/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servertesting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.logging.Level;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Sebastian Diaz
 */

public class ServerTesting {
    
    public static void main(String [] args) throws IOException
    {
        ServerSocket servidor = null;
        // socket del cliente 
        Socket socketCliente = null;
        // input
        DataInputStream in;
        DataOutputStream out;
        final int PUERTO = 1020;
    
        try {
        servidor = new ServerSocket(PUERTO);
        System.out.println("Servidor Iniciado");
        
            while(true)
            {
                System.out.println("Cliente conectado");
                socketCliente = servidor.accept();
                in = new DataInputStream(socketCliente.getInputStream());
                out = new DataOutputStream(socketCliente.getOutputStream());
                
                //
                String MensajeCliente_1 = in.readUTF();
                System.out.println(MensajeCliente_1);
                /*
                String MensajeCliente_2 = in.readUTF();
                System.out.println(MensajeCliente_2);
                */
                if(MensajeCliente_1.equals("adios") /*&& MensajeCliente_2.equals("adios")*/)
                {
                   socketCliente.close();
                   System.out.println("Clientes desconectados");
                }
            }
        }catch (IOException ex) {
            //Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
    
         
    
}
