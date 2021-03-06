package e.ollie.reservationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebview();
            }
        });

        button = (Button)findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStudentInfo();
            }
        });

        button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openItems();
            }
        });
    }

    public void openWebview(){
        Intent intent = new Intent(this,Webviews.class);
        startActivity(intent);

    }
  
    public void openStudentInfo()
    {
        Intent intent = new Intent(this,StudentInfo.class);
        startActivity(intent);

    }
    public void openItems()
    {
        Intent intent = new Intent(this,Items.class);
        startActivity(intent);

    }

}
