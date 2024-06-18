package chap20.sec09.exam01;

import lombok.Data;

@Data // 생성자, getter,setter 등을 자동으로 만들어줌(lombok)
public class User {
	private String userID;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userEmail;
	

}
