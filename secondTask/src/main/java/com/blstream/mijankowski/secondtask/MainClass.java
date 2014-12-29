/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blstream.mijankowski.secondtask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michaljankowski
 */
public class MainClass {

    
    
    public static void main(String[] args) {
        DataImporter importer = null;
        DataParser  parser = null;
        
        ArrayList  list = new ArrayList<>();
//        list.add(0.95);
//        list.add(1.5);
//        list.add(0.5);
//        list.add(0.51);
//        list.add(0.52);
//        list.add(0.05);
//        list.add(1.05);

        importer = new DataImporter("dane.txt");
        
        try {
            importer.importTo(list);
        } catch (IOException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        parser = new DataParser(list);
        
        parser.sortList();
        parser.countSum();
        parser.countAverage();
       
        for(Object x : list){
            
            System.out.println(((Double)x).toString()+", ");
        }
        System.out.println("sum: "+(parser.sum.toString()));
        System.out.println("average: "+(parser.average.toString()));
    }

    
}
