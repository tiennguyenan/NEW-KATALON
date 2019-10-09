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

Mobile.tap(findTestObject('Android User _ Sign In/Android User _ Sign in successfully when using existing account/btnHamburgerButton'), 
    0)

Mobile.tap(findTestObject('Android User _ Page Login/android.widget.TextView24 - Version 1.0.43.891'), 0)

String version = Mobile.getText(findTestObject('Object Repository/Android User _ Page Login/android.widget.TextView24 - Version 1.0.43.891'), 
    0)

System.out.println(('=======\n  Version of Build Testing  is: ' + version.toString()) + '\n=======')

Mobile.tap(findTestObject('Android User _ Sign In/Android User _ Sign in successfully when using existing account/btnLoginorSignup'), 
    0)

Mobile.setText(findTestObject('Android User _ Sign In/Android User _ Sign in successfully when using existing account/txtEmailAddressorPhoneNumber'), 
    'tien.nguyen@inspireventures.com', 0)

Mobile.setText(findTestObject('Android User _ Sign In/Android User _ Sign in successfully when using existing account/txtPassword'), 
    '123456abc', 0)

Mobile.tap(findTestObject('Android User _ Sign In/Android User _ Sign in successfully when using existing account/btnSignIn'), 
    0)

Mobile.tap(findTestObject('Android User _ Sign In/Android User _ Sign in successfully when using existing account/rdioCustomerType'), 
    0)

Mobile.tap(findTestObject('Android User _ Sign In/Android User _ Sign in successfully when using existing account/btnOK'), 
    0)

Mobile.tap(findTestObject('Android User _ Sign In/Android User _ Sign in successfully when using existing account/lblNewBooking'), 
    0)

Mobile.tap(findTestObject('Android User _ Sign In/Android User _ Sign in successfully when using existing account/btnHamburgerButton'), 
    0)

Mobile.tap(findTestObject('Android User _ Sign In/Android User _ Sign in successfully when using existing account/lblTien company new3'), 
    0)

Mobile.closeApplication()

