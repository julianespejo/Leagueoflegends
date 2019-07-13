package mx.edu.itpLOL;

import contadorjungla.ContadorJungla;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
	}
	
	public void campeones(View v){
		Intent i = new Intent(this, Campeones.class);
		startActivity(i);
		
	}
	public void contadorjungla(View v){
		Intent i = new Intent(this,ContadorJungla.class);
		startActivity(i);
	}
}
