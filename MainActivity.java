package com.example.mq12.checkboxdinamico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearMain;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearMain = (LinearLayout) findViewById(R.id.liner_main);
        ArrayList<String> al = new ArrayList<String>();
        al.add("America");
        al.add("Tigres");
        al.add("UNAM");
        al.add("Monterrey");
        al.add("Puebla");
        al.add("Queretaro");
        al.add("Lobos BUAP");
        al.add("Atlas");
        al.add("Toluca");
        al.add("Morelia");
        for (int i =0; i< al.size(); i++){

            checkBox = new CheckBox(this);
            checkBox.setId(i);
            checkBox.setText(al.get(i));
            checkBox.setOnClickListener(getOnClickDoSomething(checkBox));
            linearMain.addView(checkBox);

        }

    }

    View.OnClickListener getOnClickDoSomething( final Button button){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ON_CLICK","CheckBox ID:" +button.getId() + " Text: " +button.getText().toString());
            }
        };
    }
}
