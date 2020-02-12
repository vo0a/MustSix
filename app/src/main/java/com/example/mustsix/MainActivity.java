package com.example.mustsix;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.mustsix.navigation.DogsFragment;
import com.example.mustsix.navigation.DetailViewFragment;
import com.example.mustsix.navigation.DailyFragment;
import com.example.mustsix.navigation.CardFragment;
import com.example.mustsix.navigation.LiveFeedFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.action_livefeed:
                LiveFeedFragment liveFeedFragment = new LiveFeedFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.main_content, liveFeedFragment).commit();
                return true;
            case R.id.action_daily:
                DailyFragment dailyFragment = new DailyFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.main_content, dailyFragment).commit();
                return true;
            case R.id.action_home:
                DetailViewFragment detailViewFragment = new DetailViewFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.main_content, detailViewFragment).commit();
                return true;
            case R.id.action_dogs:
                DogsFragment dogsFragment = new DogsFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.main_content, dogsFragment).commit();
                return true;
            case R.id.action_card:
                CardFragment cardFragment = new CardFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.main_content, cardFragment).commit();
                return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(this);
    }

}
