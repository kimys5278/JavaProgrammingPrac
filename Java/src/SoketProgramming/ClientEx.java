package SoketProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket  = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("localhost",9999);
			in = new BufferedReader (new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter (new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String outmessage = in.readLine();
				if(outmessage.equalsIgnoreCase("bye")) {
					out.write(outmessage+"\n");
					out.flush();
					break;
				}
				out.write(outmessage+"\n");
				out.flush();
				String inputmessage = in.readLine();
				System.out.println("서버 : "+ inputmessage);
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}finally {
			try {
				sc.close();
				if(socket != null) {
					socket.close();
				}
			}catch(IOException e){
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
			
		}
		
	}

}
