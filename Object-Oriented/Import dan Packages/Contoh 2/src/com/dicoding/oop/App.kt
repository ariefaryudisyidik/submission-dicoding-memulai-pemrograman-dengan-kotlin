package com.dicoding.oop

import com.dicoding.oop.utils.PI
import com.dicoding.oop.utils.factorial
import com.dicoding.oop.utils.pow
import com.dicoding.oop.utils.sayHello

fun main() {
    sayHello()
    println(factorial(4.0))
    println(pow(3.0, 2.0))
    println(PI)
}

/*
   output:
       Hello From package utils
       24.0
       9.0
       3.1415926535
*/