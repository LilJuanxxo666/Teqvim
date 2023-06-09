package co.edu.uco.teqvim.entities;

import java.util.UUID;

import co.edu.uco.teqvim.crosscutting.utils.UtilNumber;
import co.edu.uco.teqvim.crosscutting.utils.UtilObject;
import co.edu.uco.teqvim.crosscutting.utils.UtilText;
import co.edu.uco.teqvim.crosscutting.utils.UtilUUID;

public final class NotaEntity {

	private UUID identificador;
	private TipoNotaEntity tipoNota;
	private Double calificacion;
	private Double porcentaje; 
	private String descripcion;
	private MateriaEntity materia;

	private NotaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoNota(TipoNotaEntity.create());
		setCalificacion(UtilNumber.ZERO.doubleValue());
		setDescripcion(UtilText.EMPTY);
		setMateria(MateriaEntity.create());
		setPorcentaje(UtilNumber.ZERO.doubleValue());
	}

	public NotaEntity(UUID identificador, TipoNotaEntity tipoNota, Double calificacion, String descripcion, MateriaEntity materia, Double porcentaje) {
		super();
		setIdentificador(identificador);
		setTipoNota(tipoNota);
		setCalificacion(calificacion);
		setDescripcion(descripcion);
		setMateria(materia);
		setPorcentaje(porcentaje);
	}

	public static NotaEntity create() {
		return new NotaEntity();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final NotaEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final TipoNotaEntity getTipoNota() {
		return tipoNota;
	}

	public final NotaEntity setTipoNota(final TipoNotaEntity tipoNota) {
		this.tipoNota = UtilObject.getDefault(tipoNota, TipoNotaEntity.create());
		return this;
	}

	public final Double getCalificacion() {
		return calificacion;
	}

	public final NotaEntity setCalificacion(final Double calificacion) {
		this.calificacion = UtilNumber.getUtilNumber().getDefault(calificacion).doubleValue();
		return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final NotaEntity setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

	public final MateriaEntity getMateria() {
		return materia;
	}

	public final NotaEntity setMateria(final MateriaEntity materia) {
		this.materia = UtilObject.getDefault(materia, MateriaEntity.create());
		return this;
	}

	public final Double getPorcentaje() {
		return porcentaje;
	}

	public final NotaEntity setPorcentaje(final Double porcentaje) {
		this.porcentaje = UtilNumber.getUtilNumber().getDefault(porcentaje).doubleValue();
		return this;
	}
	
}
