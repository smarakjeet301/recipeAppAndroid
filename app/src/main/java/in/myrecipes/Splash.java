package in.myrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import in.myrecipes.Ui.Login;
import in.myrecipes.Ui.MainActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(() -> {

            startActivity(new Intent(Splash.this, Login.class));
            finish();

        },3000);

    }
}