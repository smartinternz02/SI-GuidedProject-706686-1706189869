import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/')

// Check if the user is logged in or not
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon_Cart_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Hello, sign in'), 
    10, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('Amazon_Login_Calling_TC'), [('userID') : 'ravisaiece@gmail.com', ('password') : 'Ravi@RIET@1812'], 
        FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.verifyElementText(findTestObject('Page_Online Shopping site in India Shop Onl_10c5f3/span_Hello, RaviSaiChowdary'), 
        'RaviSaiChowdary')
}

WebUI.setText(findTestObject('Object Repository/Amazon_Cart_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_field-keywords'), 
    Item1)

WebUI.click(findTestObject('Object Repository/Amazon_Cart_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_Cart_OR/Page_Amazon.in  da vinci code/span_The Da Vinci Code (Abridged Edition) P_4896eb'))

WebUI.switchToWindowTitle('The Da Vinci Code (Abridged Edition) [Paperback] Brown, Dan : BROWN DAN: Amazon.in: Books')

WebUI.click(findTestObject('Object Repository/Amazon_Cart_OR/Page_The Da Vinci Code (Abridged Edition) P_54f610/input_Quantity_submit.add-to-cart'))

WebUI.setText(findTestObject('Amazon_Cart_Results_OR/Amazon_Search_Page/input_Search Amazon.in_field-keywords'), item2)

WebUI.click(findTestObject('Amazon_Cart_Results_OR/Amazon_Search_Page/input_Search Amazon.in_nav-search-submit-button'))

WebUI.click(findTestObject('Amazon_Cart_Results_OR/Page_Amazon.in  moto razr 40/span_Motorola razr 40'))

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Amazon_Cart_Results_OR/Page_Motorola razr 40/Add_to _Cart'))

WebUI.delay(4)

WebUI.setText(findTestObject('Amazon_Cart_Results_OR/Amazon_Search_Page/input_Search Amazon.in_field-keywords'), item3)

WebUI.click(findTestObject('Amazon_Cart_Results_OR/Amazon_Search_Page/input_Search Amazon.in_nav-search-submit-button'))

WebUI.switchToWindowIndex(3)

WebUI.click(findTestObject('Amazon_Cart_Results_OR/Oneplus ear buds/span_OnePlus Nord Buds 2 TWS'))

WebUI.click(findTestObject('Amazon_Cart_Results_OR/Page_OnePlus Nord Buds 2 TWS/Add_TO_Cart'))

WebUI.closeBrowser()

