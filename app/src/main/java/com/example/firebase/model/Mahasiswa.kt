package com.example.firebase.model

data class Mahasiswa(
    val nim: String,
    val nama: String,
    val alamat: String,
    val jenis_kelamin: String,
    val angkatan: String,
    val dosen1: String,
    val dosen2: String,
    val judulSkripsi: String,
)
{
    constructor(

    ):this("","","","","","","","",)
}