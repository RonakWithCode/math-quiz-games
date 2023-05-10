package com.crazyostudio.mathquizgames.Fragment;

import static com.crazyostudio.mathquizgames.R.drawable.starpoint;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.crazyostudio.mathquizgames.MainActivity;
import com.crazyostudio.mathquizgames.R;
import com.crazyostudio.mathquizgames.databinding.FragmentGameControllerBinding;

import java.util.Random;


public class GameControllerFragment extends Fragment {
    int MainANS,TotalPoint = 3,TotalRounds = 0,wrongPoint;
    String operations;
    FragmentGameControllerBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            operations = getArguments().getString("operations");
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGameControllerBinding.inflate(inflater,container,false);

        binding.ans1.setOnClickListener(view->{
            if (binding.ans1.getText().toString().equals(""+MainANS)) {
//                next ques
                fun();
            }
            else {
                switch (TotalPoint){
                    case 3:
                        wrongPoint = 1;
                        TotalPoint = 2;
                        binding.point3.setImageResource(starpoint);
                        fun();
                        break;
                    case 2:
                        wrongPoint = 2;
                        TotalPoint = 1;
                        binding.point2.setImageResource(starpoint);
                        fun();
                        break;
                    case 1:
                        TotalPoint=0;
                        wrongPoint = 3;
                        binding.point1.setImageResource(starpoint);
                        fun();
                        break;
                    case 0:
                        wrongPoint = 4;
                        Bundle args = new Bundle();
                        args.putString("round", TotalRounds+"");
                        args.putString("Result","fail");
                        args.putString("wrong", wrongPoint+"");

//            ldf.setArguments(args);

                        Navigation.findNavController(MainActivity.binding.fragmentContainerViewHome).navigate(R.id.action_gameControllerFragment_to_gameResultFragment,args);

//                        fun();
                        break;
                }
            }
        });
        binding.ans2.setOnClickListener(view->{
            if (binding.ans2.getText().toString().equals(""+MainANS)) {
//                next ques
                fun();
            }
            else {
                switch (TotalPoint){
                    case 3:
                        TotalPoint = 2;
                        binding.point3.setImageResource(starpoint);
                        fun();

                        break;
                    case 2:
                        TotalPoint = 1;
                        binding.point2.setImageResource(starpoint);
                        fun();

                        break;
                    case 1:
                        TotalPoint= 0;
                        binding.point1.setImageResource(starpoint);
                        fun();

                        break;
                    case 0:
                        Toast.makeText(getContext(), "Out", Toast.LENGTH_SHORT).show();
                        fun();
                        break;
                }
            }
        });

        fun();
        return binding.getRoot();
    }
    @SuppressLint("SetTextI18n")
    void fun(){
        if (!(TotalRounds == 10)) {
            switch (operations) {
                case "add": {
                    TotalRounds++;
                    binding.points.setText(TotalRounds + "/10");
                    Random rand = new Random();
                    int num1 = rand.nextInt(99);
                    int num2 = rand.nextInt(99);
                    int mainAns = num1 + num2;
                    MainANS = mainAns;
                    binding.Ques.setText(num1 + " + " + num2 + " = ? ");
                    int ANum1 = rand.nextInt(10);
                    int FakeANS = mainAns - ANum1;
                    if (FakeANS == ANum1) {
                        FakeANS = -5;
                    }
                    int CNum2 = rand.nextInt(2);
                    if (CNum2 == 0) {
                        binding.ans1.setText("" + mainAns);
                        binding.ans2.setText("" + FakeANS);
                    } else {
                        binding.ans1.setText("" + FakeANS);
                        binding.ans2.setText("" + mainAns);
                    }


                    break;
                }
                case "subtract": {
                    TotalRounds++;
                    binding.points.setText(TotalRounds + "/10");
                    Random rand = new Random();
                    int num1 = rand.nextInt(99);
                    int num2 = rand.nextInt(99);
                    int mainAns = num1 - num2;
                    MainANS = mainAns;
                    binding.Ques.setText(num1 + " - " + num2 + " = ? ");
                    int ANum1 = rand.nextInt(10);
                    int FakeANS = mainAns - ANum1;
                    if (FakeANS == ANum1) {
                        FakeANS = +5;
                    }
                    int CNum2 = rand.nextInt(2);
                    if (CNum2 == 0) {
                        binding.ans1.setText("" + mainAns);
                        binding.ans2.setText("" + FakeANS);
                    } else {
                        binding.ans1.setText("" + FakeANS);
                        binding.ans2.setText("" + mainAns);
                    }


                    break;
                }
                case "divide": {
                    TotalRounds++;
                    binding.points.setText(TotalRounds + "/10");
                    Random rand = new Random();
                    int num1 = rand.nextInt(99);
                    int num2 = rand.nextInt(99);
                    int mainAns = num1 / num2;
                    MainANS = mainAns;
                    binding.Ques.setText(num1 + "/" + num2 + " = ? ");
                    int ANum1 = rand.nextInt(10);
                    int FakeANS = mainAns - ANum1;
                    if (FakeANS == ANum1) {
                        FakeANS = +7;
                    }
                    int CNum2 = rand.nextInt(2);
                    if (CNum2 == 0) {
                        binding.ans1.setText("" + mainAns);
                        binding.ans2.setText("" + FakeANS);
                    } else {
                        binding.ans1.setText("" + FakeANS);
                        binding.ans2.setText("" + mainAns);
                    }


                    break;
                }
                case "multiply": {
                    TotalRounds++;
                    binding.points.setText(TotalRounds + "/10");
                    Random rand = new Random();
                    int num1 = rand.nextInt(99);
                    int num2 = rand.nextInt(99);
                    int mainAns = num1 * num2;
                    MainANS = mainAns;
                    binding.Ques.setText(num1 + "*" + num2 + " = ? ");
                    int ANum1 = rand.nextInt(10);
                    int FakeANS = mainAns - ANum1;
                    if (FakeANS == ANum1) {
                        FakeANS = +7;
                    }
                    int CNum2 = rand.nextInt(2);
                    if (CNum2 == 0) {
                        binding.ans1.setText("" + mainAns);
                        binding.ans2.setText("" + FakeANS);
                    } else {
                        binding.ans1.setText("" + FakeANS);
                        binding.ans2.setText("" + mainAns);
                    }
                    break;
                }

            }


        }else {
            Bundle args = new Bundle();
            args.putString("round", TotalRounds+"");
            args.putString("wrong", wrongPoint+"");
            args.putString("Result","pass");

//            ldf.setArguments(args);

            Navigation.findNavController(MainActivity.binding.fragmentContainerViewHome).navigate(R.id.action_gameControllerFragment_to_gameResultFragment,args);

        }

    }
}