package com.example.proffmakori

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proffmakori.ui.theme.ProffMakoriTheme

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //TopAppBar

        TopAppBar(
            title = { Text(text = "Desrination", color = Color.White) },
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

// Box
        Box (modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.armstadam),
                contentDescription = "armstadam",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Let's plan your next vacation",
                fontSize = 35.sp,
                color = Color.Green,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )

        }
//End of box

//SearchBar
        Spacer(modifier = Modifier.height(20.dp))
        var search by remember { mutableStateOf("") }

            OutlinedTextField(
                value = search,
                onValueChange = {search = it},
                placeholder ={ Text(text ="What's your destination")},
                leadingIcon ={ Icon(imageVector = Icons.Default.Search, contentDescription ="search") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )
// End of SearchBar
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Recently viewed",
            fontSize = 35.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp,)
        )
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
        ) {
            //card 1
            Card (
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)

            ){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.havannacuba),
                            contentDescription = "havannacuba",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(text = "Havannah",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp
                    )
                }
            }
//End of card 1
            Spacer(modifier = Modifier.width(20.dp))
//card 1
            Card (
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)

            ){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.havannacuba),
                            contentDescription = "havannacuba",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(text = "Havannah",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp
                    )
                }
            }
//End of card 1
            Spacer(modifier = Modifier.width(20.dp))
//card 1
            Card (
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)

            ){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.havannacuba),
                            contentDescription = "havannacuba",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(text = "Havannah",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp
                    )
                }
            }
//End of card 1
            Spacer(modifier = Modifier.width(20.dp))
//card 1
            Card (
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)

            ){
                Column {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.havannacuba),
                            contentDescription = "havannacuba",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(text = "Havannah",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp
                    )
                }
            }
//End of card 1
            Spacer(modifier = Modifier.width(20.dp))

        }




    }
}


@Preview(showBackground = true)
@Composable
fun DestinationPreview() {
    Destination()

}