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
public class Sum {
    
    @Length(max = 1)
    private BigDecimal sum;
    public Sum() {
        // Jackson deserialization
    }
    
    public Sum(BigDecimal[] numbers){
        sum = countSum(numbers);
    
    }
    
    @JsonProperty
    public BigDecimal getSum(){
        return sum;
    }
    
     public BigDecimal countSum(BigDecimal[] numbers){
        BigDecimal sum = new BigDecimal(0.0);
        for ( BigDecimal i : numbers){
            sum =sum.add(i);
        }
        return sum;
    }
    
}
