package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bae.domain.AtmTransactionLocations;
import com.bae.domain.EposTransactionLocations;
import com.bae.domain.PeopleBankCard;

@RestController
@RequestMapping("/finance")
public class FinanceController extends Controller {

	private RestTemplate restTemplate;
	private JmsTemplate jmsTemplate;

	public FinanceController(@Autowired RestTemplate restTemplate, JmsTemplate jmsTemplate) {
		super(jmsTemplate);
		this.restTemplate = restTemplate;
	}

	@GetMapping("/getAtmTransactionsByFullnameAndAddress/{forenames}/{surname}/{address}")
	public ResponseEntity<AtmTransactionLocations[]> findATMTransactionsByFullnameAndAddress(
			@PathVariable("forenames") String forenames, @PathVariable("surname") String surname,
			@PathVariable("address") String address) {

		return restTemplate.getForEntity(
				Constants.ATM_TRANSACTION_LOCATIONS_URL + forenames + "/" + surname + "/" + address,
				AtmTransactionLocations[].class);
	}

	@GetMapping("/getAtmTransactionsByCardNumber/{cardNumber}")
	public ResponseEntity<AtmTransactionLocations[]> findATMTransactionsByCardNumber(
			@PathVariable("cardNumber") String cardNumber) {

		return restTemplate.getForEntity(Constants.ATM_TRANSACTION_CARD_NUMBER_URL + cardNumber,
				AtmTransactionLocations[].class);
	}

	@GetMapping("/getEposTransactionsByFullnameAndAddress/{forenames}/{surname}/{address}")
	public ResponseEntity<EposTransactionLocations[]> findEposTransactionsByFullnameAndAddress(
			@PathVariable("forenames") String forenames, @PathVariable("surname") String surname,
			@PathVariable("address") String address) {

		return restTemplate.getForEntity(
				Constants.EPOS_TRANSACTION_LOCATIONS_URL + forenames + "/" + surname + "/" + address,
				EposTransactionLocations[].class);
	}

	@GetMapping("/getEposTransactionsByCardNumber/{cardNumber}")
	public ResponseEntity<EposTransactionLocations[]> findEposTransactionsByCardNumber(
			@PathVariable("cardNumber") String cardNumber) {

		return restTemplate.getForEntity(Constants.EPOS_TRANSACTION_CARD_NUMBER_URL + cardNumber,
				EposTransactionLocations[].class);
	}

	@GetMapping("/getBankAccountDetailsByFullnameAndAddress/{forenames}/{surname}/{address}")
	public ResponseEntity<PeopleBankCard[]> findBankAccountDetailsByFullnameAndAddress(
			@PathVariable("forenames") String forenames, @PathVariable("surname") String surname,
			@PathVariable("address") String address) {

		return restTemplate.getForEntity(Constants.BANK_ACCOUNT_DETAILS_URL + forenames + "/" + surname + "/" + address,
				PeopleBankCard[].class);
	}
}
