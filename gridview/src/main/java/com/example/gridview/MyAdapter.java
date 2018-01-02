package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Pooja on 29-12-2017.
 */

public class MyAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<MyItem> dataSet;
    private LayoutInflater inflater;

    public MyAdapter(Context context, ArrayList<MyItem> dataSet){
            this.context= context;
            this.dataSet= dataSet;

        inflater= LayoutInflater.from(context);

    }
    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public Object getItem(int position) {
        return dataSet.get(position );
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view= inflater.inflate(R.layout.grid_item,parent, false);
        ((ImageView)view.findViewById(R.id.imgIc)).setImageResource(dataSet.get(position).img);
        ((TextView)view.findViewById(R.id.txtNm)).setText(dataSet.get(position).txt);
        return view;
    }
}
