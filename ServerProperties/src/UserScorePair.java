
public class UserScorePair<UserAccountInterface, Integer> implements Pair<Object, Object>{
	private UserAccountInterface user;
	private int score;
	
	public UserScorePair(UserAccountInterface newUser, int i) {
		user = newUser;
		score = i;
	}
}
