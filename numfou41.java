import java.io.*;
import java.net.*;

public class numfou41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url = null;
		BufferedReader input = null;
		String address = "http:/ /www.codechobo.com/sample/hello.html";
		String line = "";

		try {
			url  = new URL(address);
			input=new BufferedReader(new InputStreamReader(url.openStream()));

			while((line=input.readLine()) !=null) {
				System.out.println(line);
			}
			input.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
