package matchMaking;

import java.util.*;
import userAccount.*;
import pair.*;

public class MatchMakingEngine implements MatchMakingInterface{
	//TODO
	//Set up a score for each user
	//Set up a priority based on location
	@Override
	public UserAccountInterface matchMake(List<UserAccountInterface> ListOfUser) {
		Iterator itr;
		itr = ListOfUser.iterator();
		List<UserScorePair> pair = new ArrayList<UserScorePair>();
		while(itr.hasNext()) {
			pair.add(new UserScorePair((UserAccountInterface)itr.next(), new Integer(0)));
		}
		
		return null;
	}
	
	@Override
	public MatchMakingInterface clone() {
		MatchMakingEngine m = new MatchMakingEngine();
		return m;
	}
}
