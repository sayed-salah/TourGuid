package com.example.sayedsalah.tourguid2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sayed Salah on 9/30/2017.
 */
public class ListAdapter extends ArrayAdapter<Item> {
    ArrayList<Item> itemslist;
    private Context mcontext;

    public ListAdapter(Context mcontext, ArrayList<Item> items) {
        super(mcontext, 0, items);
        this.mcontext = mcontext;
        this.itemslist = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listitemview = convertView;
        if (listitemview == null) {
            listitemview = LayoutInflater.from(mcontext).inflate(R.layout.one_item, parent, false);
        }

        Item item = getItem(position);

        ImageView image1 = (ImageView) listitemview.findViewById(R.id.clubimage);
        image1.setImageResource(item.getImage1());

        TextView text1 = (TextView) listitemview.findViewById(R.id.clubtext1);
        text1.setText(item.getText1());

        TextView text2 = (TextView) listitemview.findViewById(R.id.clubtext2);
        text2.setText(item.getText2());

        ImageView image2 = (ImageView) listitemview.findViewById(R.id.marker);
        image2.setImageResource(item.getImage2());


        return listitemview;
    }
}
