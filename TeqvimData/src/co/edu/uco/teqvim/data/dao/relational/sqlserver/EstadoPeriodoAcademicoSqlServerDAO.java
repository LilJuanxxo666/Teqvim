package co.edu.uco.teqvim.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.teqvim.data.dao.EstadoPeriodoAcademicoDAO;
import co.edu.uco.teqvim.entities.EstadoPeriodoAcademicoEntity;

public final class EstadoPeriodoAcademicoSqlServerDAO implements EstadoPeriodoAcademicoDAO {

	public EstadoPeriodoAcademicoSqlServerDAO(final Connection connection) {

	}

	@Override
	public List<EstadoPeriodoAcademicoEntity> read(EstadoPeriodoAcademicoEntity entity) {
		return null;
	}

}
