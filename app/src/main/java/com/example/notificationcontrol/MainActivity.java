package com.example.notificationcontrol;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    SettingsFragment settingsFragment = new SettingsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,homeFragment).commit();
                        return true;
                    case R.id.settings:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,settingsFragment).commit();
                        return true;

                }
                return false;
            }
        });
    }

//        home section work
    public void openAllApps(View view){
        Toast.makeText(this, "All Apps", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, AllApps.class);
        startActivity(intent);
    }
    public void openSocialMedia(View view) {
        Toast.makeText(this, "Social Media", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, SocialMedia.class);
        startActivity(intent);

    }
    public void openSystemApps(View view) {
        Toast.makeText(this, "System Apps", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, SystemApps.class);
        startActivity(intent);
    }
    public void openGoogleApps(View view) {
        Toast.makeText(this, "Google Apps", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, GoogleApps.class);
        startActivity(intent);
    }
    public void openPaymentsApps(View view) {
        Toast.makeText(this, "Payment Apps", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, PaymentsApps.class);
        startActivity(intent);
    }
    public void openFinanceApps(View view) {
        Toast.makeText(this, "Finance Apps", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, FinanceApps.class);
        startActivity(intent);
    }
    public void openOttPlatformApps(View view) {
        Toast.makeText(this, "Ott Platform Apps", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, OttPlatformApps.class);
        startActivity(intent);
    }
    public void openGamesApps(View view) {
        Toast.makeText(this, "Games Apps", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, GamesApps.class);
        startActivity(intent);
    }
    public void openShopping(View view) {
        Toast.makeText(this, "Shopping", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Shopping.class);
        startActivity(intent);
    }

//    setting work
    public void openContactUs(View view){
        Toast.makeText(this, "Contact Us", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ContactUs.class);
        startActivity(intent);
    }
    public void openTermsCondition(View view){
        Toast.makeText(this, "Terms & Condition", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, TermsCondition.class);
        startActivity(intent);
    }
    public void openPrivacyPolicy(View view){
        Toast.makeText(this, "Privacy Policy", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, PrivacyPolicy.class);
        startActivity(intent);
    }

}