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

WebUI.callTestCase(findTestCase('Web Admin/Web Admin Sign In/Web Admin Sign In Non BP Account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/div_NowScheduleLong haulBOX'))

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/div_Long haul'))

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/pickup_time'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/td_30'))

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

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin Similar Booking/Page_Deliveree/div_View BookingView HistoryEditAdd New similarChat History'))

WebUI.click(findTestObject('Web Admin/Web Admin Similar Booking/Page_Deliveree/a_Add New similar'))

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/pickup_time'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin _ Sign In/Web Admin _ Schedule Booking/Page_Deliveree/td_30'))

WebUI.click(findTestObject('Object Repository/Web Admin/Web Admin Similar Booking/Page_Deliveree/input_km)_commit'))

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/h2_Details'))

WebUI.click(findTestObject('Web Admin/Web Admin _ Sign In/Page_Deliveree/Page_Deliveree/a_Back to list'))

WebUI.closeBrowser()

