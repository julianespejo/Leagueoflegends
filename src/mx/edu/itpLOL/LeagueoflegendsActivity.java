package mx.edu.itpLOL;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LeagueoflegendsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void entrar(View v){
    	Intent i = new Intent(this, Menu.class);
    	startActivity(i);
    	finish();
    	
    }
}