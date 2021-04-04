package observer;

public interface Watchable {
	void watching(Viewers viewers);
	void notwatching(Viewers viewers);
	void notifyViewers();
	String getUpdate();
}
