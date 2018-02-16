package pe.com.claro.sales.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import pe.com.claro.common.resource.exception.EntityNotFoundException;
import pe.com.claro.sales.order.domain.service.CustomerService;
import pe.com.claro.sales.order.model.Customer;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/customers")
class CustomerRestController {
	
	
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/{customerId}",
    method = RequestMethod.GET,
    produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
	Customer search(@PathVariable Long customerId) throws EntityNotFoundException {
		
		return customerService.getPostCustomer(customerId);
	}
}
