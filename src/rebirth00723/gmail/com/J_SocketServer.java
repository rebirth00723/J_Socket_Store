package rebirth00723.gmail.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.CharBuffer;

public class J_SocketServer {
    int PORT = 27015;

    private Socket iClientSocket;
    private BufferedReader Receiver;

    J_SocketServer(){
        this.PORT = 27015;

    }
    void close(){
        try {
            iClientSocket.close();
            Receiver.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    int prepared(){
        try{
            ServerSocket server = new ServerSocket(PORT);
            this.iClientSocket = server.accept();
            this.Receiver = new BufferedReader(new InputStreamReader(iClientSocket.getInputStream()));
        }catch (IOException e){
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    int getData(char[] caData){

        CharBuffer buffer;
        int iLen;
        int iRs;

        buffer = CharBuffer.allocate(4);

        try{
            iRs = Receiver.read(buffer.array(), 0, 4);
            if(iRs == -1) {
                return -1;
            }

            iLen =Integer.parseInt(buffer.toString());

            iRs = Receiver.read(caData, 0, iLen);
            if(iRs == -1) {
                return -1;
            }
            caData[iLen] = '\0';

        }catch(IOException e){
            e.printStackTrace();
            return -1;
        }
        return iLen;
    }
}
