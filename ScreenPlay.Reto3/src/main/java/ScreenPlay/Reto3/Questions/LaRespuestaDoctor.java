package ScreenPlay.Reto3.Questions;

import ScreenPlay.Reto3.UserInterface.FormularioDoctor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuestaDoctor  implements Question<String> {

	public static LaRespuestaDoctor es() {
		return new LaRespuestaDoctor();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(FormularioDoctor.VERIFICAR_INGRESO_DOCTOR).viewedBy(actor).asString();
	}
}
