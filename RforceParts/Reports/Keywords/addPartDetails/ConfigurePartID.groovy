package addPartDetails

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import purchaseOrder.PurchaseOrder

public class ConfigurePartID {
	PurchaseOrder obj=new PurchaseOrder()
	@Keyword
	def AddParts() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Parts/Add Parts Button'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.enhancedClick(findTestObject('Object Repository/Parts/Add Parts Button'), FailureHandling.STOP_ON_FAILURE)
	}


	@Keyword
	def EnetrPartDetails() {
		String name="9206884",Value="1"
		WebUI.verifyElementPresent(findTestObject('Object Repository/Parts/Parts_Search'), 60, FailureHandling.STOP_ON_FAILURE)
		WebUI.enhancedClick(findTestObject('Object Repository/Parts/Parts_Search'), FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/Parts/Parts_Search'),name, FailureHandling.STOP_ON_FAILURE)
		WebUI.enhancedClick(findTestObject('Object Repository/Parts/PartValue'), FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/Parts/Quantity'),Value, FailureHandling.STOP_ON_FAILURE)
		WebUI.enhancedClick(findTestObject('Object Repository/Parts/AddButton'), FailureHandling.STOP_ON_FAILURE)
		obj.ClickOnSaveButton()
	}

	@Keyword
	def ReleasePO () {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Parts/ReleasePO'), 120, FailureHandling.STOP_ON_FAILURE)
		WebUI.enhancedClick(findTestObject('Object Repository/Parts/ReleasePO'), FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def confirmationPopUp() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Release PO/ReleasePOConfirmationPopUp'), 120, FailureHandling.STOP_ON_FAILURE)
		WebUI.enhancedClick(findTestObject('Object Repository/Parts/ReleasePO'), FailureHandling.STOP_ON_FAILURE)
		obj.ClickOnSaveButton()
	}
}