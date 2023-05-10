package com.crazyostudio.mathquizgames.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crazyostudio.mathquizgames.R;
import com.crazyostudio.mathquizgames.databinding.FragmentOlineModeBinding;

public class OlineModeFragment extends Fragment {
    FragmentOlineModeBinding binding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOlineModeBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}