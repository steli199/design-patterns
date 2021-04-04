package abstractfactory;

public class ExerciseOfCoachProgram extends Exercise {

	@Override
	public
	ExerciseOfCoach exerciseKind(String name) {

		if(name == "Stand Up") {
			return new StandUp();
		}
		
		if(name == "Sit Down") {
			return new SitDown();
		}
		
		System.out.println("Unknown command: " + name);
		
		return null;
	}

}
