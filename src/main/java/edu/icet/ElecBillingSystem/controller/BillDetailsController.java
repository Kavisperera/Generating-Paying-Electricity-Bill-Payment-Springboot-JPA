package edu.icet.ElecBillingSystem.controller;

import edu.icet.ElecBillingSystem.entity.BillDetails;
import edu.icet.ElecBillingSystem.entity.GenerateBillRequest;
import edu.icet.ElecBillingSystem.service.BillDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class BillDetailsController {

    private BillDetailsService billDetailsService;

    @GetMapping(path = "/getBillDetails")
    public ResponseEntity<List<BillDetails>> getBillDetails(@RequestParam String serviceRequestNo){
        return ResponseEntity.ok(billDetailsService.getBillDetails(serviceRequestNo));
    }
    @PutMapping(path = "/doPayment")
    public ResponseEntity<String> doPayment(@RequestParam Long id,@RequestParam String amount){
        return new ResponseEntity<>(billDetailsService.dopayment(id, amount), HttpStatus.OK);
    }
    @PostMapping(path = "/generateBill")
    public ResponseEntity<String> generateBill(@RequestBody GenerateBillRequest request){
        return new ResponseEntity<>(billDetailsService.generateBill(request), HttpStatus.OK);
    }
}
