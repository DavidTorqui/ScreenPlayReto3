package ScreenPlay.Reto3.Tasks;

import ScreenPlay.Reto3.UserInterface.SeleccionarFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	
	private SeleccionarFormulario registroformulariodoctor;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(registroformulariodoctor));
	}

	public static Performable lapaginaweb() {
		return Tasks.instrumented(Abrir.class);
	}
}
