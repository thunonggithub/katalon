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

WebUI.click(findTestObject('Page_The Internet/Key Press/a_Key Presses'))

WebUI.verifyElementPresent(findTestObject('Page_The Internet/Key Press/h3_Key Presses'), 0)

WebUI.sendKeys(null, 'ENTER')

WebUI.verifyElementPresent(findTestObject('Page_The Internet/Key Press/p_You entered ENTER'), 0)

WebUI.sendKeys(null, 'G')

WebUI.verifyElementPresent(findTestObject('Page_The Internet/Key Press/p_You entered G'), 0)

WebUI.sendKeys(null, 'TAB')

WebUI.verifyElementPresent(findTestObject('Page_The Internet/Key Press/p_You entered TAB'), 0)

WebUI.closeBrowser()

