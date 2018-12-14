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

WebUI.click(findTestObject('Object Repository/Masoko Sign In/Page_Shop Online in Kenya - Pay Con/p_Sign In'))

WebUI.setText(findTestObject('Object Repository/Masoko Sign In/Page_Customer Login/input_If you have an account s'), 'wainainaken@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Masoko Sign In/Page_Customer Login/input_If you have an account s_1'), 
    'ytq8CNxZ20o=')

WebUI.setEncryptedText(findTestObject('Object Repository/Masoko Sign In/Page_Customer Login/input_If you have an account s_2'), 
    'rQg123ONwgM=')

WebUI.setEncryptedText(findTestObject('Object Repository/Masoko Sign In/Page_Customer Login/input_If you have an account s_3'), 
    'U2K2yZ+rb98=')

WebUI.setEncryptedText(findTestObject('Object Repository/Masoko Sign In/Page_Customer Login/input_If you have an account s_4'), 
    's5hRrzAgB2I=')

WebUI.setEncryptedText(findTestObject('Object Repository/Masoko Sign In/Page_Customer Login/input_If you have an account s_5'), 
    'qkGC7I7kJnU=')

WebUI.setEncryptedText(findTestObject('Object Repository/Masoko Sign In/Page_Customer Login/input_If you have an account s_6'), 
    'tO4+Cq/d9vk=')

WebUI.setEncryptedText(findTestObject('Object Repository/Masoko Sign In/Page_Customer Login/input_If you have an account s_7'), 
    'ratjN/ZUvbI=')

WebUI.setEncryptedText(findTestObject('Object Repository/Masoko Sign In/Page_Customer Login/input_If you have an account s_8'), 
    '+kCcTNaUIqTndFXouXKvTA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Masoko Sign In/Page_Customer Login/input_If you have an account s_9'), 
    '+kCcTNaUIqTndFXouXKvTA==')

WebUI.click(findTestObject('Object Repository/Masoko Sign In/Page_Customer Login/button_Sign In'))

WebUI.closeBrowser()

