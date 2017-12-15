import java.util.*;

public interface MatchMakingInterface {
	abstract public UserAccountInterface matchMake(List<UserAccountInterface> ListOfUser);
	abstract public MatchMakingInterface clone();
}
