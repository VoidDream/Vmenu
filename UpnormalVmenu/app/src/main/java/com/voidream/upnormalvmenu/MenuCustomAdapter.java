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

public class MenuCustomAdapter extends BaseAdapter {

    private LayoutInflater inflater;

    MenuCustomAdapter (Activity activity){
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    String[] menu = new String[]{"Vanilla Milkshake", "Susu Kocok Panila", "Susu Bendera"};

    @Override
    public int getCount() {
        if (menu != null){
            return menu.length;
        }else {
            return 0;
        }
    }

    @Override
    public Object getItem(int position) {
        return menu[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = inflater.inflate(R.layout.custom_list_menu, null);
        }
        TextView kategori_ = (TextView)convertView.findViewById(R.id.nama);
        kategori_.setText(menu[position]);
        return convertView;
    }
}
