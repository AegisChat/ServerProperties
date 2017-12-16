package pair;

import userAccount.UserAccountInterface;

public abstract class Pair {
	abstract public int UserCompareScore();
	abstract protected void increaseScore();
	abstract public UserAccountInterface getUser();
	abstract public void setUser(UserAccountInterface user);
	abstract public int getScore();
	abstract public void setScore(int score);
}
