package ScreenPlay.Reto3.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioDoctor extends PageObject{
	
	public static final Target NOMBRE = Target.the("INGRESA AL FORMULARIO DE NOMBRE DOCTOR")
			.located(By.xpath("//*[@id=\"name\"]"));
	
	public static final Target APELLIDO = Target.the("INGRESA AL FORMULARIO DE APELLIDO DOCTOR")
			.located(By.xpath("//*[@id=\"last_name\"]"));
	
	public static final Target TELEFONOS = Target.the("INGRESA AL FORMULARIO DE TELEFONO DOCTOR")
			.located(By.xpath("//*[@id=\"telephone\"]"));
	
	public static final Target TIPO_DOCUMENTO = Target.the("INGRESA AL FORMULARIO DE TIPO DOCUMENTO DOCTOR")
			.located(By.xpath("//*[@id=\"identification_type\"]"));
	
	public static final Target DOCUMENTO_IDENTIDAD = Target.the("INGRESA AL FORMULARIO DE DOCUMENTO DE IDENTIDAD DOCTOR")
			.located(By.xpath("//*[@id=\"identification\"]"));
	
	public static final Target GUARDAR_DOCTOR = Target.the("BOTON GUARDAR ")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/a"));

	public static final Target VERIFICAR_INGRESO_DOCTOR = Target.the("MUESTRA EL MENSAJE DE GUARDADO EXITOSO DOCTOR ")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]"));
	
	public static final Target BOTON_INICIO = Target.the("VA A LA PANTALLA DE INICIO")
			.located(By.xpath("//*[@id=\"wrapper\"]/nav/div/a"));
}
