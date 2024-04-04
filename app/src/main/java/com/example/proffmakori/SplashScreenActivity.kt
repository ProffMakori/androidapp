package com.example.proffmakori

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proffmakori.ui.theme.ProffMakoriTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreen()

            val mContext = LocalContext
            val coroutineScope = rememberCoroutineScope()
            coroutineScope.launch {
                delay(1000)
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
                finish()
            }
        }
    }
}

@Composable
fun SplashScreen(){
    Column (
        modifier = Modifier.fillMaxSize()
                           .background(Color.Gray)

    ){
        Box (modifier = Modifier
            .fillMaxWidth()
            .padding(top = 250.dp),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.smooth) , contentDescription = "smooth",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape)
                )
            DotsAnimation()

        }

    }

}


@Composable
fun DotsAnimation() {
    val dotSize = 12.dp
    val dotSpacing = 8.dp
    val numberOfDots = 3
    val dotAnimationDuration = 1000
    val infiniteTransition = rememberInfiniteTransition()

    val dotAlpha by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 0.1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = dotAnimationDuration),
            repeatMode = RepeatMode.Reverse
        )
    )

    Row(
        modifier = Modifier.padding(top = 16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(numberOfDots) {
            Box(
                modifier = Modifier
                    .size(dotSize)
                    .background(Color.Black.copy(alpha = dotAlpha))
                    .padding(horizontal = dotSpacing)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}