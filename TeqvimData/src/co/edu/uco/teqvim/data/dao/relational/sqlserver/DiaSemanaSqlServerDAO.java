package co.edu.uco.teqvim.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.teqvim.data.dao.DiaSemanaDAO;
import co.edu.uco.teqvim.entities.DiaSemanaEntity;

public final class DiaSemanaSqlServerDAO implements DiaSemanaDAO{
	
	public DiaSemanaSqlServerDAO(final Connection connection) {

	}

	@Override
	public void create(DiaSemanaEntity entity) {
		
	}

	@Override
	public List<DiaSemanaEntity> read(DiaSemanaEntity entity) {
		return null;
	}

	@Override
	public void update(DiaSemanaEntity entity) {
		
	}

	@Override
	public void delete(DiaSemanaEntity entity) {
		
	}

}
