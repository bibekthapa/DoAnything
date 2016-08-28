package com.example.android.doanything;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton tglBtn1,tglBtn2;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();

    }

    public void addListenerOnButton()
    {
        tglBtn1=(ToggleButton)findViewById(R.id.togglebtn1);
        tglBtn2=(ToggleButton)findViewById(R.id.togglebtn2);
        btn1=(Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result=new StringBuffer(); //String Buffer is like a string but can be modified.The length and content can be modified using certain method calls
                result.append("toggleButton1:").append(tglBtn1.getText());// toggleButton1: status of the toggle button1(oN or OFF)
                result.append("\ntoggleButton1:").append(tglBtn2.getText());
                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_SHORT).show();
            }
        });



    }
}
