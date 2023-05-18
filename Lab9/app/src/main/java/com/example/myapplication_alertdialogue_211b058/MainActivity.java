package com.example.myapplication_alertdialogue_211b058;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_ab)
                .setTitle("Alert Alert!!")
                .setMessage("Beware of Spam messages")
                .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                    }
                }).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
