package tonimor.vdkans.navigationviewsample;

import android.app.Application;

public class MainObjectApp extends Application
{
	final public String m_TAG = "MainObjectApp";
	
	public MainObjectApp()
	{
	}
	
	public void onCreate()
	{
		super.onCreate();
		Globals.m_appContext = getApplicationContext();
	}

}
