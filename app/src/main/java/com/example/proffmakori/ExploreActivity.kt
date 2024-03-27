package com.example.proffmakori

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.proffmakori.ui.theme.ProffMakoriTheme

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Explore()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore() {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
//TopAppBar

        TopAppBar(
            title = { Text(text = "Cities", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.Black
                    )

                }
            },
            actions = {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "notifications",
                        tint = Color.Black
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.Black
                    )
                }

                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, LayoutActivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        tint = Color.Black
                    )
                }
            }
        )
        Text(
            text = "Tickets",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp)
        )
//End of Top app Bar


        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(10.dp))


            //MainRow 1
            Row {
                //Column 1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.budapest),
                                contentDescription = "Budabest",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favourite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)


                            )
                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Collosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,

                        )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.3800000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    //Row 1
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0711642436".toUri()
                            mContext.startActivity(callIntent)
                        }

                        )
                        {
                            Text(text = "CALL", color = Color.Black)

                        }

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("jamesmn2004@gmail.com")
                            )
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(
                                Intent.EXTRA_TEXT,
                                "Hello, this is the Kamau, am requesting on a tour visit on April."
                            )
                            mContext.startActivity(shareIntent)
                        }
                        )
                        {
                            Text(text = "Email", color = Color.Black)

                        }
                    }

                }
                //End of Column 1
                Spacer(modifier = Modifier.width(20.dp))
                //Column 2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.budapest),
                                contentDescription = "Budabest",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favourite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)


                            )
                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Collosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,

                        )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.3800000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0711642436".toUri()
                            mContext.startActivity(callIntent)
                        }

                        )
                        {
                            Text(text = "CALL", color = Color.Black)

                        }

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("jamesmn2004@gmail.com")
                            )
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(
                                Intent.EXTRA_TEXT,
                                "Hello, this is the Kamau, am requesting on a tour visit on April."
                            )
                            mContext.startActivity(shareIntent)
                        }
                        )
                        {
                            Text(text = "Email", color = Color.Black)

                        }
                    }

                }
                //End of Column 2
            }
            //End of MainRow 1
            Spacer(modifier = Modifier.height(10.dp))


            //MainRow 2
            Row {
                //Column 1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.budapest),
                                contentDescription = "Budabest",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favourite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)


                            )
                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Collosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,

                        )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.3800000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    //Row 1
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0711642436".toUri()
                            mContext.startActivity(callIntent)
                        }

                        )
                        {
                            Text(text = "CALL", color = Color.Black)

                        }

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("jamesmn2004@gmail.com")
                            )
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(
                                Intent.EXTRA_TEXT,
                                "Hello, this is the Kamau, am requesting on a tour visit on April."
                            )
                            mContext.startActivity(shareIntent)
                        }
                        )
                        {
                            Text(text = "Email", color = Color.Black)

                        }
                    }

                }
                //End of Column 1
                Spacer(modifier = Modifier.width(20.dp))
                //Column 2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.budapest),
                                contentDescription = "Budabest",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favourite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)


                            )
                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Collosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,

                        )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.3800000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0711642436".toUri()
                            mContext.startActivity(callIntent)
                        }

                        )
                        {
                            Text(text = "CALL", color = Color.Black)

                        }

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("jamesmn2004@gmail.com")
                            )
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(
                                Intent.EXTRA_TEXT,
                                "Hello, this is the Kamau, am requesting on a tour visit on April."
                            )
                            mContext.startActivity(shareIntent)
                        }
                        )
                        {
                            Text(text = "Email", color = Color.Black)

                        }
                    }

                }
                //End of Column 2
            }
            //End of MainRow 2
            Spacer(modifier = Modifier.height(10.dp))


            //MainRow 3
            Row {
                //Column 1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.budapest),
                                contentDescription = "Budabest",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favourite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)


                            )
                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Collosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,

                        )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.3800000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    //Row 1
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0711642436".toUri()
                            mContext.startActivity(callIntent)
                        }

                        )
                        {
                            Text(text = "CALL", color = Color.Black)

                        }

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("jamesmn2004@gmail.com")
                            )
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(
                                Intent.EXTRA_TEXT,
                                "Hello, this is the Kamau, am requesting on a tour visit on April."
                            )
                            mContext.startActivity(shareIntent)
                        }
                        )
                        {
                            Text(text = "Email", color = Color.Black)

                        }
                    }

                }
                //End of Column 1
                Spacer(modifier = Modifier.width(20.dp))
                //Column 2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.budapest),
                                contentDescription = "Budabest",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds

                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favourite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)


                            )
                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Collosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "star")
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,

                        )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "From Ksh.3800000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0711642436".toUri()
                            mContext.startActivity(callIntent)
                        }

                        )
                        {
                            Text(text = "CALL", color = Color.Black)

                        }

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("jamesmn2004@gmail.com")
                            )
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Request for a tour visit")
                            shareIntent.putExtra(
                                Intent.EXTRA_TEXT,
                                "Hello, this is the Kamau, am requesting on a tour visit on April."
                            )
                            mContext.startActivity(shareIntent)
                        }
                        )
                        {
                            Text(text = "Email", color = Color.Black)

                        }
                    }

                }
                //End of Column 2
            }
            //End of MainRow 3
            Spacer(modifier = Modifier.height(10.dp))


        }
    }
}


@Preview(showBackground = true)
@Composable
fun ExplorePreview() {
    Explore()

}