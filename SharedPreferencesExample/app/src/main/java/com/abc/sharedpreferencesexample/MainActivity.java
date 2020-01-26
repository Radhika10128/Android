package com.abc.sharedpreferencesexample;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public SharedPreferenceConfig preferenceConfig;
    private EditText UserName,UserPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferenceConfig=new SharedPreferenceConfig(getApplicationContext());
        UserName=findViewById(R.id.user_name);
        UserPassword=findViewById(R.id.user_password);
        if(preferenceConfig.readLoginStatus())
        {
            startActivity(new Intent(this,MainActivity.class);
            finish();
        }
    }

    @Override

    public void LoginUser(View view) {
        String username=UserName.getText().toString();
        String userpassword=UserPassword.getText().toString();
        if( UserPassword.equals(getResources().getString(R.string.user_password)))
        {
            startActivity(new Intent(this,SuccessActivity.class);
            preferenceConfig.writeLogStatus(true);
            finish();
        }
        else
        {
            Toast.makeText(this,"Login failed",Toast.LENGTH_SHORT).show();
            UserPassword.setText(" ");
        }
    }
}
