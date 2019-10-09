import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\User\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Android User _ BP Account\\Android User _ Create an Immediate Booking BP Account 1 Stop - Cancel booking before driver accept booking\\20190723_155741\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Android User _ BP Account/Android User _ Create an Immediate Booking BP Account 1 Stop - Cancel booking before driver accept booking', new TestCaseBinding('Test Cases/Android User _ BP Account/Android User _ Create an Immediate Booking BP Account 1 Stop - Cancel booking before driver accept booking',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
