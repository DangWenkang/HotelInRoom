package edu.rose_hulman.tongy.hotelbutler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Context mainContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainContext=this.getApplicationContext();
        Button ird_button =(Button) findViewById(R.id.button_in_room_dinning);
        Button schedule_button =(Button) findViewById(R.id.button_schedule_clean);
        Button other_button =(Button) findViewById(R.id.button_other_service);
        ird_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent =new Intent(mainContext,FoodMenuActivity.class);
                startActivity(mainIntent);
            }
        });
        schedule_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent =new Intent(mainContext,ScheduleCleaningActivity.class);
                startActivity(mainIntent);
            }
        });

        //Todo Add Other Service Button Logic
//        other_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent mainIntent =new Intent(mainContext,FoodMenuActivity.class);
//                startActivity(mainIntent);
//            }
//        });
    }
}
