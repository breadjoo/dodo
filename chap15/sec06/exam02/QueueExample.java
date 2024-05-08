package chap15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// Queue 컬렉션 생성 (FIFO :First In First Out구조 먼저 넣은것부터 나옴)
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail","유환주"));
		messageQueue.offer(new Message("sendSMS","비타오백"));
		messageQueue.offer(new Message("replyMail","아이폰"));
		messageQueue.offer(new Message("replySMS","이자바"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			//System.out.println(message.command+" : "+message.to);
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to+"에게 메일을 보냅니다."); break;
			case "sendSMS" :
				System.out.println(message.to+"에게 문자를 보냅니다."); break;
			case "replyMail" :
				System.out.println(message.to +"에게 메일답장을 보냅니다."); break;
			default : System.out.println(message.to + "에게 문자답장을 보냅니다.");
			}
			
		}

	}

}
