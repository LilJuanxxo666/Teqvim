package co.edu.uco.teqvim.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.teqvim.data.dao.UnidadTiempoDAO;
import co.edu.uco.teqvim.entities.UnidadTiempoEntity;

public final class UnidadTiempoSqlServerDAO implements UnidadTiempoDAO {

	public UnidadTiempoSqlServerDAO(final Connection connection) {

	}

	@Override
	public List<UnidadTiempoEntity> read(UnidadTiempoEntity entity) {
		return null;
	}

}
