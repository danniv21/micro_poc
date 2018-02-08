package pe.com.claro.sales.order.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.com.claro.sales.order.model.Customer;


@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long> {
//	List<Customer> findByOriginAndDestinationAndFlightDate(String origin,String destination, String flightDate);
	//Customer findByFlightNumberAndFlightDate(String flightNumber, String flightDate);
} 