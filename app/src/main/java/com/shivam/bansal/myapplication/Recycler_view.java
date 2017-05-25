package com.shivam.bansal.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Recycler_view extends AppCompatActivity {
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    private Button physics_button, chemistry_button, mathematics_button;
    public static LinearLayout subject_chooser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        physics_button = (Button) findViewById(R.id.physics_button);
        chemistry_button = (Button) findViewById(R.id.chemistry_button);
        mathematics_button = (Button) findViewById(R.id.mathematics_button);
        subject_chooser = (LinearLayout) findViewById(R.id.subject_chooser);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(3, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        List<ItemObjects> gaggeredList = getListItemData();

        SolventRecyclerViewAdapter rcAdapter = new SolventRecyclerViewAdapter(Recycler_view.this, gaggeredList);
        recyclerView.setAdapter(rcAdapter);

        physics_button.setOnClickListener(
                new View.OnClickListener(){

                    public void onClick(View view){
                        Log.d("test", "clicked");
                        Toast.makeText(getApplicationContext(),"physics",Toast.LENGTH_SHORT);
                    }

                }
        );
        chemistry_button.setOnClickListener(
                new Button.OnClickListener(){

                    public void onClick(View view){
                        Toast.makeText(getApplicationContext(),"chemistry",Toast.LENGTH_SHORT);
                    }

                }
        );
        mathematics_button.setOnClickListener(
                new Button.OnClickListener(){

                    public void onClick(View view){
                        Toast.makeText(getApplicationContext(),"mathematics",Toast.LENGTH_SHORT);
                    }

                }
        );
    }

    private List<ItemObjects> getListItemData(){
        List<ItemObjects> listViewItems = new ArrayList<ItemObjects>();
        listViewItems.add(new ItemObjects("Sample Paper", R.drawable.one));
        listViewItems.add(new ItemObjects("Sample Paper", R.drawable.two));
        listViewItems.add(new ItemObjects("Sample Paper", R.drawable.three));
        listViewItems.add(new ItemObjects("Sample Paper", R.drawable.four));
        listViewItems.add(new ItemObjects("Sample Paper", R.drawable.one));
        listViewItems.add(new ItemObjects("Sample Paper", R.drawable.two));
        listViewItems.add(new ItemObjects("Sample Paper", R.drawable.three));
        listViewItems.add(new ItemObjects("Sample Paper", R.drawable.four));
        listViewItems.add(new ItemObjects("Sample Paper", R.drawable.one));
        listViewItems.add(new ItemObjects("Sample Paper", R.drawable.two));
        listViewItems.add(new ItemObjects("Sample Paper", R.drawable.three));
        listViewItems.add(new ItemObjects("Sample Paper", R.drawable.four));

        return listViewItems;
    }
}
