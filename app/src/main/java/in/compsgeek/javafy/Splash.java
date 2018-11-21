package in.compsgeek.javafy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Splash extends AppCompatActivity {

    ProgressBar mprogressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //mprogressbar = (ProgressBar) findViewById(R.layout.progressBar1);
        //mprogressbar.setVisibility(View.VISIBLE);

        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent int_splash = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(int_splash);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        };
        splashThread.start();
    }

}