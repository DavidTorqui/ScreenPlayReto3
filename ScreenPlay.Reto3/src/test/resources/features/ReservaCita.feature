#language:es
#Author: your.email@your.domain.com

@tag
Característica: Gestionar cita medica
  		Como paciente
  		Quiero realizar una cita medica
  		A traves del sistema de Administracion de Hospitales

  @tag1
  Escenario: Registar el registro de un Doctor
    Dado que david necesita registrar un nuevo doctor
    Cuando el realiza el registro del mismo en el aplicativo de Administracion de Hospitales 
    | nombre | apellido | telefono	 | tipoDocumento  | documentoIdentidad |
		| David  | Torres	  | 3202411094 | Pasaportes	    | 623445699  			 | 
    Entonces el verifica que se presente en pantalla el mensaje Datos guardados correctamente.
    
  @tag2
  Escenario: Realizar el registro de un paciente
    Dado que david necesita registrar un nuevo paciente
    Cuando el realiza el registro del mismo en el aplicativo de Administracion de Hospitales paciente
 		| nombrepaciente | apellidopaciente | telefonopaciente	 | tipoDocumentopaciente  | documentoIdentidadpaciente |
		| David  				 | Torres	  				| 3202411094 				 | Pasaportes	  				  | 643521122 		 					 | 
    Entonces el verifica que se presente en pantalla el mensaje paciente Datos guardados correctamente.
    
 	@tag3
  Escenario: Realizar el registro de una cita
    Dado que david necesita registrar una cita
    Cuando el realiza el registro del mismo en el aplicativo de Administracion de Hospitales cita
 		| fechaCita    | documentoPaciente | documentoDoctor	 | observacion  			| 
		| 03-04-2019	 | 643521122	  		     | 623445699 				     | Cita de la Prostata	| 
    Entonces el verifica que se presente en pantalla el mensaje cita Datos guardados correctamente.
    
   
    
