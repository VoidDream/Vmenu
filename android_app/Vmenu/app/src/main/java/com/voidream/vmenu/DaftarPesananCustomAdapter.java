package com.voidream.vmenu;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Abi Karami on 11/30/2016.
 */

public class DaftarPesananCustomAdapter extends BaseAdapter {

    private LayoutInflater inflater;

    DaftarPesananCustomAdapter (Activity activity){
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    private String[] pesanan = new String[]{"2 Vanilla Milkshake", "3 Dancow Dingin", "3 Dancow Dingin", "3 Dancow Dingin", "3 Dancow Dingin", "3 Dancow Dingin", "3 Dancow Dingin", "3 Dancow Dingin", "3 Dancow Dingin", "TOTAL"};
    private String[] harga = new String[]{"Rp70.000", "Rp45.000", "Rp45.000","Rp45.000","Rp45.000","Rp45.000","Rp45.000","Rp45.000","Rp45.000", "Rp430.000"};

    @Override
    public int getCount() {
        if (pesanan != null){
            return pesanan.length;
        }else {
            return 0;
        }
    }

    @Override
    public Object getItem(int position) {
        return pesanan[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = inflater.inflate(R.layout.custom_list_daftar_pesanan, null);
        }
        TextView pesanan_ = (TextView)convertView.findViewById(R.id.pesanan);
        TextView harga_ = (TextView)convertView.findViewById(R.id.harga);
        pesanan_.setText(pesanan[position]);
        harga_.setText(harga[position]);
        //if(position==pesanan.length-1){pesanan_.setTypeface(Typeface.DEFAULT_BOLD);}
        return convertView;
    }
}
