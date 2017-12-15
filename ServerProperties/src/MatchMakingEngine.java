import java.util.*;

public class MatchMakingEngine implements MatchMakingInterface{
	
	//TODO
	//Set up a score for each user
	//Set up a priority based on location
	
	@Override
	public UserAccountInterface matchMake(List<UserAccountInterface> ListOfUser) {
		// TODO Auto-generated method stub
		List<Integer> score = new ArrayList<Integer>();
		
		return null;
	}
	
	@Override
	public MatchMakingInterface clone() {
		MatchMakingEngine m = new MatchMakingEngine();
		return m;
	}
}
