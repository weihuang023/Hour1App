package com.example.huang.hour1app;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //TODO Create 3 EditText 3 TextView 2 Button
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText e = (EditText) findViewById(R.id.editText);
        final EditText e2 = (EditText) findViewById(R.id.editText2);
        final EditText e3 = (EditText) findViewById(R.id.editText3);
        final TextView t = (TextView) findViewById(R.id.textView);
        final TextView t2 = (TextView) findViewById(R.id.textView2);
        final TextView t3 = (TextView) findViewById(R.id.textView3);
        Button b = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        //TODO EditText to Change Title
        e.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (e.getText().length() >= 0) {
                    t.setText(e.getText().toString());
                }
            }
        });
        //TODO Click Button to EditText then Set TextView for Username and Password
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(e2.getText());
                t3.setText(e3.getText());
            }
        });
        //TODO Click Button2 to Reset EditText and Reset TextView for Username and Password
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                e.getText().clear();
                e2.getText().clear();
                e3.getText().clear();
                t2.setText(null);
                t3.setText(null);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
