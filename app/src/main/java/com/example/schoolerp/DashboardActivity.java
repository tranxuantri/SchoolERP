package com.example.schoolerp;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView itemList = findViewById(R.id.list_item_dashboard);
        TextView title = findViewById(R.id.title);
        TextView subTitle = findViewById(R.id.sub_title);
        TextView date = findViewById(R.id.date);
        title.setText(getString(R.string.hi_name, "Admin"));
        subTitle.setText(getString(R.string.sub_title, "005", "SE"));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        LocalDateTime now = LocalDateTime.now();
        date.setText(dtf.format(now));

        ItemListAdapter listAdapter = new ItemListAdapter(Model.getListModel());
        itemList.setAdapter(listAdapter);
        itemList.setLayoutManager(new GridLayoutManager(this, 2));
    }
}