package com.crazyostudio.mathquizgames.UserManger;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crazyostudio.mathquizgames.MainActivity;
import com.crazyostudio.mathquizgames.R;
import com.crazyostudio.mathquizgames.databinding.FragmentSignInBinding;


public class SignInFragment extends Fragment {
    FragmentSignInBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSignInBinding.inflate(inflater,container,false);
        binding.signUp.setOnClickListener(view->{
            Navigation.findNavController(MainActivity.binding.fragmentContainerViewHome).navigate(R.id.action_signInFragment_to_phoneSignFragment);
        });
        binding.signIn.setOnClickListener(view->{
            Navigation.findNavController(MainActivity.binding.fragmentContainerViewHome).navigate(R.id.action_signInFragment_to_phoneSignFragment);
        });
        return binding.getRoot();

    }
}