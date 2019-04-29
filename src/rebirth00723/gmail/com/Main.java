package rebirth00723.gmail.com;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Arrays;

class Main{



    public static void main(String args[]){

        int iLen;
        CharBuffer buffer = CharBuffer.allocate(512);
        J_SocketServer server = new J_SocketServer();

        server.prepared();
        iLen = server.getData(buffer.array());
        try {
            J_FileControlUtil.saveFile("store.txt", buffer.array(), iLen);
        } catch (IOException e) {
            e.printStackTrace();
        }
        server.close();

    }

    public int atoi(String sNum){
        int iNum = 0;
        for(char c: sNum.toCharArray()){
            iNum += iNum*10 + (c -'0');
        }

        return iNum;
    }

}

