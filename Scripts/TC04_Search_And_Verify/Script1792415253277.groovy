import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.url)
WebUI.setText(findTestObject('Object Repository/JPetStore/txt_Search'), 'Fish')
WebUI.click(findTestObject('Object Repository/JPetStore/btn_Search'))
WebUI.closeBrowser()