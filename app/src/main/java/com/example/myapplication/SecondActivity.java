package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {
    private TextView viewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        // Initialize UI components
        viewResult = findViewById(R.id.viewResult);
        Button btnBackToMain = findViewById(R.id.btnBackToMain);
        Button btnClear = findViewById(R.id.btnClear);

        // Get bundle from intent
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            try {
                String strA = bundle.getString("a", "0").trim();
                String strB = bundle.getString("b", "0").trim();
                String strC = bundle.getString("c", "0").trim();

                if (!strA.isEmpty() && !strB.isEmpty() && !strC.isEmpty()) {
                    double a = Double.parseDouble(strA);
                    double b = Double.parseDouble(strB);
                    double c = Double.parseDouble(strC);
                    String result = solveQuadraticEquation(a, b, c);
                    viewResult.setText(result);
                } else {
                    viewResult.setText("Khong co ket qua dau vao");
                }
            } catch (NumberFormatException e) {
                viewResult.setText("Khong co ket qua dau vao");
            }
        }

        // Button: Clear Result
        btnClear.setOnClickListener(v -> viewResult.setText(""));

        // Button: Back to MainActivity
        btnBackToMain.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }

    // Method to solve quadratic equation
    private String solveQuadraticEquation(double a, double b, double c) {
        if(a==0 && b==0 && c==0)
        {
            return "Phuong trinh vo so nghiem";
        }
        if (a == 0) {
            return (b == 0) ? "Phuong trinh vo nghiem" : "x = " + (-c / b);
        }

        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "x1 = " + x1 + "\nx2 = " + x2;
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "x = " + x;
        } else {
            return "Phuong trinh vo nghiem";
        }
    }
}
