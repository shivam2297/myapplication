package com.shivam.bansal.myapplication;

/**
 * Created by DELL on 4/16/2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class Bottom_fragment extends Fragment{

    private static TextView t;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container, false);
        t = (TextView) view.findViewById(R.id.meme_text);
        return view;
    }

    public void setmeme(String s){
        t.setText(s);
    }
}
