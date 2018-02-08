package pe.com.claro.sales.order.domain.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.claro.common.resource.exception.NotFoundException;
import pe.com.claro.sales.order.domain.repository.CustomerRepository;
import pe.com.claro.sales.order.model.Customer;

@Service
public class CustomerService {
	private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);
	@Autowired
	private CustomerRepository customerRepository;

	// @Cacheable(value = CACHE_NAME_TAGS, key =
	// "#post.id.toString().concat('-tags')")
	public Customer getPostCustomer(Long customerId) {

		logger.debug("Get post " + customerId);
       
		Customer customer = customerRepository.findOne(customerId);

		if (customer == null) {
			throw new NotFoundException("Post with id " + customer + " is not found.");
		}

		return customer;
	}

}
