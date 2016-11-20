package com.androidbelieve.drawerwithswipetabs;

import android.app.Application;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by atacand19200 on 16/11/2016.
 */

public class ProductDetail extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.details_produit);
    }
}
