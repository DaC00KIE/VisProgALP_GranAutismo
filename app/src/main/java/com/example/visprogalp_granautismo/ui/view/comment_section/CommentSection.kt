package com.example.visprogalp_granautismo.ui.view.comment_section

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.model.User
import com.example.visprogalp_granautismo.ui.theme.LightPurple
import com.example.visprogalp_granautismo.ui.theme.Purple
import com.example.visprogalp_granautismo.ui.view.recipe_section.ralewayBold
import com.example.visprogalp_granautismo.ui.view.recipe_section.ralewayRegular

@Composable
fun CommentSection(user: User) {

//    fun LoadImageCustom(
//        url: String = user.profilePicture,
//        modifier = Modifier
//            .fillMaxSize(),
//        contentScale = ContentScale.FillWidth
//    ): Painter {
//
//    }
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .padding(start = 12.dp, end = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
//                LoadImageCustom(
//                    url = user.profilePicture,
//                    modifier = Modifier.size(128.dp)
//                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Cherry Pie",
                        fontFamily = ralewayBold,
                        color = Purple,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(start = 8.dp),
                        style = TextStyle(fontWeight = FontWeight(800))
                    )
                    Text(
                        text = "Jakarta",
                        fontFamily = ralewayRegular,
                        color = Purple,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(start = 8.dp, top = 6.dp),
                        style = TextStyle(fontWeight = FontWeight(400))
                    )
                }
            }
            Row {
                // IconButton for Save Icon
                IconButton(onClick = { /* TODO */ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_save),
                        contentDescription = "Save Icon",
                        tint = LightPurple,
                        modifier = Modifier.size(25.dp)
                    )
                }
                // IconButton for More Options Icon
                IconButton(onClick = { /* TODO */ }) {
                    Icon(
                        painter = painterResource(R.drawable.ic_more),
                        tint = LightPurple,
                        contentDescription = "More Options",
                        modifier = Modifier.rotate(90f) // Rotate only the Icon by 90 degrees
                    )
                }
            }
        }

//        Image(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(25.dp) // Adjust the padding as needed
//                .clip(RoundedCornerShape(20.dp)), // Adjust the corner radius as needed
//            painter = LoadImageCustom(user.profilePicture),
//            contentDescription = "Post Picture",
//            contentScale = ContentScale.FillWidth
//        )
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .size(4.dp)
                .align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.slide),
            contentDescription = "Slides",
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Comments",
                    fontFamily = ralewayBold,
                    color = Purple,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 4.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
//                Text(
//                    text = user.commentCount.toString(),
//                    fontFamily = ralewayRegular,
//                    color = LightPurple,
//                    fontSize = 16.sp,
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier.padding(start = 4.dp)
//                )
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun CommentSectionPreview() {
//    Column {
//
//        CommentSection(user = User(
//            profilePic = painterResource(R.drawable.user1),
//            username = "Cranberry Pie",
//            location = "Jakarta, Indonesia",
//            postPic = painterResource(R.drawable.post1),
//            likeCount = 168,
//            caption = "Afternoon Tea with some Lovely Muffin. Comment if you want to know more about the other dessert recipe. I can also give you the full courses about baking.",
//            commentCount = 15,
//            commentTime = "1h ago"
//        ))
//    }
//}
