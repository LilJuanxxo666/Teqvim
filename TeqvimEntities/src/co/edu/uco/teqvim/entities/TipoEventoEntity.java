package co.edu.uco.teqvim.entities;

import java.util.UUID;

import co.edu.uco.teqvim.crosscutting.utils.UtilText;
import co.edu.uco.teqvim.crosscutting.utils.UtilUUID;

public class TipoEventoEntity {

	private static final TipoEventoEntity DEFAULT_OBJECT = new TipoEventoEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;

	private TipoEventoEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
	}

	public TipoEventoEntity(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public static final TipoEventoEntity createWithIdentificador(final UUID identificador) {
		return new TipoEventoEntity(identificador, UtilText.EMPTY, UtilText.EMPTY);
	}

	public static final TipoEventoEntity createWithNombre(final String nombre) {
		return new TipoEventoEntity(UtilUUID.DEFAULT_UUID, nombre, UtilText.EMPTY);
	}

	public static TipoEventoEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final String getNombre() {
		return nombre;
	}

	private final void setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	}

	public final String getDescripcion() {
		return descripcion;
	}

	private final void setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
	}

}
