package br.arc_camp_tcc.fingerprint

import android.content.Context
import android.os.Build
import androidx.biometric.BiometricManager
import androidx.biometric.BiometricManager.Authenticators.BIOMETRIC_WEAK

class BiometricHelper {
    companion object{
        fun isBiometricAvaliable(context: Context): Boolean{

            if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
                return false
            }

            val biometricManager = BiometricManager.from(context)
            when (biometricManager.canAuthenticate(BIOMETRIC_WEAK)){
                BiometricManager.BIOMETRIC_SUCCESS -> return true
                BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE -> return false
                BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE -> return false
                BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED -> return false
            }

            return false
        }
    }
}