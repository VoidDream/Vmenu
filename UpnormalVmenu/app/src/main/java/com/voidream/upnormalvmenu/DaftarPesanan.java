package com.voidream.upnormalvmenu;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class DaftarPesanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pesanan);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_pesan_sekarang= new Intent(DaftarPesanan.this, PesanSekarang.class);
                startActivity(intent_pesan_sekarang);

            }
        });

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.daftar_pesanan);
        ListView daftar_pesanan = (ListView)findViewById(R.id.daftar_pesanan);
        DaftarPesananCustomAdapter pesanan = new DaftarPesananCustomAdapter(DaftarPesanan.this);
        daftar_pesanan.setAdapter(pesanan);
        View footerView = ((LayoutInflater) this.getApplicationContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(
                R.layout.custom_list_footer, null, false);
        daftar_pesanan.addFooterView(footerView);

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
            Intent intent_pencarian= new Intent(DaftarPesanan.this, Pencarian.class);
            startActivity(intent_pencarian);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
