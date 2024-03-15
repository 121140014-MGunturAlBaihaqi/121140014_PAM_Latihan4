package com.example.a121140014_pam_latihan4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi NavHostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        // Tambahkan kode ini untuk melakukan transisi dari FragmentA ke FragmentB saat Activity pertama kali dibuat
        navController.navigate(R.id.action_fragmentA_to_fragmentB)
    }
}
