package com.example.root.codev01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.R.attr.data;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EasyLogin.initialize();
        EasyLogin easyLogin = EasyLogin.getInstance();

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            easyLogin.onActivityResult(requestCode, resultCode, data);
        }

    }
}
