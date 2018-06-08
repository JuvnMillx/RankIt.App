package project.welltec.rankitapp.utils;

import android.app.ActionBar;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import project.welltec.rankitapp.R;

public final class ActionBarManagement {
    private static ActionBar myActionBar = null;
    private static LayoutInflater myLayoutInflater = null;

    public static void inflateCustomActionBar(ActionBar actionBar, LayoutInflater layoutInflater){
        //Get the default actionbar instance
        myActionBar = actionBar;
        myActionBar.setDisplayShowHomeEnabled(false);
        myActionBar.setDisplayShowTitleEnabled(false);

        //Initializes the custom action bar layout
        myLayoutInflater = layoutInflater;
        View mCustomView = myLayoutInflater.inflate(R.layout.custom_actionbar, null);
        myActionBar.setCustomView(mCustomView);
        myActionBar.setDisplayShowCustomEnabled(true);
    }
}
