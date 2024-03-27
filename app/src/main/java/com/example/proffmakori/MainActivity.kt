package com.example.proffmakori

import android.content.Intent
import android.os.Bundle
import android.provider.SyncStateContract.Columns
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proffmakori.ui.theme.ProffMakoriTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){
    Column(modifier = Modifier.fillMaxSize()
                              .verticalScroll(rememberScrollState())
    ){

        val mContext = LocalContext.current
        Text(
            text = "Welcome to Android",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
        Text(text = "(Android is one of the best Operating System that is open source unlike MacOs. That has resulted it to be used in different devises as the permanent OS of their systems.)")
        Spacer(modifier = Modifier.height(20.dp))

        Box (modifier = Modifier.fillMaxWidth(),
             contentAlignment = Alignment.Center
            ){
            Button(onClick = { mContext.startActivity(Intent(mContext,DestinationActivity::class.java) )}) {
                Text(text = "Destination")
            }
        }

        Text(text = "Types of cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(40.dp),

            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline)

        Text(text = "1.BMW")
        Text(text = "2.Mercedes Benz")
        Text(text = "3.Ferrari")
        Text(text = "4.Bughatti")
        Text(text = "Types of fruits",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .height(40.dp),

            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline)

        Text(text = "1.Mango")
        Text(text = "2.Banana")
        Text(text = "3.Grapes")
        Text(text = "4.Pineapple")
        Divider()
        //centering en image
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.smooth) , contentDescription = "smooth",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape)   )

        }
        Text(text = "eMobilis Mobile Training Institute",
            fontSize =20.sp,
        fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
                         mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
        },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp)


        ) {
            Text(text = "Continue")
        }
    }


}






@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()

}