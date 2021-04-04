package command;

public class Up_Down {

	private Boolean isUp;
	
	public void standUp() {
		//...
		System.out.println("He/She is Up");
		this.isUp = true;
	}
	
	public void sitDown() {
		//..
		System.out.println("He/She is Down");
		this.isUp = false;
	}
}
