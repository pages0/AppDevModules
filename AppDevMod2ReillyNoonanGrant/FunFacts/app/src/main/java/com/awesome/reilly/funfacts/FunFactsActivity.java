package com.awesome.reilly.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends Activity {

    public static final String TAG= FunFactsActivity.class.getSimpleName();
    private FactBook mFactBook=new FactBook();
    private ColorWheel mColorWheel =new ColorWheel();;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        //Declare variables




        final RelativeLayout mLayout= (RelativeLayout) findViewById(R.id.FunFactsRelativeLayout);


        //Declare our view variables and assign them the views from our layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFacts= (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update the label with our dynamic fact
                int color = mColorWheel.getColor();
                factLabel.setText(mFactBook.getFact());
                mLayout.setBackgroundColor(color);
                showFacts.setTextColor(color);
            }
        };


        showFacts.setOnClickListener(listener);

        //testing
        //String message = "please don!!!";
        //Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        Log.d(TAG,"we are logging from the On create method!");

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
