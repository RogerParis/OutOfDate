package es.rogerparis.outofdate;

import android.app.Application;
import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * Created by RogerParis on 17/05/15.
 */
public class OODApplication extends Application{


    private static final String TAG = OODApplication.class.getSimpleName();
    private final static int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private static Context ctx;

    public static Context getApplication() {
        return ctx;
    }

    @Override
    public void onCreate() {
        Log.i(TAG, "onCreate");
        ctx = this;
    }
}
