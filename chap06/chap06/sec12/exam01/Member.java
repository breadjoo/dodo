package chap06.sec12.exam01;


public class Member {

	String name;
	String id;
	String password;
	int age;
	
	/*Member mem = new Member(){
	this(name,id,password,age);
	
	Member(String name,String id, String password){
	this(id,password,age);
	
	Member(String name,String id, String password, int age){
	this(password,age);
	
	Member(String name,String id, String password, int age){
	this(age);*/
	
	Member(String name,String id, String password, int age){
	this.name=name;
	this.id=id;
	this.password=password;
	this,age=age;
	
	
	
	
}

String model ;
String color ; 
int maxSpeed ;

Car1(String model) {
	this(model,"은색",250);
	//this.model = model;
	//this.color = "은색";
	//this.maxSpeed =250; 

}Car1(String model,String color) {
	this(model,color,250); //생성자 바로 다음줄(첫줄)에 둬야 에러가 안난다.
	//this.model = model;
	//this.color = color;
	//this.maxSpeed = 250;
	

}Car1(String model,String color,int maxSpeed) { //공통 초기화부분코드
	this.model = model;
	this.color = color;
	this.maxSpeed = maxSpeed;
}
}

