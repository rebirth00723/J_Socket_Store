package rebirth00723.gmail.com;

import com.sun.xml.internal.txw2.output.DataWriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class J_SocketClient {
    private Socket socket;
    private BufferedWriter Sender;

    J_SocketClient(){
        try {
            socket = new Socket("127.0.0.1", 27015);
            Sender = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    void close(){
        try {
            Sender.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
    void sendData(char[] content, int iLen){
        String Len;
        try {
            Len = String.format("%04d", iLen);
            Sender.write(Len);
            Sender.write(content, 0, iLen);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
