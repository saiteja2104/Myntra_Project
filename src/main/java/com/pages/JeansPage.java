package com.pages;

import org.openqa.selenium.WebDriver;

import com.objectrepository.JeansPageProp;
import com.objectrepository.LandingPageProp;
import com.utils.Driverutils;

public class JeansPage extends Driverutils implements LandingPageProp {
	WebDriver driver;
	public JeansPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	public void getjeansimgs() {
		int jeans= getwebelements(Jeans_imgs).size();
		 System.out.println(jeans);

}
	public void closebrowser() {
		driver.quit();
		
	}

}
