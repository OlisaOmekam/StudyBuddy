package e.ollie.reservationapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


import java.util.ArrayList;

public class StudentInfo extends AppCompatActivity {

    Button delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        final Spinner dropdown = findViewById(R.id.spinner2);
        final ArrayList<String> spinneritems = new ArrayList<String>();

        delete = (Button)findViewById(R.id.cancelRes);

        spinneritems.add("item 1");
        spinneritems.add("item 2");
        spinneritems.add("item 3");

        final ArrayAdapter<String> adp = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,spinneritems );
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adp);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dropdown != null && dropdown.getSelectedItem() != null) {
                    String selectedSpinner = dropdown.getSelectedItem().toString();
                    spinneritems.remove(selectedSpinner);
                    adp.notifyDataSetChanged();

                    Context context = getApplicationContext();
                    CharSequence text = "You have canceled the reservation, please return key or item to desk";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else{
                    Context context = getApplicationContext();
                    CharSequence text = "You have no reservation to cancel";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

    }
}
