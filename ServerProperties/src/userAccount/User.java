package userAccount;

import java.util.List;
import java.util.ArrayList;
import id.*;
import tag.*;

public final class User implements UserAccountInterface{
	private String FirstName;
	private String LastName;
	private String emailAddress;
	private String password;
	private String gender;
	private String date_of_birth;
	private String Location;
	private ArrayList<Tag> tags;
	private IDInterface ID;
	
	public User (ArrayList<Tag> t){
		tags = t;
	}
	
	public void addTag(Tag t) {
		tags.add(t);
	}
	
	public void removeTag(Tag t) {
		tags.remove(t);
	}
	
	public void importTags(ArrayList<Tag> t) {
		tags = (ArrayList<Tag>)t.clone();
	}
	
	public ArrayList<Tag> exportTag(){
		return (ArrayList<Tag>)tags.clone();
	}
	
	@Override
	public boolean equals(UserAccountInterface userAccount) {
		return this.ID.equals(userAccount.getID());
	}
	
	
	
	@Override
	public UserAccountInterface clone() {
		UserAccountInterface s = new User(null);
		s.setID((IDInterface)ID.clone());
		return s;
	}
	
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public IDInterface getID() {
		return ID;
	}
	public void setID(IDInterface iD) {
		ID = iD;
	}
}
