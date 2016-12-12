package com.voidream.upnormalvmenu;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Abi Karami on 11/30/2016.
 */

public class KategoriCustomAdapter extends BaseAdapter {

    private LayoutInflater inflater;

    KategoriCustomAdapter (Activity activity){
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    private String[] kategori = new String[]{"Makanan Berat", "Snack", "Dessert", "Sangu", "Cai", "Special Drinks", "Coffee", "Permen", "Buah", "Dessert", "X-treme Food"};

    @Override
    public int getCount() {
        if (kategori != null){
            return kategori.length;
        }else {
            return 0;
        }
    }

    @Override
    public Object getItem(int position) {
        return kategori[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = inflater.inflate(R.layout.custom_list_kategori, null);
        }
        TextView kategori_ = (TextView)convertView.findViewById(R.id.kategori);
        kategori_.setText(kategori[position]);
        return convertView;
    }
}
