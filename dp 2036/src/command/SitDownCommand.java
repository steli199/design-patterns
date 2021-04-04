package command;

public class SitDownCommand implements Command {

	private Up_Down up_down;
	
	public SitDownCommand(Up_Down up_down) {
		this.up_down = up_down;
	}

	@Override
	public void execute() {
		this.up_down.sitDown();
	}

}
