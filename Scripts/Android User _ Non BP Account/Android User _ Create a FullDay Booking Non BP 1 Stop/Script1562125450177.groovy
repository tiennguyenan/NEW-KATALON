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

Mobile.callTestCase(findTestCase('Android User _ Sign In/Android User _ Sign in Non BP Account Function'), [:], FailureHandling.STOP_ON_FAILURE)

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

not_run: Mobile.tap(findTestObject('Android User _ Page Login/txtTextView0 - Personal'), 0)

not_run: Mobile.tap(findTestObject('Android User _ Page Login/btn0 - OK'), 0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/lbl - TIEN LEXUS TEST'), 0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/lblTextView6 - Select Time'), 0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ FullDay Booking 1 Stop/android.widget.TextView8 - Full Day10 hours flat price'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ FullDay Booking 1 Stop/lblView30 - 30'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ FullDay Booking 1 Stop/android.widget.Button1 - OK'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ FullDay Booking 1 Stop/android.widget.Button1 - OK (1)'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ 1 Stop/txt Input address or drop pin'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ 1 Stop/android.widget.TextView4 -  Destination optional'), 
    0)

Mobile.setText(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ 1 Stop/android.widget.EditText0 -  Search name of location'), 
    'nguyen thai binh', 0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ 1 Stop/android.widget.TextView3 - Nguyen Thai Binh District 1 Ho Chi Minh City Vietnam'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ 1 Stop/android.widget.Button1 - SET DESTINATION'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ 1 Stop/android.widget.Button0 - Next'), 
    0)

Mobile.swipe(200, 500, 200, 100)

Mobile.scrollToText('Discount Code')

Mobile.tap(findTestObject('Android User _ Page 2 Services/android.widget.TextView6 - Discount Code'), 0)

Mobile.setText(findTestObject('Android User _ Page 2 Services/android.widget.EditText0 -  Optional'), 'tienabc', 0)

Mobile.scrollToText('Note to Driver')

Mobile.tap(findTestObject('Android User _ Page 2 Services/android.widget.TextView11 - Note to Driver'), 0)

Mobile.setText(findTestObject('Android User _ Page 2 Services/txt1 - Optional'), 'testdriver', 0)

Mobile.swipe(200, 500, 200, 100)

Mobile.tap(findTestObject('Android User _ Page 2 Services/btnImageButton0'), 0)

Mobile.tap(findTestObject('Android User _ Page 2 Services/btn1 - Yes'), 0)

Mobile.tap(findTestObject('Android User _ Page 2 Services/imgImageView2'), 0)

not_run: Mobile.tap(findTestObject('Android User _ BP Account/Android User _ Create an Immediate Booking 1 Stop/Android User Immediate BP Booking Step 2 Step 3/txt0 - Select Photo or File'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 2 Services/android.widget.TextView1 - Take Photo'), 0)

Mobile.tap(findTestObject('Android User _ Page 2 Services/android.view.View4'), 0)

Mobile.tap(findTestObject('Android User _ Page 2 Services/android.widget.ImageView1'), 0)

not_run: Mobile.tap(findTestObject('Android User _ BP Account/Android User _ Create an Immediate Booking 1 Stop/Android User Immediate BP Booking Step 2 Step 3/btnImageButton0 (1)'), 
    0)

not_run: Mobile.tap(findTestObject('Android User _ BP Account/Android User _ Create an Immediate Booking 1 Stop/Android User Immediate BP Booking Step 2 Step 3/txt23 - Photos'), 
    0)

not_run: Mobile.tap(findTestObject('Android User _ BP Account/Android User _ Create an Immediate Booking 1 Stop/Android User Immediate BP Booking Step 2 Step 3/view.View0'), 
    0)

not_run: Mobile.tap(findTestObject('Android User _ BP Account/Android User _ Create an Immediate Booking 1 Stop/Android User Immediate BP Booking Step 2 Step 3/view.ViewGroup1'), 
    0)

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Android User _ Page 2 Services/btn1 - Next'), 0)

Mobile.swipe(200, 1500, 200, 100)

Mobile.tap(findTestObject('Android User _ Page 3 Price/android.widget.ImageView6 Add me'), 0)

Mobile.swipe(200, 1500, 200, 100)

Mobile.scrollToText('Confirm Booking')

Mobile.tap(findTestObject('Android User _ Page 3 Price/btn1 - Confirm Booking'), 0)

sleep(10000)

Mobile.tap(findTestObject('Android User _ Finding Driver/android.widget.TextView0 - Assigning'), 0)

Mobile.closeApplication()

