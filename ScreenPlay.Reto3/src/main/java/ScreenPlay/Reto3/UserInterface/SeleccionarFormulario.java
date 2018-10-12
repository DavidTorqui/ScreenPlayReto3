package ScreenPlay.Reto3.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("http://automatizacion.herokuapp.com/pperez/")
public class SeleccionarFormulario extends PageObject{
	
	public static final Target AGREGAR_DOCTOR = Target.the("INGRESA AL FORMULARIO DE AGREGAR DOCTOR")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[1]"));
	
	public static final Target AGREGAR_PACIENTE = Target.the("INGRESA AL FORMULARIO DE AGREGAR PACIENTE")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[2]"));
	
	public static final Target AGREGAR_CITA = Target.the("INGRESA AL FORMULARIO DE AGENDAR CITA")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[6]"));
}
