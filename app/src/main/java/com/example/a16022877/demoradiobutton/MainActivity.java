package com.example.a16022877.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Get Radio Group object
                RadioGroup rg=(RadioGroup)findViewById(R.id.radioGroup);
                //Get id of the selected RB in the RG
                int selectedButtonId=rg.getCheckedRadioButtonId();
                //Get the RB object from the id we got above
                RadioButton rb=(RadioButton)findViewById(selectedButtonId);
                //show a toast that display the text on the selcted RB
                Toast.makeText(getBaseContext(),rb.getText(),
                        Toast.LENGTH_LONG).show();

            }
        });

    }
}
