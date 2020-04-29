import java.net.*;
import java.io.*;

public class server{

	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(1234);
		Socket s = ss.accept();

		System.out.println("Client connected!");

		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);

		String str = bf.readLine();
		System.out.println("client: " + str);

		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("Yes");
		pr.flush();
	}

}
