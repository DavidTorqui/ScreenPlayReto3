package ScreenPlay.Reto3.StepDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import ScreenPlay.Reto3.Model.DatosCita;
import ScreenPlay.Reto3.Model.DatosDoctor;
import ScreenPlay.Reto3.Model.DatosPaciente;
import ScreenPlay.Reto3.Questions.LaRespuestaCita;
import ScreenPlay.Reto3.Questions.LaRespuestaDoctor;
import ScreenPlay.Reto3.Questions.LaRespuestaPaciente;
import ScreenPlay.Reto3.Tasks.Abrir;
import ScreenPlay.Reto3.Tasks.LlenarFormularioCita;
import ScreenPlay.Reto3.Tasks.LlenarFormularioDoctor;
import ScreenPlay.Reto3.Tasks.LlenarFormularioPaciente;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistroDoctor {
	
	@Managed (driver="chrome")
	private WebDriver hisBrowser;
	private Actor david = Actor.named("David");
	
	@Before
	public void configuracionInicial() {
		david.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que david necesita registrar un nuevo doctor$")
	public void queDavidNecesitaRegistrarUnNuevoDoctor(){
		david.wasAbleTo(Abrir.lapaginaweb());
		}
	
	@Dado("^que david necesita registrar un nuevo paciente$")
	public void queDavidNecesitaRegistrarUnNuevoPaciente() {
	    david.wasAbleTo(Abrir.lapaginaweb());
	}
	
	@Dado("^que david necesita registrar una cita$")
	public void queDavidNecesitaRegistrarUnaCita() {
		david.wasAbleTo(Abrir.lapaginaweb());
	 }

	@Cuando("^el realiza el registro del mismo en el aplicativo de Administracion de Hospitales$")
	public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministracionDeHospitales(List<DatosDoctor> automaticamente) {
		david.attemptsTo(LlenarFormularioDoctor.datosdoctor(automaticamente));
	}
	
	@Cuando("^el realiza el registro del mismo en el aplicativo de Administracion de Hospitales paciente$")
	public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministracionDeHospitalesPaciente(List<DatosPaciente> automaticamentepaciente) {
		david.attemptsTo(LlenarFormularioPaciente.datospaciente(automaticamentepaciente));
	}
	
	@Cuando("^el realiza el registro del mismo en el aplicativo de Administracion de Hospitales cita$")
	public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministracionDeHospitalescita(List<DatosCita> automaticamentecita) {
		david.attemptsTo(LlenarFormularioCita.datoscita(automaticamentecita));
	}

	@Entonces("^el verifica que se presente en pantalla el mensaje (.*)$")
	public void elVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(String registrodoctor)  {
		david.should(seeThat(LaRespuestaDoctor.es(),equalTo(registrodoctor)));
	 }
	
	@Entonces("^el verifica que se presente en pantalla el mensaje paciente (.*)$")
	public void elVerificaQueSePresenteEnPantallaElMensajepacienteDatosGuardadosCorrectamente(String registropaciente)  {
		david.should(seeThat(LaRespuestaPaciente.es(),equalTo(registropaciente)));
	 }
	
	@Entonces("^el verifica que se presente en pantalla el mensaje cita (.*)$")
	public void elVerificaQueSePresenteEnPantallaElMensajecitaDatosGuardadosCorrectamente(String reservolacita)  {
		david.should(seeThat(LaRespuestaCita.es(),equalTo(reservolacita)));
	 }
}