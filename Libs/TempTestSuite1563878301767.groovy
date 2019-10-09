import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Android User Suite')

suiteProperties.put('name', 'Android User Suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\tien test git deliveree\\Reports\\Android User Suite\\20190723_173821\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Android User Suite', suiteProperties, [new TestCaseBinding('Test Cases/Android User _ Non BP Account/Android User _ Create a FullDay Booking Non BP 1 Stop', 'Test Cases/Android User _ Non BP Account/Android User _ Create a FullDay Booking Non BP 1 Stop',  null), new TestCaseBinding('Test Cases/Android User _ Non BP Account/Android User _ Create a Schedule Booking Non BP 1 Stop', 'Test Cases/Android User _ Non BP Account/Android User _ Create a Schedule Booking Non BP 1 Stop',  null), new TestCaseBinding('Test Cases/Android User _ Non BP Account/Android User _ Create an Immediate Booking Non BP 1 Stop', 'Test Cases/Android User _ Non BP Account/Android User _ Create an Immediate Booking Non BP 1 Stop',  null), new TestCaseBinding('Test Cases/Android User _ BP Account/Android User _ Create a FullDay Booking BP Account 1 Stop', 'Test Cases/Android User _ BP Account/Android User _ Create a FullDay Booking BP Account 1 Stop',  null), new TestCaseBinding('Test Cases/Android User _ BP Account/Android User _ Create a Schedule Booking BP Account 1 Stop', 'Test Cases/Android User _ BP Account/Android User _ Create a Schedule Booking BP Account 1 Stop',  null), new TestCaseBinding('Test Cases/Android User _ BP Account/Android User _ Create an Immediate Booking BP Account 1 Stop', 'Test Cases/Android User _ BP Account/Android User _ Create an Immediate Booking BP Account 1 Stop',  null), new TestCaseBinding('Test Cases/Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking BP Account 3 Stop', 'Test Cases/Android User _ BP Account _ 3 Stop/Android User _ Create an Immediate Booking BP Account 3 Stop',  null), new TestCaseBinding('Test Cases/Android User _ Non BP Account _ 3 Stop/Android User _ Create an Immediate Booking Non BP Account 3 Stop', 'Test Cases/Android User _ Non BP Account _ 3 Stop/Android User _ Create an Immediate Booking Non BP Account 3 Stop',  null), new TestCaseBinding('Test Cases/Android User _ Sign In/Android User _ Sign in successfully when using existing account', 'Test Cases/Android User _ Sign In/Android User _ Sign in successfully when using existing account',  null), new TestCaseBinding('Test Cases/Android User _ BP Account _ 3 Stop/Android User _ Create a Schedule Booking BP Account 3 Stop', 'Test Cases/Android User _ BP Account _ 3 Stop/Android User _ Create a Schedule Booking BP Account 3 Stop',  null), new TestCaseBinding('Test Cases/Android User _ Non BP Account _ 3 Stop/Android User _ Create a Schedule Booking Non BP 3 Stop', 'Test Cases/Android User _ Non BP Account _ 3 Stop/Android User _ Create a Schedule Booking Non BP 3 Stop',  null), new TestCaseBinding('Test Cases/Android User _ BP Account/Android User _ Create a Long Haul Booking BP Account', 'Test Cases/Android User _ BP Account/Android User _ Create a Long Haul Booking BP Account',  null), new TestCaseBinding('Test Cases/Android User _ Non BP Account/Android User _ Create a Long Haul Booking Non BP Account', 'Test Cases/Android User _ Non BP Account/Android User _ Create a Long Haul Booking Non BP Account',  null), new TestCaseBinding('Test Cases/Android User_Sign Up/Android User _ Sign Up', 'Test Cases/Android User_Sign Up/Android User _ Sign Up',  null), new TestCaseBinding('Test Cases/Android User _ BP Account/Android User _ Create an Immediate Booking BP Account Use Pickup is at Out of Service Area', 'Test Cases/Android User _ BP Account/Android User _ Create an Immediate Booking BP Account Use Pickup is at Out of Service Area',  null)])
