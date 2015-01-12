/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.helloworld;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;
import javax.ws.rs.core.GenericEntity;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author michaljankowski
 */
public class Average {
    @Length(max = 1)
    private BigDecimal average;
    public Average() {
        // Jackson deserialization
    }
    
    public Average(BigDecimal[] numbers){
        average = countAverage(numbers);
    
    }
    
    @JsonProperty
    public BigDecimal getSum(){
        return average;
    }
    
     public BigDecimal countAverage(BigDecimal[] numbers){
        BigDecimal avg = new BigDecimal(0.0);
        for ( BigDecimal i : numbers){
            avg = avg.add(i);
        }
        avg.divide(new BigDecimal(numbers.length));
        
        return avg;
    }
}
