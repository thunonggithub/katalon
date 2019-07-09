import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://the-internet.herokuapp.com/')

WebUI.click(findTestObject('Page_The Internet/Menu/a_JQuery UI Menus'))

WebUI.verifyElementPresent(findTestObject('Page_The Internet/Menu/h3_JQueryUI - Menu'), 0)

WebUI.click(findTestObject('Page_The Internet/Menu/a_Enabled'))

WebUI.waitForElementVisible(findTestObject('Page_The Internet/Menu/a_Back to JQuery UI'), 0)

WebUI.click(findTestObject('Page_The Internet/Menu/a_Back to JQuery UI'))

WebUI.verifyElementPresent(findTestObject('Page_The Internet/Menu/h3_JQuery UI'), 0)

WebUI.click(findTestObject('Page_The Internet/Menu/a_Menu'))

WebUI.verifyElementPresent(findTestObject('Page_The Internet/Menu/h3_JQueryUI - Menu'), 0)

WebUI.click(findTestObject('Page_The Internet/Menu/a_Enabled'))

WebUI.waitForElementVisible(findTestObject('Page_The Internet/Menu/a_Downloads'), 0)

WebUI.click(findTestObject('Page_The Internet/Menu/a_Downloads'))

WebUI.waitForElementVisible(findTestObject('Page_The Internet/Menu/a_CSV'), 0)

WebUI.click(findTestObject('Page_The Internet/Menu/a_CSV'))

File downloadFolder = new File("D:\\Katalon\\")
List namesOfFiles = Arrays.asList(downloadFolder.list())
if(namesOfFiles.contains("menu.cvs")) 
{	println "Success"}
else {	println "Failure"}

WebUI.closeBrowser()

