package com.androidbelieve.drawerwithswipetabs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by atacand19200 on 16/11/2016.
 */

public class ImageAdapter extends BaseAdapter
{
    private Context context;
    String [] result;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public ImageAdapter(Context c, String[] prgmNameList, int[] prgmImages)
    {
        super();
        context = c;
        result=prgmNameList;
        imageId=prgmImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    //---returns the number of images---
    public int getCount() {
        return 6;
    }
    @Override
    //---returns the ID of an item---
    public Object getItem(int position) {
        return 1;
    }
@Override
    public long getItemId(int position) {
        return position;
    }

    //---returns an ImageView view---
    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {

        final View rowView;

        rowView = inflater.inflate(R.layout.details_activity, null);
       TextView tv= (TextView) rowView.findViewById(R.id.title);
       ImageView img=(ImageView) rowView.findViewById(R.id.image);

        tv.setText(result[position]);
        img.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context,ProductDetail.class);
             context.startActivity(intent);
            }
        });

        return rowView;
    }


}

