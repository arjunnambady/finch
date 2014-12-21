package com.finch;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        
        // thread for displaying the splash screen
        
        Thread splash_screen = new Thread(){
        	
        	public void run(){
        		try{
        			sleep(5000);
        		}catch(Exception e){
        		e.printStackTrace();
        		}finally{
        	startActivity(new Intent(getApplicationContext(),Main.class));
        	finish();}}
        	};
        	splash_screen.start();
        

       
        }
   
    

}
