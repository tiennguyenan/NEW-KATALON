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
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.mobile.driver.MobileDriverType as MobileDriverType
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import org.openqa.selenium.WebDriver as WebDriver
import io.appium.java_client.MultiTouchAction as MultiTouchAction
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.offset.PointOption as PointOption
import com.kms.katalon.webui.keyword.vuejs.ModalKeywords as ModalKeywords
import com.kms.katalon.webui.keyword.vuejs.RichTextEditorKeywords as RichTextEditorKeywords

//AppiumDriver<?> driver = MobileDriverFactory.getDriver()
//KeywordLogger log = new KeywordLogger()
//log.logInfo(driver.getPageSource())
//@Keyword
Mobile.startApplication('D:\\KATALON\\APP 2019\\Deliveree_User_Staging.apk', true)

Mobile.tap(findTestObject('Android User _ Page Login/btnHamburger'), 0)

Mobile.tap(findTestObject('Android User _ Page Login/android.widget.TextView24 - Version 1.0.43.891'), 0)

String version = Mobile.getText(findTestObject('Object Repository/Android User _ Page Login/android.widget.TextView24 - Version 1.0.43.891'), 
    0)

System.out.println(('=======\n  Version of Build Testing  is: ' + version.toString()) + '\n=======')

Mobile.tap(findTestObject('Android User _ Page Login/btnLoginOrSignup'), 0)

Mobile.setText(findTestObject('Android User _ Page Login/txtEditText0 - Email Address or Phone Number'), 'tien.nguyen@inspireventures.com', 
    0)

Mobile.setText(findTestObject('Android User _ Page Login/txtEditText1 - Password'), '123456abc', 0)

Mobile.tap(findTestObject('Android User _ Page Login/btn1 - Sign In'), 0)

Mobile.tap(findTestObject('Android User _ Page Login/lblTextView1 - TienTestCompanyNEWMOINHAT'), 0)

Mobile.tap(findTestObject('Android User _ Page Login/btn0 - OK'), 0)

Mobile.waitForElementPresent(findTestObject('Android User _ Page Login/btnHamburger'), 200)

Mobile.tap(findTestObject('Android User _ Page Login/btnHamburger'), 0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

'Create object to "MultiTouchAction" class '
MultiTouchAction multiTouch = new MultiTouchAction(driver)

'Create First action Object to "TouchAction" class'

'Press First action with x y coordinates wait 5 Seconds then release'
TouchAction touchAction = new TouchAction(driver)

Mobile.delay(10)

//touchAction.tap(PointOption.point(125, 400)).perform()
touchAction.tap(PointOption.point(125, 400)).perform()

Mobile.delay(10)

//touchAction.tap(PointOption.point(300, 400)).perform()
Mobile.tap(findTestObject('Android User - Confirm reimbursement/android.widget.TextView22 - My Bookings'), 0)

Mobile.tap(findTestObject('Android User - Confirm reimbursement/android.widget.TextView2 - PAST (1)'), 0)

//clickAtOffset((findTestObject('Android User - Confirm reimbursement/android.widget.TextView2 - PAST')),100.200)
//Mobile.tap(findTestObject('Android User - Confirm reimbursement/android.widget.TextView2 - PAST'), 0)
Mobile.tap(findTestObject('Android User - Confirm reimbursement/android.widget.TextView4 - Click to review reimbursements'), 
    0)

Mobile.tap(findTestObject('Android User - Confirm reimbursement/android.widget.Button1 - Submit'), 0)

//CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot'(findTestObject('WebApp_page/Step2/btn_Auto_Attachment_2'), 
// 'D:\\Image\\800x800-uniform.jpg')
Mobile.closeApplication()

def clickAtOffset(TestObject to, int Xoffset, int Yoffset) {
    ele = Mobile.findTestObject(to, 30)

    AppiumDriver<?> driver = MobileDriverFactory.getDriver()

    Actions build = new Actions(driver)

    build.moveToElement(ele, Xoffset, Yoffset).click().build().perform()
}

