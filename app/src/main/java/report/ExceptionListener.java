package report;

public interface ExceptionListener {
	void onEx(Thread thread, Throwable ex);
}
