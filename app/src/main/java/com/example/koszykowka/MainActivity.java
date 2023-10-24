package com.example.koszykowka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.koszykowka.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private int pkt;
    private PunktyViewModel punktyViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        punktyViewModel= new ViewModelProvider(this).get(PunktyViewModel.class);
        binding.textView.setText(String.valueOf(punktyViewModel.getPkt()));
        binding.button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        zmienpunkty(1);
                    }
                }
        );
        binding.button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        zmienpunkty(2);
                    }
                }
        );
        binding.button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        zmienpunkty(3);
                    }
                }
        );
    }
    private void zmienpunkty(int i){
        punktyViewModel.dodajPkt(i);
        binding.textView.setText(String.valueOf(punktyViewModel.getPkt()));
    }
}