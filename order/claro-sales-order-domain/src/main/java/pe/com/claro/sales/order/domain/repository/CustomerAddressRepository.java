package pe.com.claro.sales.order.domain.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pe.com.claro.sales.order.model.CustomerAddress;

@Repository
@Transactional
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Long> {
	//List<Direccion> findByOriginAndDestinationAndFlightDate(String origin,String destination, String flightDate);
	//Direccion findByFlightNumberAndFlightDate(String flightNumber, String flightDate);
} 