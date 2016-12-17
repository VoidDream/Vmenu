package com.voidream.vmenu;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Abi Karami on 11/30/2016.
 */

public class KategoriCustomAdapter extends BaseAdapter {

    private Context mContext;
    private final String[] daftar_kategori;
    private final int[] Imageid;

    public KategoriCustomAdapter(Context c, String[] daftar_kategori, int[] Imageid) {
        mContext = c;
        this.Imageid = Imageid;
        this.daftar_kategori = daftar_kategori;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return daftar_kategori.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return daftar_kategori[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.custom_list_kategori, null);

        }
        TextView textView = (TextView) convertView.findViewById(R.id.kategori);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.menu_image);
        textView.setText(daftar_kategori[position]);
        imageView.setImageResource(Imageid[position]);
        RelativeLayout footer_gradient = (RelativeLayout)convertView.findViewById(R.id.relativeLayout);
        RelativeLayout background = (RelativeLayout)convertView.findViewById(R.id.background);
        if (position == daftar_kategori.length-1)
        {
            background.setBackgroundColor(Color.TRANSPARENT);
            footer_gradient.setVisibility(View.INVISIBLE);
            imageView.setVisibility(View.INVISIBLE);
            textView.setVisibility(View.INVISIBLE);
        }

        return convertView;
    }
}
