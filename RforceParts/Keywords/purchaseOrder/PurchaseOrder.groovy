package purchaseOrder

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

public class PurchaseOrder {
	@Keyword
	def PurchaseorderHeader(){
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchaseOrder/PurchaseOrder button'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.enhancedClick(findTestObject('Object Repository/PurchaseOrder/PurchaseOrder button'), FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def NewCostPO() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchaseOrder/NewCostPO button'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.enhancedClick(findTestObject('Object Repository/PurchaseOrder/NewCostPO button'), FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def CreateNewCostPO() {
		String name="Renewal by Andersen"
		WebUI.switchToFrame(findTestObject('Object Repository/PurchaseOrder/IFrame'), 60, FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForElementPresent(findTestObject('Object Repository/PurchaseOrder/Vendor'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.enhancedClick(findTestObject('Object Repository/PurchaseOrder/SearchAccount'), FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/PurchaseOrder/SearchAccount'), name, FailureHandling.STOP_ON_FAILURE)
		WebUI.enhancedClick(findTestObject('Object Repository/PurchaseOrder/Renewal by Andersen'), FailureHandling.STOP_ON_FAILURE)
		ClickOnSaveButton()
		WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def ClickOnSaveButton() {
		WebUI.enhancedClick(findTestObject('Object Repository/PurchaseOrder/Save Button'), FailureHandling.STOP_ON_FAILURE)
	}
}