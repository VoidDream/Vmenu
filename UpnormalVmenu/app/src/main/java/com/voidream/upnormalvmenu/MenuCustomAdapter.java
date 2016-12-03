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
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Abi Karami on 11/30/2016.
 */

public class MenuCustomAdapter extends BaseAdapter {

    private LayoutInflater inflater;

    MenuCustomAdapter (Activity activity){
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    String[] menu = new String[]{"Vanilla Milkshake", "Dancow Dingin", "Susu Bendera", "Susu Murni"};
    String[] detil = new String[]{"Susu sapi asli yang dikocok dengan kasih sayang dari seorang koki profesional dengan rasa panila yang gurih di lidah membuat anda mabuk kepayang",
            "Susu dancow sachet yang diseduh lalu di blend dengan es yang menggiurkan",
            "Susu bendera kental manis siap menggoyang mulutmu",
            "Susu murni langsung dari sapi asli"};
    String[] cost = new String[]{"35.000", "15.000", "7.500", "11.000"};

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
        TextView nama = (TextView)convertView.findViewById(R.id.nama);
        TextView keterangan = (TextView)convertView.findViewById(R.id.keterangan);
        TextView harga = (TextView)convertView.findViewById(R.id.harga);
        RelativeLayout click = (RelativeLayout)convertView.findViewById(R.id.gradient);
        nama.setText(menu[position]);
        keterangan.setText(detil[position]);
        harga.setText("Rp"+cost[position]);
        return convertView;
    }
}
