
public class PNM {

	String name;
	int spot;
	boolean isLegacy;
	
	
	// Constructor:
	public PNM(String n, int s, Boolean b) {
		this.name = n;
		this.spot = s;
		this.isLegacy = b;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getSpot() {
		return spot;
	}

	public void setSpot(int spot) {
		this.spot = spot;
	}

	public boolean isLegacy() {
		return isLegacy;
	}

	public void setLegacy(boolean isLegacy) {
		this.isLegacy = isLegacy;
	}


}
