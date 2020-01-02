package com.example.samplegeneratorforscienttoolsmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText et,et1,et2,et3,et4,et5,et6;
    private ArrayList<Tool> tools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et= findViewById(R.id.editText);
        et1= findViewById(R.id.editText2);
        et2= findViewById(R.id.editText3);
        et3= findViewById(R.id.editText4);
        et4= findViewById(R.id.editText5);
        et5= findViewById(R.id.editText6);
        et6= findViewById(R.id.editText7);

        tools= new ArrayList<>();
        tools.add(new Tool("ahh",Long.valueOf(12458),"12/10/19","31/10/19"));
        tools.add(new Tool("ggg",Long.valueOf(74254),"4/11/19","24/11/19"));

        Button button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IndividualProfile individualProfile= new IndividualProfile(et.getText().toString(),Long.parseLong(et1.getText().toString()),tools);
                FirebaseDatabase.getInstance().getReference().child("individual_profile").child(et1.getText().toString()).setValue(individualProfile);

                ClubProfile clubProfile= new ClubProfile(et2.getText().toString(),tools);
                FirebaseDatabase.getInstance().getReference().child("club_profile").child(et2.getText().toString()).setValue(clubProfile);

                ToolsListN toolsListN= new ToolsListN(et3.getText().toString(),Long.valueOf(et4.getText().toString()),Boolean.parseBoolean("0"),"No details",et5.getText().toString(),et6.getText().toString());
                FirebaseDatabase.getInstance().getReference().child("tools").child(et4.getText().toString()).setValue(toolsListN);
            }
        });
    }
}