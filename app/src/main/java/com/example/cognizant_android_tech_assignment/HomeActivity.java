package com.example.cognizant_android_tech_assignment;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {
    ListView pl_teamListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        pl_teamListView = findViewById(R.id.pl_team_list);

        String[] pl_teamList = {
                "Arsenal", "Aston Villa", "Brighton", "Burnley", "Chelsea",
                "Crystal Palace", "Everton", "Fulham", "Leeds United", "Leicester City",
                "Liverpool", "Manchester City", "Manchester United", "Newcastle United",
                "Sheffield United", "Southampton", "Tottenham", "West Brom", "West Ham",
                "Wolves"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pl_teamList);
        pl_teamListView.setAdapter(adapter);
    }
}