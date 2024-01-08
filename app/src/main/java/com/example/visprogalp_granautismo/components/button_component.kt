package com.example.visprogalp_granautismo.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R
import org.w3c.dom.Text
import java.time.format.TextStyle

@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    text:String = stringResource(R.string.get_started),
    backgroundColor: Color = Color.White,
    foregroundColor: Color = Color.Black,
    elevation : ButtonElevation = ButtonDefaults.buttonElevation(0.dp),
    color: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = backgroundColor
    ),
    onClick:()->Unit
    ) {
Button(onClick = onClick,
    modifier = modifier.fillMaxWidth(),
    elevation = elevation,
    shape = RoundedCornerShape(100.dp),
    colors = color

) {
    Text(text = text, style = androidx.compose.ui.text.TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    ))

}

}