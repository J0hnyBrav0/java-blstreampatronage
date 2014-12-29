/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blstream.mijankowski.secondtask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author michaljankowski
 */
public class DataParser {
    List<Double> list;
    Double sum;
    Double average;
    public DataParser(ArrayList<Double> list){
        this.list = list;
        this.sum = 0.0;
        this.average = 0.0;
    }
    public void sortList(){
        Collections.sort(list);
    }
    
    public void countSum(){
        for ( Object i : list){
            sum += (Double)i;
        }
    }
    
    public void countAverage(){
        this.average = sum/list.size();
        
    }
}
