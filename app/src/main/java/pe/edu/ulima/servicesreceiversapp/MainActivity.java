package pe.edu.ulima.servicesreceiversapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but = (Button) findViewById(R.id.but);
        Button butTerminar = (Button) findViewById(R.id.butTerminar);
        Button butIntentService = (Button) findViewById(R.id.butIntentService);

        but.setOnClickListener(this);
        butTerminar.setOnClickListener(this);
        butIntentService.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setClass(this, NuevoService.class);
        if (view.getId() == R.id.but){
            startService(intent);
        }else if (view.getId() == R.id.butTerminar){
            stopService(intent);
        }else if (view.getId() == R.id.butIntentService){
            Intent intent2 = new Intent();
            intent2.setClass(this, NuevoIntentService.class);
            startService(intent2);
        }


    }


}
