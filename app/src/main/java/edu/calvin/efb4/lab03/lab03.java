package edu.calvin.efb4.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class lab03 extends AppCompatActivity {

    private  EditText enterPassword;
    private ImageView trump;
    private TextView invalidpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab03);

        enterPassword = (EditText) findViewById(R.id.enterPassword);
        trump = (ImageView) findViewById(R.id.trump);
        invalidpassword = (TextView) findViewById(R.id.invalidpassword);

        trump.setVisibility(View.INVISIBLE);
        invalidpassword.setVisibility(View.INVISIBLE);

        enterPassword.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

                String passCode = enterPassword.getText().toString();
                if (passCode.equals("franksowah")){
                    trump.setVisibility(View.VISIBLE);
                    return true;
                }
                else{
                    trump.setVisibility(View.GONE);
                    invalidpassword.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });


    }
}
