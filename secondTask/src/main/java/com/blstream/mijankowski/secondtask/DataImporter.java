/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blstream.mijankowski.secondtask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author michaljankowski
 */
public class DataImporter {
    //public static List<Double> list = new ArrayList<Double>();
    
    public static File file; 
    
    public DataImporter(String filePath){
        this.file = new File(filePath);
    }
    
    public static void importTo(List<Double> list) throws IOException{
		
        try{
            
            BufferedReader reader = null; 
            reader = new BufferedReader(new FileReader(file));
            String tmp = null;
	
            while((tmp = reader.readLine()) != null){
		list.add(Double.parseDouble(tmp));
            }
            reader.close();
	}
	catch (FileNotFoundException e){
            e.printStackTrace();
	}
    }
}
