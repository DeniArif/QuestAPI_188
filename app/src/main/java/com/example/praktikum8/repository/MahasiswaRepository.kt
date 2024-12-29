package com.example.praktikum8.repository

import android.os.Parcel
import android.os.Parcelable
import com.example.praktikum8.model.Mahasiswa
import com.example.praktikum8.service_api.MahasiswaService

interface MahasiswaRepository {

    suspend fun getMahasiswa(): List<Mahasiswa>
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    suspend fun updateMahasiswa(nim: String, mahasiswa: Mahasiswa)
    suspend fun deleteMahasiswa(nim: String)
    suspend fun getMahasiswaById(nim: String): Mahasiswa
}
class NetworkKontakRepository(
    private val kontakApiService: MahasiswaService
) : MahasiswaRepository {

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<NetworkKontakRepository> {
        override fun createFromParcel(parcel: Parcel): NetworkKontakRepository {
            return NetworkKontakRepository(parcel)
        }

        override fun newArray(size: Int): Array<NetworkKontakRepository?> {
            return arrayOfNulls(size)
        }
    }
}