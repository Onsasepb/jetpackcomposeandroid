package com.example.newwe

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newwe.ui.theme.NewweTheme

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
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current
        //To create a topAppBar

        TopAppBar(title = { Text(text = "Destination",
            color = Color.White)
        },

//Background color for a top app Bar
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
//end
//icon
            //Icons before
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        //Color for Icon
                        tint = Color.White
                    )
                    //End color
                }


                //Icon before End
            },
            //Icon after start

            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "Share",
                        tint = Color.White)

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription ="settings",
                        tint = Color.White)

                }
            }
            //Icon after end
        )
//end of top app bar
        Box (modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
            contentAlignment = Alignment.Center)
        {
            Image(painter = painterResource(id = R.drawable.night),
                contentDescription = "",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Lets plan your next vacation",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                textAlign = TextAlign.Center)
        }
//End of box
        Spacer(modifier = Modifier.height(10.dp))
//Search bar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search ,
            onValueChange = {search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            placeholder = { Text(text = "Whats your next destination") },
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription ="Search" ) }
        )
//end of search bar
        Text(
            text ="Recently viewed",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(20.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Row (modifier = Modifier
            .horizontalScroll(rememberScrollState())){
            //start of card 1
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .width(250.dp)

            ) {
                Column {
                    Box (modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center)
                    {
                        Image(painter = painterResource(id = R.drawable.bkam),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = "Newyork",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }
//End of card 1
            Spacer(modifier = Modifier.width(5.dp))
            //start of card 2
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .width(250.dp)

            ) {
                Column {
                    Box (modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center)
                    {
                        Image(painter = painterResource(id = R.drawable.bkam),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = "Newyork",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }
//End of card 2
            Spacer(modifier = Modifier.width(5.dp))
            //start of card 3
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .width(250.dp)

            ) {
                Column {
                    Box (modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                        contentAlignment = Alignment.Center)
                    {
                        Image(painter = painterResource(id = R.drawable.bkam),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop)

                    }
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = "Newyork",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }
//End of card 3
            Spacer(modifier = Modifier.width(5.dp))
        }
//End of Row 1
    }

}


@Preview(showBackground = true)
@Composable
fun Destinationpreview(){
    Destination()

}
