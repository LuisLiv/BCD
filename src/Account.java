import java.util.Date;


public class Account {
	private int ID;
	private int ICNo;
	private String Email;
	private String Password;
	private String FullName;
	private String Gender;
	private String Phone;
	private String Address;
	private Date BirthDate;
	
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getICNo() {
		return ICNo;
	}
	public void setICNo(int iCNo) {
		ICNo = iCNo;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Account [ID=" + ID + ", ICNo=" + ICNo + ", Email=" + Email + ", Password=" + Password + ", FullName="
				+ FullName + ", Gender=" + Gender + ", Phone=" + Phone + ", Address=" + Address + ", BirthDate="
				+ BirthDate + "]";
	}
	
	
}
