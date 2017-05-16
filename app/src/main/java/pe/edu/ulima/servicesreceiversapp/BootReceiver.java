package pe.edu.ulima.servicesreceiversapp;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("BootReceiver", "Se ejecuta el BroadcastReceiver");
        Intent intent1 = new Intent();
        intent1.setClass(context, NuevoService.class);
        context.startService(intent1);
    }
}
