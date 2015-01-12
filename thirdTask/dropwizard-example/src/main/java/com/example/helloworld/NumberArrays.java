/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.helloworld;

/**
 *
 * @author michaljankowski
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;
import javax.ws.rs.core.GenericEntity;
import org.hibernate.validator.constraints.Length;

public class NumberArrays {


    @Length(max = 1)
    
    private BigDecimal[] array;
    private BigDecimal sum;
    private BigDecimal average; 
    public NumberArrays() {
        // Jackson deserialization
    }

   
    
    public NumberArrays(BigDecimal[] array){
        this.array = new BigDecimal[array.length];
        this.array = array;
    
    }
    
    @JsonProperty
    public BigDecimal[] getArray(){
        return array;
    }
    
    
    
    
    

    
}
