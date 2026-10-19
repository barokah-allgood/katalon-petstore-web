import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.url)
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JPetStore/lnk_SignIn'))
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/JPetStore/txt_Username'), 'invalidUser123')
WebUI.setText(findTestObject('Object Repository/JPetStore/txt_Password'), 'wrongPassword123')
WebUI.click(findTestObject('Object Repository/JPetStore/btn_Login'))
WebUI.delay(2)

WebUI.closeBrowser()