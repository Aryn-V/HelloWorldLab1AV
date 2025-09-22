package com.example.helloworldlab1av;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textChanging;
    Button btnColourChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        this.textChanging = findViewById(R.id.textChanging);
        btnColourChange = findViewById(R.id.btnColourChange);
        btnColourChange.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textChanging.setTextColor(Color.RED);
            }
        });
    }


    public void ChangeText1(View view) {
        textChanging.setText("The Hello World Text is Changed");
    }
}