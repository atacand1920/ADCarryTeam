package com.androidbelieve.drawerwithswipetabs;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class GridViewAdapter extends ArrayAdapter<ImageItem> {

    private Context context;
    private int layoutResourceId;
    private ArrayList<ImageItem> data = new ArrayList<ImageItem>();

    public GridViewAdapter(Context context, int layoutResourceId, ArrayList<ImageItem> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder;

        if (row == null) {
           // LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = View.inflate(context,layoutResourceId,null);
            System.out.println(row);

            holder = new ViewHolder();
            holder.imageTitle = (TextView) row.findViewById(R.id.produit);
            holder.image = (ImageView) row.findViewById(R.id.image);

            row.setTag(holder);
            System.out.println("row==null");
        } else {


            holder = (ViewHolder) row.getTag();

        }

        row.findViewById(R.id.produit);
        ImageItem item = data.get(position);
       // System.out.println(item.getTitle());
       holder.imageTitle.setText(item.getTitle().toString());
       holder.image.setImageBitmap(item.getImage());

        return row;
    }

    static class ViewHolder {
        TextView imageTitle;
        ImageView image;
    }
}