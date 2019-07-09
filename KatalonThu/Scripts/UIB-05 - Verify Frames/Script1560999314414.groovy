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

WebUI.click(findTestObject('Page_The Internet/Frames/a_WYSIWYG Editor'))

WebUI.verifyElementPresent(findTestObject('Page_The Internet/Frames/h3_An iFrame containing the TinyMCE WYSIWYG Editor'), 
    0)

'Switch to iframe'
WebUI.switchToFrame(findTestObject('Page_The Internet/Frames/textArea_Iframe'), 5)

WebUI.scrollToElement(findTestObject('Page_The Internet/Frames/textArea'), 60)

'Fecthing the text from Text area and storing it in a variable'
Text = WebUI.getText(findTestObject('Page_The Internet/Frames/textArea'))

'Verifying the Actual text with Expected text from Text Area.'
WebUI.verifyEqual(Text, 'Your content goes here.')

'Set text to element inside iframe'
WebUI.sendKeys(findTestObject('txt_TextArea'), 'Your content goes here.')

WebUI.closeBrowser()

