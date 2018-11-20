package com.example.chaitanyadeshpande.vachan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.ll_login_details_container)
    LinearLayout llLoginDetailsContainer;
    @BindView(R.id.btn_login)
    Button btnLogin;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btn_login)
    public void onViewClicked() {

        if (etUsername.getText().toString().equalsIgnoreCase("Gauri Dev")
                && etPassword.getText().toString().equalsIgnoreCase("gd@1234")) {
            UserNameUtility.getInstance().setUserName("Gauri Dev");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Ashwini Chavan")
                && etPassword.getText().toString().equalsIgnoreCase("ac@1234")) {
            UserNameUtility.getInstance().setUserName("Ashwini Chavan");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Jayashri Mandke")
                && etPassword.getText().toString().equalsIgnoreCase("jm@1234")) {
            UserNameUtility.getInstance().setUserName("Jayashri Mandke");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Revati Warle")
                && etPassword.getText().toString().equalsIgnoreCase("rw@1234")) {
            UserNameUtility.getInstance().setUserName("Revati Warle");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Vaishali Athalye")
                && etPassword.getText().toString().equalsIgnoreCase("va@1234")) {
            UserNameUtility.getInstance().setUserName("Vaishali Athalye");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Pradnya Wagh")
                && etPassword.getText().toString().equalsIgnoreCase("pw@1234")) {
            UserNameUtility.getInstance().setUserName("Pradnya Wagh");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Tanvi Divekar")
                && etPassword.getText().toString().equalsIgnoreCase("td@1234")) {
            UserNameUtility.getInstance().setUserName("Tanvi Divekar");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Madhuri Baviskar")
                && etPassword.getText().toString().equalsIgnoreCase("mb@1234")) {
            UserNameUtility.getInstance().setUserName("Madhuri Baviskar");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Swati Fadke")
                && etPassword.getText().toString().equalsIgnoreCase("sf@1234")) {
            UserNameUtility.getInstance().setUserName("Swati Fadke");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Aishwarya Gadgil")
                && etPassword.getText().toString().equalsIgnoreCase("ag@1234")) {
            UserNameUtility.getInstance().setUserName("Aishwarya Gadgil");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Gauri Patki")
                && etPassword.getText().toString().equalsIgnoreCase("gp@1234")) {
            UserNameUtility.getInstance().setUserName("Gauri Patki");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Bhavana Thorat")
                && etPassword.getText().toString().equalsIgnoreCase("bt@1234")) {
            UserNameUtility.getInstance().setUserName("Bhavana Thorat");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Manasi Apte")
                && etPassword.getText().toString().equalsIgnoreCase("ma@1234")) {
            UserNameUtility.getInstance().setUserName("Manasi Apte");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Archana Thakur")
                && etPassword.getText().toString().equalsIgnoreCase("at@1234")) {
            UserNameUtility.getInstance().setUserName("Archana Thakur");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Neha Kshirsagar")
                && etPassword.getText().toString().equalsIgnoreCase("nk@1234")) {
            UserNameUtility.getInstance().setUserName("Neha Kshirsagar");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Pinanki Barge")
                && etPassword.getText().toString().equalsIgnoreCase("pb@1234")) {
            UserNameUtility.getInstance().setUserName("Pinanki Barge");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Rahul Kokil")
                && etPassword.getText().toString().equalsIgnoreCase("rk@1234")) {
            UserNameUtility.getInstance().setUserName("Rahul Kokil");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Manasi Kokil")
                && etPassword.getText().toString().equalsIgnoreCase("mk@1234")) {
            UserNameUtility.getInstance().setUserName("Manasi Kokil");
            ReadingLevelListActivity.launch(this);
        } else if (etUsername.getText().toString().equalsIgnoreCase("Swarali Gokhale")
                && etPassword.getText().toString().equalsIgnoreCase("sg@1234")) {
            UserNameUtility.getInstance().setUserName("Swarali Gokhale");
            ReadingLevelListActivity.launch(this);
        } else if(etUsername.getText().toString().equalsIgnoreCase("")
                ||etPassword.getText().toString().equalsIgnoreCase("")){
            Toast.makeText(this,"Please fill Username and Password",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"Please enter correct Username and Password",Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onBackPressed() {
        ExitActivity.exitApplication(this);
    }
}

