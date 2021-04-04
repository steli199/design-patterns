package observer;

public class ViewersMain {

	public static void main(String[] args) {

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
