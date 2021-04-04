package observer;

import java.util.ArrayList;
import java.util.List;

public class Workout implements Watchable {

	private List<Viewers> viewers = new ArrayList<>();
	private String exerciseName;
	
	@Override
	public void watching(Viewers viewers) {
		this.viewers.add(viewers);
		viewers.setExercise(this);
	}

	@Override
	public void notwatching(Viewers viewers) {
		this.viewers.remove(viewers);
	}

	@Override
	public void notifyViewers() {
		for(Viewers viewers: this.viewers) {
			viewers.update();
		}
	}

	@Override
	public String getUpdate() {
		// Can be something more than just a getter
		return this.exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
		this.notifyViewers();
	}

}
