package com.example.android_01_helloworld;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.android_01_helloworld.ui.main.SectionsPagerAdapter;

/**
 * This is my first class for mobile development in the 7-th semester.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /** Комментарии именно такого вида сохраняются
     * с помощью утилиты javadoc
     * The min function finds and returns
     * a minimal of two integers.
     * @param a is the first integer to compare
     * @param b is the second integer to compare
     * @return returns the minimum
     */
    public int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }

    /**
     * The max function finds and returns
     * the maximum of two integers inserted
     * @param a is the first integer to compare
     * @param b is the second integer to compare
     * @return this statement returns the maximum
     */
    public int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }
}