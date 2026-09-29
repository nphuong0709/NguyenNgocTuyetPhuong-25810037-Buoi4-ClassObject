package com.example.nguyenngoctuyetphuong_25810037_buoi4_classobject

fun String.demNguyenAm(): Int {
    var soLuong = 0

    for (kyTu in this.lowercase()) {
        if (kyTu in "aeiou") {
            soLuong++
        }
    }

    return soLuong
}

fun Int.kiemTraSoNguyenTo(): Boolean {
    if (this < 2) {
        return false
    }

    for (i in 2 until this) {
        if (this % i == 0) {
            return false
        }
    }

    return true
}

fun main() {
    val chuoi1 = "Hello Kotlin"
    val chuoi2 = "Programming"

    println("So nguyen am chuoi 1: ${chuoi1.demNguyenAm()}")
    println("So nguyen am chuoi 2: ${chuoi2.demNguyenAm()}")

    val so1 = 7
    val so2 = 10

    println("$so1 la so nguyen to: ${so1.kiemTraSoNguyenTo()}")
    println("$so2 la so nguyen to: ${so2.kiemTraSoNguyenTo()}")
}
