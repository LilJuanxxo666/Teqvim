package co.edu.uco.teqvim.api.validator.estudiante.common;

import co.edu.uco.teqvim.api.validator.Result;
import co.edu.uco.teqvim.api.validator.Validation;
import co.edu.uco.teqvim.crosscutting.utils.Messages.EstudianteValidatorMessage;
import co.edu.uco.teqvim.crosscutting.utils.UtilText;

public class NumeroTelefonicoValidation implements Validation<String>{
	
	private NumeroTelefonicoValidation() {
		super();
	}

	public static Result validate(String data) {
		return new NumeroTelefonicoValidation().execute(data);
	}

	@Override
	public Result execute(String data) {
		Result result = Result.create();

		if (UtilText.getUtilText().isEmpty(data)) {
			result.addMessage(EstudianteValidatorMessage.NUMERO_TELEFONO_EMPTY_MESSAGE);
		}
		else if (UtilText.getUtilText().applyTrim(data).length() > 15) {
			result.addMessage(EstudianteValidatorMessage.NUMERO_TELEFONO_LENGTH_MESSAGE);
		}
		return result;
	}

}
