package pe.com.claro.sales.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.com.claro.sales.order.domain.service.CustomerService;
import pe.com.claro.sales.order.model.Customer;

//import com.brownfield.pss.search.component.SearchComponent;
//import com.brownfield.pss.search.entity.Flight;

@Controller
@RequestMapping("/api/customer")
class CustomerRestController {
	
	
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/{customerId}")
    @ResponseBody
	Customer search(@PathVariable("customerId") Long customerId){
		
		return customerService.getPostCustomer(customerId);
	}
}

	
	
	
	
/*	private static final Logger logger = LoggerFactory.getLogger(SearchComponent.class);
	TPMCounter tpm = new TPMCounter();

	private SearchComponent searchComponent;
	
	@Value("${orginairports.shutdown}")
	private String originAirportShutdownList;
	
	GaugeService gaugeService;

	
	@Autowired
	public SearchRestController(SearchComponent searchComponent, GaugeService gaugeService){
		this.gaugeService = gaugeService;
		this.searchComponent = searchComponent;
	}*/
	
	/*@RequestMapping(value="/get", method = RequestMethod.POST)
	List<Flight> search(@RequestBody SearchQuery query){
		logger.info("Input : "+ query);
		if(Arrays.asList(originAirportShutdownList.split(",")).contains(query.getOrigin())){
			logger.info("The origin airport is in shutdown state");
			return new ArrayList<Flight>();
		}
		tpm.increment();
		gaugeService.submit("tpm", tpm.count.intValue()); 
		
		return searchComponent.search(query);
	}
}*/


/*class TPMCounter {
	LongAdder count;
	Calendar expiry = null; 

	TPMCounter(){
		reset();
	}
	
	void reset (){
		count = new LongAdder();
		expiry = Calendar.getInstance();
		expiry.add(Calendar.MINUTE, 1);
	}
	
	boolean isExpired(){
		return Calendar.getInstance().after(expiry);
	}

	
	void increment(){
		 if(isExpired()){
			 reset();
		 }
		 count.increment();
	}*/
