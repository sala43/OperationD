package Entity;

public class Pojo {
	private String fname;
	private String lname;
	private String age;
	private String city;
	private String pnumber;

	public Pojo(String fname, String lname, String age, String city, String pnumber) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.city = city;
		this.pnumber = pnumber;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	@Override
	public String toString() {
		return "[fname=" + fname + ", lname=" + lname + ", age=" + age + ", city=" + city + ", pnumber=" + pnumber
				+ "]";
	}
	

}
