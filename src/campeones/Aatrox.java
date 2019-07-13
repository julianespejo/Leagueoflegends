
package campeones;

import mx.edu.itpLOL.R;
import videoatrox.VideoEspada;
import videoatrox.VideoMasacre;
import videoatrox.VideoPasiva;
import videoatrox.VideoSed;
import videoatrox.VideoVuelo;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class Aatrox extends Activity {
	
@Override
public void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	setContentView(R.layout.aatrox);

	}

	
	/* EMPIEZAN LAS LLAMADAS HACIA LOS VIDEOS DE SUS RESPECTIVAS CLASES*/
	public void videopozo(View v){
		Intent i = new Intent(this, VideoPasiva.class);
		startActivity(i);
	}
	public void videovuelo(View v){
		Intent i = new Intent(this, VideoVuelo.class);
		startActivity(i);
	}
	public void videosed(View v){
		Intent i = new Intent(this, VideoSed.class);
		startActivity(i);
		
	}
	public void videoespada(View v){
		Intent i = new Intent(this, VideoEspada.class);
		startActivity(i);
	}
	public void videomasacre(View v){
		Intent i = new Intent(this, VideoMasacre.class);
		startActivity(i);
	}
	
	/* IMPLEMENTACION DE UN VIDEO DESDE YOUTUBE*/
	public void videoguia(View v){
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=ja-PVQ94t9o")));
	}
	
	/* TERMINA LAS LLAMADAS AL LAYOUT VIDEO AATROX*/

	
		
	
	
	/* DIALOGO DE ALERTAS DE CADA UNA DE LAS HABILIDADES DEL CAMPEON*/
	public void Pozo(View view) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Al usar una habilidad que cuesta Vida, Aatrox acumula el daño autoinfligido en el Pozo Sangriento. Al sufrir un ataque mortal, Aatrox extrae la sangre del pozo y la recupera como Vida durante un breve periodo de tiempo. Además, Aatrox obtiene 1% de Velocidad de Ataque por cada 2% de sangre que haya en el pozo.")
		        .setTitle("Pozo Sangriento")
		        .setCancelable(false)
		        .setNeutralButton("CERRAR",
		                new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int id) {
		                        dialog.cancel();
		                    }
		                });
		AlertDialog alert = builder.create();
		alert.show();
	} 
	
	
		
		
	public void VueloOscuro(View v){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Costo: Costo 10% de la Vida Actual\n\nAlcance: 600\n\nAatrox comienza a volar y cae sobre una posición objetivo, inflige daño y derriba a todos los enemigos que estén en el centro del impacto.\n\n"+"Aatrox se eleva en el aire y cae sobre la posición objetivo, inflige 70/115/160/205/250 (+60% Daño de Ataque adicional) de daño físico y derriba a todos los enemigos que estén en el centro del impacto durante 1 segundo")
		        .setTitle("Vuelo Oscuro")
		        .setCancelable(false)
		        .setNeutralButton("CERRAR",
		                new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int id) {
		                        dialog.cancel();
		                    }
		                });
		AlertDialog alert = builder.create();
		alert.show();
		}
	
	
	public void sed(View v){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Costo: Sin Costo\n\nAlcance: Propio\n\n Al estar activa, Aatrox inflige daño adicional cada tres ataques consecutivos a costa de su propia Vida. Al estar desactivada, Aatrox recupera Vida cada tercer ataque consecutivo.\n\nAl estar desactivada, Aatrox se beneficia de Sed de Sangre, mientras que al activarse, se beneficia de Precio Sangriento.\n\nSed de Sangre: Cada tres ataques, Aatrox recupera 20/25/30/35/40 (+25% Daño de Ataque adicional) de Vida, aumentada 200% cuando se encuentre por debajo de la mitad de Vida.\n\nPrecio Sangriento: Cada tres ataques, Aatrox inflige 60/95/130/165/200 (+100% Daño de Ataque adicional) de daño físico adicional y pierde de Vida.")
		        .setTitle("Sed de Sangre/Precio Sangriento")
		        .setCancelable(false)
		        .setNeutralButton("CERRAR",
		                new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int id) {
		                        dialog.cancel();
		                    }
		                });
		AlertDialog alert = builder.create();
		alert.show();
		}
	
	
	public void espada(View v){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Costo: Costo 5% de la Vida Actual\n\nAlcance: 1000\n\nAatrox desata el poder de su espada, que inflige daño y ralentiza a todos los enemigos impactados.\n\nAatrox desata el poder de su espada, que inflige 75/110/145/180/215 (+60% Poder de Habilidad) (+60% Daño de Ataque adicional) de daño mágico a todos los enemigos impactados y los ralentiza un 40% durante 1.75/2/2.25/2.5/2.75 segundos.")
		        .setTitle("Espada del Tormento")
		        .setCancelable(false)
		        .setNeutralButton("CERRAR",
		                new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int id) {
		                        dialog.cancel();
		                    }
		                });
		AlertDialog alert = builder.create();
		alert.show();
		}
	
	public void masacre(View v){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Costo: Sin Costo\n\nAlcance: 550\n\nAatrox obtiene la sangre de sus enemigos e inflige daño a todos los campeones enemigos cercanos a él. Además, obtiene Velocidad de Ataque y Alcance de Ataque adicional durante un breve periodo de tiempo.\n\nAatrox obtiene la sangre de sus enemigos e inflige 200/300/400 (+100% Poder de Habilidad) de daño mágico a todos los campeones enemigos que lo rodean, lo que aumenta su Velocidad de Ataque 40/50/60%, y obtiene 175 de Alcance de Ataque durante 12 segundos.")
		        .setTitle("Masacre")
		        .setCancelable(false)
		        .setNeutralButton("CERRAR",
		                new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int id) {
		                        dialog.cancel();
		                    }
		                });
		AlertDialog alert = builder.create();
		alert.show();
		}
	/* TERMINAN LAS LLAMADAS DEL DIALOGO DE ALERTAS*/
}
