package com.example.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mediaStreamerButton = (Button) this.findViewById(R.id.media_streamer_button);
        mediaStreamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(v);
            }
        });

        Button superDuoButton1 = (Button) this.findViewById(R.id.super_duo1_button);
        superDuoButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(v);
            }
        });

        Button superDuoButton2 = (Button) this.findViewById(R.id.super_duo2_button);
        superDuoButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(v);
            }
        });

        Button antTerminatorButton = (Button) this.findViewById(R.id.ant_terminator_button);
        antTerminatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(v);
            }
        });

        Button materializeButton = (Button) this.findViewById(R.id.materialize_app_button);
        materializeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(v);
            }
        });

        Button capstoneAppButton = (Button) this.findViewById(R.id.capstone_app_button);
        capstoneAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(v);
            }
        });
    }

    private void makeToast(View v){
        String appName = "";
        if(v instanceof Button) {
            Button b = (Button) v;
            appName = b.getText().toString();
        }
        Toast toast = Toast.makeText(getApplicationContext(),
                getResources().getString(R.string.launch_string_start)+" "+appName+" "+getResources().getString(R.string.launch_string_end),
                Toast.LENGTH_LONG);
        toast.show();
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
