
public class Sister {

	String name;
	BumpGroup group;
	int spot;

	// Constructor:
	public Sister(String n, BumpGroup bg, int s) {
		this.name = n;
		this.group = bg;
		this.spot = s;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public BumpGroup getGroup() {
		return group;
	}

	public void setGroup(BumpGroup group) {
		this.group = group;
	}
	
	public int getSpot() {
		return spot;
	}

	public void setSpot(int spot) {
		this.spot = spot;
	}

	



}
