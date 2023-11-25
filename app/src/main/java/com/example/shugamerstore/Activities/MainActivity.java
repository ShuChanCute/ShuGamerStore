package com.example.shugamerstore.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;

import com.example.shugamerstore.Domain.SliderItems;
import com.example.shugamerstore.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private Handler slideHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        banner();
    }

    private void banner() {
       List<SliderItems> sliderItems=new ArrayList<>();
       sliderItems.addAll(new SliderItems(R.drawable.);
    }

    private void initView() {
       viewPager2=findViewById(R.id.viewpageSlider);
    }
}