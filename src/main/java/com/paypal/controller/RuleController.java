package com.paypal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.model.Measure;
import com.paypal.model.RuleSet;
import com.paypal.service.MeasureService;
import io.swagger.annotations.ApiOperation;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class RuleController {

    @Autowired
    MeasureService  measureService;



    @ApiOperation(value="RuleSetName Information",response= RuleSet.class)
    @GetMapping(value = "/ruleSets/{rulename}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RuleSet> getRuleInfo(@PathVariable(name = "rulename") String name) {

        //Page<OrderHistory> orderHistory = cartService.getOrderHistory(customerId);

        return new ResponseEntity<RuleSet>(HttpStatus.OK);

    }

	/*
	 * @ApiOperation(value="Meaure Information",response= Measure.class)
	 * 
	 * @GetMapping(value = "/rule/getMeasureDetails",produces =
	 * MediaType.APPLICATION_JSON_VALUE) public ResponseEntity<?> getMeasureInfo() {
	 * 
	 * List<Measure> measure = measureService.getMeasureDetails();
	 * System.out.println("hmm"+measure.size()); return measure != null ? new
	 * ResponseEntity<>(measure, HttpStatus.ACCEPTED) : new
	 * ResponseEntity<>("Something went wrong ", HttpStatus.BAD_REQUEST);
	 * 
	 * }
	 * 
	 * @ApiOperation(value="Meaure Information",response= Measure.class)
	 * 
	 * @PostMapping(value = "/rule/postMeasureInfo", consumes =
	 * MediaType.APPLICATION_JSON_VALUE) public ResponseEntity<?>
	 * postMeasureInfo(@RequestBody Measure measure) { return
	 * measureService.postMeasure(measure) != null ? new
	 * ResponseEntity<>(measure.getMeasureName() + " created Successfully",
	 * HttpStatus.ACCEPTED) : new
	 * ResponseEntity<>("ERROR WHILE SUBMITTING RECORD PLEASE TRY AGAIN",
	 * HttpStatus.BAD_REQUEST); }
	 */
    
    
}
