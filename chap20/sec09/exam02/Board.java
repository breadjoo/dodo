package chap20.sec09.exam02;

import java.sql.Blob;
import java.sql.Date;

import lombok.Data;

@Data
public class Board {
	
	private int bNo;
	private String bTitle;
	private String bContent;
	private String bWriter; 
	private Date bDate;
	private String bFileName;
	private Blob bFileDate;

	
}
