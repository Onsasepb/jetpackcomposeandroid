package com.example.newwe

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
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
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newwe.ui.theme.NewweTheme

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
fun Layout(){
    Column (

        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.background),
                contentScale = ContentScale.FillBounds
            ))

    {
        val mContext = LocalContext.current

//To create a topAppBar

        TopAppBar(title = { Text(text = "Home",
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

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "GENRES OF BOOKS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.White
        )
//First row
        Row {
            Image(painter = painterResource(id = R.drawable.bk1),
                contentDescription = "book",
                modifier = Modifier.
                size(width = 200.dp, height = 200.dp))
            Column {
                Text(text = "FANTASY",
                    fontSize = 18.sp,
                    color = Color.White
                )
                Text(text = "Fantasy literature is literature set in an imaginary universe.",
                    color = Color.White)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
//End of first row
//Second Row
        Row {
            Image(painter = painterResource(id = R.drawable.bk4),
                contentDescription = "book",
                modifier = Modifier.
                size(width = 200.dp, height = 200.dp))
            Column {
                Text(text = "Romance",
                    fontSize = 18.sp,
                    color = Color.White)
                Text(text = "Fantasy literature is literature set in an imaginary universe.",
                    color = Color.White)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
//End of Second Row


        Spacer(modifier = Modifier.width(40.dp))
        Row {
            //Start of Button
            Button(
                onClick = { mContext.startActivity(Intent(mContext, MainActivity::class.java)) },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(Color.Blue),
            ) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "arrowback", tint = Color.Blue)
                Text(text = "Back",
                    color = Color.White)
            }
            //End of Button

            Spacer(modifier = Modifier.width(40.dp))
            //Start of Button

            Button(
                onClick = {
                    mContext.startActivity(Intent(mContext, IntentActivity::class.java))
                },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(Color.Blue),
            ) {
                Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "arrowforward", tint = Color.Blue)
                Text(
                    text = "Next",
                    color = Color.White
                )
            }
            //End of Button
        }
    }

}


@Preview(showBackground = true)
@Composable
fun Layoutpreview(){
    Layout()
}