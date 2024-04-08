package com.example.newwe

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
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
import com.example.newwe.ui.theme.NewweTheme

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
fun Explore(){
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current
//To create a topAppBar

        TopAppBar(title = { Text(text = "Cities",
            color = Color.Black)
        },

//Background color for a top app Bar
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
//end
//icon
            //Icons before
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "menu",
                        //Color for Icon
                        tint = Color.Black
                    )
                    //End color
                }


                //Icon before End
            },
            //Icon after start

            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription ="settings",
                        tint = Color.Black)

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "Share",
                        tint = Color.Black)

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Search, contentDescription ="settings",
                        tint = Color.Black)

                }
            }
            //Icon after end
        )
//end of top app bar
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "Tickets",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp))
            Spacer(modifier = Modifier.height(10.dp))
            //start of row 1
            Row {
                //Column 1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(150.dp)
                    )
                    {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ng2),
                                contentDescription = "",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    //end of card
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "443 Reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "From ksh.38000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(2.dp))


                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0112390902".toUri()
                            mContext.startActivity(callIntent)
                        })
                        {
                            Text(text = "Call")
                        }
                        Spacer(modifier = Modifier.width(2.dp))
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("preciousonsase@gmail.com")
                            )
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Inquiry of stock")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, I made an aaaaapp")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")
                        }
                    }
                }
                //End of column 1
                Spacer(modifier = Modifier.width(4.dp))
//Column 2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(150.dp)
                    )
                    {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ng2),
                                contentDescription = "",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    //end of card
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "443 Reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "From ksh.38000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(2.dp))


                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0112390902".toUri()
                            mContext.startActivity(callIntent)
                        })
                        {
                            Text(text = "Call")
                        }
                        Spacer(modifier = Modifier.width(2.dp))
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("preciousonsase@gmail.com")
                            )
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Inquiry of stock")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, I made an aaaaapp")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")
                        }
                    }
                }
                //End of column2
            }
            //end of row1
            //Start of row 2
            Row {
                //Column 1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(150.dp)
                    )
                    {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ng2),
                                contentDescription = "",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    //end of card
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "443 Reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "From ksh.38000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(2.dp))


                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0112390902".toUri()
                            mContext.startActivity(callIntent)
                        })
                        {
                            Text(text = "Call")
                        }
                        Spacer(modifier = Modifier.width(2.dp))
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("preciousonsase@gmail.com")
                            )
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Inquiry of stock")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, I made an aaaaapp")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")
                        }
                    }
                }
                //End of column 1
                Spacer(modifier = Modifier.width(4.dp))
//Column 2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(150.dp)
                    )
                    {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ng2),
                                contentDescription = "",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )

                        }

                    }
                    //end of card
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "443 Reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "From ksh.38000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(2.dp))


                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0112390902".toUri()
                            mContext.startActivity(callIntent)
                        })
                        {
                            Text(text = "Call")
                        }
                        Spacer(modifier = Modifier.width(2.dp))
                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("preciousonsase@gmail.com")
                            )
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Inquiry of stock")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, I made an aaaaapp")
                            mContext.startActivity(shareIntent)
                        }) {
                            Text(text = "Email")
                        }
                    }
                }
                //End of column2
            }
            //end of row1
        }



    }

}

@Preview(showBackground = true)
@Composable
fun ExplorePreview(){
    Explore()
}