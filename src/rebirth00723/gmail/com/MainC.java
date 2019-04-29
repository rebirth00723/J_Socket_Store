package rebirth00723.gmail.com;

import java.io.IOException;
import java.nio.CharBuffer;

public class MainC {
    public static void main(String args[]) {

        int iLen;
        CharBuffer buffer = CharBuffer.allocate(512);
        J_SocketClient client = new J_SocketClient();
        try {
            iLen = J_FileControlUtil.loadFile("req.txt", buffer.array());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        client.sendData(buffer.array(), iLen);
        client.close();

    }



}
