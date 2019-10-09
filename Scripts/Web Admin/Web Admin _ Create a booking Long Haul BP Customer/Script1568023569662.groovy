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
import org.openqa.selenium.Keys as Keys

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

not_run: WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/i_Time Type_dropdown icon'))

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/div_PersonalTienTestCompanyNEWMOINHAT'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/div_TienTestCompanyNEWMOINHAT'))

not_run: WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/div_Schedule'))

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/div_NowScheduleLong haulBOX'))

not_run: WebUI.setText(findTestObject('Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/div_RightSchedule'), 
    'Schedule')

not_run: WebUI.selectOptionByValue(findTestObject('Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/div_RightSchedule'), 
    'Schedule', false)

not_run: WebUI.selectOptionByLabel(findTestObject('Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/div_RightSchedule'), 
    'Schedule', false)

not_run: WebUI.selectOptionByIndex(findTestObject('Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/div_RightSchedule'), 
    1)

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/div_Long haul'))

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/pickup_time'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/td_30'))

not_run: WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/span_Dec_glyphicon glyphicon-time'))

not_run: WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/span_Dec_glyphicon glyphicon-chevron-up'))

not_run: WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/span_Dec_glyphicon glyphicon-chevron-up_1'))

not_run: WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/span_Dec_glyphicon glyphicon-calendar'))

not_run: WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/span_Dec_glyphicon glyphicon-remove'))

WebUI.setText(findTestObject('Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/input_)_bookinglocations_attributes0name'), 
    'le thi')

WebUI.setText(findTestObject('Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/input_)_bookinglocations_attributes1name'), 
    'le thi hong gam')

WebUI.setText(findTestObject('Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/input_)_bookinglocations_attributes1latitude'), 
    '10.7688999')

WebUI.setText(findTestObject('Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/input_)_bookinglocations_attributes1longitude'), 
    '106.6975936')

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/input_km)_commit'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/div_Yes'))

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/h2_Details'))

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/a_Back to list'))

WebUI.closeBrowser()

