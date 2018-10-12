package ScreenPlay.Reto3.Tasks;

import java.util.List;

import ScreenPlay.Reto3.Model.DatosPaciente;
import ScreenPlay.Reto3.UserInterface.FormularioPaciente;
import ScreenPlay.Reto3.UserInterface.SeleccionarFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class LlenarFormularioPaciente implements Task {
	
private List<DatosPaciente> datospaciente;
	
	public LlenarFormularioPaciente(List<DatosPaciente> registroformulario) {
        super();
        this.datospaciente = registroformulario;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionarFormulario.AGREGAR_PACIENTE));
		actor.attemptsTo(Enter.theValue(datospaciente.get(0).getNombrepaciente()).into(FormularioPaciente.NOMBRE));
		actor.attemptsTo(Enter.theValue(datospaciente.get(0).getApellidopaciente()).into(FormularioPaciente.APELLIDO));
		actor.attemptsTo(Enter.theValue(datospaciente.get(0).getTelefonopaciente()).into(FormularioPaciente.TELEFONOS));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datospaciente.get(0).getTipoDocumentopaciente()).from(FormularioPaciente.TIPO_DOCUMENTO));
		actor.attemptsTo(Enter.theValue(datospaciente.get(0).getDocumentoIdentidadpaciente()).into(FormularioPaciente.DOCUMENTO_IDENTIDAD));
		actor.attemptsTo(Click.on(FormularioPaciente.SELECCIONAR_PREPAGADA));
		actor.attemptsTo(Click.on(FormularioPaciente.GUARDAR_PACIENTE));
	}

	public static LlenarFormularioPaciente datospaciente(List<DatosPaciente> registroAutomaticopaciente) {
		return Tasks.instrumented(LlenarFormularioPaciente.class, registroAutomaticopaciente);
	}
}