package com.noti;

import android.Manifest.*;
import android.app.*;
import android.content.pm.*;
import android.os.*;
import android.view.*;
import report.*;

public class MainActivity extends Activity {

	private Notification.Builder nb;

	private NotificationManager nm;

	private static final int REQUEST_CODE = 20;
	final String sep = "-----";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		String[] perm = {permission.WRITE_EXTERNAL_STORAGE,permission.READ_EXTERNAL_STORAGE};
        setContentView(R.layout.main);
		if (checkSelfPermission(perm[1]) == PackageManager.PERMISSION_DENIED)
			requestPermissions(perm, REQUEST_CODE);
			
		Thread.setDefaultUncaughtExceptionHandler(
			new Reporter(this, new ExceptionListener(){

					@Override
					public void onEx(Thread thread, Throwable ex) {
						finish();
					}
				}));
    }

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	public void set(View cv) {
		nb.setSmallIcon(R.drawable.ic_launcher)
			.setContentTitle("Title")
			.setContentText("text")
			.setNumber(100)
			.setSubText("sub")
			.setTicker("Ticker");
		nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		nm.notify(1, nb.build());
	}
}

