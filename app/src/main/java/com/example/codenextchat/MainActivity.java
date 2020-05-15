package com.example.codenextchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView welcomeMsg;
    ArrayList<String> messages = new ArrayList<>();
    ArrayAdapter<String> messagesAdapter;
    String userVal;

    //TODO: Define a DatabaseReference reference to the messages object here


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeMsg = findViewById(R.id.welcomeTV);
        editText = findViewById(R.id.edit_text);

        //Generates a user identification number and sets the welcome message at the top of the app
        int userNum = (int) (Math.random()*100);
        userVal = "User #" + userNum + ": ";
        welcomeMsg.setText("Welcome " + userVal);


        //TODO: Place a FirebaseDatabase reference to the database here



        //TODO: Instantiate the DatabaseReference to the messages object here


        ListView listView = findViewById(R.id.list_view);
        messagesAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, messages);
        listView.setAdapter(messagesAdapter);

        //TODO: Add a listener for when a child message is added to the messages object in the db here
        //when a child message has been added to the db:
        //get the message String from the Snapshot and add it to the ArrayList
        //notify the adapter to update the listview with a new message




    }

    public void sendMessage(View view) {
        //get the string from the edittext field
        //push the message as a child to the messages object in the db
        String message = userVal + editText.getText().toString();
        editText.setText("");
        messages.add(message); //TODO: remove later
        messagesAdapter.notifyDataSetChanged(); //TODO: remove later

        //TODO: push the message as a child to the messages object in the db

    }
}
