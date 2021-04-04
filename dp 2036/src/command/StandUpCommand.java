package command;

public class StandUpCommand implements Command {

	private Up_Down up_down;
	
	public StandUpCommand(Up_Down up_down) {
		this.up_down = up_down;
	}

	@Override
	public void execute() {
		this.up_down.standUp();
	}

}
