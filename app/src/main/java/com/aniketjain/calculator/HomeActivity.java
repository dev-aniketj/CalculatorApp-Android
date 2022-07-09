package com.aniketjain.calculator;

import android.annotation.SuppressLint;
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
        binding.btn7.setOnClickListener(view -> setInputData("7"));
        binding.btn8.setOnClickListener(view -> setInputData("8"));
        binding.btn9.setOnClickListener(view -> setInputData("9"));

        binding.btnAc.setOnClickListener(view -> {
            binding.inputText.setText("");
            binding.outputText.setText("");
        });
        binding.btnPlusMinus.setOnClickListener(view -> {
        });
        binding.btnPerc.setOnClickListener(view ->  setInputData("/100"));
        binding.btnDiv.setOnClickListener(view ->  setInputData("/"));
        binding.btnMul.setOnClickListener(view ->  setInputData("*"));
        binding.btnMinus.setOnClickListener(view -> setInputData("-"));
        binding.btnPlus.setOnClickListener(view -> setInputData("+"));
        binding.btnEqual.setOnClickListener(view -> {
        });

        binding.btnDot.setOnClickListener(view -> setInputData("."));

    }

    @SuppressLint("SetTextI18n")
    private void setInputData(String data) {
        this.data = binding.inputText.getText().toString();
        binding.inputText.setText(this.data + data);
    }
}