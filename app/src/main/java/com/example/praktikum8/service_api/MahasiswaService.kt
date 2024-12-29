package com.example.praktikum8.service_api

import com.example.praktikum8.model.Mahasiswa
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface MahasiswaService{
    @Headers(
        "Accept : apllication/json",
        "Content-Type: application/json",
    )
    @GET("bacamahasiswa.php")
    suspend fun getAllMahasiswsa(): List<Mahasiswa>

    @GET("baca1mahasiswa.php/{nim}")
    suspend fun getMahasiswaNim(@Query("nim") nim:String):Mahasiswa

    @POST("insertmahasiswa.php")
    suspend fun insertMahasiswa(@Body mahasiswa:Mahasiswa)

    @PUT("editmahasiswa.php/{nim}")
    suspend fun updateMahasiswa(@Query("nim")nim:String,@Body mahasiswa:Mahasiswa)

    @DELETE("deletedmahasiswa.php/{nim}")
    suspend fun updateMahasiswa(@Query("nim")nim: String): retrofit2.Response<Void>
}