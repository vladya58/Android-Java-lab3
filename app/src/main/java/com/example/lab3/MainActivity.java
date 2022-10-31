package com.example.lab3;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.jetbrains.annotations.Nullable;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("ON START", "Start");

        setContentView(R.layout.autho);
        Intent intent = new Intent(this, list.class);
        Button button1 = findViewById(R.id.button);

        Bundle bl = new Bundle();
        bl.putString("key","Слово уже было введено");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtras(bl);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ON CREATE", "Create");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ON PAUSE", "Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ON RESUME", "Resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ON DESTROY", "Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ON StOP", "Stop");
    }
}
