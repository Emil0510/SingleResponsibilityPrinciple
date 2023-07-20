import data.SMS
import factory.SMSFacade
import manager.GenerateManager
import manager.SaveUIDManager
import manager.SendSMSManager

fun main(){
    val smsFacade  = SMSFacade(GenerateManager(), SaveUIDManager(), SendSMSManager())
    val sms = SMS("1", "Hello")
    smsFacade.sendSMS(sms)
    smsFacade.saveUID(sms)
    smsFacade.generateInvoice(sms)
}