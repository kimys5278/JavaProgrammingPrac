package SoketProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999); //서버소켓 생성
			System.out.println("연결을 기다리고 있습니다.......");
			socket = listener.accept();//클라이언트로 부터 연결 요청 대기
			System.out.println("연결이 완료되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputmessage = in.readLine();
				if(inputmessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트로 연결을 종료하였습니다.");
					break;
				}
				System.out.println("클라이언트 : "+inputmessage);
				System.out.println("보내기");//프폼포트
				String outmessage = sc.nextLine();//키보드에서 한 행 읽기
				out.write(outmessage+"\n");//키보드에서 읽은 문자열 전송
				out.flush();//out 스트림 버퍼에 있는 모든 문자열 전송
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
			
		}finally{
			try {
				sc.close();
				socket.close();
				listener.close();
			}catch(IOException e){
				System.out.println("클라이언트와 채팅 중 오류가 발생하였습니다.");
			}
			
			
		}
		
		
	}

}
