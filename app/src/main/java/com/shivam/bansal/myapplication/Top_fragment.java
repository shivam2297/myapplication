package com.shivam.bansal.myapplication;

/**
 * Created by DELL on 4/16/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Top_fragment extends Fragment {

    private static Button b;
    private static EditText text;

    Top_fragment_listener activity_commander;

    public interface Top_fragment_listener{
        void creatememe(String text);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        activity_commander = (Top_fragment_listener) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);
        b = (Button) view.findViewById(R.id.top_button);
        text = (EditText) view.findViewById(R.id.top_text_input);

        b.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        buttonclicked(view);
                    }
                }
        );
        return view;
    }

    public void buttonclicked(View view){
        activity_commander.creatememe(text.getText().toString());

    }
}
