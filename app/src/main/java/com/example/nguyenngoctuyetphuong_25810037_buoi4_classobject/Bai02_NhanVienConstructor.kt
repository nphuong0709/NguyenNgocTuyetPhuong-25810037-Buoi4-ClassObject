package com.example.nguyenngoctuyetphuong_25810037_buoi4_classobject

class NhanVien(
    maNhanVien: String,
    val ten: String,
    var luongThang: Double
) {

    constructor(maNhanVien: String) : this(
        maNhanVien,
        "Chưa có tên",
        0.0
    )

    init {
        println("Mã nhân viên khi khởi tạo: $maNhanVien")
    }

    fun inThongTin() {
        println("Tên: $ten")
        println("Lương tháng: $luongThang")

        // println(maNhanVien)
        // Lỗi vì maNhanVien chỉ là parameter của constructor,
        // không phải property của object.
    }
}

fun main() {
    val nv1 = NhanVien(
        "NV001",
        "Nguyễn Văn A",
        15000000.0
    )

    val nv2 = NhanVien("NV002")

    println("Nhân viên 1:")
    nv1.inThongTin()

    println()

    println("Nhân viên 2:")
    nv2.inThongTin()
}
