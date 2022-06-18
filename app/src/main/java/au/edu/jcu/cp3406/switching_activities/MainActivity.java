package au.edu.jcu.cp3406.switching_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText name, email, mobile_number;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        mobile_number = (EditText) findViewById(R.id.mobile_number);

        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_to = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(go_to);
            }
        });

    }
}