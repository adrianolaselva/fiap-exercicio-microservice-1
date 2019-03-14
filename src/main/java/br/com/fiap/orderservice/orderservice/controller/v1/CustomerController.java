package br.com.fiap.orderservice.orderservice.controller.v1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.orderservice.orderservice.dto.v1.CustomerDTO;

import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(path="v1/customers")
public class CustomerController {
	
	private static final Logger log = LoggerFactory.getLogger(CustomerController.class);
	
	@GetMapping("/")
	public ResponseEntity<ArrayList<CustomerDTO>> all(){
		
		ArrayList<CustomerDTO> response = new ArrayList<>();
		
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/{uuid}")
	public ResponseEntity<CustomerDTO> load(@PathParam("uuid") String uuid){
		
		CustomerDTO customerDTO = new CustomerDTO();
		
		return ResponseEntity.ok(customerDTO);
	}
	
	@PostMapping("/")
	public ResponseEntity<CustomerDTO> create(@RequestBody CustomerDTO customerDTO){
		
		return ResponseEntity.ok(customerDTO);
	}
	
	@PostMapping("/{uuid}")
	public ResponseEntity<CustomerDTO> update(@PathParam("uuid") String uuid, @RequestBody CustomerDTO customerDTO){
		
		return ResponseEntity.ok(customerDTO);
	}
	
}
