package com.learnspring2.activity.beanscopewithannotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private List<String> lstFortuneValues;
	private String fileName = System.getProperty("user.dir") + "//src//com//learnspring2//activity//beanscopewithannotation//fortune-data.txt";
	private Random random = new Random();
	
	@PostConstruct
	public void doInitStuff() {
		lstFortuneValues = new ArrayList<>();
		File theFile = new File(fileName);
		
		try(BufferedReader br = new BufferedReader(new FileReader(theFile)) ) {
			String tempString;
			while((tempString = br.readLine()) != null) {
				lstFortuneValues.add(tempString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String getFortune() {
		
		int index = random.nextInt(lstFortuneValues.size());
		return lstFortuneValues.get(index);
	}

}
