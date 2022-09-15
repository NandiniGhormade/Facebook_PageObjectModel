package com.fb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class HomePage extends TestBase {
	public static WebElement search;
	
	    @FindBy(xpath = "//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken']")
	    WebElement findfreinds;

	    @FindBy(xpath = "//span[contains(text(),'Welcome')]")
	    WebElement welcome;

	    @FindBy(xpath = "//span[contains(text(),'Groups')]")
	    WebElement groups;
	    
	    @FindBy(xpath = "//span[contains(text(),'Watch')]")
	    WebElement watch;
	    
	    @FindBy(xpath = "//span[contains(text(),'Memories')]")
	    WebElement memories;
	    
	    @FindBy(xpath = "//span[contains(text(),'Pages')]")
	    WebElement pages;
	    
	    @FindBy(xpath = "//span[contains(text(),'Blood Donations')]")
	    WebElement bloodDonations;
	    
	    
	     public HomePage() {

	        PageFactory.initElements(driver, this);
	    }
//	public boolean verifySearchFieldOfHomePage() {
//		search = driver.findElement(By.xpath("(//input[@class='qi72231t s3jn8y49 k14qyeqv mz1h5j5e ztn2w49o s19c0p35 febi1ev9 pccvoycu c84hr6m5 losq46hw qgrdou9d nu7423ey n3hqoq4p r86q59rh b3qcqh3k fq87ekyn f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l pbevjfx6 tgm57n0e cgu29s5g i15ihif8 no6h3tfh k1z55t6l aeinzg81 icdlwmnq om3e55n1 rh5b4hnh gy87pps4 b0eko5f3 r9fxt90l fwlpnqze nq2b4knc adj1mh9s h7nzrzxv gl9yfm1p ap9gnrge k4z0jo6w'])[1]"));
//		return search.isDisplayed();
//	}
public String verifyHomePageTitle(){
	return driver.getTitle();
}
	       
	    public String verifyFindFriends() {
	    	findfreinds = driver.findElement(By.xpath("//span[contains(text(),'Find friends')]"));
//			findfreinds = driver.findElement(By.xpath("//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken']"));
			return findfreinds.getAttribute("xpath");
//			return driver.findElement(By.name(""));
		}
	    
	    public String verifyWelcomeField() {
	    	welcome = driver.findElement(By.xpath("//span[contains(text(),'Welcome')]"));
			return welcome.getAttribute("xpath");
		}
	    
	    public String verifyGroupsField() {
	    	groups = driver.findElement(By.xpath("//span[contains(text(),'Groups')]"));
			return groups.getAttribute("xpath");
		}
	    
	    public String verifyWatchField() {
	    	watch = driver.findElement(By.xpath("//span[contains(text(),'Watch')]"));
			return watch.getAttribute("xpath");
		}
	    
	    public String verifyMemoriesField() {
	    	memories = driver.findElement(By.xpath("//span[contains(text(),'Memories')]"));
			return memories.getAttribute("xpath");
		}
	    
	    public String verifyPagesField() {
	    	pages = driver.findElement(By.xpath("//span[contains(text(),'Pages')]"));
			return pages.getAttribute("xpath");
		}
	    
	    public String verifyBloodDoationField() {
	    	bloodDonations = driver.findElement(By.xpath("//span[contains(text(),'Blood Donations')]"));
			return bloodDonations.getAttribute("xpath");
		}


	}