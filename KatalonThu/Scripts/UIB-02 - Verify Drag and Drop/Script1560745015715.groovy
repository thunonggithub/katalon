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
'Maximize the Window'
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://the-internet.herokuapp.com/')

WebUI.click(findTestObject('Page_The Internet/Drag and Drop/a_Drag and Drop'))

WebUI.verifyElementPresent(findTestObject('Page_The Internet/Drag and Drop/h3_Drag and Drop'), 0)

WebUI.dragAndDropToObject(findTestObject('Page_The Internet/Drag and Drop/div_A'), findTestObject('Page_The Internet/Drag and Drop/div_B'))

WebUI.waitForElementVisible(findTestObject('Page_The Internet/Drag and Drop/div_B'), 1000)

WebUI.verifyEqual(findTestObject('Page_The Internet/Drag and Drop/div_B'), 'A')

WebUI.closeBrowser()

