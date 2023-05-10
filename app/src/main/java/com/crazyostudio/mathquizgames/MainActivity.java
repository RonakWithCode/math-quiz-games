package com.crazyostudio.mathquizgames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;

import android.annotation.SuppressLint;
import android.os.Binder;
import android.os.Bundle;

import com.crazyostudio.mathquizgames.Fragment.HomeFragment;
import com.crazyostudio.mathquizgames.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("StaticFieldLeak")
    public static ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction()
//                .replace(binding.getRoot().getId(), HomeFragment.class, null)
//                .setReorderingAllowed(true)
//                .addToBackStack("home") // Name can be null
//                .commit();

    }
}