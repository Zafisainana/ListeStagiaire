package zafisainana.randria.listestagiaire.io;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText mEdLogin;
    private EditText mEdPassword;
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mEdLogin = (EditText) findViewById(R.id.editLogin);
        mEdPassword = (EditText) findViewById(R.id.editPassword);
        mBtnLogin = (Button) findViewById(R.id.btnValider);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked

                SignIn(mEdLogin.getText().toString(),mEdPassword.getText().toString());
            }
        });
    }

        public void SignIn(String _login, String _password) {

            //String _login = mEdLogin.getText().toString();
            //String _password = mEdPassword.getText().toString();

            if(_login.equals("Admin") && _password.equals("0000")) {
                //Toast.makeText(this, "You Signed In", Toast.LENGTH_SHORT).show();

                //redirige vers l'ecran StagiairesActivity
                Intent intent = new Intent(MainActivity.this, StagiaireActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show();
            }
        }


    }

