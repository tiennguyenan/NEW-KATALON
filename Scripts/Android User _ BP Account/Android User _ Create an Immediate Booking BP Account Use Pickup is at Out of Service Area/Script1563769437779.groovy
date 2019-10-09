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

Mobile.callTestCase(findTestCase('Test Cases/Android User _ Sign In/Android User _ Sign in BP Account Function'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.startApplication('D:\\KATALON\\APP 2019\\Deliveree_User_Staging.apk', true)

not_run: Mobile.tap(findTestObject('Android User _ Page Login/btnHamburger'), 0)

not_run: Mobile.tap(findTestObject('Android User _ Page Login/android.widget.TextView24 - Version 1.0.43.891'), 0)

not_run: String version = Mobile.getText(findTestObject('Object Repository/Android User _ Page Login/android.widget.TextView24 - Version 1.0.43.891'), 
    0)

not_run: System.out.println(('=======\n  Version of Build Testing  is: ' + version.toString()) + '\n=======')

not_run: Mobile.tap(findTestObject('Android User _ Page Login/btnLoginOrSignup'), 0)

not_run: Mobile.setText(findTestObject('Android User _ Page Login/txtEditText0 - Email Address or Phone Number'), 'tien.nguyen@inspireventures.com', 
    0)

not_run: Mobile.setText(findTestObject('Android User _ Page Login/txtEditText1 - Password'), '123456abc', 0)

not_run: Mobile.tap(findTestObject('Android User _ Page Login/btn1 - Sign In'), 0)

not_run: Mobile.tap(findTestObject('Android User _ Page Login/lblTextView1 - TienTestCompanyNEWMOINHAT'), 0)

not_run: Mobile.tap(findTestObject('Android User _ Page Login/btn0 - OK'), 0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/lbl - TIEN LEXUS TEST'), 0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/lblTextView6 - Select Time'), 0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ Immediate Booking/btn Immediate 45min'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Acount Use Pickup is at Out of Market (Country)/android.widget.TextView4 -  Input address or drop pin'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Acount Use Pickup is at Out of Market (Country)/android.widget.ImageView0'), 
    0)

Mobile.pinchToZoomInAtPosition(500, 500, 500)

for (int i : (1..80)) {
    Mobile.swipe(50, 500, 1000, 500)
}

Mobile.tap(findTestObject('Android User _ BP Acount Use Pickup is at Out of Market (Country)/android.widget.Button1 - SET DESTINATION'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Acount Use Pickup is at Out of Market (Country)/android.widget.Button0 - Next'), 
    0)

sleep(10000)

Mobile.closeApplication()

