package com.crazyostudio.mathquizgames.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crazyostudio.mathquizgames.MainActivity;
import com.crazyostudio.mathquizgames.R;
import com.crazyostudio.mathquizgames.databinding.FragmentGameResultBinding;

public class GameResultFragment extends Fragment {
    FragmentGameResultBinding binding;
    String round,wrong,Result;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            round = getArguments().getString("round");
            wrong = getArguments().getString("wrong");
            Result = getArguments().getString("Result");
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGameResultBinding.inflate(inflater,container,false);
        int T = Integer.parseInt(round) - Integer.parseInt(wrong);
        binding.Point.setText(T+"");
        binding.Wrong.setText(wrong+"");
        binding.Result.setText(Result);
        binding.button.setOnClickListener(view->
                Navigation.findNavController(MainActivity.binding.fragmentContainerViewHome).navigate(R.id.action_gameResultFragment_to_homeFragment));
        return binding.getRoot();

    }
}