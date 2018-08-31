
public class Ucesnici {
	
	private String name;
	private int time;
	
	public Ucesnici(){
		
	}
	
	public Ucesnici(String name, int time) {
		this.name = name;
		this.time = time;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTime() {
		return time;
	}

}
