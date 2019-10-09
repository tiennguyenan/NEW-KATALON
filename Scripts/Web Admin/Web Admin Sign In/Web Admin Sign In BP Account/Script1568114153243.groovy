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

WebUI.navigateToUrl('https://admin.stg.deliveree.com/staffs/sign_in')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/input_Login_stafflogin'), 
    'tien.nguyen@deliveree.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/input_Password_staffpassword'), 
    'A6cbiHqbQHLxx8IIeu56jw==')

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/input_Remember me_commit'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/i_Events_icon dropdown'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/a_Ho Chi Minh'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/a_Bookings'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/a_New booking'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/a_Ho Chi Minh_1'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/i__dropdown icon'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/div_TIEN LEXUS TYPE'))

WebUI.setText(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/input_Customer ID_prompt'), 
    'tie')

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/div_1810 - Tien company new3'))

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/div_PersonalTienTestCompanyNEWMOINHAT'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/div_TienTestCompanyNEWMOINHAT'))

