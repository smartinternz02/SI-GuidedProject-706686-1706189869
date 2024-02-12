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

WebUI.navigateToUrl('www.amazon.in')

WebUI.scrollToElement(findTestObject('Amazon_Footer/India to australia/Australia'), 0)

WebUI.click(findTestObject('Amazon_Footer/India to australia/a_Australia'))

WebUI.scrollToElement(findTestObject('Amazon_Footer/Australia to Brazil/Brazil'), 0)

WebUI.click(findTestObject('Amazon_Footer/Australia to Brazil/a_Brazil'))

WebUI.scrollToElement(findTestObject('Amazon_Footer/Brazil to France/Frana'), 0)

WebUI.click(findTestObject('Amazon_Footer/Brazil to France/a_Frana'))

WebUI.click(findTestObject('Amazon_Footer/Italie to spagna/Accept'))

WebUI.scrollToElement(findTestObject('Amazon_Footer/France to Italie/Italie'), 0)

WebUI.click(findTestObject('Amazon_Footer/France to Italie/a_Italie'))

WebUI.scrollToElement(findTestObject('Amazon_Footer/Italie to spagna/UnitoSpagna'), 0)

WebUI.click(findTestObject('Amazon_Footer/Italie to spagna/a_Spagna'))

WebUI.click(findTestObject('Amazon_Footer/Italie to spagna/Accept'))

WebUI.scrollToElement(findTestObject('Amazon_Footer/Spagna to India/Inida'), 0)

WebUI.click(findTestObject('Amazon_Footer/Spagna to India/a_India'))

