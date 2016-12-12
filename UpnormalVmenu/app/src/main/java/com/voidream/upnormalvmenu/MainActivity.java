package com.voidream.upnormalvmenu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_pesanan= new Intent(MainActivity.this, DaftarPesanan.class);
                startActivity(intent_pesanan);

            }
        });

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.kategori);
        ListView daftar_kategori = (ListView)findViewById(R.id.daftar_kategori);
        KategoriCustomAdapter kategori = new KategoriCustomAdapter(MainActivity.this);
        daftar_kategori.setAdapter(kategori);
        View footerView = ((LayoutInflater) this.getApplicationContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(
                R.layout.custom_list_footer, null, false);
        daftar_kategori.addFooterView(footerView);

        daftar_kategori.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Intent intent_pencarian= new Intent(MainActivity.this, Pencarian.class);
                startActivity(intent_pencarian);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.search_menu, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.pencarian) {
            Intent intent_pencarian= new Intent(MainActivity.this, Pencarian.class);
            startActivity(intent_pencarian);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
