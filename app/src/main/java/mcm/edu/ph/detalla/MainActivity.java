package mcm.edu.ph.detalla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int input1, input2;
    EditText inp1, inp2;
    TextView res;
    Button multi, subtra, addi, div;

    double sol = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            inp1 = (EditText) findViewById(R.id.input1);
            inp2 = (EditText) findViewById(R.id.input2);
            res = (TextView) findViewById(R.id.results);
            multi = findViewById(R.id.mult);
            subtra = findViewById(R.id.subtr);
            addi = findViewById(R.id.add);
            div = findViewById(R.id.divi);


            addi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String box1 = inp1.getText().toString();
                String box2 = inp2.getText().toString();

                if (box1.isEmpty() || box2.isEmpty()) {
                    res.setText ("Hey man. Ya' gotta put somethin in the boxes before we can start.");
                }
                else {
                double a = Double.parseDouble(inp1.getText().toString());
                double b = Double.parseDouble(inp2.getText().toString());
                String solu = String.valueOf(sol);
                res.setText(solu);
                sol = a + b;
              }
            }
        });

        subtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String box1 = inp1.getText().toString();
                String box2 = inp2.getText().toString();

                if (box1.isEmpty() || box2.isEmpty()) {
                    res.setText ("Hey man. Ya' gotta put somethin in the boxes before we can start.");
                }
                else {
                    double a = Double.parseDouble(inp1.getText().toString());
                    double b = Double.parseDouble(inp2.getText().toString());
                    String solu = String.valueOf(sol);
                    res.setText(solu);
                    sol = a - b;
                }
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String box1 = inp1.getText().toString();
                String box2 = inp2.getText().toString();

                if (box1.isEmpty() || box2.isEmpty()) {
                    res.setText ("Hey man. Ya' gotta put somethin in the boxes before we can start.");
                }
                else {
                    double a = Double.parseDouble(inp1.getText().toString());
                    double b = Double.parseDouble(inp2.getText().toString());
                    String solu = String.valueOf(sol);
                    res.setText(solu);
                    sol = a * b;
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String box1 = inp1.getText().toString();
                String box2 = inp2.getText().toString();

                if (box1.isEmpty() || box2.isEmpty()) {
                    res.setText ("Hey man. Ya' gotta put somethin in the boxes before we can start.");
                }
                else {
                double a = Double.parseDouble(inp1.getText().toString());
                double b = Double.parseDouble(inp2.getText().toString());
                String solu = String.valueOf(sol);
                res.setText(solu);
                if (b != 0)
                    sol = a / b;
                else
                    res.setText("Are you trying to kill me? Put something else in there.");
            }
            }
        });
    }}
