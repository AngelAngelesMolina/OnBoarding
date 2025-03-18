package com.example.onboarding.onBoardView

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.onboarding.R
import com.example.onboarding.data.PageData
import com.example.onboarding.dataStore.StoreBoarding
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainOnboarding(navController: NavController, store: StoreBoarding) {

    val items = ArrayList<PageData>()

    items.add(
        PageData(
            image = R.raw.page1,
            title = "Title 1",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"
        )
    )
    items.add(
        PageData(
            image = R.raw.page2,
            title = "Title 2",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"
        )
    )

    items.add(
        PageData(
            image = R.raw.page3,
            title = "Title 3",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"
        )
    )
    val pagerState =
        rememberPagerState(
            pageCount = items.size,
            initialOffscreenLimit = 2, //maximo de items
            infiniteLoop = false,
            initialPage = 0 //pagina inicial
        ) //Sacamos el numero de paginas en el array


    OnBoardingPager(
        item = items, pagerState, modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White), navController = navController, store = store
    )
}