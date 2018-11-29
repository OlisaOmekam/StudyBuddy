package e.ollie.reservationapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.charset.Charset;

public class Login extends AppCompatActivity {
    private Button button;
    private EditText musername, mpassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final CharSequence setPW = "pw", setUN = "un";

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = (Button) findViewById(R.id.loginButton);
        musername = (EditText)findViewById(R.id.username);
        mpassword = (EditText)findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(musername.getText().toString().contentEquals(setUN) && mpassword.getText().toString().contentEquals(setPW))
                    openMainActivity();
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "invalid credentials";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });


    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
