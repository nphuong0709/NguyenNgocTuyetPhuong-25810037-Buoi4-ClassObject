package com.example.nguyenngoctuyetphuong_25810037_buoi4_classobject
class SanPham(val tenSanPham:String, val gia:Double, val soLuongTonKho:Int=0)

fun main() {
    val sanPham1 = SanPham(
        tenSanPham = "Laptop",
        gia = 15000000.0,
        soLuongTonKho = 10
    )

    val sanPham2 = SanPham(
        tenSanPham = "Chuột",
        gia = 250000.0
    )

    println("Sản phẩm 1:")
    println("Tên: ${sanPham1.tenSanPham}")
    println("Giá: ${sanPham1.gia}")
    println("Số lượng tồn kho: ${sanPham1.soLuongTonKho}")

    println()

    println("Sản phẩm 2:")
    println("Tên: ${sanPham2.tenSanPham}")
    println("Giá: ${sanPham2.gia}")
    println("Số lượng tồn kho: ${sanPham2.soLuongTonKho}")
}
