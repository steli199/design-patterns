package command;

public class CommandMain {

	public static void main(String[] args) {

		RemoteController remoteController = new RemoteController();
		Up_Down up_down = new Up_Down();
		
		Command StandUpCommand = new StandUpCommand(up_down);
		Command SitDownCommand = new SitDownCommand(up_down);

		remoteController.setCommand(StandUpCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(SitDownCommand);
		remoteController.pressButton();

	}

}
