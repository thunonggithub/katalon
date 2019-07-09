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

WebUI.click(findTestObject('Page_The Internet/Dropdown/a_Dropdown'))

WebUI.verifyElementPresent(findTestObject('Page_The Internet/Dropdown/h3_Dropdown List'), 0)
'Select the dropdown value by Select option By Label Method'
WebUI.selectOptionByLabel(findTestObject('Page_The Internet/Dropdown/select_Please select an option    Option 1    Option 2'), 'Option 2', 
    false)
'Verifying the Option is Selected by Label option'
WebUI.verifyOptionSelectedByLabel(findTestObject('Page_The Internet/Dropdown/select_Please select an option    Option 1    Option 2'), 'Option 2', false, 60)

'Select the dropdown value by Select option By index Method'
WebUI.selectOptionByIndex(findTestObject('Page_The Internet/Dropdown/select_Please select an option    Option 1    Option 2'), 2)
'Verifying the Option is Selected by Index option'
WebUI.verifyOptionSelectedByIndex(findTestObject('Page_The Internet/Dropdown/select_Please select an option    Option 1    Option 2'), 2, 60)

'Select the dropdown value by Select option By value method'
WebUI.selectOptionByValue(findTestObject('Page_The Internet/Dropdown/select_Please select an option    Option 1    Option 2'), '2', false)
'Verifying the Option is Selected by Value option'
WebUI.verifyOptionSelectedByValue(findTestObject('Page_The Internet/Dropdown/select_Please select an option    Option 1    Option 2'), '2', false, 60)

WebUI.closeBrowser()

