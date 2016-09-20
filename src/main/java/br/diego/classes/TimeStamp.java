package br.diego.classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeStamp {

	// pego no javafree...
	//	
	//	SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy");  
	//	SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");  
	//
	//	public String data = "";  
	//	public String hora = "";  
	//
	//	data = sdfData.format(new Date());  
	//	hora = sdfHora.format(new Date());

	//pego no guj 1

	Locale locale = new Locale("pt","BR");
	private SimpleDateFormat formatador;
	private Date buscador;
	//GregorianCalendar calendar = new GregorianCalendar();
	//dividir o horário:
	public String pegaData(){
		buscador = new Date(System.currentTimeMillis());
		formatador = new SimpleDateFormat("dd-mm-yyyy",locale);
		return formatador.format(buscador);
	}
	public String pegaHora(){
		buscador = new Date(System.currentTimeMillis());
		formatador = new SimpleDateFormat("HH:MM",locale);
		return formatador.format(buscador);
	}


	//System.out.print(formatador.format(calendar.getTime()));

	//pego no guj 2

	//	private String data = "dd/MM/yyyy";
	//	private String hora = "h:mm - a";
	//	private String data1, hora1;
	//	private Date agora = new Date();
	//	public SimpleDateFormat formata = new SimpleDateFormat(data);
	//
	//	data1 = formata.format(agora);
	//	formata = new SimpleDateFormat(hora);
	//	hora1 = formata.format(agora);
	//	System.out.print(data1+" ");
	//	System.out.print(hora1+" ");


}
