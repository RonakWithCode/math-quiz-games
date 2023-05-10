package com.crazyostudio.mathquizgames.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.crazyostudio.mathquizgames.R;
import com.crazyostudio.mathquizgames.databinding.FragmentHomeBinding;


public class  HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding
                .inflate(inflater, container, false);

//        NavController navController = new NavController(getContext());
        binding.offline.setOnClickListener(view -> Navigation.findNavController(binding.getRoot()).navigate(R.id.action_homeFragment_to_offline_modeFragment));
        binding.online.setOnClickListener(view -> Navigation.findNavController(binding.getRoot()).navigate(R.id.action_homeFragment_to_olineModeFragment));
        return binding.getRoot();
    }
}