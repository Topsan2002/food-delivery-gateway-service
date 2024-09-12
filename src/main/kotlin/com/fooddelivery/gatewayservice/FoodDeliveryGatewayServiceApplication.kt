package com.fooddelivery.gatewayservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FoodDeliveryGatewayServiceApplication

fun main(args: Array<String>) {
    runApplication<FoodDeliveryGatewayServiceApplication>(*args)
}
