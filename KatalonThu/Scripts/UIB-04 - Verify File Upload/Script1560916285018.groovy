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

WebUI.click(findTestObject('Page_The Internet/File Upload/a_File Upload'))

WebUI.verifyElementPresent(findTestObject('Page_The Internet/File Upload/h3_File Uploader'), 0)

'Uploading the File using Send Keys method by passing the File path'
WebUI.sendKeys(findTestObject('Page_The Internet/File Upload/input_File Uploader_file'), 'D:/Katalon/test.png')

WebUI.click(findTestObject('Page_The Internet/File Upload/input_File Uploader_file-submit'))

WebUI.verifyElementPresent(findTestObject('Page_The Internet/File Upload/h3_File Uploaded'), 0)

WebUI.closeBrowser()

