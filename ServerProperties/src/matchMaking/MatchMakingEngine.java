package matchMaking;

import java.util.*;
import userAccount.*;
import pair.*;

public class MatchMakingEngine implements MatchMakingInterface{
	//TODO
	//Set up a score comparing a user with users in the area
	//Set up a priority based on location
	@Override
	public UserAccountInterface matchMake(UserAccountInterface user, List<UserAccountInterface> ListOfUser) {
		Iterator itr;
		itr = ListOfUser.iterator();
		List<UserScorePair> pairs = new ArrayList<UserScorePair>();		
		while(itr.hasNext()) {
			pairs.add(new UserScorePair((UserAccountInterface)itr.next(), new Integer(0)));
		}
		
//		for(int i = 0; i < pairs.size(); i++) {
//			for(int j = 0; j < pairs.size(); j++) {
//				if(pairs.get(i).getUser().equals(obj)) {
//					
//				}
//			}
//		}
		
		return null;
	}
	
	@Override
	public MatchMakingInterface clone() {
		MatchMakingEngine m = new MatchMakingEngine();
		return m;
	}
}
