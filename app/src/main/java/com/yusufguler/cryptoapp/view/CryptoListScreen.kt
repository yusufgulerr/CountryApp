package com.yusufguler.cryptoapp.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.yusufguler.cryptoapp.model.CryptoList
import com.yusufguler.cryptoapp.viewmodel.CryptoListViewModel
import java.lang.reflect.Modifier

@Composable
fun CryptoListScreen(
    navController: NavController,
    viewModel : CryptoListViewModel = hiltViewModel()
){
    Surface(
        color = MaterialTheme.colors.secondary,
        modifier = androidx.compose.ui.Modifier.fillMaxSize()
    ){
        Column {
            Text(text = "Crypto Crazy", modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(20.dp),
                textAlign = TextAlign.Center,
                fontSize = 45.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.primary
            )
            Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
            //Search


            Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
            //List


        }
        
        
        
    }

}

@Composable
fun SearchBar(
    modifier : androidx.compose.ui.Modifier = androidx.compose.ui.Modifier,
    hint : String = "",
    onSearch : (String) -> Unit = {}
) {
    var text = remember{
        mutableStateOf("")
    }

}



