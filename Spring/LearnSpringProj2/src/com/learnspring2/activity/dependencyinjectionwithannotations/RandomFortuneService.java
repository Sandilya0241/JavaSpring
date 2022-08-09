package com.learnspring2.activity.dependencyinjectionwithannotations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private List<String> lstFortuneValues;
	private String inputFileName = System.getProperty("user.dir") + "\\src\\com\\learnspring2\\activity\\dependencyinjectionwithannotations\\fortune-data.txt";
	
	private Random rand = new Random();
	
	
	public RandomFortuneService() {
		File theFile = new File(inputFileName);
		lstFortuneValues = new ArrayList<String>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(theFile))) {
			String tempStr;
			while((tempStr = br.readLine()) != null) {
				lstFortuneValues.add(tempStr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		
		int index = rand.nextInt(lstFortuneValues.size());
		return lstFortuneValues.get(index);
	}

}
