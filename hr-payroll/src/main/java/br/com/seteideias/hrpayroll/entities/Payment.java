package br.com.seteideias.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private String name;
    private Double dailyIncome;
    private Integer days;

    public Double getTotal(){
        return this.dailyIncome * this.days;
    }


}
