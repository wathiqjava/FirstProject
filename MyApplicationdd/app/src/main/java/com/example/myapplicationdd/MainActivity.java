package com.example.myapplicationdd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edittext1,edittext2;
    private Button buttonSum ;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext1=(EditText) findViewById(R.id.editText3);
        edittext2=(EditText) findViewById(R.id.editText4);
        buttonSum=(Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView2);


              buttonSum.setOnClickListener(new View.OnClickListener(){
                  @Override
                          public void onClick(View view) {
                      String value1 = edittext1.getText().toString();
                      String value2 = edittext2.getText().toString();
                      int a = Integer.parseInt(value1);
                      int b = Integer.parseInt(value2);
                      int sum = a + b;
                      textView.setText(String.valueOf(sum));
                      Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();

                  }
        });
    }
}