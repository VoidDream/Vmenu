package com.voidream.upnormalvmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class Pencarian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencarian);

        ListView daftar_menu = (ListView)findViewById(R.id.menu);
        MenuCustomAdapter menu = new MenuCustomAdapter(Pencarian.this);
        daftar_menu.setAdapter(menu);

        ImageButton back = (ImageButton) findViewById(R.id.button_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_main= new Intent(Pencarian.this, MainActivity.class);
                startActivity(intent_main);
                finish();
            }
        });

    }
}
