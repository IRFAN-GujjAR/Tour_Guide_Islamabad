package com.example.irfan.tourguide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_drawer_layout);

        Toolbar toolbar=findViewById(R.id.toolbar_view);
        setSupportActionBar(toolbar);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);

        mDrawerLayout=findViewById(R.id.drawer_layout);

        NavigationView navigationView=findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.About_City_item_view:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content_container,new AboutCityFragment()).commit();
                        break;
                    case R.id.General_Places_item_view:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content_container,new GeneralPlacesFragment()).commit();
                        break;
                    case R.id.Historical_Places_item_View:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content_container,new HistoricalPlacesFragment()).commit();
                        break;
                    case R.id.Hotels_item_view:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content_container,new HotelsFragment()).commit();
                        break;
                    case R.id.Main_Markets_item_view:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content_container,new MainMarketsFragment()).commit();
                        break;
                    case R.id.Museums_And_Art_Galleries_item_view:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content_container,new MuseumsAndArtsGalleriesFragment()).commit();
                        break;
                    case R.id.Parks_item_view:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content_container,new ParksFragment()).commit();
                        break;
                    case R.id.Restaurants_item_view:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content_container,new RestaurantsFragment()).commit();
                        break;
                }

                mDrawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });

        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_content_container,new AboutCityFragment()).commit();
            navigationView.setCheckedItem(R.id.About_City_item_view);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}
