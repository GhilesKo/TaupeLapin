package com.example.lapin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lapin.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    List<Button> bouttons = new ArrayList<>();
    int positionLapin;
    int pafs =0;
    int flops = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        bouttons.add(binding.btn1);
        bouttons.add(binding.btn2);
        bouttons.add(binding.btn3);
        bouttons.add(binding.btn4);
        bouttons.add(binding.btn5);
        bouttons.add(binding.btn6);
        bouttons.add(binding.btn7);
        bouttons.add(binding.btn8);
        bouttons.add(binding.btn9);


        bougerLeLapin();

        for (Button boutton:bouttons
             ) {
           boutton.setOnClickListener(view -> {

                reagirClick(view);

            });

        }







    }
    private void bougerLeLapin() {

        Random random = new Random();
        positionLapin = random.nextInt(9);
        bouttons.get(positionLapin).setText("Lapin");

    }

    private void reagirClick(View view) {

        Button buttonLapin = bouttons.get(positionLapin);

        if (view==buttonLapin)
        {
            pafs++;
            binding.pafs.setText(pafs + " pafs");
            bougerLeLapin();
        }
        else
            {
                flops++;
                binding.flops.setText(flops + " flops");


            }


    }


}