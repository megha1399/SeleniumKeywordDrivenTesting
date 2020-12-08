package TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void test() throws IOException {
		System.out.println("In test");
		String path = "G:\\Selenium\\keyword-driven\\src\\test\\resources\\xlsxFiles\\Keywords.xlsx";
		KeywordsUtility.setExcel(path, 0);
		for(int i = 0; i < 3; i++ ) {
			String keyword = KeywordsUtility.getData(i,0);
			System.out.println(keyword);
			if(keyword.equals("openBrowser")) {
				TestActions.openBrowser();
			}else if(keyword.equals("navigate")) {
				TestActions.navigate();
			}else if(keyword.equals("clickbtn")) {
				TestActions.clickbtn();
			}
		}
	}
}
