package chap19.sec04;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class NewsServer extends Thread {
	// UDP  : 발신자가 일방적으로 수신자에게 데이터를 보내는 방식
	// 			TCP보다 데이터 전송 속도가 상대적으로 빠름
	//			DatagramSocket은 발신점과 수신점에 해당하고 DatagramPacket은 주고 받는 데이터에 해당
	
	// TCP  : 연결 요청 및 수락 과정이 있어서 전송 속도가 느림, 데이터의 신뢰성 보장
	private static DatagramSocket datagramSocket = null;

	public static void main(String[] args) throws Exception {
		
		System.out.println("--------------------------------------------------");
		System.out.println("서버를 종료하려면 Q를 입력하고  enter키를 입력하세요.");
		System.out.println("--------------------------------------------------");
		
		startServer();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) {
			break;	
			}
		}
		sc.close();
		stopServer();



	}
	
	public static void startServer() {
		Thread thread = new Thread() {
			public void run() {
				try {
					datagramSocket = new DatagramSocket(50001);
					System.out.println("[서버] 시작됨");
				
				while(true) {
					DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
					datagramSocket.receive(receivePacket);
					String newsKind = new String(receivePacket.getData(),0,receivePacket.getLength(),"UTF-8");
					
					SocketAddress socketAddress = receivePacket.getSocketAddress();
					
					for(int i=0;i<=10;i++) {
						String data = newsKind + ": 뉴스" + i;
						byte[] bytes = data.getBytes("UTF-8");
						DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
						datagramSocket.send(sendPacket);						
					}
				}
				} catch(Exception e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};
		thread.start();
	}
	
	public static void stopServer() {
		datagramSocket.close();
		System.out.println("[서버] 종료됨");
	}

}
