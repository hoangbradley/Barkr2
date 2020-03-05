package com.example.barkr;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button eventButton;
    Button saveBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventButton = findViewById(R.id.event_btn);
        saveBtn = findViewById(R.id.saveBtn);

        //write code here


        Switch switchage= (Switch) findViewById(R.id.switch_age);
        switchage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //POP UP BOX

                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

                builder.setCancelable(true);
                builder.setTitle("Barkr will take care of it!");
                builder.setMessage("Your age won't be shown anymore!");

                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();


            }
        });
        Switch switchdistance= (Switch) findViewById((R.id.switch_distance));
        switchdistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

                builder.setCancelable(true);
                builder.setTitle("Barkr will take care of it!");
                builder.setMessage("Your distance won't be shown anymore!");

                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();

                //POP UP BOX
            }
        });

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

                builder.setCancelable(true);
                builder.setTitle("We Got It!");
                builder.setMessage("All Changes Have Been Saved to Your Profile!");

                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();

            }
        });


        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Intent eventIntent = new Intent (getApplicationContext(), FindEvents.class);

                startActivity(new Intent(MainActivity.this,FindEvents.class));
               // startActivity(eventIntent);
            }
        });




    }
}
