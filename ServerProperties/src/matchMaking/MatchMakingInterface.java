package matchMaking;

import java.util.*;
import userAccount.*;

public interface MatchMakingInterface {
	abstract public UserAccountInterface matchMake(UserAccountInterface user, List<UserAccountInterface> ListOfUser);
	abstract public MatchMakingInterface clone();
}
