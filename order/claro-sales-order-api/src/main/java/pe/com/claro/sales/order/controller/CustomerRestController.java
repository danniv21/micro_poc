package pe.com.claro.sales.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.com.claro.common.resource.exception.EntityNotFoundException;
import pe.com.claro.sales.order.domain.service.CustomerService;
import pe.com.claro.sales.order.model.Customer;


@Controller
@RequestMapping("/api/customer")
class CustomerRestController {
	
	
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/{customerId}")
    @ResponseBody
	Customer search(@PathVariable("customerId") Long customerId) throws EntityNotFoundException {
		
		return customerService.getPostCustomer(customerId);
	}
}
