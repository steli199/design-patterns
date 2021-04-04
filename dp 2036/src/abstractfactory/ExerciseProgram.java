package abstractfactory;

public class ExerciseProgram {
	
	public static Exercise exerciseKind(String name) {
		
		if(name == "Stand Up_Sit Down") {
			return new ExerciseOfCoachProgram();
		}
		
		System.out.println("Unknown program: " + name);
		return null;
	}
	
}
