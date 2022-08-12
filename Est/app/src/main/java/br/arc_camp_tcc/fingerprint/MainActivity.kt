package br.arc_camp_tcc.fingerprint

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat

// API 23 - Empty

// PoC - Proof of Concept

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(BiometricHelper.isBiometricAvaliable(this)){

            val executer = ContextCompat.getMainExecutor(this)

            val bio =  BiometricPrompt(this, executer, object : BiometricPrompt.AuthenticationCallback() {
                override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                    val s = ""
                    super.onAuthenticationSucceeded(result)
                }
            })

            val info = BiometricPrompt.PromptInfo.Builder()
                .setTitle("Titulo")
                .setSubtitle("Sub Titulo")
                .setDescription("Descricao")
                .setNegativeButtonText("Cancelar")
                .build()

            bio.authenticate(info)

        }

        supportActionBar?.hide()
    }
}