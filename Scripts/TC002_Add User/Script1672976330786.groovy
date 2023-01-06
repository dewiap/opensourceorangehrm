import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC001_Login'), [:])

WebUI.delay(10)

WebUI.click(findTestObject('Admin/span_Admin'))

WebUI.delay(10)

WebUI.click(findTestObject('/Admin/button_Add'))

WebUI.click(findTestObject('/AddUser/add_user/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_1672992823864/Element_1672992825713'))

WebUI.click(findTestObject('New Folder/Page_1672996145072/Element_1672996223138'))

WebUI.click(findTestObject('/AddUser/add_user/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.setText(findTestObject('/AddUser/add_user/input'), 'Odis  Adalwin')

WebUI.click(findTestObject('/AddUser/add_user/input_Username_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('/AddUser/add_user/input_Username_oxd-input oxd-input--focus'), 'adminOdis')

WebUI.click(findTestObject('AddUser/add_user/input_Password_password'))

WebUI.setText(findTestObject('/AddUser/add_user/input_Password_oxd-input oxd-input--focus o_671073'), 'Test1234!')

WebUI.click(findTestObject('/AddUser/add_user/button_Save'))

