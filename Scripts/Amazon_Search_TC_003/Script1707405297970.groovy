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

WebUI.openBrowser('www.amazon.in')

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon_SignIn_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Hello, sign in'), 
    10, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('Amazon_Login_Calling_TC'), [('userID') : 'ravisaiece@gmail.com', ('password') : 'Ravi@RIET@1812'], 
        FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.verifyElementText(findTestObject('Page_Online Shopping site in India Shop Onl_10c5f3/span_Hello, RaviSaiChowdary'), 
        'RaviSaiChowdary')
}

WebUI.delay(10)

// Check if the user name element is present
// Need to modify here: use the userName variable instead of findTestObject method
WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon_Search_OR/Page_Online Shopping site in India Shop Onl_10c5f3/select_All Categories        Alexa Skills  _a62561'), 
    books, true)

WebUI.setText(findTestObject('Object Repository/Amazon_Search_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_field-keywords'), 
    'Da vinci code')

WebUI.click(findTestObject('Object Repository/Amazon_Search_OR/Page_Online Shopping site in India Shop Onl_10c5f3/input_Search Amazon.in_nav-search-submit-button'))

WebUI.closeBrowser()

