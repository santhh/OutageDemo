package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")  
@RequestMapping(path="/terminals") 
public class TerminalsRestController {
	@Autowired 
  
private TerminalsRepository terminalsRepository;

@RequestMapping(path="/add") 
public @ResponseBody String addNewTerminal (@RequestParam String terminalId 
	, @RequestParam String customerNum,@RequestParam String preference, @RequestParam String preferenceValue) {


Terminals t = new Terminals();
t.setTerminalId(terminalId);
t.setCustomerNum(customerNum);
t.setPreference(preference);
t.setPreferenceValue(preferenceValue);
terminalsRepository.save(t);
return "Saved";
}

@RequestMapping(path="/all")
public @ResponseBody Iterable<Terminals> getAllTerminals() {
// This returns a JSON or XML with the users
return terminalsRepository.findAll();
}
}
