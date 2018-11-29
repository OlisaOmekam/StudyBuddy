package e.ollie.reservationapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Items extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        final Spinner dropdown = findViewById(R.id.spinner);
        String[] items = new String[]{
          "item 1",
          "item 2",
          "item 3",
          "item 4",
          "item 5",
          "item 6",
          "item 7",
          "item 8"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);



        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final CharSequence itemPicked = String.valueOf(dropdown.getSelectedItem());;
                Context context = getApplicationContext();
                CharSequence text = itemPicked + " was reserved";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }
        });
    }
}
