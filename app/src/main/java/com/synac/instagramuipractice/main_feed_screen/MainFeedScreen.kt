package com.synac.instagramuipractice.main_feed_screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.main_feed_screen.BottomBar

import com.synac.instagramuipractice.model.User

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainFeedScreen() {

    val users = listOf(
        User(
            profilePic = painterResource(R.drawable.jon_snow),
            username = "jon_snow",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.jon_snow_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "1h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.arya_stark),
            username = "arya_stark",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.arya_stark_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "2h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.bran_stark),
            username = "bran_stark",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.bran_stark_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "3h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.daenerys_targaryen),
            username = "queen_daenerys",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.daenerys_targaryen_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "1h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.jorah_mormont),
            username = "jorah_m",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.jorah_mormont_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "1h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.rob_stark),
            username = "robb_stark",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.robb_stark_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "5h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.sansa_stark),
            username = "sansa_stark",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.sansa_stark_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "1h ago"
        ),
        User(
            profilePic = painterResource(R.drawable.tyrian_lannister),
            username = "tyrian_lan",
            location = "Accra, Ghana",
            postPic = painterResource(R.drawable.tyrian_lannister_post),
            likeCount = 168,
            caption = "Hey Guy's, checkout my new post",
            commentCount = 15,
            commentTime = "2h ago"
        )
    )

    Scaffold(
        topBar = { TopBar() },
        containerColor = Color.White,
        bottomBar = { BottomBar() }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            item {
                LazyRow {
                    items(users) { user ->

                    }
                }
            }
            item { Divider() }
            items(users) { user ->
                PostWidget(user = user)
                Spacer(modifier = Modifier.height(15.dp))
            }
        }
    }
}
