package pe.edu.ulima.servicesreceiversapp;


import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class NuevoIntentService extends IntentService{
    public NuevoIntentService(){
        super("NuevoIntentService");
    }
    public NuevoIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i("NuevoIntentService", "Se ejecuta el onHandleIntent");
    }
}
