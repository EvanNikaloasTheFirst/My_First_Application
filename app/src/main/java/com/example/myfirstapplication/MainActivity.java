package com.example.myfirstapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername,edtPassword;
    Button btnLogIn;

    String strStoreUsername ="Evangelos";
    String strStorePassword = "123";

//    ConstraintLayout
//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogIn = findViewById(R.id.btnLogIn);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,"Welcome Evangelos",Toast.LENGTH_LONG).show();
                String strUsername = edtUsername.getText().toString();
                String strPassword = edtPassword.getText().toString();

                if (strStoreUsername.equals(strUsername) && strStorePassword.equals(strPassword)) {
                    Toast.makeText(MainActivity.this,
                            "Welcome " + strUsername, Toast.LENGTH_LONG).show();
                }

                else if (strStoreUsername.equals(strUsername) && !strStorePassword.equals(strPassword))  {
                    Toast.makeText(MainActivity.this,
                            "Incorrect password ",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}