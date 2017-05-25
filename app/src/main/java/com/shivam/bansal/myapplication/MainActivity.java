package com.shivam.bansal.myapplication;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements Top_fragment.Top_fragment_listener{

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final String tag = "test_sb";

        Log.i(tag, "all is well!");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_settings:
                Toast.makeText(getApplicationContext(), "calculator", Toast.LENGTH_LONG).show();
                return true;
            case R.id.student_detail:
                i = new Intent(getApplicationContext(),UI_test.class);
                i.putExtra("layout",R.layout.student_details);
                startActivity(i);
                return true;
            case R.id.teacher_detail:
                i = new Intent(getApplicationContext(),UI_test.class);
                i.putExtra("layout",R.layout.teacher_details);
                startActivity(i);
                return true;
            case R.id.class_chooser:
                i = new Intent(getApplicationContext(),UI_test.class);
                i.putExtra("layout",R.layout.class_chooser);
                startActivity(i);
                return true;
            case R.id.recycler_view_activity:
                i = new Intent(getApplicationContext(),Recycler_view.class);
                //i.putExtra("layout",R.layout.activity_recycler_view);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public void creatememe(String text) {
       Bottom_fragment bottom_fragment = (Bottom_fragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottom_fragment.setmeme(text);
    }
}
