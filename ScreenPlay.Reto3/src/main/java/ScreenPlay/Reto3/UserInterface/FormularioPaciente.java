package ScreenPlay.Reto3.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioPaciente extends PageObject {
	
	public static final Target NOMBRE = Target.the("INGRESA AL FORMULARIO DE NOMBRE PACIENTE")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[1]/input"));
	
	public static final Target APELLIDO = Target.the("INGRESA AL FORMULARIO DE APELLIDO PACIENTE")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input"));
	
	public static final Target TELEFONOS = Target.the("INGRESA AL FORMULARIO DE TELEFONO PACIENTE")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input"));
	
	public static final Target TIPO_DOCUMENTO = Target.the("INGRESA AL FORMULARIO DE TIPO DOCUMENTO PACIENTE")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/select"));
	
	public static final Target DOCUMENTO_IDENTIDAD = Target.the("INGRESA AL FORMULARIO DE DOCUMENTO DE IDENTIDAD PACIENTE")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[5]/input"));
	
	public static final Target SELECCIONAR_PREPAGADA = Target.the("SELECCIONA EL CHECK LIST DE MEDICINA PREPAGADA")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[6]/label/input"));
	
	public static final Target GUARDAR_PACIENTE = Target.the("GUARDA EL FORMULARIO DEL PACIENTE")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/a"));
	
	public static final Target VERIFICAR_INGRESO_PACIENTE = Target.the("MUESTRA EL MENSAJE DE GUARDADO EXITOSO DEL PACIENTE")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]"));
}
