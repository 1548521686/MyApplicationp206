package com.example.myapplicationp206;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    EditText account;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        account = findViewById(R.id.account);
        password = findViewById(R.id.password);

        Button login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //得到账号和密码的值
                String account_str=account.getText().toString();
                String password_str=password.getText().toString();
                if(account_str.equals("admin") && password_str.equals("123456")){
                    //进入业务界面
                    Intent intent=new Intent(
                            LoginActivity.this,
                            MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(
                            LoginActivity.this,
                            "密码不对",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });
    }
}
