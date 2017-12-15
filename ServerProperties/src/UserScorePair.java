
public class UserScorePair<UserAccountInterface, Integer> extends Pair{
	private UserAccountInterface user;
	private int score;
	
	public UserScorePair(UserAccountInterface newUser, int i) {
		user = newUser;
		score = i;
	}
	
	public void increaseScore(){
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
