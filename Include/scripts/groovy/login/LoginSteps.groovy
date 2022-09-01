package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps {
	@Given("User navigates to login page")
	def navigateToLoginPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.saucedemo.com/')
		print("\n on login page")
	}

	@When("User enters (.*) and (.*)")
	def enterUsernameAndPassword(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/LoginTestsRepository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac'),
				username)

		WebUI.setEncryptedText(findTestObject('Object Repository/LoginTestsRepository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_3423e9'),
				password)


		print("\n entered username and password")
	}

	@And("User clicks on login button")
	def clickOnLoginButton() {
		WebUI.click(findTestObject('Object Repository/LoginTestsRepository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_0dff71'))
		print("\n clicked on Login button")
	}

	@Then("User is navigated to home")
	def verifyHomePage() {
		WebUI.verifyElementPresent(findTestObject("LoginTestsRepository/Page_Swag Labs/span_PRODUCTS"), 5)
		print("\n on home page")
		WebUI.closeBrowser()
	}
}