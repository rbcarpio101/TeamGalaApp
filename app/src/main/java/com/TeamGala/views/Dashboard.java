package com.TeamGala.views;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


//        dl = (DrawerLayout)findViewById(R.id.activity_main);
//        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);
//
//        dl.addDrawerListener(t);
//        t.syncState();
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        nv = (NavigationView)findViewById(R.id.nv);
//        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                int id = item.getItemId();
//                switch(id)
//                {
//                    case R.id.account:
//                        Toast.makeText(MainActivity.this, "My Account",Toast.LENGTH_SHORT).show();break;
//                    case R.id.settings:
//                        Toast.makeText(MainActivity.this, "Settings",Toast.LENGTH_SHORT).show();break;
//                    case R.id.mycart:
//                        Toast.makeText(MainActivity.this, "My Cart",Toast.LENGTH_SHORT).show();break;
//                    default:
//                        return true;
//                }
//
//
//                return true;
//
//            }
//        });


    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        if(t.onOptionsItemSelected(item))
//            return true;
//
//        return super.onOptionsItemSelected(item);
//    }
//    private DrawerLayout dl;
//    private ActionBarDrawerToggle t;
//    private NavigationView nv;
}
