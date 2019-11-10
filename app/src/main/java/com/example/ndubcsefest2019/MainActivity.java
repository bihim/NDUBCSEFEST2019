package com.example.ndubcsefest2019;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.fxn.BubbleTabBar;
import com.fxn.OnBubbleClickListener;
import com.gauravk.bubblenavigation.BubbleNavigationLinearView;
import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener;
import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final BubbleNavigationLinearView bubbleNavigationLinearView = findViewById(R.id.bottom_navigation_view_linear);

        if (savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CalendarFragment()).commit();
        }

       bubbleNavigationLinearView.setNavigationChangeListener(new BubbleNavigationChangeListener() {
           @Override
           public void onNavigationChanged(View view, int position) {

               Fragment selectFragment;
               selectFragment = null;

               Log.d("Clicked", "onNavigationChanged: "+position);

               switch (position)
               {
                   case 0:
                       selectFragment = new CalendarFragment();
                       break;

                   case 1:
                       selectFragment = new EventsFragment();
                       break;

                   case 2:
                       selectFragment = new DeveloperFragment();
                       break;
               }
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectFragment).commit();

           }
       });

    }
}
