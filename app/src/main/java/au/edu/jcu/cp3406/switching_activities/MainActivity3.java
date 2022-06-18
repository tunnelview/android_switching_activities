package au.edu.jcu.cp3406.switching_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView last_view;
    Button go_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        last_view = (TextView) findViewById(R.id.last_view);

        go_back = (Button) findViewById(R.id.go_back);
        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_back = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(go_back);
            }
        });

    }
}