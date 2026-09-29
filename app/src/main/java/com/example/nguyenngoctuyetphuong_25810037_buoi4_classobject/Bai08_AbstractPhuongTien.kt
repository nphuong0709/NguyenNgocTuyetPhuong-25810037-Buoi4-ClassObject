package com.example.nguyenngoctuyetphuong_25810037_buoi4_classobject

abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int

    fun moTa() {
        println("Phuong tien co toc do toi da: $tocDoToiDa km/h")
    }
}

class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 120
}

class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 200
}

fun main() {
    val xeMay = XeMay()
    val oTo = OTo()

    xeMay.moTa()
    oTo.moTa()
}