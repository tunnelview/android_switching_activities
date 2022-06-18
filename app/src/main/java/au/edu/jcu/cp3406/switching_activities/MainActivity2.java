package au.edu.jcu.cp3406.switching_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView second_act_view;
    EditText product_one, product_two, product_three;
    Button submit_two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        second_act_view = (TextView) findViewById(R.id.second_act_view);

        product_one = (EditText) findViewById(R.id.product_one);
        product_two = (EditText) findViewById(R.id.product_two);
        product_three = (EditText) findViewById(R.id.product_three);

        submit_two = (Button) findViewById(R.id.submit_two);
        submit_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent move_to = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(move_to);
            }
        });

    }
}