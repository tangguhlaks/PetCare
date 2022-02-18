package com.example.petcare.user;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.petcare.R;
import com.example.petcare.user.fragment.ArticleUserFragment;
import com.example.petcare.user.fragment.HistoryUserFragment;
import com.example.petcare.user.fragment.HomeUserFragment;
import com.example.petcare.user.fragment.UserUserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class UserActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        bottomNavigationView = findViewById(R.id.navigasiuser);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment f = null;
                switch (item.getItemId()){
                    case R.id.menu_user_home:
                        f = new HomeUserFragment();
                        break;
                    case R.id.menu_user_article:
                        f = new ArticleUserFragment();
                        break;
                    case R.id.menu_user_history:
                        f = new HistoryUserFragment();
                        break;
                    case R.id.menu_user_user:
                        f = new UserUserFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentuser,f).commit();
                return true;
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        bottomNavigationView.setSelectedItemId(R.id.menu_user_home);
        Fragment f = new HomeUserFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragmentuser,f).commit();
    }
}