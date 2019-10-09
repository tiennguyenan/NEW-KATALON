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

def bookingid = WebUI.callTestCase(findTestCase('Android User _ BP Account/Android User _ Create a FullDay Booking BP Account 1 Stop - Sent to Favorite driver'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://admin.stg.deliveree.com/staffs/sign_in')

WebUI.setText(findTestObject('null'), 'tien.nguyen@deliveree.com')

WebUI.setEncryptedText(findTestObject('null'), 
    'A6cbiHqbQHLxx8IIeu56jw==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.navigateToUrl('https://admin.stg.deliveree.com/bookings/66602')

//String bookingid = 66602

WebUI.doubleClick(findTestObject('null'))


String Favorite = WebUI.getText(findTestObject('null'))

Favorite = Favorite.substring(Favorite.length() - 8)

Favorite = Favorite.trim()

if (Favorite == 'Favorite') 
{
	System.out.println(('\n=======\n||| Your Booking: ' + bookingid) + ' has been sent to Favorite Driver (True)\n=======')
	
}
 else 
{
	System.out.println(('\n=======\n||| Your Booking: ' + bookingid) + ' hasn\'t been sent to Favorite Driver (False)\n=======')
	
}

//WebUI.closeBrowser()

