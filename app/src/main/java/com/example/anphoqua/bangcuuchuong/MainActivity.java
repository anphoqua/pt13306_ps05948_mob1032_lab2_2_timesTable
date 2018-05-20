package com.example.anphoqua.bangcuuchuong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView_result;
    SeekBar seekBar;
    int min = 1, max = 50, current = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView_result = findViewById(R.id.textView_result);
        seekBar = findViewById(R.id.seekBar);

        seekBar.setMax(max-min);
        seekBar.setProgress(current-min);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                current = progress + min;
                textView_result.setText(cuuChuong(current));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public String cuuChuong (int number) {
        String result = "";
        for (int i = 1; i <= 9; i++) {
            result += number + " * " + i + " = " + number * i + "\n";
        }
        return result;
    }
}
