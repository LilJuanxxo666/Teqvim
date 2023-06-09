package co.edu.uco.teqvim.business.assembler.concrete;

import java.util.List;

import co.edu.uco.teqvim.business.assembler.Assembler;
import co.edu.uco.teqvim.business.domain.PeriodoAcademicoDomain;
import co.edu.uco.teqvim.dto.PeriodoAcademicoDTO;
import co.edu.uco.teqvim.entities.PeriodoAcademicoEntity;

public class PeriodoAcademicoAssembler
		implements Assembler<PeriodoAcademicoDomain, PeriodoAcademicoDTO, PeriodoAcademicoEntity> {

	private static final Assembler<PeriodoAcademicoDomain, PeriodoAcademicoDTO, PeriodoAcademicoEntity> INSTANCE = new PeriodoAcademicoAssembler();

	private PeriodoAcademicoAssembler() {
		super();
	}

	public static Assembler<PeriodoAcademicoDomain, PeriodoAcademicoDTO, PeriodoAcademicoEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public PeriodoAcademicoDTO toDtoFromDomain(PeriodoAcademicoDomain domain) {
		return PeriodoAcademicoDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre())
				.setFechaInicio(domain.getFechaInicio()).setFechaFin(domain.getFechaFin())
				.setTipoPeriodo(TipoPeriodoAcademicoAssembler.getInstance().toDtoFromDomain(domain.getTipoPeriodo()))
				.setEstado(EstadoPeriodoAcademicoAssembler.getInstance().toDtoFromDomain(domain.getEstado()))
				.setEstudiante(EstudianteAssembler.getInstance().toDtoFromDomain(domain.getEstudiante())).setPromedioPeriodo(domain.getPromedioPeriodo());
	}

	@Override
	public PeriodoAcademicoDomain toDomainFromDto(PeriodoAcademicoDTO dto) {
		return new PeriodoAcademicoDomain(dto.getIdentificador(), dto.getNombre(), dto.getFechaInicio(),
				dto.getFechaFin(), TipoPeriodoAcademicoAssembler.getInstance().toDomainFromDto(dto.getTipoPeriodo()),
				EstadoPeriodoAcademicoAssembler.getInstance().toDomainFromDto(dto.getEstado()),
				EstudianteAssembler.getInstance().toDomainFromDto(dto.getEstudiante()), dto.getPromedioPeriodo());
	}

	@Override
	public PeriodoAcademicoEntity toEntityFromDomain(PeriodoAcademicoDomain domain) {
		return new PeriodoAcademicoEntity(domain.getIdentificador(), domain.getNombre(), domain.getFechaInicio(),
				domain.getFechaFin(),
				TipoPeriodoAcademicoAssembler.getInstance().toEntityFromDomain(domain.getTipoPeriodo()),
				EstadoPeriodoAcademicoAssembler.getInstance().toEntityFromDomain(domain.getEstado()),
				EstudianteAssembler.getInstance().toEntityFromDomain(domain.getEstudiante()), domain.getPromedioPeriodo());
	}

	@Override
	public PeriodoAcademicoDomain toDomainFromEntity(PeriodoAcademicoEntity entity) {
		return new PeriodoAcademicoDomain(entity.getIdentificador(), entity.getNombre(), entity.getFechaInicio(),
				entity.getFechaFin(),
				TipoPeriodoAcademicoAssembler.getInstance().toDomainFromEntity(entity.getTipoPeriodo()),
				EstadoPeriodoAcademicoAssembler.getInstance().toDomainFromEntity(entity.getEstado()),
				EstudianteAssembler.getInstance().toDomainFromEntity(entity.getEstudiante()), entity.getPromedioPeriodo());
	}

	@Override
	public List<PeriodoAcademicoDomain> toDomainListFromEntityList(List<PeriodoAcademicoEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<PeriodoAcademicoDTO> toDTOListFromDomainList(List<PeriodoAcademicoDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}
