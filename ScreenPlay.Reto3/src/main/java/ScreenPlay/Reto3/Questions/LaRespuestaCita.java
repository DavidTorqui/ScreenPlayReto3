package ScreenPlay.Reto3.Questions;

import ScreenPlay.Reto3.UserInterface.FormularioCita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuestaCita  implements Question<String> {

	public static LaRespuestaCita es() {
		return new LaRespuestaCita();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(FormularioCita.VERIFICAR_CITA).viewedBy(actor).asString();
	}
}