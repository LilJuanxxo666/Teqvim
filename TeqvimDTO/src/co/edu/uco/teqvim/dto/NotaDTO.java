package co.edu.uco.teqvim.dto;

import java.util.UUID;

import co.edu.uco.teqvim.crosscutting.utils.UtilNumber;
import co.edu.uco.teqvim.crosscutting.utils.UtilObject;
import co.edu.uco.teqvim.crosscutting.utils.UtilText;
import co.edu.uco.teqvim.crosscutting.utils.UtilUUID;

public final class NotaDTO {

	private UUID identificador;
	private TipoNotaDTO tipoNota;
	private double calificacion;
	private String descripcion;
	
	public NotaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoNota(TipoNotaDTO.create());
		setCalificacion(UtilNumber.ZERO_DOUBLE);
		setDescripcion(UtilText.EMPTY);
	}

	public NotaDTO(UUID identificador, TipoNotaDTO tipoNota, double calificacion, String descripcion) {
		super();
		setIdentificador(identificador);
		setTipoNota(tipoNota);
		setCalificacion(calificacion);
		setDescripcion(descripcion);
	}
	
	public static NotaDTO create() {
		return new NotaDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final NotaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final TipoNotaDTO getTipoNota() {
		return tipoNota;
	}

	public final NotaDTO setTipoNota(final TipoNotaDTO tipoNota) {
		this.tipoNota = UtilObject.getDefault(tipoNota, TipoNotaDTO.create());
		return this;
	}

	public final double getCalificacion() {
		return calificacion;
	}

	public final NotaDTO setCalificacion(final double calificacion) {
		this.calificacion = calificacion;
		return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final NotaDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

}