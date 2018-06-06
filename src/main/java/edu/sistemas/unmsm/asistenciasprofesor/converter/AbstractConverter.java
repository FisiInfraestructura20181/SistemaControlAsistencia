package edu.sistemas.unmsm.asistenciasprofesor.converter;

public abstract class AbstractConverter <E, M> {

	public abstract E modelToEntity(M m);
	
	public abstract M entityToModel(E e);
}
