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






Random random = new Random()

int number = random.nextInt(10000000)

String randoms = String.format('%05d', number)

String phonenumber = '099' + randoms



String email = ('firstname' + phonenumber + '@gmail.com')


//////////////////////////////////////////////////////
Mobile.startApplication('D:\\KATALON\\APP 2019\\Deliveree_User_Staging.apk', true)

Mobile.tap(findTestObject('Android User_ Sign Up/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Android User_ Sign Up/android.widget.TextView19 - Login or Sign up'), 0)

Mobile.tap(findTestObject('Android User_ Sign Up/android.widget.TextView2 - Create an account'), 0)

Mobile.setText(findTestObject('Android User_ Sign Up/android.widget.EditText0 - Email Address'), email,0)

Mobile.setText(findTestObject('Android User_ Sign Up/android.widget.EditText1 - Phone Number'), phonenumber, 0)

Mobile.setText(findTestObject('Android User_ Sign Up/android.widget.EditText2 - First Name'), 'Hung', 0)

Mobile.setText(findTestObject('Android User_ Sign Up/android.widget.EditText3 - Last Name'), 'Nguyen Van', 0)

Mobile.setText(findTestObject('Android User_ Sign Up/android.widget.EditText6 - Password (6 characters required)'), '123456', 
    0)

Mobile.tap(findTestObject('Android User_ Sign Up/android.widget.Button1'), 0)

Mobile.tap(findTestObject('Android User_ Sign Up/android.widget.Button2 - Sign Up'), 0)

Mobile.tap(findTestObject('Android User_ Sign Up/android.widget.Button1 - OK'), 0)

Mobile.tap(findTestObject('Android User_ Sign Up/android.widget.TextView0 - Passcode Required'), 0)



System.out.println('=======\n  Phone number signup is: ' + phonenumber + '\n=======')
System.out.println('=======\n  Email signup is: ' + email + '\n=======')



Mobile.closeApplication()

