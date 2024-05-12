package S0512.exam02;

public class Product {
	
	private int pno;
	private String name;
	private String company;
	private int price;
	
	public Product (int pno, String name, String company, int price) {
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	public int getPno() { return pno;}
	public String getName() { return name;}
	public String getCompany () { return company;}
	public int getPrice() { return price;}
	
	public String toString() {
		return new StringBuilder()
				.append("{")
				.append("pno:" +pno+", ")
				.append("name:"+name+", ")
				.append("company:" +company+", ")
				.append("price:"+price+"원")
				.append("}")
				.toString();
	}
	
		
	
	

}
