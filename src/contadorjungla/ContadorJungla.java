package contadorjungla;

import mx.edu.itpLOL.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;//Libreria de no suspencion del dispositivo
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ContadorJungla extends Activity {
	
	private TextView CronometroRed,CronometroBlue,CronometroDragon,CronometroBaron,CronometroBlueEnemy,CronometroRedEnemy;//
	private Button Blue,Red,Dragon,Baron,BlueEnemy,RedEnemy;
	/* Checkbox color*/
	private CheckBox Colorbox; 
	private LinearLayout MyJungle,EnemyJungle;
	/* instanciamos sonidos con soundpool*/
	SoundPool soundPool;
	int idDisponible, idNodisponible;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		/* Codigo que permite no suspender la pantalla mientras el cronometro se ejecuta*/
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		setContentView(R.layout.contadorjungla);
		
		/* Asignando texto a cada uno de los correspondientes cronometros*/
		CronometroRed=(TextView)findViewById(R.id.txtRed);
		CronometroBlue=(TextView)findViewById(R.id.txtBlue);
		CronometroDragon=(TextView)findViewById(R.id.txtDragon);
		CronometroBaron=(TextView)findViewById(R.id.txtBaronNashor);
		
		/* Asignando texto a cada uno de los correspondientes cronometros enemigos*/
		CronometroBlueEnemy=(TextView)findViewById(R.id.txtBlueEnemy);
		CronometroRedEnemy=(TextView)findViewById(R.id.txtRedEnemy);
		
		/* Asignando nombres a cada botón*/
		Blue = (Button)findViewById(R.id.btnBlueContador);
		Red = (Button)findViewById(R.id.btnRedContador);
		Dragon=(Button)findViewById(R.id.btnDragonContador);
		Baron=(Button)findViewById(R.id.btnBaronContador);
		Colorbox=(CheckBox)findViewById(R.id.checkboxcolor);
		/* Asignando nombre a cada boton del enemigo */
		BlueEnemy=(Button)findViewById(R.id.btnBlueContadorEnemy);
		RedEnemy=(Button)findViewById(R.id.btnRedContadorEnemy);
		
		/* Asignando nombre a los layouts*/
		MyJungle=(LinearLayout)findViewById(R.id.ContenedorMiJungla);
		EnemyJungle=(LinearLayout)findViewById(R.id.ContenedorJunglaEnemigo);
		
		/*Iniciamos el Activity precargados con los metodos*/
		cronometroBlue();
		cronometroRed();
		cronometroDragon();
		cronometroBaron();
		/* Cronometros Enemigos*/ 
		cronometroBlueEnemy();
		cronometroRedEnemy();
		
	}
	
	/**
	 *	Metodo onClick para cambiar el color de los contenedores
	 */	
	public void invertircolor(View view){
		boolean checked = (Colorbox).isChecked();
		 if (checked) {
             
             MyJungle.setBackgroundColor(Color.parseColor("#0080ff"));
			  EnemyJungle.setBackgroundColor(Color.parseColor("#ff0040"));
             
		 }else{
			  MyJungle.setBackgroundColor(Color.parseColor("#ff0040"));
			  EnemyJungle.setBackgroundColor(Color.parseColor("#0080ff"));
		 }
	}	
	
	/**
	 * Cronometro de Azul
	 * 300000 = 5:00 minutos  
	 */
		
	public void cronometroBlue(){
		/* Instanciamos soundpool */
		soundPool = new SoundPool( 5, AudioManager.STREAM_MUSIC , 0);
		/* cargando el sonido en el soundpool */
		idDisponible = soundPool.load(getBaseContext(), R.raw.disponible, 0);
		idNodisponible = soundPool.load(getBaseContext(), R.raw.nodisponible, 0);
		/* Instanciamos el contador Azul*/
		final CountDownTimer BlueCounter = new CountDownTimer(300000, 1000) {
			
	         public void onTick(long millisUntilFinished) {
	        	 /*Ponemos el cronometro en el texto*/
	            CronometroBlue.setText((millisUntilFinished/60000)+":"+(millisUntilFinished % 60000 / 1000));
	            /*El boton se deshabilita*/
	            Blue.setEnabled(false);
	         }
	         
	         public void onFinish() {
	        	 /*Cuando termina de contar se reescribe el texto al conteo original*/
	        	 CronometroBlue.setText("5:00");
	        	 /* Se habilita nuevamente el boton*/
	        	 Blue.setEnabled(true);
	        	 /* Se ejecuta el sonido para que el usuario sepa que ya esta disponible el Golem nuevamente*/
	        	 soundPool.play(idDisponible, 1, 1, 1, 0, 1);
	        	 /*Vibracion para notificacion  */
	        	 Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
	             // Vibrar por 1000 milliseconds
	             v.vibrate(1000);
	         }
	      };
	      /*Cancelando el contador parametros sin ejecucion y sin codigo*/
	      BlueCounter.cancel();
	      /* Se ejecuta el boton del golem */
	      Blue.setOnClickListener(new OnClickListener() {

	        public void onClick(View v) {
	        		/* El boton inicial el conteo*/
	               BlueCounter.start();
	               /* Se ejecuta un sonido de golem destruido*/
	               soundPool.play(idNodisponible, 1, 1, 1, 0, 1);
	        }
	    });
	}
	
	/**
	 * Cronometro Rojo
	 * 5:00 min.
	 */
	public void cronometroRed(){
		soundPool = new SoundPool( 5, AudioManager.STREAM_MUSIC , 0);
		/* cargando el sonido en el soundpool */
		idDisponible = soundPool.load(getBaseContext(), R.raw.disponible, 0);
		idNodisponible = soundPool.load(getBaseContext(), R.raw.nodisponible, 0);
		/* Instanciamos el contador Rojo*/
		final CountDownTimer RedCounter = new CountDownTimer(300000, 1000) {
	    
	         public void onTick(long millisUntilFinished) {
	            
	            CronometroRed.setText((millisUntilFinished/60000)+":"+(millisUntilFinished % 60000 / 1000));
	            Red.setEnabled(false);
	         }

	         public void onFinish() {
	        	 CronometroRed.setText("5:00");
	        	 Red.setEnabled(true);
	        	 /* Se ejecuta el sonido para que el usuario sepa que ya esta disponible el Lizard nuevamente*/
	        	 soundPool.play(idDisponible, 1, 1, 1, 0, 1);
	        	 /*Vibracion para notificacion  */
	        	 Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
	             // Vibrar por 1000 milliseconds
	             v.vibrate(1000);
	        	 
	         }
	      };
	      RedCounter.cancel();

	      Red.setOnClickListener(new OnClickListener() {

	        public void onClick(View v) {
	               RedCounter.start();
	               /* Se ejecuta un sonido de Lizard destruido*/
	               soundPool.play(idNodisponible, 1, 1, 1, 0, 1);
	        }
	    });
	}
	/**
	 * Cronometro del Dragon
	 * 6:00 min.
	 */
	public void cronometroDragon(){
		
		soundPool = new SoundPool( 5, AudioManager.STREAM_MUSIC , 0);
		/* cargando el sonido en el soundpool */
		idDisponible = soundPool.load(getBaseContext(), R.raw.disponible, 0);
		idNodisponible = soundPool.load(getBaseContext(), R.raw.nodisponible, 0);
		/* Instanciamos el contador Dragon*/
		
		final CountDownTimer DragonCounter = new CountDownTimer(360000, 1000) {
	         
	         public void onTick(long millisUntilFinished) {
	           
	            CronometroDragon.setText((millisUntilFinished/60000)+":"+(millisUntilFinished % 60000 / 1000));
	            Dragon.setEnabled(false);
	         }

	         public void onFinish() {
	        	 CronometroDragon.setText("6:00");
	        	 Dragon.setEnabled(true);
	        	 /* Se ejecuta el sonido para que el usuario sepa que ya esta disponible el Dragon nuevamente*/
	        	 soundPool.play(idDisponible, 1, 1, 1, 0, 1);
	        	 /*Vibracion para notificacion  */
	        	 Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
	             // Vibrar por 1000 milliseconds
	             v.vibrate(1000);
	         }
	      };
	      DragonCounter.cancel();

	      Dragon.setOnClickListener(new OnClickListener() {

	        public void onClick(View v) {
	               DragonCounter.start();
	               /* Se ejecuta un sonido de Dragon destruido*/
	               soundPool.play(idNodisponible, 1, 1, 1, 0, 1);
	        }
	    });
		
	}
	
	/*
	 * Cronometro de Baron 
	 * 7:00 min.
	 */
	
	public void cronometroBaron(){
		soundPool = new SoundPool( 5, AudioManager.STREAM_MUSIC , 0);
		/* cargando el sonido en el soundpool */
		idDisponible = soundPool.load(getBaseContext(), R.raw.disponible, 0);
		idNodisponible = soundPool.load(getBaseContext(), R.raw.nodisponible, 0);
		/* Instanciamos el contador Baron*/
		final CountDownTimer BaronCounter = new CountDownTimer(420000, 1000) {
	         
	         public void onTick(long millisUntilFinished) {
	           
	            CronometroBaron.setText((millisUntilFinished/60000)+":"+(millisUntilFinished % 60000 / 1000));
	            Baron.setEnabled(false);
	         }

	         public void onFinish() {
	        	 CronometroBaron.setText("7:00");
	        	 Baron.setEnabled(true);
	        	 /* Se ejecuta el sonido para que el usuario sepa que ya esta disponible el Baron nuevamente*/
	        	 soundPool.play(idDisponible, 1, 1, 1, 0, 1);
	        	 /*Vibracion para notificacion  */
	        	 Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
	             // Vibrar por 1000 milliseconds
	             v.vibrate(1000);
	         }
	      };
	      BaronCounter.cancel();

	      Baron.setOnClickListener(new OnClickListener() {

	        public void onClick(View v) {
	        	BaronCounter.start();
	        	 /* Se ejecuta un sonido de Baron destruido*/
	            soundPool.play(idNodisponible, 1, 1, 1, 0, 1);
	        }
	    });
	}
	
	/*
	 * Cronometro Blue Enemigo
	 * 5;00 min.
	 */
	public void cronometroBlueEnemy(){
		/* Instanciamos soundpool */
		soundPool = new SoundPool( 5, AudioManager.STREAM_MUSIC , 0);
		/* cargando el sonido en el soundpool */
		idDisponible = soundPool.load(getBaseContext(), R.raw.disponible, 0);
		idNodisponible = soundPool.load(getBaseContext(), R.raw.nodisponible, 0);
		/* Instanciamos el contador Azul Enemigo*/
		final CountDownTimer BlueEnemyCounter = new CountDownTimer(3000, 1000) {
			
	         public void onTick(long millisUntilFinished) {
	        	 /*Ponemos el cronometro en el texto*/
	            CronometroBlueEnemy.setText((millisUntilFinished/60000)+":"+(millisUntilFinished % 60000 / 1000));
	            /*El boton se deshabilita*/
	            BlueEnemy.setEnabled(false);
	         }
	         
	         public void onFinish() {
	        	 /*Cuando termina de contar se reescribe el texto al conteo original*/
	        	 CronometroBlueEnemy.setText("5:00");
	        	 /* Se habilita nuevamente el boton*/
	        	 BlueEnemy.setEnabled(true);
	        	 /* Se ejecuta el sonido para que el usuario sepa que ya esta disponible el Golem nuevamente*/
	        	 soundPool.play(idDisponible, 1, 1, 1, 0, 1);
	        	 /*Vibracion para notificacion  */
	        	 Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
	             // Vibrar por 1000 milliseconds
	             v.vibrate(1000);
	         }
	      };
	      /*Cancelando el contador parametros sin ejecucion y sin codigo*/
	      BlueEnemyCounter.cancel();
	      /* Se ejecuta el boton del golem */
	      BlueEnemy.setOnClickListener(new OnClickListener() {

	        public void onClick(View v) {
	        		/* El boton inicial el conteo*/
	               BlueEnemyCounter.start();
	               /* Se ejecuta un sonido de golem destruido*/
	               soundPool.play(idNodisponible, 1, 1, 1, 0, 1);
	        }
	    });
		
	}
	/*
	 * Cronometro Red enemigo
	 * 5:00 min.
	 */
	public void cronometroRedEnemy(){
		/* Instanciamos soundpool */
		soundPool = new SoundPool( 5, AudioManager.STREAM_MUSIC , 0);
		/* cargando el sonido en el soundpool */
		idDisponible = soundPool.load(getBaseContext(), R.raw.disponible, 0);
		idNodisponible = soundPool.load(getBaseContext(), R.raw.nodisponible, 0);
		/* Instanciamos el contador Azul Enemigo*/
		final CountDownTimer RedEnemyCounter = new CountDownTimer(300000, 1000) {
			
	         public void onTick(long millisUntilFinished) {
	        	 /*Ponemos el cronometro en el texto*/
	            CronometroRedEnemy.setText((millisUntilFinished/60000)+":"+(millisUntilFinished % 60000 / 1000));
	            /*El boton se deshabilita*/
	            RedEnemy.setEnabled(false);
	         }
	         
	         public void onFinish() {
	        	 /*Cuando termina de contar se reescribe el texto al conteo original*/
	        	 CronometroRedEnemy.setText("5:00");
	        	 /* Se habilita nuevamente el boton*/
	        	 RedEnemy.setEnabled(true);
	        	 /* Se ejecuta el sonido para que el usuario sepa que ya esta disponible el Golem nuevamente*/
	        	 soundPool.play(idDisponible, 1, 1, 1, 0, 1);
	        	 /*Vibracion para notificacion  */
	        	 Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
	             // Vibrar por 1000 milliseconds
	             v.vibrate(1000);
	         }
	      };
	      /*Cancelando el contador parametros sin ejecucion y sin codigo*/
	      RedEnemyCounter.cancel();
	      /* Se ejecuta el boton del golem */
	      RedEnemy.setOnClickListener(new OnClickListener() {

	        public void onClick(View v) {
	        		/* El boton inicial el conteo*/
	               RedEnemyCounter.start();
	               /* Se ejecuta un sonido de golem destruido*/
	               soundPool.play(idNodisponible, 1, 1, 1, 0, 1);
	        }
	    });
		
	}
	
	
	

}
