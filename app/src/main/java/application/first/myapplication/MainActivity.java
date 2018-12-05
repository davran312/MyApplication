package application.first.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String loginValue ="";
    private String loginPassword ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSend = findViewById(R.id.btnSend);
        final EditText etLogin = findViewById(R.id.etLogin);
        final EditText etPassword = findViewById(R.id.etPassword);
        loginValue = etLogin.getText().toString();
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etLogin.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this,"Заполните все поля",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"You successfully have registred",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
