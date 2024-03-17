package com.aliemressman.lesson2

fun main(){
    val arabalar : MutableList<String> = mutableListOf("BMW", "Mercedes", "Audi", "Ferrari", "Lamborghini")
    arabalar.add("Porsche")
    println("Auid" in arabalar)
    println(arabalar.count())
    println(arabalar[2])

    val arabalar2 : MutableSet<String> = mutableSetOf("BMW", "Mercedes", "Audi", "Ferrari", "Lamborghini")
    arabalar2.add("Porsche")
    println("Audi" in arabalar2)
    println(arabalar2.count())
    println(arabalar2.elementAt(2))

    val arabalar3 = mutableMapOf("BMW" to "M3", "Mercedes" to "C180", "Audi" to "A3", "Ferrari" to "F8", "Lamborghini" to "Aventador")
    arabalar3.put("Porsche", "911")
    println(arabalar3["Audi"])
    println(arabalar3.count())
    println(arabalar3.keys)
}
class Collection {
}
