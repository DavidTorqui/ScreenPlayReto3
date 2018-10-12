package ScreenPlay.Reto3.Tasks;

import java.util.List;

import ScreenPlay.Reto3.Model.DatosCita;
import ScreenPlay.Reto3.UserInterface.FormularioCita;
import ScreenPlay.Reto3.UserInterface.SeleccionarFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class LlenarFormularioCita implements Task{
	
private List<DatosCita> datoscita;
	
	public LlenarFormularioCita(List<DatosCita> registroformulario) {
        super();
        this.datoscita = registroformulario;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	actor.attemptsTo(Click.on(SeleccionarFormulario.AGREGAR_CITA));
	actor.attemptsTo(Enter.theValue(datoscita.get(0).getFechaCita()).into(FormularioCita.FECHA_CITA));
	actor.attemptsTo(Click.on(FormularioCita.VACIO));
	actor.attemptsTo(Enter.theValue(datoscita.get(0).getDocumentoPaciente()).into(FormularioCita.DOCUMENTO_PACIENTE));
	actor.attemptsTo(Enter.theValue(datoscita.get(0).getDocumentoDoctor()).into(FormularioCita.DOCUMENTO_DOCTOR));
	actor.attemptsTo(Enter.theValue(datoscita.get(0).getObservacion()).into(FormularioCita.OBSERVACION));
	actor.attemptsTo(Click.on(FormularioCita.BOTON_GUARDAR_CITA));
	}
	
	public static LlenarFormularioCita datoscita(List<DatosCita> registroAutomaticocita) {
		return Tasks.instrumented(LlenarFormularioCita.class, registroAutomaticocita);
	}
}