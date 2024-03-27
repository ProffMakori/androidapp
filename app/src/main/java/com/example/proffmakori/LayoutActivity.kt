package com.example.proffmakori

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.proffmakori.ui.theme.ProffMakoriTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout() {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //TopAppBar

        TopAppBar(
            title = { Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.White
                    )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White
                    )
                }

                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
                        tint = Color.White
                    )
                }
            }
        )
//End of Top app Bar
    Spacer(modifier = Modifier.height(5.dp))
   Text(text = "Famous Cities In The World",
       fontSize = 20.sp,
       fontWeight = FontWeight.Bold,
       modifier = Modifier.fillMaxWidth(),
       textAlign = TextAlign.Center
   )
//Row 1
   Row {
       Image(painter = painterResource(id = R.drawable.havannacuba), contentDescription ="havannacuba" ,
           modifier = Modifier.size(width = 150.dp, height = 200.dp))

       Column {
           Text(text = "Havanna,Cubas Capital City", fontWeight = FontWeight.Bold)
           Text(text = "Old Havana was declared a UNESCO World Heritage Site in 1982. The city is also noted for its history, culture, architecture and monuments. As typical of Cuba, Havana experiences a tropical climate.")
       }
   }
  Spacer(modifier = Modifier.height(2.dp))

//Row 2
        Row {
            Image(painter = painterResource(id = R.drawable.budapest), contentDescription ="budapest" ,
                modifier = Modifier
                    .size(width = 150.dp, height = 200.dp))

            Column {
                Text(text = "Budapest,Hungary's Capital City", fontWeight = FontWeight.Bold)
                Text(text = "The city is located at the river Danube, in central north Hungary.It is a primate city, Hungary's principal political, commercial, cultural, and industrial center.Budapest has an official population of 1,744,000 inhabitants (in 2014), 2.5 million people live in its urban area (2009). Official language is Hungarian."

                )
            }
        }
        Spacer(modifier = Modifier.height(2.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,IntentActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)


        ) {
            Text(text = "NEXT")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun LayoutPreview() {
   Layout()

}