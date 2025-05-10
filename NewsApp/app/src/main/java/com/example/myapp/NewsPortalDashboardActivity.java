package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NewsPortalDashboardActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ListView listView = findViewById(R.id.news_list);

        String[] news = {
            "Berita 1: Android Studio Update",
            "Berita 2: Java vs Kotlin",
            "Berita 3: Tips UX Mobile",
            "Berita 4: AI in Mobile App",
            "Berita 5: Open Source Trends"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, news);
        listView.setAdapter(adapter);
    }
}