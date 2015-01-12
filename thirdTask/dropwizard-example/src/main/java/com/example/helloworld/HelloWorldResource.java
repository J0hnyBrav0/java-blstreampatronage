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
import com.codahale.metrics.annotation.Timed;
import static java.lang.Math.*;
import java.math.BigDecimal;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;



@Produces(MediaType.APPLICATION_JSON)
@Path("/numbers")
public class HelloWorldResource {
    
    private static ArrayList<BigDecimal> numbers;

    
    public HelloWorldResource(){
        numbers = new ArrayList<BigDecimal>();
        
    }
    
    @POST
    @Timed
    public NumberArrays addNumber(@QueryParam("number") BigDecimal number) {
        
        numbers.add(number);
        BigDecimal[] array = new BigDecimal[numbers.size()];
        array=numbers.toArray(array);
        return new NumberArrays(array);
    }
    
    @GET
    @Timed
    public NumberArrays listNumbers() {
        BigDecimal[] array = new BigDecimal[numbers.size()];
        array=numbers.toArray(array);
        return new NumberArrays(array);
    }
    
    @GET
    @Timed
    @Path("/sorted")
    public NumberArrays listSortedNumbers() {
        BigDecimal[] array = new BigDecimal[numbers.size()];
        array=numbers.toArray(array);
        Arrays.sort(array);
        
        return new NumberArrays(array);
    }
    
    
    public BigDecimal countSum(){
        BigDecimal sum = new BigDecimal(0.0);
        for ( BigDecimal i : numbers){
            sum = sum.add(i);
        }
        return sum;
    }
    public BigDecimal countAverage(){
        
        return countSum().divide( new BigDecimal(numbers.size()));
    }
    @GET
    @Timed
    @Path("/sum")
    public Sum sum() {
        BigDecimal[] array = new BigDecimal[numbers.size()];
        array = numbers.toArray(array);
        return new Sum(array);
    }
    
    @GET
    @Timed
    @Path("/average")
    public Average avg() {
        BigDecimal[] array = new BigDecimal[numbers.size()];
        array = numbers.toArray(array);
        return new Average(array);
    }
}

