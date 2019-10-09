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

Mobile.tap(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ Schedule Booking/android.widget.TextView4 -  Input address or drop pin'), 
    0)

Mobile.setText(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ 1 Stop/android.widget.EditText0 -  Search name of location'), 
    'Nguyen Hue', 0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.TextView2 - Nguyen Hue Bn Ngh District 1 Ho Chi Minh City Vietnam'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 1 Route/Android User _ Page 1 Route _ 1 Stop/android.widget.Button1 - SET DESTINATION'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.ImageView4'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.TextView6 -  Input address or drop pin'), 
    0)

Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.EditText0 -  Search name of location'), 
    'nguyen thai binh', 0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.TextView3 - Nguyen Thai Binh District 1 Ho Chi Minh City Vietnam'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.Button1 - SET DESTINATION'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.ImageView9'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.TextView8 -  Input address or drop pin'), 
    0)

Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.EditText0 -  Search name of location'), 
    'tran hung dao', 0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.TextView2 - Trn Hng o District 1 Ho Chi Minh City Vietnam'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.Button1 - SET DESTINATION'), 
    0)

Mobile.tap(findTestObject('test 2/android.widget.ImageView11'), 0)

Mobile.tap(findTestObject('test 2/android.widget.CheckBox0'), 0)

Mobile.tap(findTestObject('test 2/android.widget.CheckBox1'), 0)

Mobile.tap(findTestObject('test 2/android.widget.ImageView14'), 0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/btn 0 Next'), 
    0)

Mobile.scrollToText('Business Services')

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/imgImageView4'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/lblTextView4 - L Th Hng Gm District 1 Ho Chi Minh City Vietnam'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/chkCheckBox0 - Document Return'), 
    0)

Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/txt0 - Note'), 
    'testa', 0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/chkCheckBox1 - Cash on Delivery'), 
    0)

Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/txtEditText1 - Note'), 
    'notea', 0)

Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/txt2 - Amount'), 
    '1', 0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/chkCheckBox2 - Document Return'), 
    0)

Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/txt3 - Note'), 
    'noteb', 0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/chkCheckBox3 - Cash on Delivery'), 
    0)

Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/txt4 - Note'), 
    'notec', 0)

Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/txt5 - Amount'), 
    '2', 0)

Mobile.swipe(200, 1000, 200, 100)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.CheckBox1 - Document Return'), 
    0)

not_run: Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.EditText3 -  Note'), 
    'test c', 0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.CheckBox3 - Cash on Delivery'), 
    0)

Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.EditText4 -  Note'), 
    'test d', 0)

not_run: Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.EditText2 -  Amount'), 
    '4', 0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.CheckBox0 - Document Return'), 
    0)

not_run: Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.EditText1 -  Note'), 
    'test e', 0)

Mobile.swipe(200, 1000, 200, 100)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.CheckBox1 - Cash on Delivery'), 
    0)

not_run: Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.EditText2 -  Note'), 
    'test f', 0)

not_run: Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.EditText3 -  Amount'), 
    '5', 0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.CheckBox1 - Document Return (1)'), 
    0)

not_run: Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.EditText2 -  Note (1)'), 
    'test g', 0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.CheckBox2 - Cash on Delivery'), 
    0)

Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.EditText2 -  Note (2)'), 
    'test h', 0)

not_run: Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/3 Stop/android.widget.EditText3 -  Amount (1)'), 
    '6', 0)

Mobile.scrollToText('Confirm')

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/btn2 - Confirm'), 
    0)

Mobile.swipe(200, 1000, 200, 100)

Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/txt0 - Optional'), 
    'dlvr50', 0)

Mobile.scrollToText('Note to Driver')

Mobile.setText(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/txt1 - Optional'), 
    'testdriver', 0)

Mobile.swipe(200, 1500, 200, 100)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/btnImageButton0'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/btn1 - Yes'), 
    0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/imgImageView2'), 
    0)

not_run: Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/txt0 - Select Photo or File'), 
    0)

not_run: Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/btnImageButton0 (1)'), 
    0)

not_run: Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/txt23 - Photos'), 
    0)

not_run: Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/view.View0'), 
    0)

not_run: Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/android.view.ViewGroup2'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 2 Services/android.widget.TextView1 - Take Photo'), 0)

Mobile.tap(findTestObject('Android User _ Page 2 Services/android.view.View4'), 0)

Mobile.tap(findTestObject('Android User _ Page 2 Services/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/btn1 - Next'), 
    0)

Mobile.swipe(1000, 1500, 200, 800)

Mobile.tap(findTestObject('Android User _ Page 3 Price/Android User _ Immediate Booking BP Account _ 3 Stop/android.widget.ImageView8'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 3 Price/Android User _ Immediate Booking BP Account _ 3 Stop/android.widget.ImageView0'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 3 Price/Android User _ Immediate Booking BP Account _ 3 Stop/android.widget.ImageView13'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 3 Price/Android User _ Immediate Booking BP Account _ 3 Stop/android.widget.ImageView0'), 
    0)

Mobile.swipe(1000, 1500, 200, 500)

Mobile.tap(findTestObject('Android User _ Page 3 Price/Android User _ Immediate Booking BP Account _ 3 Stop/android.widget.ImageView4'), 
    0)

Mobile.tap(findTestObject('Android User _ Page 3 Price/Android User _ Immediate Booking BP Account _ 3 Stop/android.widget.ImageView0'), 
    0)

sleep(4000)

Mobile.scrollToText('Confirm Booking')

Mobile.tap(findTestObject('Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking 3 Stop/Android User Immediate BP Booking 3 Stop _ Step 2 Step 3/btn1 - Confirm Booking'), 
    0)

sleep(10000)

Mobile.tap(findTestObject('Android User _ Finding Driver/android.widget.TextView0 - Assigning'), 0)

Mobile.closeApplication()

