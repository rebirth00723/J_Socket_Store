package rebirth00723.gmail.com;

import java.io.*;

public class J_FileControlUtil {

    public static int loadFile(String fileName, char[] data) throws IOException {

        int iRs;
        FileReader f = new FileReader(fileName);
        iRs = f.read(data, 0, 512);
        f.close();
        return iRs;
    }
    public static int saveFile(String fileName, char[] content, int iLen) throws IOException {

        FileWriter file = new FileWriter(fileName);
        file.write(content, 0, iLen);
        file.close();
        return 0;
    }
}
