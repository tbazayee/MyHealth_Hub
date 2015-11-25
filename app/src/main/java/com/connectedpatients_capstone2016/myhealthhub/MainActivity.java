package com.connectedpatients_capstone2016.myhealthhub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import android.widget.Toolbar;
//import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button connectionButton= (Button) findViewById(R.id.connection_button);

        connectionButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view)
                    {
                        TextView hworld = (TextView) findViewById(R.id.hello);
                        if (hworld.getVisibility()== View.INVISIBLE )
                        {
                            hworld.setVisibility(View.VISIBLE);
                        } else {
                            hworld.setVisibility(View.INVISIBLE);
                        }
                    }
                });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
