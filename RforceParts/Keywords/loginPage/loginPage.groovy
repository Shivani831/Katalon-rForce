package loginPage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class loginPage {

	@Keyword
	def login(Username,Password) {
		WebUI.enhancedClick(findTestObject('Object Repository/Login/UserName'),FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/Login/UserName'),Username)
		WebUI.enhancedClick(findTestObject('Object Repository/Login/PassWord'),FailureHandling.STOP_ON_FAILURE)
		WebUI.setEncryptedText(findTestObject('Object Repository/Login/PassWord'),Password)
		WebUI.verifyElementClickable(findTestObject('Object Repository/Login/Login button'),FailureHandling.STOP_ON_FAILURE)
		WebUI.enhancedClick(findTestObject('Object Repository/Login/Login button'),FailureHandling.STOP_ON_FAILURE)
	}
}
