package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button disButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        disButton = findViewById(R.id.clickButton);
        disButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //Toast toast = Toast.makeText(getApplicationContext() , "You have clicked the button", Toast.LENGTH_LONG);
                //toast.show();
                TextView greetingText = (TextView)findViewById(R.id.greetingText);
                greetingText.setText("You have clicked the button"); //
            }
        });
    }


}
