package com.example.customspinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.customspinneractivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    String[]  City = {"india","USA","UK","germany"};
    int[] flag = {R.drawable.india,R.drawable.usa,R.drawable.uk,R.drawable.germany};

    ActivityMainBinding  binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initView();

    }

    private void initView() {

        MyCustomAdapter adapter = new MyCustomAdapter(City,flag,MainActivity.this);
        binding.mainSpinner.setAdapter(adapter);





    }
}