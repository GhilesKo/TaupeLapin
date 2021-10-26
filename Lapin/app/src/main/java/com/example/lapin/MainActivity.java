package com.example.lapin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lapin.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        List<Button> bouttons = new ArrayList<>();
        bouttons.add(binding.btn1);
        bouttons.add(binding.btn2);
        bouttons.add(binding.btn3);
        bouttons.add(binding.btn4);
        bouttons.add(binding.btn5);
        bouttons.add(binding.btn6);
        bouttons.add(binding.btn7);
        bouttons.add(binding.btn8);
        bouttons.add(binding.btn9);

        Random random = new Random();
        int NombreHasard = random.nextInt(9);
        bouttons.get(NombreHasard).setText("Lapin");    






    }
}