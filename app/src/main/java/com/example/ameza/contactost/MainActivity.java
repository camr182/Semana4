package com.example.ameza.contactost;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.ameza.contactost.adapters.PageAdapterHome;
import com.example.ameza.contactost.fragments.DetalleDogFragment;
import com.example.ameza.contactost.fragments.HomeFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();

        if (toolbar!=null){
           setSupportActionBar(toolbar);
        }

    }

    private ArrayList<android.support.v4.app.Fragment> agregarFragments (){

        ArrayList<android.support.v4.app.Fragment> fragments = new ArrayList<>();

        fragments.add(new HomeFragment());
        fragments.add(new DetalleDogFragment());
        return fragments;

    }

    private void setUpViewPager(){

        viewPager.setAdapter(new PageAdapterHome(getSupportFragmentManager(),agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_dog);

    }


    public void irSegundaActividad(View v){

        Intent i = new Intent(this,Favoritos.class);
        startActivity(i);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.mContacto:

                Intent i = new Intent(this,ContactoActivity.class);
                startActivity(i);

                break;

            case R.id.mAceraD:

                Intent i2 = new Intent(this,AcercadActivity.class);
                startActivity(i2);

                break;

        }

        return super.onOptionsItemSelected(item);

    }
}
