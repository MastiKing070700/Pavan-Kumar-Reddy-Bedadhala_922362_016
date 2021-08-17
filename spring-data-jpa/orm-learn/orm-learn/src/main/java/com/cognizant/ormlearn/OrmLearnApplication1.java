package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;

@SpringBootApplication
public class OrmLearnApplication1 {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	// private static StockService stockService;
	//@Autowired
	private static StockRepository stockRepository;

	public static void main(String[] args) {
		//stock-data application
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		LOGGER.info("Start");
		LOGGER.info("Application started.........");
		stockRepository = context.getBean(StockRepository.class);
		// List<Stock> list = stockService.getAllStock("FB", 9, 2019);
		// LOGGER.info("Stock List:{}",list);
		// List<Stock> stockList = stockRepository.findStockByCodeAndMonthAndYear("FB",
		// 9, 2019);
//		List<Stock> stockList = stockRepository.findGoogleStockByNameAndPrice("GOOGL");
//		LOGGER.info("Stock List:{}", stockList);
//		List<Stock> stockList = stockRepository.findStockByVolume(Sort.by("volume").descending());
//		LOGGER.info("Stock List:{}", stockList);
		Pageable pageable = PageRequest.of(0, 3, Sort.by("volume").descending());
		List<Stock> stockList = stockRepository.findThreeHighestVolumeStock(pageable);
		LOGGER.info("Stock List:{}", stockList);
		LOGGER.info("End");
	}
}

/* country application
 * public static void main(String[] args) { ApplicationContext context =
 * SpringApplication.run(OrmLearnApplication.class, args);
 * LOGGER.info("Application started........."); service =
 * context.getBean(CountryService.class); testGetAllCountries(); //
 * testAddCountry(); // testUpdateCountry(); // testDeleteCountry(); }
 * 
 * private static void testGetAllCountries() { LOGGER.info("Start");
 * //List<Country> countryList = service.getAllCountries(); List<Country>
 * countryList = service.getAllCountry("ou"); LOGGER.debug("countries={}",
 * countryList); // try { // Country country = service.findCountryByCode("IN");
 * // LOGGER.info("countries={}", country); // } catch (CountryNotFoundException
 * e) { // LOGGER.error(e.getMessage()); // } LOGGER.info("End"); }
 * 
 * public static void testAddCountry() { LOGGER.info("Start"); Country country =
 * new Country("MM", "New Country"); service.addCountry(country);
 * LOGGER.info("End"); }
 * 
 * public static void testUpdateCountry() { LOGGER.info("Start"); try {
 * service.updateCountry("MM", "New Country Modified"); } catch
 * (CountryNotFoundException e) { LOGGER.error(e.getMessage()); }
 * LOGGER.info("End"); }
 * 
 * public static void testDeleteCountry() { LOGGER.info("Start");
 * service.deleteCountry("MM"); LOGGER.info("End"); } }
 */
