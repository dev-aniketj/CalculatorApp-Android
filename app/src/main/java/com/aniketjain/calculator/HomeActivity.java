package com.aniketjain.calculator;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.aniketjain.calculator.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;
    private String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        onClickListeners();

    }

    private void onClickListeners() {
        binding.btn0.setOnClickListener(view -> setInputData("0"));
        binding.btn1.setOnClickListener(view -> setInputData("1"));
        binding.btn2.setOnClickListener(view -> setInputData("2"));
        binding.btn3.setOnClickListener(view -> setInputData("3"));
        binding.btn4.setOnClickListener(view -> setInputData("4"));
        binding.btn5.setOnClickListener(view -> setInputData("5"));
        binding.btn6.setOnClickListener(view -> setInputData("6"));

    }

    private void setInputData(String data) {
        this.data = binding.inputText.getText().toString();
        binding.inputText.setText(this.data + data);
    }
}