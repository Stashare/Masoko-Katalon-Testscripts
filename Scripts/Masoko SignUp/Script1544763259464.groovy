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

WebUI.navigateToUrl('https://www.masoko.com/')

WebUI.click(findTestObject('Object Repository/Masoko SignUp/Page_Shop Online in Kenya - Pay Con/span_Register'))

WebUI.setText(findTestObject('Object Repository/Masoko SignUp/Page_Create New Customer Account/input_Personal Information_fir'), 
    first)

WebUI.setText(findTestObject('Object Repository/Masoko SignUp/Page_Create New Customer Account/input_Personal Information_las'), 
    last)

WebUI.setText(findTestObject('Object Repository/Masoko SignUp/Page_Create New Customer Account/input_land Islands_mobile'), 
    phone)

WebUI.setText(findTestObject('Object Repository/Masoko SignUp/Page_Create New Customer Account/input_Sign-in Information_emai'), 
    email)

WebUI.setEncryptedText(findTestObject('Object Repository/Masoko SignUp/Page_Create New Customer Account/input_Sign-in Information_pass'), 
    'idfmk6zVFEa4W1l6E8z2cA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Masoko SignUp/Page_Create New Customer Account/input_Very Strong_password_con'), 
    'ratjN/ZUvbI=')

/** validate password parsed**/
def initial_password = WebUI.getText(findTestObject('Object Repository/Masoko SignUp/Page_Create New Customer Account/input_Sign-in Information_pass'))

def confirm_password = WebUI.getText(findTestObject('Object Repository/Masoko SignUp/Page_Create New Customer Account/input_Very Strong_password_con'))

WebUI.verifyMatch(initial_password, confirm_password, false)

WebUI.click(findTestObject('Object Repository/Masoko SignUp/Page_Create New Customer Account/button_Create an Account'))

WebUI.verifyTextPresent('You must confirm your account. Please check your email for the confirmation link or click here for a new link.', 
    false)

WebUI.closeBrowser()

