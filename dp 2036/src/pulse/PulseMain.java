package pulse;

import abstractfactory.Exercise;
import abstractfactory.ExerciseOfCoach;
import abstractfactory.ExerciseProgram;
import command.Command;
import command.RemoteController;
import command.SitDownCommand;
import command.StandUpCommand;
import command.Up_Down;
import observer.ExerciseWatcher;
import observer.Viewers;
import observer.Workout;

public class PulseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise exerciseOfCoachProgram = ExerciseProgram.exerciseKind("Stand Up_Sit Down");
		ExerciseOfCoach standup = exerciseOfCoachProgram.exerciseKind("Stand Up");
		standup.execute();	
		ExerciseOfCoach sitdown = exerciseOfCoachProgram.exerciseKind("Sit Down");
		sitdown.execute();
		
		
		RemoteController remoteController = new RemoteController();
		Up_Down up_down = new Up_Down();
		
		Command StandUpCommand = new StandUpCommand(up_down);
		Command SitDownCommand = new SitDownCommand(up_down);

		remoteController.setCommand(StandUpCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(SitDownCommand);
		remoteController.pressButton();
		
		
		Workout exercise = new Workout();
		Viewers vwr1 = new ExerciseWatcher("Viewer 01");
		Viewers vwr2 = new ExerciseWatcher("Viewer 02");
		Viewers vwr3 = new ExerciseWatcher("Viewer 03");
		
		exercise.watching(vwr1);
		exercise.watching(vwr2);
		exercise.watching(vwr3);
		
		exercise.setExerciseName("Stand up");
		exercise.setExerciseName("Sit down");


	}

}
