package userAccount;
import java.util.ArrayList;

import id.*;
import tag.Tag;

public interface UserAccountInterface {
	abstract public UserAccountInterface clone();
	abstract public String getLocation();
	abstract public void setLocation(String location);
	abstract public String getFirstName();
	abstract public void setFirstName(String firstName);
	abstract public String getLastName();
	abstract public void setLastName(String lastName);
	abstract public String getEmailAddress();
	abstract public void setEmailAddress(String emailAddress);
	abstract public String getPassword();
	abstract public void setPassword(String password);
	abstract public String getGender();
	abstract public void setGender(String gender);
	abstract public String getDate_of_birth();
	abstract public void setDate_of_birth(String date_of_birth);
	abstract public IDInterface getID();
	abstract public void setID(IDInterface iD);
	abstract public void addTag(Tag t);
	abstract public void removeTag(Tag t);
	abstract public void importTags(ArrayList<Tag> t);
	abstract public ArrayList<Tag> exportTag();
	abstract public boolean equals(UserAccountInterface userAccount);
}
