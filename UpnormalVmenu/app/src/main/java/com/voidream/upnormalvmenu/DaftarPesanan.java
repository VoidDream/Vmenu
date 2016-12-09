package com.voidream.upnormalvmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
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

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.daftar_pesanan);
        ListView daftar_pesanan = (ListView)findViewById(R.id.daftar_pesanan);
        Button pesan_sekarang = (Button)findViewById(R.id.pesan_sekarang);
        DaftarPesananCustomAdapter pesanan = new DaftarPesananCustomAdapter(DaftarPesanan.this);
        daftar_pesanan.setAdapter(pesanan);

        pesan_sekarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_pesan_sekarang= new Intent(DaftarPesanan.this, PesanSekarang.class);
                startActivity(intent_pesan_sekarang);
                finish();
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
            Intent intent_pencarian= new Intent(DaftarPesanan.this, Pencarian.class);
            startActivity(intent_pencarian);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
