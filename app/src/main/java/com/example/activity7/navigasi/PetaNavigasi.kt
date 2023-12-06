@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.activity7.navigasi

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.activity7.R
import com.example.activity7.ui.halaman.DestinasiEntry
import com.example.activity7.ui.halaman.DestinasiHome
import com.example.activity7.ui.halaman.Entrysiswascreen
import com.example.activity7.ui.halaman.HomeScreen

@Composable
fun SiswaApp(navController: NavHostController = rememberNavController()){
    HostNavigasi (navController = navController)
}

@Composable
fun SiswaTopAppBar(
    title: String,
    canNavigateback: Boolean,
    modifier: Modifier =Modifier,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    navigateUp: () -> Unit = {}
){
    CenterAlignedTopAppBar(
        title = { Text(title)},
        modifier = Modifier,
        scrollBehavior = scrollBehavior,
        navigationIcon = {
            if (canNavigateback){
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(id = R.string.back)
                    )
                }
            }
        })
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(navController=navController, startDestination = DestinasiHome.route, modifier = Modifier)
    {
       composable(DestinasiHome.route){
           HomeScreen(navigateToItemEntry = {navController.navigate(DestinasiEntry.route)})
       }
        composable(DestinasiEntry.route){
            Entrysiswascreen(navigateBack = {navController.popBackStack() })
        }
        
    }
}