package ScreenPlay.Reto3.Tasks;

import java.util.List;

import ScreenPlay.Reto3.Model.DatosDoctor;
import ScreenPlay.Reto3.UserInterface.FormularioDoctor;
import ScreenPlay.Reto3.UserInterface.SeleccionarFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class LlenarFormularioDoctor implements Task{
	
	private List<DatosDoctor> datosdoctor;
	
	public LlenarFormularioDoctor(List<DatosDoctor> registroformulario) {
        super();
        this.datosdoctor = registroformulario;
	}

	
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionarFormulario.AGREGAR_DOCTOR));
		actor.attemptsTo(Enter.theValue(datosdoctor.get(0).getNombre()).into(FormularioDoctor.NOMBRE));
		actor.attemptsTo(Enter.theValue(datosdoctor.get(0).getApellido()).into(FormularioDoctor.APELLIDO));
		actor.attemptsTo(Enter.theValue(datosdoctor.get(0).getTelefono()).into(FormularioDoctor.TELEFONOS));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datosdoctor.get(0).getTipoDocumento()).from(FormularioDoctor.TIPO_DOCUMENTO));
		actor.attemptsTo(Enter.theValue(datosdoctor.get(0).getDocumentoIdentidad()).into(FormularioDoctor.DOCUMENTO_IDENTIDAD));
		actor.attemptsTo(Click.on(FormularioDoctor.GUARDAR_DOCTOR));
	}
	
	public static LlenarFormularioDoctor datosdoctor(List<DatosDoctor> registroformulario) {
		return Tasks.instrumented(LlenarFormularioDoctor.class, registroformulario);
	}
}
