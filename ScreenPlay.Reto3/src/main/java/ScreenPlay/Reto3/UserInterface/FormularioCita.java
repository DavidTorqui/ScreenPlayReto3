package ScreenPlay.Reto3.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioCita extends PageObject  {
	
	public static final Target FECHA_CITA = Target.the("INGRESA EL CAMPO FECHA DE CITA")
			.located(By.xpath("//*[@id=\"datepicker\"]"));
	
	public static final Target VACIO  = Target.the("DA CLICK EN EL VACIO PARA QUE SE OCULTE EL CALENDARIO")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]"));
	
	public static final Target DOCUMENTO_PACIENTE = Target.the("INGRESA EL DOCUMENTO DEL PACIENTE")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input"));
	
	public static final Target DOCUMENTO_DOCTOR = Target.the("INGRESA EL DOCUMENTO DEL DOCTOR")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input"));
	
	public static final Target OBSERVACION = Target.the("INGRESA LA OBSERVACION")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/textarea"));
	
	public static final Target BOTON_GUARDAR_CITA = Target.the("BOTON DE GUARDAR CITA")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/a"));
	
	public static final Target VERIFICAR_CITA = Target.the("VERIFICAR SI GUARDO LA CITA CORRECTAMENTE")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]"));
}