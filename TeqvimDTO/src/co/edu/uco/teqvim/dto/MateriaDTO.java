package co.edu.uco.teqvim.dto;

import java.util.UUID;
import java.util.List;

import co.edu.uco.teqvim.crosscutting.utils.UtilNumber;
import co.edu.uco.teqvim.crosscutting.utils.UtilObject;
import co.edu.uco.teqvim.crosscutting.utils.UtilText;
import co.edu.uco.teqvim.crosscutting.utils.UtilUUID;

public class MateriaDTO {

	private UUID identificador;
	private String nombre;
	private int creditos;
	private PeriodoAcademicoDTO periodoAcademico;
	private List<NotaDTO> notas;

	public MateriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setCreditos(UtilNumber.ZERO_INT);
		setPeriodoAcademico(PeriodoAcademicoDTO.create());
	}

	public MateriaDTO(UUID identificador, String nombre, int creditos, PeriodoAcademicoDTO periodoAcademico, List<NotaDTO> notas) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setCreditos(creditos);
		setPeriodoAcademico(periodoAcademico);
		setNotas(notas);
	}
	
	public static MateriaDTO create() {
		return new MateriaDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final MateriaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final String getNombre() {
		return nombre;
	}

	public final MateriaDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}

	public final int getCreditos() {
		return creditos;
	}

	public final MateriaDTO setCreditos(final int creditos) {
		this.creditos = creditos;
		return this;
	}

	public final PeriodoAcademicoDTO getPeriodoAcademico() {
		return periodoAcademico;
	}

	public final MateriaDTO setPeriodoAcademico(final PeriodoAcademicoDTO periodoAcademico) {
		this.periodoAcademico = UtilObject.getDefault(periodoAcademico, PeriodoAcademicoDTO.create());
		return this;
	}

	public final List<NotaDTO> getNotas() {
		return notas;
	}

	public final MateriaDTO setNotas(List<NotaDTO> notas) {
		this.notas = notas;
		return this;
	}
}