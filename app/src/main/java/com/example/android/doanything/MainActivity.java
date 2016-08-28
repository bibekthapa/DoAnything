package com.example.android.doanything;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggle_button_1,toggle_button_2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newOnClicListener();


    }
    public void newOnClicListener()
    {
        toggle_button_1=(ToggleButton)findViewById(R.id.toggle_btn_1);
        toggle_button_2=(ToggleButton)findViewById(R.id.toggle_btn_2);
        button=(Button)findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result= new StringBuffer();
                result.append("Toggle Button 1:").append(toggle_button_1.getText());
                result.append("\n Toggle Button 2: ").append(toggle_button_2.getText());
                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_SHORT).show();
            }
        });



    }

}
