package com.example.visprogalp_granautismo.ui.view.create_post

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.ui.theme.LightPurple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarCreatePost() {

    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp, top = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = {
                    // Handle back button click here
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
                        tint = LightPurple,
                        contentDescription = "Back Button",
                        modifier = Modifier
                            .size(25.dp)
                            .padding(top = 5.dp)
                    )
                }
                Text(
                    text = "Create your post",
                    modifier = Modifier
                        .padding(top = 3.dp),
                    style = TextStyle(
                        fontSize = 28.sp,
                        lineHeight = 27.24.sp,
                        fontFamily = FontFamily(Font(R.font.satisfy)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF65598E),
                        textAlign = TextAlign.Center,
                    )
                )
                Text(
                    text = "Next",
                    modifier = Modifier
                        .padding(end = 30.dp, top = 10.dp)
                        .clickable {
                            // Handle click action
                        },
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 27.24.sp,
                        fontFamily = FontFamily(Font(R.font.raleway_semibold)),
                        fontWeight = FontWeight(800),
                        color = Color(0xFF65598E),
                        textAlign = TextAlign.End,
                    )
                )
            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun TopBarCreatePostPreview() {
    TopBarCreatePost()
}