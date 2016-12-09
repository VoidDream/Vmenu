package com.voidream.upnormalvmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class PesanSekarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_sekarang);

        ImageButton send = (ImageButton) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplication().getApplicationContext(),"Pesanan sedang dikirim",Toast.LENGTH_SHORT).show();
                finish();
                Toast.makeText(getApplication().getApplicationContext(),"Pesanan A/N Abi Karami Meja 21 sukses!",Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton back = (ImageButton) findViewById(R.id.button_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_main= new Intent(PesanSekarang.this, DaftarPesanan.class);
                startActivity(intent_main);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.send_menu, menu);
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
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
