package com.example.android.doanything;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggle_Button_1,toggle_Button_2;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClicListener();



    }

    public void onClicListener()
    {
        toggle_Button_1=(ToggleButton)findViewById(R.id.toggle_button_1);
        toggle_Button_2=(ToggleButton)findViewById(R.id.toggle_button_2);
        button1=(Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer result= new StringBuffer();
                result.append("Toggle Button1:").append(toggle_Button_1.getText());
                result.append(" \n Toggle Button 2:").append(toggle_Button_2.getText());
                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_SHORT).show();



            }
        });


    }


}
