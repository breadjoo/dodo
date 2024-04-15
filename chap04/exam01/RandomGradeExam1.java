package chap04.exam01;

public class RandomGradeExam1 {

	public static void main(String[] args) {
		String grade ; 
		
		
		int score = (int)(Math.random()*100+1);
			System.out.println("오늘의 점수 : " + score);
			  
			   if (score >= 90) {
		            grade = "A";
		        } else if (score >= 80) {
		            grade = "B";
		        } else if (score >= 70) {
		            grade = "C";
		        } else if (score >= 60) {
		            grade = "D";
		        } else if (score >= 50) {
		            grade = "E";
		        } else if (score >= 40) {
		            grade = "F";
		        } else if (score >= 30) {
		            grade = "G";
		        } else if (score >= 20) {
		            grade = "H";
		        } else if (score >= 10) {
		            grade = "I";
		        } else {
		            grade = "J";
		        } System.out.println("오늘의 등급 : " + grade);
		
}}



