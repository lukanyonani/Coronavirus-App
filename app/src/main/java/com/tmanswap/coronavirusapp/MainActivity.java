package com.tmanswap.coronavirusapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_spread, R.id.nav_protect,
                R.id.nav_symptoms, R.id.nav_myth )
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.action_settings:

                // Do Activity menu item stuff here
                return true;

            case R.id.action_buyCoffee:
                Intent coffee = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.buymeacoffee.com/lukanyonani"));
                startActivity(coffee);

                // Not implemented here
                return true;

            case R.id.action_twitter:
                Intent tweet = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.twitter.com/lukanyonani"));
                startActivity(tweet);

                return true;

            case R.id.action_youtube:
                Intent yt = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/channel/UCJkloOF_W0g3NWhpgL5muEg"));
                startActivity(yt);

                // Not implemented here
                return true;

            case R.id.action_facebook:
                Intent book = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/tmanswap"));
                startActivity(book);

                // Not implemented here
                return true;
            default:
                break;
        }

        return false;
    }



    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
