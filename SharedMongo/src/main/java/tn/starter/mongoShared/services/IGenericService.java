package tn.starter.mongoShared.services;

import java.util.List;

public interface IGenericService<T> {
	T add(T dto);
	T update(T dto);
	T retrieveById(String id);
	List<T> retrieveAll();
	void delete(String id);
}
