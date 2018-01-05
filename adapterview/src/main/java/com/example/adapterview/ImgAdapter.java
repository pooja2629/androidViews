package com.example.adapterview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Pooja on 04-01-2018.
 */

public class ImgAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<ImgItem> dtSt;
    private LayoutInflater inflater;

    public ImgAdapter (Context context, ArrayList<ImgItem> dtSt){
        this.context= context;
        this.dtSt= dtSt;

        inflater= LayoutInflater.from(context);
}
    @Override
    public int getCount() {
        return dtSt.size();
    }
    @Override
    public Object getItem (int pos) {
        return dtSt.get(pos);
    }

    @Override
    public long getItemId (int pos) {
        return pos;
    }

    @Override
    public View getView (int pos, View view, ViewGroup viewGroup) {
        View viewInf = inflater.inflate(R.layout.img_itm, viewGroup, false);
        ImgItem itm = dtSt.get(pos);
        ImageView imgVw = viewInf.findViewById(R.id.imgVw);
        imgVw.setImageResource(itm.id);
        TextView txtVw = viewInf.findViewById(R.id.txtVw);
        txtVw.setText(itm.name);
        return viewInf;
    }
}
