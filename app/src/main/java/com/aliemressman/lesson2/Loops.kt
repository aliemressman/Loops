package com.aliemressman.lesson2

class Loops {
}

fun main(){

    for (number in 1..10){
        println(number)
    }

    val sebzeListesi : List<String> = listOf("salatalık", "domates", "biber")
    for (sebze in sebzeListesi){
        println(sebze)
    }

    val karakter : MutableSet<Char> = mutableSetOf('a', 'b', 'c')
    karakter.add('z')

    for (harf in karakter){
        println(harf)
    }
    println(karakter.count())
    print(karakter.size)

    var cakeEat = 0
    while (cakeEat < 5 ) {
        println("Cake is eaten")
        cakeEat++
    }

    var cakeBake = 0
    while (cakeEat < 5){
        println("Cake is baked")
        cakeEat++
    }
    do {
        println("Cake is baked")
        cakeBake++
    } while (cakeBake < 5)

}