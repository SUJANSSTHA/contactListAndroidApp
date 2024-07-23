package com.example.contactlist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MainPage extends Activity {
    ListView lstContact;
    Button btnName;
    ArrayList<Person> personList = new ArrayList<Person>();
    CustomAdapter adapter;

    //ArrayAdapter<Person> adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentTransitionManager();
        setContentView(R.layout.main_activity_layout);
        lstContact = findViewById(R.id.lstContact);
        btnName = findViewById(R.id.btnNew);
        personList.add(new Person("Ramesh","Dharan","987654"));
        personList.add(new Person("Sita","Itahari","987654"));

        // Adapter call
        adapter = new CustomAdapter(this,personList);
        lstContact.setAdapter(adapter);

    }
}
