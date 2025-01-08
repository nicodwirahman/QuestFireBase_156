package com.example.firebase.model

data class Mahasiswa(
    val nim: String,
    val nama: String,
    val alamat: String,
    val jenis_kelamin: String,
    val angkatan: String,
    val kelas: String,
)
{
    constructor(

    ):this("","","","","","")
}