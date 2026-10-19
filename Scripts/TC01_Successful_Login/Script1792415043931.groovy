import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.url)
WebUI.delay(2) // Jeda 2 detik setelah halaman terbuka

WebUI.click(findTestObject('Object Repository/JPetStore/lnk_SignIn'))
WebUI.delay(2) // Jeda 2 detik setelah klik Sign In

WebUI.setText(findTestObject('Object Repository/JPetStore/txt_Username'), GlobalVariable.validUsername)
WebUI.setText(findTestObject('Object Repository/JPetStore/txt_Password'), GlobalVariable.validPassword)
WebUI.click(findTestObject('Object Repository/JPetStore/btn_Login'))
WebUI.delay(2) // Jeda 2 detik setelah klik Login

WebUI.closeBrowser()