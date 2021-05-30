package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        listView=findViewById( R.id.List_View );

        final ArrayList <String > fruits = new ArrayList<>(  );

        fruits.add( "Oranges" );
        fruits.add( "Bananas" );
        fruits.add( "Apples" );


        // the arrayAdapter is to connect the ArrayList with the listView which displays what items we have in the ArrayList!!

        ArrayAdapter <String> adapter = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item,fruits );//
       // here we make the listView which displays the items set the adapter as (adapter ) to get the data and display it!!
        listView.setAdapter( adapter );


       // here we set on clickItemListener to choose the any item in the list
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               Toast.makeText(getApplicationContext()," You selected : "+ fruits.get( position ),Toast.LENGTH_LONG).show();

           }
       } );







    }

    public void addData(){


    }
}
