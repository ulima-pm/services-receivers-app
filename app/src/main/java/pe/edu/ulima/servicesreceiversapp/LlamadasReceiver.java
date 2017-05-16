package pe.edu.ulima.servicesreceiversapp;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

public class LlamadasReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null){
            String state = extras.getString(TelephonyManager.EXTRA_STATE);
            String number = extras.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
            Log.i("LlamadasReceiver", "Estado llamada: " + state);
        }


    }
}
