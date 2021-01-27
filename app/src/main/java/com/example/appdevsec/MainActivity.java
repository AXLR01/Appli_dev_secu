package com.example.appdevsec;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MainActivity extends AppCompatActivity{
    EditText editTextLogin, editTextPassword;
    String password = "d033e22ae348aeb5660fc2140aec35850c4da997"; // SHA1 de "admin"
    String inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClick(View v) {
        editTextLogin = findViewById(R.id.editTextTextPersonName);
        editTextPassword = findViewById(R.id.editTextPassword);
        try {
            MessageDigest sha1 = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        inputPassword = editTextPassword.getText().toString();
        if (editTextLogin.getText().toString().equals("Destini") && encryptThisString(inputPassword).equals(password)) {
            Toast.makeText(MainActivity.this, "Username and Password is correct", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, UserActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this, "Username or Password is incorrect", Toast.LENGTH_SHORT).show();
        }
    }

    public static String encryptThisString(String input)
    {
        try {
            // getInstance() method is called with algorithm SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");

            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);

            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            // return the HashText
            return hashtext;
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}

