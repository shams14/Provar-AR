package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="QATest"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(linkText = "Opportunities")
	public WebElement opportunities;
	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement accounts;
			
}
