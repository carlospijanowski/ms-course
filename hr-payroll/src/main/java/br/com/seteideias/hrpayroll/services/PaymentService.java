package br.com.seteideias.hrpayroll.services;

import br.com.seteideias.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workedId, int days){
        return new Payment("Bob",200.0,days);
    }

}
