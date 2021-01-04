package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.base;

public class HomePage extends base {

	@Test

	public void baseNavigation() throws IOException {
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		

	}

}
