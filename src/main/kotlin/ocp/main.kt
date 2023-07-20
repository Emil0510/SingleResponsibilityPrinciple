package ocp

import ocp.manager.BusDelivery
import ocp.manager.CarDelivery
import ocp.manager.ShipDelivery
import ocp.manager.WalkDelivery
import ocp.service.DeliveryService

fun main(){
   val deliveryService = DeliveryService()
    deliveryService.deliver(BusDelivery())
    deliveryService.deliver(CarDelivery())
    deliveryService.deliver(WalkDelivery())
    deliveryService.deliver(ShipDelivery())
}