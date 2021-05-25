package com.example.lecture24_05_2021fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lecture24_05_2021fragments.ui.login.LoginFragment;

public class MainActivity extends AppCompatActivity {
    Button loginButton, registerButton;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton=findViewById(R.id.signinButton);
        registerButton=findViewById(R.id.registerButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction=getSupportFragmentManager().beginTransaction();
                LoginFragment loginFragment= new LoginFragment();
                fragmentTransaction.replace(R.id.fragmentLayout,loginFragment);
                fragmentTransaction.commit();
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                Register registerFragment = new Register();
                fragmentTransaction.replace(R.id.fragmentLayout, registerFragment);
                fragmentTransaction.commit();
            }

        });

    }
}