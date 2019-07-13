package mx.edu.itpLOL;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import campeones.Aatrox;

public class Campeones extends Activity{
	
	private Button batrox,bahri,bakali,balistar,bamumu,banivia,
				   bannie,bashe,bblits,bbrand,bbraum,bcaitlyn,
				   bcassiopeia,bchogat,bcorki,bdarius,bdiana,
				   bdrmundo,bdraven,belise,bevelynn,bezreal,
				   bfiddlesticks,bfiora,bfizz,bgalio,bgangplank,
				   bgaren,bgragas,bgraves,bhecarim,bheirmerdinger,
				   birelia,bjanna,bjarvaniv,bjax,bjayce,bjinx,bkarma,
				   bkarthus,bkassadin,bkatarina,bkayle,bkennen,bkhazix,
				   bkogmaw,bleblanc,bleesin,bleona,blissandra,blucian,
				   blulu,blux,bmaestroyi,bmalphite,bmalsahar,bmaokai,
				   bmissfortune,bmordekaiser,bmorgana,bnami,bnasus,
				   bnautilus,bnidalee,bnocturne,bnunu,bolaf,borianna,
				   bpantheon,bpoppy,bquinn,brammus,brenekton,brengar,
				   briven,brumble,brise,bsejuani,bshaco,bshen,bshyvana,
				   bsinged,bsion,bsivir,bskarner,bsona,bsoraka,bswain,
				   bsyndra,btalon,btaric,bteemo,bthresh,btristana,
				   btrundle,btryndamare,btwistedfate,btwitch,budyr,
				   burgot,bvarus,bvayne,bveigar,bvelkos,bvi,bviktor,
				   bvladimir,bvolibear,bwarwick,bwukong,bxerath,
				   bxinzhao,byasuo,byorick,bzac,bzed,bziggs,bzilean,bzyra;
	
	private Spinner spin;
	private List<String> opcion;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.campeones);
		//spin que controla el ordenamiento de los botones por categorias
		spinner();		
		// instanciamos los botones con cada uno de los id que corresponde
		batrox=(Button)findViewById(R.id.btnatrox);
		bahri =(Button)findViewById(R.id.btnahri);
		bakali=(Button)findViewById(R.id.btnakali);
		balistar=(Button)findViewById(R.id.btnalistar);
		bamumu=(Button)findViewById(R.id.btnamumu);
		banivia=(Button)findViewById(R.id.btnanivia);
		bannie=(Button)findViewById(R.id.btnannie);
		bashe=(Button)findViewById(R.id.btnashe);
		bblits=(Button)findViewById(R.id.btnblit);
		bbrand=(Button)findViewById(R.id.btnbrand);
		bbraum=(Button)findViewById(R.id.btnbraum);
		bcaitlyn=(Button)findViewById(R.id.btncaitlyn);
		bcassiopeia=(Button)findViewById(R.id.btncassiopeia);
		bchogat=(Button)findViewById(R.id.btnchogat);
		bcorki=(Button)findViewById(R.id.btncorki);
		bdarius=(Button)findViewById(R.id.btndarius);
		bdiana=(Button)findViewById(R.id.btndiana);
		bdrmundo=(Button)findViewById(R.id.btndrmundo);
		bdraven=(Button)findViewById(R.id.btndraven);
		belise=(Button)findViewById(R.id.btnElise);
		bevelynn=(Button)findViewById(R.id.btnevelynn);
		bezreal=(Button)findViewById(R.id.btnesreal);
		bfiddlesticks=(Button)findViewById(R.id.btnfiddlestick);
		bfiora=(Button)findViewById(R.id.btnfiora);
		bfizz=(Button)findViewById(R.id.btnfiss);
		bgalio=(Button)findViewById(R.id.btngalio);
		bgangplank=(Button)findViewById(R.id.btngangplank);
		bgaren=(Button)findViewById(R.id.btngaren);
		bgragas=(Button)findViewById(R.id.btngragas);
		bgraves=(Button)findViewById(R.id.btngraves);
		bhecarim=(Button)findViewById(R.id.btnhecarim);
		bheirmerdinger=(Button)findViewById(R.id.btnheirmerdinger);
		birelia=(Button)findViewById(R.id.btnirelia);
		bjanna=(Button)findViewById(R.id.btnjanna);
		bjarvaniv=(Button)findViewById(R.id.btnjarvaniv);
		bjax=(Button)findViewById(R.id.btnjax);
		bjayce=(Button)findViewById(R.id.btnjayce);
		bjinx=(Button)findViewById(R.id.btnjinx);
		bkarma=(Button)findViewById(R.id.btnkarma);
		bkarthus=(Button)findViewById(R.id.btnkarthus);
		bkassadin=(Button)findViewById(R.id.btnkassadin);
		bkatarina=(Button)findViewById(R.id.btnkatarina);
		bkayle=(Button)findViewById(R.id.btnkayle);
		bkennen=(Button)findViewById(R.id.btnkennen);
		bkhazix=(Button)findViewById(R.id.btnkhazix);
		bkogmaw=(Button)findViewById(R.id.btnkogmaw);
		bleblanc=(Button)findViewById(R.id.btnleblanc);
		bleesin=(Button)findViewById(R.id.btnleesin);
		bleona=(Button)findViewById(R.id.btnleona);
		blissandra=(Button)findViewById(R.id.btnlissandra);
		blucian=(Button)findViewById(R.id.btnlucian);
		blulu=(Button)findViewById(R.id.btnlulu);
		blux=(Button)findViewById(R.id.btnlux);
		bmaestroyi=(Button)findViewById(R.id.btnmaestroyi);
		bmalphite=(Button)findViewById(R.id.btnmalphite);
		bmalsahar=(Button)findViewById(R.id.btnmalsahar);
		bmaokai=(Button)findViewById(R.id.btnmaokai);
		bmissfortune=(Button)findViewById(R.id.btnmissfortune);
		bmordekaiser=(Button)findViewById(R.id.btnmordekaiser);
		bmorgana=(Button)findViewById(R.id.btnmorgana);
		bnami=(Button)findViewById(R.id.btnnami);
		bnasus=(Button)findViewById(R.id.btnnasus);
		bnautilus=(Button)findViewById(R.id.btnnautilus);
		bnidalee=(Button)findViewById(R.id.btnnidalee);
		bnocturne=(Button)findViewById(R.id.btnnocturne);
		bnunu=(Button)findViewById(R.id.btnnunu);
		bolaf=(Button)findViewById(R.id.btnolaf);
		borianna=(Button)findViewById(R.id.btnorianna);
		bpantheon=(Button)findViewById(R.id.btnpantheon);
		bpoppy=(Button)findViewById(R.id.btnpoppy);
		bquinn=(Button)findViewById(R.id.btnquinn);
		brammus=(Button)findViewById(R.id.btnrammus);
		brenekton=(Button)findViewById(R.id.btnrenekton);
		brengar=(Button)findViewById(R.id.btnrengar);
		briven=(Button)findViewById(R.id.btnriven);
		brumble=(Button)findViewById(R.id.btnrumble);
		brise=(Button)findViewById(R.id.btnrise);
		bsejuani=(Button)findViewById(R.id.btnsejuani);
		bshaco=(Button)findViewById(R.id.btnshaco);
		bshen=(Button)findViewById(R.id.btnshen);
		bshyvana=(Button)findViewById(R.id.btnshyvana);
		bsinged=(Button)findViewById(R.id.btnsinged);
		bsion=(Button)findViewById(R.id.btnsion);
		bsivir=(Button)findViewById(R.id.btnsivir);
		bskarner=(Button)findViewById(R.id.btnskarner);
		bsona=(Button)findViewById(R.id.btnsona);
		bsoraka=(Button)findViewById(R.id.btnsoraka);
		bswain=(Button)findViewById(R.id.btnswain);
		bsyndra=(Button)findViewById(R.id.btnsyndra);
		btalon=(Button)findViewById(R.id.btntalon);
		btaric=(Button)findViewById(R.id.btntaric);
		bteemo=(Button)findViewById(R.id.btnteemo);
		bthresh=(Button)findViewById(R.id.btnthresh);
		btristana=(Button)findViewById(R.id.btntristana);
		btrundle=(Button)findViewById(R.id.btntrundle);
		btryndamare=(Button)findViewById(R.id.btntryndamare);
		btwistedfate=(Button)findViewById(R.id.btntwistedfate);
		btwitch=(Button)findViewById(R.id.btntwitch);
		budyr=(Button)findViewById(R.id.btnudyr);
		burgot=(Button)findViewById(R.id.btnurgot);
		bvarus=(Button)findViewById(R.id.btnvarus);
		bvayne=(Button)findViewById(R.id.btnvayne);
		bveigar=(Button)findViewById(R.id.btnveigar);
		bvelkos=(Button)findViewById(R.id.btnvelkos);
		bvi=(Button)findViewById(R.id.btnvi);
		bviktor=(Button)findViewById(R.id.btnviktor);
		bvladimir=(Button)findViewById(R.id.btnvladimir);
		bvolibear=(Button)findViewById(R.id.btnvolibear);
		bwarwick=(Button)findViewById(R.id.btnwarwick);
		bwukong=(Button)findViewById(R.id.btnwukong);
		bxerath=(Button)findViewById(R.id.btnxerath);
		bxinzhao=(Button)findViewById(R.id.btnxinzhao);
		byasuo=(Button)findViewById(R.id.btnyasuo);
		byorick=(Button)findViewById(R.id.btnyorick);
		bzac=(Button)findViewById(R.id.btnzac);
		bzed=(Button)findViewById(R.id.btnzed);
		bziggs=(Button)findViewById(R.id.btnziggs);
		bzilean=(Button)findViewById(R.id.btnzilean);
		bzyra=(Button)findViewById(R.id.btnzyra);
	}
	
	private void spinner(){
		  
		 spin = (Spinner)findViewById(R.id.spinner);
		 
		 opcion = new ArrayList<String>();
		 spin = (Spinner) this.findViewById(R.id.spinner);
		   opcion.add("Alfabeticamente");
		   opcion.add("Asesino");
		   opcion.add("Luchador");
		   opcion.add("Hechicero");
		   opcion.add("Soporte");
		   opcion.add("Tanque");
		   opcion.add("Tirador");
		   ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcion);
		   adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		   spin.setAdapter(adaptador);
		   spin.setOnItemSelectedListener(new OnItemSelectedListener() {
				   @Override
				   public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
					  String seleccion = parentView.getItemAtPosition(position).toString();
					  
					  if(seleccion=="Alfabeticamente"){
						  ordenarAlfa();
					  }
					  
					  if(seleccion=="Asesino"){
						  ordenarAsesino();
					  }
					  if(seleccion=="Luchador"){
						  ordenarLuchador();
					  }
					  if(seleccion=="Hechicero"){
						  ordenarHechicero();
					  }
					  if(seleccion=="Soporte"){
						  ordenarSoporte();
					  }
					  if(seleccion=="Tanque"){
						  ordenarTanque();
					  }
					  if(seleccion=="Tirador"){
						  ordenarTirador();
					  }
					  
				      Toast.makeText(parentView.getContext(), "Seleccionado: " + seleccion, Toast.LENGTH_SHORT).show();
				     
				   }
				   public void onNothingSelected(AdapterView<?> parentView){ }
				   
			});
	}  
   
	
	
	
	/*Metodos de ordenamiento */ 
	public void ordenarAlfa(){
		
		//Poniendo todos los botones en modo visible
		batrox.setVisibility(View.VISIBLE);
		bahri.setVisibility(View.VISIBLE);
		bakali.setVisibility(View.VISIBLE);
		balistar.setVisibility(View.VISIBLE);
		bamumu.setVisibility(View.VISIBLE);
		banivia.setVisibility(View.VISIBLE);
		bannie.setVisibility(View.VISIBLE);
		bashe.setVisibility(View.VISIBLE);
		bblits.setVisibility(View.VISIBLE);
		bbrand.setVisibility(View.VISIBLE);
		bbraum.setVisibility(View.VISIBLE);
		bcaitlyn.setVisibility(View.VISIBLE);
		bcassiopeia.setVisibility(View.VISIBLE);
		bchogat.setVisibility(View.VISIBLE);
		bcorki.setVisibility(View.VISIBLE);
		bdarius.setVisibility(View.VISIBLE);
		bdiana.setVisibility(View.VISIBLE);
		bdrmundo.setVisibility(View.VISIBLE);
		bdraven.setVisibility(View.VISIBLE);
		belise.setVisibility(View.VISIBLE);
		bevelynn.setVisibility(View.VISIBLE);
		bezreal.setVisibility(View.VISIBLE);
		bfiddlesticks.setVisibility(View.VISIBLE);
		bfiora.setVisibility(View.VISIBLE);
		bfizz.setVisibility(View.VISIBLE);
		bgalio.setVisibility(View.VISIBLE);
		bgangplank.setVisibility(View.VISIBLE);
		bgaren.setVisibility(View.VISIBLE);
		bgragas.setVisibility(View.VISIBLE);
		bgraves.setVisibility(View.VISIBLE);
		bhecarim.setVisibility(View.VISIBLE);
		bheirmerdinger.setVisibility(View.VISIBLE);
		birelia.setVisibility(View.VISIBLE);
		bjanna.setVisibility(View.VISIBLE);
		bjarvaniv.setVisibility(View.VISIBLE);
		bjax.setVisibility(View.VISIBLE);
		bjayce.setVisibility(View.VISIBLE);
		bjinx.setVisibility(View.VISIBLE);
		bkarma.setVisibility(View.VISIBLE);
		bkarthus.setVisibility(View.VISIBLE);
		bkassadin.setVisibility(View.VISIBLE);
		bkatarina.setVisibility(View.VISIBLE);
		bkayle.setVisibility(View.VISIBLE);
		bkennen.setVisibility(View.VISIBLE);
		bkhazix.setVisibility(View.VISIBLE);
		bkogmaw.setVisibility(View.VISIBLE);
		bleblanc.setVisibility(View.VISIBLE);
		bleesin.setVisibility(View.VISIBLE);
		bleona.setVisibility(View.VISIBLE);
		blissandra.setVisibility(View.VISIBLE);
		blucian.setVisibility(View.VISIBLE);
		blulu.setVisibility(View.VISIBLE);
		blux.setVisibility(View.VISIBLE);
		bmaestroyi.setVisibility(View.VISIBLE);
		bmalphite.setVisibility(View.VISIBLE);
		bmalsahar.setVisibility(View.VISIBLE);
		bmaokai.setVisibility(View.VISIBLE);
		bmissfortune.setVisibility(View.VISIBLE);
		bmordekaiser.setVisibility(View.VISIBLE);
		bmorgana.setVisibility(View.VISIBLE);
		bnami.setVisibility(View.VISIBLE);
		bnasus.setVisibility(View.VISIBLE);
		bnautilus.setVisibility(View.VISIBLE);
		bnidalee.setVisibility(View.VISIBLE);
		bnocturne.setVisibility(View.VISIBLE);
		bnunu.setVisibility(View.VISIBLE);
		bolaf.setVisibility(View.VISIBLE);
		borianna.setVisibility(View.VISIBLE);
		bpantheon.setVisibility(View.VISIBLE);
		bpoppy.setVisibility(View.VISIBLE);
		bquinn.setVisibility(View.VISIBLE);
		brammus.setVisibility(View.VISIBLE);
		brenekton.setVisibility(View.VISIBLE);
		brengar.setVisibility(View.VISIBLE);
		briven.setVisibility(View.VISIBLE);
		brumble.setVisibility(View.VISIBLE);
		brise.setVisibility(View.VISIBLE);
		bsejuani.setVisibility(View.VISIBLE);
		bshaco.setVisibility(View.VISIBLE);
		bshen.setVisibility(View.VISIBLE);
		bshyvana.setVisibility(View.VISIBLE);
		bsinged.setVisibility(View.VISIBLE);
		bsion.setVisibility(View.VISIBLE);
		bsivir.setVisibility(View.VISIBLE);
		bskarner.setVisibility(View.VISIBLE);
		bsona.setVisibility(View.VISIBLE);
		bsoraka.setVisibility(View.VISIBLE);
		bswain.setVisibility(View.VISIBLE);
		bsyndra.setVisibility(View.VISIBLE);
		btalon.setVisibility(View.VISIBLE);
		btaric.setVisibility(View.VISIBLE);
		bteemo.setVisibility(View.VISIBLE);
		bthresh.setVisibility(View.VISIBLE);
		btristana.setVisibility(View.VISIBLE);
		btrundle.setVisibility(View.VISIBLE);
		btryndamare.setVisibility(View.VISIBLE);
		btwistedfate.setVisibility(View.VISIBLE);
		btwitch.setVisibility(View.VISIBLE);
		budyr.setVisibility(View.VISIBLE);
		burgot.setVisibility(View.VISIBLE);
		bvarus.setVisibility(View.VISIBLE);
		bvayne.setVisibility(View.VISIBLE);
		bveigar.setVisibility(View.VISIBLE);
		bvelkos.setVisibility(View.VISIBLE);
		bvi.setVisibility(View.VISIBLE);
		bviktor.setVisibility(View.VISIBLE);
		bvladimir.setVisibility(View.VISIBLE);
		bvolibear.setVisibility(View.VISIBLE);
		bwarwick.setVisibility(View.VISIBLE);
		bwukong.setVisibility(View.VISIBLE);
		bxerath.setVisibility(View.VISIBLE);
		bxinzhao.setVisibility(View.VISIBLE);
		byasuo.setVisibility(View.VISIBLE);
		byorick.setVisibility(View.VISIBLE);
		bzac.setVisibility(View.VISIBLE);
		bzed.setVisibility(View.VISIBLE);
		bziggs.setVisibility(View.VISIBLE);
		bzilean.setVisibility(View.VISIBLE);
		bzyra.setVisibility(View.VISIBLE);
		
	}
	
	
	
	public void ordenarAsesino(){
		
		batrox.setVisibility(View.GONE);
		bahri.setVisibility(View.VISIBLE);
		bakali.setVisibility(View.VISIBLE);
		balistar.setVisibility(View.GONE);
		bamumu.setVisibility(View.GONE);
		banivia.setVisibility(View.GONE);
		bannie.setVisibility(View.GONE);
		bashe.setVisibility(View.GONE);
		bblits.setVisibility(View.GONE);
		bbrand.setVisibility(View.GONE);
		bbraum.setVisibility(View.GONE);
		bcaitlyn.setVisibility(View.GONE);
		bcassiopeia.setVisibility(View.GONE);
		bchogat.setVisibility(View.GONE);
		bcorki.setVisibility(View.GONE);
		bdarius.setVisibility(View.GONE);
		bdiana.setVisibility(View.GONE);
		bdrmundo.setVisibility(View.GONE);
		bdraven.setVisibility(View.GONE);
		belise.setVisibility(View.GONE);
		bevelynn.setVisibility(View.VISIBLE);
		bezreal.setVisibility(View.GONE);
		bfiddlesticks.setVisibility(View.GONE);
		bfiora.setVisibility(View.VISIBLE);
		bfizz.setVisibility(View.VISIBLE);
		bgalio.setVisibility(View.GONE);
		bgangplank.setVisibility(View.GONE);
		bgaren.setVisibility(View.GONE);
		bgragas.setVisibility(View.GONE);
		bgraves.setVisibility(View.GONE);
		bhecarim.setVisibility(View.GONE);
		bheirmerdinger.setVisibility(View.GONE);
		birelia.setVisibility(View.VISIBLE);
		bjanna.setVisibility(View.GONE);
		bjarvaniv.setVisibility(View.GONE);
		bjax.setVisibility(View.VISIBLE);
		bjayce.setVisibility(View.GONE);
		bjinx.setVisibility(View.GONE);
		bkarma.setVisibility(View.GONE);
		bkarthus.setVisibility(View.GONE);
		bkassadin.setVisibility(View.VISIBLE);
		bkatarina.setVisibility(View.VISIBLE);
		bkayle.setVisibility(View.GONE);
		bkennen.setVisibility(View.GONE);
		bkhazix.setVisibility(View.VISIBLE);
		bkogmaw.setVisibility(View.GONE);
		bleblanc.setVisibility(View.VISIBLE);
		bleesin.setVisibility(View.VISIBLE);
		bleona.setVisibility(View.GONE);
		blissandra.setVisibility(View.GONE);
		blucian.setVisibility(View.GONE);
		blulu.setVisibility(View.GONE);
		blux.setVisibility(View.GONE);
		bmaestroyi.setVisibility(View.VISIBLE);
		bmalphite.setVisibility(View.GONE);
		bmalsahar.setVisibility(View.VISIBLE);
		bmaokai.setVisibility(View.GONE);
		bmissfortune.setVisibility(View.GONE);
		bmordekaiser.setVisibility(View.GONE);
		bmorgana.setVisibility(View.GONE);
		bnami.setVisibility(View.GONE);
		bnasus.setVisibility(View.GONE);
		bnautilus.setVisibility(View.GONE);
		bnidalee.setVisibility(View.VISIBLE);
		bnocturne.setVisibility(View.VISIBLE);
		bnunu.setVisibility(View.VISIBLE);
		bolaf.setVisibility(View.GONE);
		borianna.setVisibility(View.GONE);
		bpantheon.setVisibility(View.VISIBLE);
		bpoppy.setVisibility(View.VISIBLE);
		bquinn.setVisibility(View.GONE);
		brammus.setVisibility(View.GONE);
		brenekton.setVisibility(View.GONE);
		brengar.setVisibility(View.VISIBLE);
		briven.setVisibility(View.VISIBLE);
		brumble.setVisibility(View.GONE);
		brise.setVisibility(View.GONE);
		bsejuani.setVisibility(View.GONE);
		bshaco.setVisibility(View.VISIBLE);
		bshen.setVisibility(View.GONE);
		bshyvana.setVisibility(View.GONE);
		bsinged.setVisibility(View.GONE);
		bsion.setVisibility(View.GONE);
		bsivir.setVisibility(View.GONE);
		bskarner.setVisibility(View.GONE);
		bsona.setVisibility(View.GONE);
		bsoraka.setVisibility(View.GONE);
		bswain.setVisibility(View.GONE);
		bsyndra.setVisibility(View.GONE);
		btalon.setVisibility(View.VISIBLE);
		btaric.setVisibility(View.GONE);
		bteemo.setVisibility(View.VISIBLE);
		bthresh.setVisibility(View.GONE);
		btristana.setVisibility(View.VISIBLE);
		btrundle.setVisibility(View.GONE);
		btryndamare.setVisibility(View.VISIBLE);
		btwistedfate.setVisibility(View.GONE);
		btwitch.setVisibility(View.VISIBLE);
		budyr.setVisibility(View.GONE);
		burgot.setVisibility(View.GONE);
		bvarus.setVisibility(View.GONE);
		bvayne.setVisibility(View.VISIBLE);
		bveigar.setVisibility(View.GONE);
		bvelkos.setVisibility(View.GONE);
		bvi.setVisibility(View.VISIBLE);
		bviktor.setVisibility(View.GONE);
		bvladimir.setVisibility(View.GONE);
		bvolibear.setVisibility(View.GONE);
		bwarwick.setVisibility(View.GONE);
		bwukong.setVisibility(View.GONE);
		bxerath.setVisibility(View.VISIBLE);
		bxinzhao.setVisibility(View.VISIBLE);
		byasuo.setVisibility(View.VISIBLE);
		byorick.setVisibility(View.GONE);
		bzac.setVisibility(View.GONE);
		bzed.setVisibility(View.VISIBLE);
		bziggs.setVisibility(View.GONE);
		bzilean.setVisibility(View.GONE);
		bzyra.setVisibility(View.GONE);
		
	}
	
	public void ordenarLuchador(){
		
		batrox.setVisibility(View.VISIBLE);
		bahri.setVisibility(View.GONE);
		bakali.setVisibility(View.GONE);
		balistar.setVisibility(View.GONE);
		bamumu.setVisibility(View.GONE);
		banivia.setVisibility(View.GONE);
		bannie.setVisibility(View.GONE);
		bashe.setVisibility(View.GONE);
		bblits.setVisibility(View.VISIBLE);
		bbrand.setVisibility(View.GONE);
		bbraum.setVisibility(View.GONE);
		bcaitlyn.setVisibility(View.GONE);
		bcassiopeia.setVisibility(View.GONE);
		bchogat.setVisibility(View.GONE);
		bcorki.setVisibility(View.GONE);
		bdarius.setVisibility(View.VISIBLE);
		bdiana.setVisibility(View.VISIBLE);
		bdrmundo.setVisibility(View.VISIBLE);
		bdraven.setVisibility(View.GONE);
		belise.setVisibility(View.VISIBLE);
		bevelynn.setVisibility(View.GONE);
		bezreal.setVisibility(View.GONE);
		bfiddlesticks.setVisibility(View.GONE);
		bfiora.setVisibility(View.VISIBLE);
		bfizz.setVisibility(View.VISIBLE);
		bgalio.setVisibility(View.GONE);
		bgangplank.setVisibility(View.VISIBLE);
		bgaren.setVisibility(View.VISIBLE);
		bgragas.setVisibility(View.VISIBLE);
		bgraves.setVisibility(View.GONE);
		bhecarim.setVisibility(View.VISIBLE);
		bheirmerdinger.setVisibility(View.GONE);
		birelia.setVisibility(View.VISIBLE);
		bjanna.setVisibility(View.GONE);
		bjarvaniv.setVisibility(View.VISIBLE);
		bjax.setVisibility(View.VISIBLE);
		bjayce.setVisibility(View.VISIBLE);
		bjinx.setVisibility(View.GONE);
		bkarma.setVisibility(View.GONE);
		bkarthus.setVisibility(View.GONE);
		bkassadin.setVisibility(View.GONE);
		bkatarina.setVisibility(View.GONE);
		bkayle.setVisibility(View.VISIBLE);
		bkennen.setVisibility(View.GONE);
		bkhazix.setVisibility(View.GONE);
		bkogmaw.setVisibility(View.GONE);
		bleblanc.setVisibility(View.GONE);
		bleesin.setVisibility(View.VISIBLE);
		bleona.setVisibility(View.GONE);
		blissandra.setVisibility(View.GONE);
		blucian.setVisibility(View.GONE);
		blulu.setVisibility(View.GONE);
		blux.setVisibility(View.GONE);
		bmaestroyi.setVisibility(View.VISIBLE);
		bmalphite.setVisibility(View.VISIBLE);
		bmalsahar.setVisibility(View.GONE);
		bmaokai.setVisibility(View.GONE);
		bmissfortune.setVisibility(View.GONE);
		bmordekaiser.setVisibility(View.VISIBLE);
		bmorgana.setVisibility(View.GONE);
		bnami.setVisibility(View.GONE);
		bnasus.setVisibility(View.VISIBLE);
		bnautilus.setVisibility(View.VISIBLE);
		bnidalee.setVisibility(View.GONE);
		bnocturne.setVisibility(View.VISIBLE);
		bnunu.setVisibility(View.VISIBLE);
		bolaf.setVisibility(View.VISIBLE);
		borianna.setVisibility(View.GONE);
		bpantheon.setVisibility(View.VISIBLE);
		bpoppy.setVisibility(View.VISIBLE);
		bquinn.setVisibility(View.VISIBLE);
		brammus.setVisibility(View.VISIBLE);
		brenekton.setVisibility(View.VISIBLE);
		brengar.setVisibility(View.VISIBLE);
		briven.setVisibility(View.VISIBLE);
		brumble.setVisibility(View.VISIBLE);
		brise.setVisibility(View.VISIBLE);
		bsejuani.setVisibility(View.VISIBLE);
		bshaco.setVisibility(View.GONE);
		bshen.setVisibility(View.VISIBLE);
		bshyvana.setVisibility(View.VISIBLE);
		bsinged.setVisibility(View.VISIBLE);
		bsion.setVisibility(View.VISIBLE);
		bsivir.setVisibility(View.GONE);
		bskarner.setVisibility(View.VISIBLE);
		bsona.setVisibility(View.GONE);
		bsoraka.setVisibility(View.GONE);
		bswain.setVisibility(View.VISIBLE);
		bsyndra.setVisibility(View.GONE);
		btalon.setVisibility(View.VISIBLE);
		btaric.setVisibility(View.VISIBLE);
		bteemo.setVisibility(View.GONE);
		bthresh.setVisibility(View.VISIBLE);
		btristana.setVisibility(View.GONE);
		btrundle.setVisibility(View.VISIBLE);
		btryndamare.setVisibility(View.VISIBLE);
		btwistedfate.setVisibility(View.GONE);
		btwitch.setVisibility(View.GONE);
		budyr.setVisibility(View.VISIBLE);
		burgot.setVisibility(View.GONE);
		bvarus.setVisibility(View.GONE);
		bvayne.setVisibility(View.GONE);
		bveigar.setVisibility(View.GONE);
		bvelkos.setVisibility(View.GONE);
		bvi.setVisibility(View.VISIBLE);
		bviktor.setVisibility(View.GONE);
		bvladimir.setVisibility(View.GONE);
		bvolibear.setVisibility(View.VISIBLE);
		bwarwick.setVisibility(View.VISIBLE);
		bwukong.setVisibility(View.VISIBLE);
		bxerath.setVisibility(View.GONE);
		bxinzhao.setVisibility(View.VISIBLE);
		byasuo.setVisibility(View.VISIBLE);
		byorick.setVisibility(View.VISIBLE);
		bzac.setVisibility(View.VISIBLE);
		bzed.setVisibility(View.VISIBLE);
		bziggs.setVisibility(View.GONE);
		bzilean.setVisibility(View.GONE);
		bzyra.setVisibility(View.GONE);
		
	}
	
	public void ordenarHechicero(){
		
		batrox.setVisibility(View.GONE);
		bahri.setVisibility(View.VISIBLE);
		bakali.setVisibility(View.GONE);
		balistar.setVisibility(View.GONE);
		bamumu.setVisibility(View.VISIBLE);
		banivia.setVisibility(View.VISIBLE);
		bannie.setVisibility(View.VISIBLE);
		bashe.setVisibility(View.GONE);
		bblits.setVisibility(View.GONE);
		bbrand.setVisibility(View.VISIBLE);
		bbraum.setVisibility(View.GONE);
		bcaitlyn.setVisibility(View.GONE);
		bcassiopeia.setVisibility(View.VISIBLE);
		bchogat.setVisibility(View.VISIBLE);
		bcorki.setVisibility(View.GONE);
		bdarius.setVisibility(View.GONE);
		bdiana.setVisibility(View.VISIBLE);
		bdrmundo.setVisibility(View.GONE);
		bdraven.setVisibility(View.GONE);
		belise.setVisibility(View.VISIBLE);
		bevelynn.setVisibility(View.VISIBLE);
		bezreal.setVisibility(View.VISIBLE);
		bfiddlesticks.setVisibility(View.VISIBLE);
		bfiora.setVisibility(View.GONE);
		bfizz.setVisibility(View.GONE);
		bgalio.setVisibility(View.VISIBLE);
		bgangplank.setVisibility(View.GONE);
		bgaren.setVisibility(View.GONE);
		bgragas.setVisibility(View.VISIBLE);
		bgraves.setVisibility(View.GONE);
		bhecarim.setVisibility(View.GONE);
		bheirmerdinger.setVisibility(View.VISIBLE);
		birelia.setVisibility(View.GONE);
		bjanna.setVisibility(View.VISIBLE);
		bjarvaniv.setVisibility(View.GONE);
		bjax.setVisibility(View.GONE);
		bjayce.setVisibility(View.GONE);
		bjinx.setVisibility(View.GONE);
		bkarma.setVisibility(View.VISIBLE);
		bkarthus.setVisibility(View.VISIBLE);
		bkassadin.setVisibility(View.VISIBLE);
		bkatarina.setVisibility(View.VISIBLE);
		bkayle.setVisibility(View.GONE);
		bkennen.setVisibility(View.VISIBLE);
		bkhazix.setVisibility(View.GONE);
		bkogmaw.setVisibility(View.VISIBLE);
		bleblanc.setVisibility(View.VISIBLE);
		bleesin.setVisibility(View.GONE);
		bleona.setVisibility(View.GONE);
		blissandra.setVisibility(View.VISIBLE);
		blucian.setVisibility(View.GONE);
		blulu.setVisibility(View.VISIBLE);
		blux.setVisibility(View.VISIBLE);
		bmaestroyi.setVisibility(View.GONE);
		bmalphite.setVisibility(View.GONE);
		bmalsahar.setVisibility(View.VISIBLE);
		bmaokai.setVisibility(View.VISIBLE);
		bmissfortune.setVisibility(View.GONE);
		bmordekaiser.setVisibility(View.VISIBLE);
		bmorgana.setVisibility(View.VISIBLE);
		bnami.setVisibility(View.VISIBLE);
		bnasus.setVisibility(View.GONE);
		bnautilus.setVisibility(View.GONE);
		bnidalee.setVisibility(View.GONE);
		bnocturne.setVisibility(View.GONE);
		bnunu.setVisibility(View.GONE);
		bolaf.setVisibility(View.GONE);
		borianna.setVisibility(View.VISIBLE);
		bpantheon.setVisibility(View.GONE);
		bpoppy.setVisibility(View.GONE);
		bquinn.setVisibility(View.GONE);
		brammus.setVisibility(View.GONE);
		brenekton.setVisibility(View.GONE);
		brengar.setVisibility(View.GONE);
		briven.setVisibility(View.GONE);
		brumble.setVisibility(View.VISIBLE);
		brise.setVisibility(View.VISIBLE);
		bsejuani.setVisibility(View.GONE);
		bshaco.setVisibility(View.GONE);
		bshen.setVisibility(View.GONE);
		bshyvana.setVisibility(View.GONE);
		bsinged.setVisibility(View.GONE);
		bsion.setVisibility(View.VISIBLE);
		bsivir.setVisibility(View.GONE);
		bskarner.setVisibility(View.GONE);
		bsona.setVisibility(View.VISIBLE);
		bsoraka.setVisibility(View.VISIBLE);
		bswain.setVisibility(View.VISIBLE);
		bsyndra.setVisibility(View.VISIBLE);
		btalon.setVisibility(View.GONE);
		btaric.setVisibility(View.GONE);
		bteemo.setVisibility(View.GONE);
		bthresh.setVisibility(View.GONE);
		btristana.setVisibility(View.GONE);
		btrundle.setVisibility(View.GONE);
		btryndamare.setVisibility(View.GONE);
		btwistedfate.setVisibility(View.VISIBLE);
		btwitch.setVisibility(View.GONE);
		budyr.setVisibility(View.GONE);
		burgot.setVisibility(View.GONE);
		bvarus.setVisibility(View.VISIBLE);
		bvayne.setVisibility(View.GONE);
		bveigar.setVisibility(View.VISIBLE);
		bvelkos.setVisibility(View.VISIBLE);
		bvi.setVisibility(View.GONE);
		bviktor.setVisibility(View.VISIBLE);
		bvladimir.setVisibility(View.VISIBLE);
		bvolibear.setVisibility(View.GONE);
		bwarwick.setVisibility(View.GONE);
		bwukong.setVisibility(View.GONE);
		bxerath.setVisibility(View.VISIBLE);
		bxinzhao.setVisibility(View.GONE);
		byasuo.setVisibility(View.GONE);
		byorick.setVisibility(View.VISIBLE);
		bzac.setVisibility(View.GONE);
		bzed.setVisibility(View.GONE);
		bziggs.setVisibility(View.VISIBLE);
		bzilean.setVisibility(View.VISIBLE);
		bzyra.setVisibility(View.VISIBLE);			
		
	}
	
	public void ordenarSoporte(){
		
	}
	
	public void ordenarTanque(){
		
	}
	
	public void ordenarTirador(){
		
	}
	
	/* Termina el metodo de ordenamiento */
	
	
	
	/* Llamadas a los layouts desde el boton de cada */
	public void aatrox(View v){
		Intent i = new Intent(this, Aatrox.class);
		startActivity(i);
	}
}
