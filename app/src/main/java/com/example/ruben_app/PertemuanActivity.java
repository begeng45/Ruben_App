package com.example.ruben_app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PertemuanActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


    String[] perangkat = {"pertemuan 1", "pertemuan 2","pertemuan 3","pertemuan 4", "pertemuan 5"};
        this.setListAdapter(new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, perangkat));
}
    public void onListItemClick(ListView parent, View v, int urutan, long id) {
        Object detail = this.getListAdapter().getItem(urutan);
        String tampil = detail.toString();
        Intent i = null;
        if (tampil == "pertemuan 1")
        {
            i = new
                    Intent(PertemuanActivity.this, pertemuan1.class);
            startActivity(i);
        }
    }
}
