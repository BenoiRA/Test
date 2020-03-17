package report;
import java.lang.Thread.*;
import java.io.*;
import android.app.*;
import android.widget.*;
import android.os.*;
import java.text.*;
import java.util.*;
import android.content.*;
public class Reporter implements UncaughtExceptionHandler {

	private Context activity;

	private String logfile = "/";

	private ExceptionListener oel;
	public Reporter(Context a,ExceptionListener ex){
		activity = a;
		oel = ex;
	}
	
	@Override
	public void uncaughtException(Thread t, Throwable ex) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			PrintWriter pw = new PrintWriter(activity.getExternalFilesDir("logs")+logfile+format.format(new Date())+".txt");
			ex.printStackTrace(pw);
			pw.close();
		}
		catch (FileNotFoundException e) {
			Toast.makeText(activity,e.toString(),Toast.LENGTH_LONG).show();
		}
		if(oel != null)
			oel.onEx(t,ex);
	}
}
