# J_Socket_Store
Practice socket

## 說明:
執行Client時會將文本req.txt內容傳送至Server，Server接收到後，將內容除存在store.txt檔中

Client端的req.txt需要自行建立並輸入內容，
Server端在收到資料後會自動產生store.txt

MainC.java 為 Client端Main Class
Main.java 為 Server端Main Class
J_SocketClient.java 為 Client端的Socket物件 
J_SocketServer.java 為 Server端的Socket物件
J_FileControlUtil.java 為對File做控制的物件，最大讀取檔案的大小設置為512bytes


## 測試方式
req.txt 為Client讀取資料，需自行建立。傳送到Server後會自動產生store.txt 內容與req.txt一致

需先開啟Server 後開啟Client
