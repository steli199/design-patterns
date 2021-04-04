package abstractfactory;

public class ExerciseProgramMain {

	public static void main(String[] args) {

		Exercise exerciseOfCoachProgram = ExerciseProgram.exerciseKind("Stand Up_Sit Down");
		ExerciseOfCoach standup = exerciseOfCoachProgram.exerciseKind("Stand Up");
		standup.execute();	
		ExerciseOfCoach sitdown = exerciseOfCoachProgram.exerciseKind("Sit Down");
		sitdown.execute();
	}
}
