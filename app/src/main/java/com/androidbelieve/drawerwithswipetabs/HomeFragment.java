package com.androidbelieve.drawerwithswipetabs;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by Ratan on 7/29/2015.
 */
public class HomeFragment extends Fragment {
    ArrayList prgmName;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View x = inflater.inflate(R.layout.home_layout, null);
        GridView gridview = (GridView) x.findViewById(R.id.gridView);
         String [] prgmNameList={"Article 1","Article 2","Article 3","Article 4","Article 5","Article 6","Article 7","Article 8",
                 "Article 9"};
      int [] prgmImages={R.drawable.vetments,R.drawable.vetments,R.drawable.vetments,R.drawable.vetments,
        R.drawable.vetments,R.drawable.vetments,R.drawable.vetments,R.drawable.vetments,R.drawable.vetments};

        gridview.setAdapter(new ImageAdapter(x.getContext(), prgmNameList,prgmImages));
    return  x;
    }


}
