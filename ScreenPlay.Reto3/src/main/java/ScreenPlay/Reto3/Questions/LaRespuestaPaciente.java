package ScreenPlay.Reto3.Questions;

import ScreenPlay.Reto3.UserInterface.FormularioPaciente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuestaPaciente  implements Question<String> {

	public static LaRespuestaPaciente es() {
		return new LaRespuestaPaciente();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(FormularioPaciente.VERIFICAR_INGRESO_PACIENTE).viewedBy(actor).asString();
	}
}
