package com.crazyostudio.mathquizgames.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.crazyostudio.mathquizgames.databinding.ActivityUserMangerBinding;

public class UserMangerActivity extends AppCompatActivity {
    ActivityUserMangerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserMangerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}