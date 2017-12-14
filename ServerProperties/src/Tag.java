
public class Tag implements TagInterface {
	private String tag;

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	@Override
	public boolean equals(Tag t) {
		if(this.getTag() == t.getTag()) {
			return true;
		}else {
			return false;
		}
	}
}
