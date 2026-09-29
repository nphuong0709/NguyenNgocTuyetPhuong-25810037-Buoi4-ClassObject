package com.example.nguyenngoctuyetphuong_25810037_buoi4_classobject

data class SinhVien(
    val mssv: String,
    val hoTen: String,
    val diemTrungBinh: Double
)

fun main() {
    val sinhVien1 = SinhVien(
        mssv = "25810025",
        hoTen = "Vuong Tuan Kiet",
        diemTrungBinh = 8.0
    )

    val sinhVien2 = SinhVien(
        mssv = "25810025",
        hoTen = "Vuong Tuan Kiet",
        diemTrungBinh = 8.0
    )

    println("Sinh vien 1: $sinhVien1")
    println("Sinh vien 2: $sinhVien2")

    println("Hai sinh vien bang nhau: ${sinhVien1 == sinhVien2}")

    val sinhVien3 = sinhVien1.copy(
        diemTrungBinh = 9.0
    )

    println("Sinh vien sau khi copy: $sinhVien3")
}