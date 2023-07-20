package ocp.service

import ocp.idelivery.IDelivery

class DeliveryService   {
    fun deliver(iDelivery: IDelivery){
        iDelivery.deliver()
    }
}