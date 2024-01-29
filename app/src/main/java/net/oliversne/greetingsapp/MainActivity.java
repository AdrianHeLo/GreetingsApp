package net.oliversne.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    TextView messageIntro;
    Button btnMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.editText);
        messageIntro = findViewById(R.id.messageView);
        btnMessage = findViewById(R.id.buttonMessage);

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = userName.getText().toString();
                Toast.makeText(MainActivity.this, "Merry Christmas " + input + "!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}