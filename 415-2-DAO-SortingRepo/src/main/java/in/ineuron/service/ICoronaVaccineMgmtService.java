package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import in.ineuron.bo.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	
	
	/*
	 * public interface PagingAndSortingRepository<T, ID> extends CrudRepository<T,ID> {
	 *  Iterable<T> findAll(Sort sort);
	 *  Page<T> findAll(Pageable pageable); }
	 */
	
	
	public Iterable<CoronaVaccine> fetchDetails(boolean asc, String... properties);
	
}