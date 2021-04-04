package observer;

public class ExerciseWatcher implements Viewers {

	
	private String name;
	private Watchable exercise;
	
	public ExerciseWatcher(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.exercise == null) {
			System.out.println(this.name + " has no exercise set");
			return;
		}
		String exerciseName = this.exercise.getUpdate();
		System.out.println(this.name + " have to " + exerciseName);
	}

	@Override
	public void setExercise(Watchable exercise) {
		this.exercise = exercise;
	}

}
