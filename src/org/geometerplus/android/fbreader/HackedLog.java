package org.geometerplus.android.fbreader;

import android.os.Environment;
import android.util.Log;

public class HackedLog {

	private final static String LOG_ACTIVATION_FOLDER_NAME = "ACTIVATE_LOG";
	private static boolean checked;
	private static boolean is_on;

	public static synchronized void check() {
		is_on = false;
		checked = false;
		try {
			String state = Environment.getExternalStorageState();
			if (Environment.MEDIA_MOUNTED.equals(state)) {
//				Log.i("Logger", "External storage state is MEDIA_MOUNTED");
				String[] root = Environment.getExternalStorageDirectory()
						.list();
				for (String string : root) {
					if (string.equalsIgnoreCase(LOG_ACTIVATION_FOLDER_NAME)) {
						Log.i("Logger", "Log was activated");
						is_on = true;
						break;
					}
				}
			} else if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
//				Log.i("Logger",
//						"External storage state is MEDIA_MOUNTED_READ_ONLY");
			} else {
//				Log.i("Logger", "External storage state is not mounted");
			}
		} catch (Exception e) {
//			Log.e("Logger", "Exception", e);
		} finally {
			checked = true;
		}
	}

	public static synchronized void i(String tag, String message) {
		if (!checked) {
			check();
		}
		if (is_on) {
			Log.i(tag, message);
		}
	}

	public static synchronized void i(String tag, String message, Throwable tr) {
		if (!checked) {
			check();
		}
		if (is_on) {
			Log.i(tag, message, tr);
		}
	}

	public static synchronized void e(String tag, String message) {
		if (!checked) {
			check();
		}
		if (is_on) {
			Log.e(tag, message);
		}
	}

	public static synchronized void e(String tag, String message, Throwable tr) {
		if (!checked) {
			check();
		}
		if (is_on) {
			Log.e(tag, message, tr);
		}
	}

	public static synchronized void d(String tag, String message) {
		if (!checked) {
			check();
		}
		if (is_on) {
			Log.d(tag, message);
		}
	}

	public static synchronized void d(String tag, String message, Throwable tr) {
		if (!checked) {
			check();
		}
		if (is_on) {
			Log.d(tag, message, tr);
		}
	}

	public static synchronized void v(String tag, String message) {
		if (!checked) {
			check();
		}
		if (is_on) {
			Log.v(tag, message);
		}
	}

	public static synchronized void v(String tag, String message, Throwable tr) {
		if (!checked) {
			check();
		}
		if (is_on) {
			Log.v(tag, message, tr);
		}
	}

	public static synchronized void w(String tag, String message) {
		if (!checked) {
			check();
		}
		if (is_on) {
			Log.w(tag, message);
		}
	}

	public static synchronized void w(String tag, Throwable tr) {
		if (!checked) {
			check();
		}
		if (is_on) {
			Log.w(tag, tr);
		}
	}

	public static synchronized void w(String tag, String message, Throwable tr) {
		if (!checked) {
			check();
		}
		if (is_on) {
			Log.w(tag, message, tr);
		}
	}
}
