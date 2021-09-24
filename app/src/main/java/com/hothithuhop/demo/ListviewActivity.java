package com.hothithuhop.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {
    private ArrayList<String> danhSach;
    private ListView lvDanhSach;
    private ArrayAdapter<String> mainAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        lvDanhSach = (ListView) findViewById(R.id.lvDanhSach);

        danhSach = new ArrayList<>();
        for(int i=1;i<=50;i++){
            danhSach.add(i+"");
        }
        mainAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,danhSach);
        lvDanhSach.setAdapter(mainAdapter);
    }
}