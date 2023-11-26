package com.example.cgpacalc;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,num10;
    Button cal1;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.g1);
        num2 = findViewById(R.id.n1);
        num3 = findViewById(R.id.g2);
        num4 = findViewById(R.id.n2);
        num5 = findViewById(R.id.g3);
        num6 = findViewById(R.id.n3);
        num7 = findViewById(R.id.g4);
        num8 = findViewById(R.id.n4);
        num9 = findViewById(R.id.g5);
        num0 = findViewById(R.id.n5);
        num10 = findViewById(R.id.precgpa);


        cal1 = findViewById(R.id.buttoncgpa);
        ans = findViewById(R.id.ans);

        final float[] q = new float[1];
        final float[] p = new float[1];

        cal1.setOnClickListener(view -> {
            int a = 0, b, c = 0, d, e = 0, f, g = 0, h, i = 0, j;
            float s;
            float finalans;
            String a1, c1, e1, g1, i1;
            a1 = num1.getText().toString();
            if (a1.equals("O") || a1.equals("o")) {
                a = 10;
            }
            if (a1.equals("A+") || a1.equals("a+")) {
                a = 9;
            }
            if (a1.equals("A") || a1.equals("a")) {
                a = 8;
            }
            if (a1.equals("B+") || a1.equals("b+")) {
                a = 7;
            }
            if (a1.equals("B") || a1.equals("b")) {
                a = 6;
            }
            if (a1.equals("C") || a1.equals("c")) {
                a = 5;
            }
            b = Integer.parseInt(num2.getText().toString());
            c1 = num1.getText().toString();
            if (c1.equals("O") || c1.equals("o")) {
                c = 10;
            }
            if (c1.equals("A+") || c1.equals("a+")) {
                c = 9;
            }
            if (c1.equals("A") || c1.equals("a")) {
                c = 8;
            }
            if (c1.equals("B+") || c1.equals("b+")) {
                c = 7;
            }
            if (c1.equals("B") || c1.equals("b")) {
                c = 6;
            }
            if (c1.equals("C") || c1.equals("c")) {
                c = 5;
            }
            //final = Integer.parseInt(num10.getText().toString());
            d = Integer.parseInt(num4.getText().toString());
            e1 = num1.getText().toString();
            if (e1.equals("O") || e1.equals("o")) {
                e = 10;
            }
            if (e1.equals("A+") || e1.equals("a+")) {
                e = 9;
            }
            if (e1.equals("A") || e1.equals("a")) {
                e = 8;
            }
            if (e1.equals("B+") || e1.equals("b+")) {
                e = 7;
            }
            if (e1.equals("B") || e1.equals("b")) {
                e = 6;
            }
            if (e1.equals("C") || e1.equals("c")) {
                e = 5;
            }
            f = Integer.parseInt(num6.getText().toString());
            g1 = num1.getText().toString();
            if (g1.equals("O") || g1.equals("o")) {
                g = 10;
            }
            if (g1.equals("A+") || g1.equals("a+")) {
                g = 9;
            }
            if (g1.equals("A") || g1.equals("a")) {
                g = 8;
            }
            if (g1.equals("B+") || g1.equals("b+")) {
                g = 7;
            }
            if (g1.equals("B") || g1.equals("b")) {
                g = 6;
            }
            if (g1.equals("C") || g1.equals("c")) {
                g = 5;
            }
            h = Integer.parseInt(num8.getText().toString());
            i1 = num1.getText().toString();
            if (i1.equals("O") || i1.equals("o")) {
                i = 10;
            }
            if (i1.equals("A+") || i1.equals("a+")) {
                i = 9;
            }
            if (i1.equals("A") || i1.equals("a")) {
                i = 8;
            }
            if (i1.equals("B+") || i1.equals("b+")) {
                i = 7;
            }
            if (i1.equals("B") || i1.equals("b")) {
                i = 6;
            }
            if (i1.equals("C") || i1.equals("c")) {
                i = 5;
            }
            j = Integer.parseInt(num0.getText().toString());
            s = ((float) (a * b) + (c * d) + (e * f) + (g * h) + (i * j));
            float r = (float) (b + d + f + h + j);
            q[0] = s / r;
            finalans = Integer.parseInt(num10.getText().toString());
            if(finalans!=0)
            {
                p[0]=(q[0]+finalans)/2;
                ans.setText(String.valueOf(p[0]));
            }
            else{
                ans.setText(String.valueOf(q[0]));}
        });
    }
}

