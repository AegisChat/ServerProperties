package matchMaking;

import java.util.*;
import userAccount.*;

public interface MatchMakingInterface {
	abstract public UserAccountInterface matchMake(List<UserAccountInterface> ListOfUser);
	abstract public MatchMakingInterface clone();
}
