package pe.edu.ulima.servicesreceiversapp;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

public class NuevoService extends Service{
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("NuevoService", "Se llama el service");
        //stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("NuevoService", "Se termino el service");
    }
}
