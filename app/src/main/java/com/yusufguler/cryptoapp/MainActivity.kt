package com.yusufguler.cryptoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.yusufguler.cryptoapp.ui.theme.CryptoAppTheme
import com.yusufguler.cryptoapp.view.CryptoDetailScreen
import com.yusufguler.cryptoapp.view.CryptoListScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoAppTheme {
                val navController = rememberNavController()
                NavHost(navController =navController, startDestination = "crypto_list_screen"){

                    composable("crypto_list_screen"){
                        //Crypto List Screen
                        CryptoListScreen(navController = navController)
                    }
                    composable("crypto_detail_screen/{cryptoId}/{cryptoPrice}", arguments = listOf(
                        navArgument("cryptoId"){
                            type = NavType.StringType
                        },
                        navArgument("cryptoPrice"){
                            type = NavType.StringType
                        }
                    )){
                        //Crypto Details Screen
                        val cryptoId = remember{
                            it.arguments?.getString("cryptoId")
                        }
                        val cryptoPrice = remember{
                            it.arguments?.getString("cryptoPrice")
                        }
                        CryptoDetailScreen(id = cryptoId ?: "", price = cryptoPrice ?: "", navController = navController )
                    }

                }
            }
        }
    }
}
