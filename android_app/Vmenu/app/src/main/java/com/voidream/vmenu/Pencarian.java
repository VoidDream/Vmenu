package com.voidream.vmenu;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

public class Pencarian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencarian);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_pesanan= new Intent(Pencarian.this, DaftarPesanan.class);
                startActivity(intent_pesanan);

            }
        });

        ListView daftar_menu = (ListView)findViewById(R.id.menu);
        MenuCustomAdapter menu = new MenuCustomAdapter(Pencarian.this);
        daftar_menu.setAdapter(menu);

        daftar_menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent_main= new Intent(Pencarian.this, PopupJumlahPesanan.class);
                startActivity(intent_main);
            }
        });

        ImageButton back = (ImageButton) findViewById(R.id.button_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

    }
}
