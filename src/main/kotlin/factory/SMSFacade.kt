package factory

import data.SMS
import manager.GenerateManager
import manager.SaveUIDManager
import manager.SendSMSManager

class SMSFacade(
    private var generateManager: GenerateManager,
    private var saveUIDManager: SaveUIDManager,
    private var sendSMSManager: SendSMSManager
) {
    fun generateInvoice(sms : SMS){
        generateManager.generateInvoice(sms)
    }
    fun saveUID(sms : SMS){
        saveUIDManager.saveUID(sms)
    }
    fun sendSMS(sms: SMS){
        sendSMSManager.sendSMS(sms)
    }
}