package pair;
import userAccount.*;

//ABSTRACT: The Score is representative to the similarities in the tag similar to the "original User"

public final class UserScorePair extends Pair{
	private UserAccountInterface user;
	private int score;
	
	public UserScorePair(UserAccountInterface newUser, int i) {
		user = newUser;
		score = i;
	}
	
	public int UserCompareScore() {
		
		return score;
	}
	
	protected void increaseScore(){
		score++;
	}
	
	public UserAccountInterface getUser(){
		return user;
	}

	public void setUser(UserAccountInterface user) {
		this.user = user;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
