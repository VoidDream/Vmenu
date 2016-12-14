package com.voidream.upnormalvmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
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
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.custom_list_kategori, null);
            TextView textView = (TextView) grid.findViewById(R.id.kategori);
            ImageView imageView = (ImageView) grid.findViewById(R.id.menu_image);
            textView.setText(daftar_kategori[position]);
            imageView.setImageResource(Imageid[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}
