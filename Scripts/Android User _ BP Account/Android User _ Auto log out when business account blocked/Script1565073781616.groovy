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

Mobile.startApplication('D:\\KATALON\\APP 2019\\Deliveree_User_Staging.apk', true)

Mobile.tap(findTestObject('Android User _ Page Login/btnHamburger'), 0)

Mobile.tap(findTestObject('Android User _ Page Login/android.widget.TextView24 - Version 1.0.43.891'), 0)

String version = Mobile.getText(findTestObject('Object Repository/Android User _ Page Login/android.widget.TextView24 - Version 1.0.43.891'), 
    0)

System.out.println(('=======\n  Version of Build Testing  is: ' + version.toString()) + '\n=======')

Mobile.tap(findTestObject('Android User _ Page Login/btnLoginOrSignup'), 0)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Android User _ Page Login/txtEditText0 - Email Address or Phone Number'), 'tien.nguyen@inspireventures.com', 
    0)

Mobile.setText(findTestObject('Android User _ Page Login/txtEditText1 - Password'), '123456abc', 0)

Mobile.tap(findTestObject('Android User _ Page Login/btn1 - Sign In'), 0)

Mobile.tap(findTestObject('Android User - Confirm reimbursement/Android User _ Auto log out when business account blocked/android.widget.TextView0 - Your account has been blocked please contact customer service.'), 
    0)

Mobile.closeApplication()

