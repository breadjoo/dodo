package chap20.sec11;

import java.sql.Date;

import lombok.Data;

@Data
public class Board {
	
	private int bNo;
	private String bTitle;
	private String bContent;
	private String bWriter;
	private Date bDate;

}
