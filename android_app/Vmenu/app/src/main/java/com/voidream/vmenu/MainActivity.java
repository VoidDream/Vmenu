package com.voidream.vmenu;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView grid;
    String[] daftar_kategori = {
            "Special Drinks1",
            "Special Drinks2",
            "Special Drinks3",
            "Special Drinks4",
            "Special Drinks5",
            "Special Drinks6",
            "Special Drinks7",
            "Holy Fuckin Super Special Drinks",
            "footer"

    } ;
    int[] imageId = {
            R.drawable.dummy_square,
            R.drawable.dummy1_square,
            R.drawable.dummy2_square,
            R.drawable.dummy_square,
            R.drawable.dummy1_square,
            R.drawable.dummy2_square,
            R.drawable.dummy_square,
            R.drawable.dummy1_square,
            R.drawable.dummy_square

    };


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
        toolbar.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent_pencarian= new Intent(MainActivity.this, AboutUs.class);
                startActivity(intent_pencarian);
                return false;
            }
        });

        KategoriCustomAdapter adapter = new KategoriCustomAdapter(MainActivity.this, daftar_kategori, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent_pencarian= new Intent(MainActivity.this, Pencarian.class);
                startActivity(intent_pencarian);
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
