import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://the-internet.herokuapp.com/')

WebUI.click(findTestObject('Page_The Internet/Alert/a_JavaScript Alerts'))

WebUI.verifyElementPresent(findTestObject('Page_The Internet/Alert/h3_JavaScript Alerts'), 0)

WebUI.click(findTestObject('Page_The Internet/Alert/button_Click for JS Alert'))

WebDriver driverJSA = DriverFactory.getWebDriver()

'Getting the text from the alert and storing it in Variable '
String JSAlert = driverJSA.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert\r\n'
WebUI.verifyEqual(JSAlert, 'I am a JS Alert')

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_The Internet/Alert/button_Click for JS Confirm'))

WebDriver driverJSC = DriverFactory.getWebDriver()

'Getting the text from the alert and storing it in Variable '
String JSConfirm = driverJSC.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert\r\n'
WebUI.verifyEqual(JSConfirm, 'I am a JS Confirm')

WebUI.dismissAlert()

WebUI.click(findTestObject('Page_The Internet/Alert/button_Click for JS Prompt'))

WebDriver driverJSP = DriverFactory.getWebDriver()

'Passing the text in the text box in the Alert\r\n'
driverJSP.switchTo().alert().sendKeys('You entered Hello')

WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('Page_The Internet/Alert/p_You entered Hello'), 0)

WebUI.closeBrowser()

