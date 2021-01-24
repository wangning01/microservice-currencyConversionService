package snippet;

public class Snippet {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	  public ExchangeValue retrieveExchangeValue
	    (@PathVariable String from, @PathVariable String to){
	    
	    ExchangeValue exchangeValue = 
	        repository.findByFromAndTo(from, to);
	    
	    exchangeValue.setPort(
	        Integer.parseInt(environment.getProperty("local.server.port")));
	    
	    return exchangeValue;
	  }
}

