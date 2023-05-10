package com.crazyostudio.mathquizgames.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crazyostudio.mathquizgames.MainActivity;
import com.crazyostudio.mathquizgames.R;
import com.crazyostudio.mathquizgames.databinding.FragmentOfflineModeBinding;

public class offline_modeFragment extends Fragment {
    FragmentOfflineModeBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentOfflineModeBinding.inflate(inflater,container,false);

        binding.AddBtu.setOnClickListener(view->{
            Bundle args = new Bundle();
            args.putString("operations", "add");
            Navigation.findNavController(MainActivity.binding.fragmentContainerViewHome).navigate(R.id.action_offline_modeFragment_to_gameControllerFragment,args);
        });
        binding.divideBtu.setOnClickListener(view->{
            Bundle args = new Bundle();
            args.putString("operations", "divide");
            Navigation.findNavController(MainActivity.binding.fragmentContainerViewHome).navigate(R.id.action_offline_modeFragment_to_gameControllerFragment,args);
        });
        binding.MultiplyBtu.setOnClickListener(view->{
            Bundle args = new Bundle();
            args.putString("operations", "multiply");
            Navigation.findNavController(MainActivity.binding.fragmentContainerViewHome).navigate(R.id.action_offline_modeFragment_to_gameControllerFragment,args);
        });
        binding.subtract.setOnClickListener(view->{
            Bundle args = new Bundle();
            args.putString("operations", "subtract");
            Navigation.findNavController(MainActivity.binding.fragmentContainerViewHome).navigate(R.id.action_offline_modeFragment_to_gameControllerFragment,args);
        });
        return binding.getRoot();

    }
}