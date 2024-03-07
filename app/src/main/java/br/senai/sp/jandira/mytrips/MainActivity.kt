package br.senai.sp.jandira.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
Column {

    Row (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ){
        Card (
            modifier = Modifier
                .size(width = 120.dp, height = 40.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFCF06F0)),
            shape = RoundedCornerShape(
                bottomStart = 15.dp
            )
        ){}
    }

    Column (
        modifier = Modifier
            .padding(top = 160.dp, start = 16.dp)
    ){
        Text(
            text = "Login",
            color = Color(0xFFFCF06F0),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 50.sp
        )
        Text(
            text = "Please sign in to continue.",
            color = Color(0xFFFA09C9C),
            fontWeight = FontWeight.Light
        )
    }

    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        OutlinedTextField(
            modifier = Modifier
                .width(360.dp)
                .padding(top = 60.dp),

            value ="",
            onValueChange = {},
            label = {
                Text(text =  "E-mail",
                    color = Color(0xFFFA09C9C)
                )
               },

            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "E-mail",
                    tint = Color(0xFFFCF06F0)
                )
            },
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults
                .colors(unfocusedBorderColor = Color(0xFFFCF06F0),
                    focusedBorderColor = Color(0xFFFCF06F0)
                )
        )

        OutlinedTextField(
            modifier = Modifier
                .width(360.dp)
                .padding(top = 20.dp),

            value = "",
            onValueChange = {},
            label = {
                Text(text = "Password",
                    color = Color(0xFFFA09C9C)
                    )
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Password",
                    tint = Color(0xFFFCF06F0)
                )
            },
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults
                .colors(unfocusedBorderColor = Color(0xFFFCF06F0),
                    focusedBorderColor = Color(0xFFFCF06F0)
                )

        )

    }

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 16.dp),
        horizontalAlignment = Alignment.End
    ){
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(top = 30.dp)
                .size(width = 150.dp, height = 50.dp),
                shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults
                .buttonColors(
                    containerColor = Color(0xFFFCF06F0)
                )


        ) {
            Text(
                text = "SIGN IN",
                fontWeight = FontWeight.Black,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(end = 10.dp)
            )
            Icon(
                imageVector = Icons.Default.ArrowForward ,
                contentDescription = "Sign in",
                tint = Color.White
            )

        }
                Row (
                    modifier = Modifier
                        .padding(top = 30.dp)
                ){
                    Text(
                        text = "Don’t have an account?",
                        fontSize = 14.sp,
                        color = Color(0xFFFA09C9C),
                        fontWeight = FontWeight.Light,
                        modifier = Modifier
                            .padding(end = 7.dp)
                    )
                    Text(
                        text = "Sign up",
                        fontSize = 14.sp,
                        color = Color(0xFFFCF06F0),
                        fontWeight = FontWeight.Bold
                    )
                }
    }

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalAlignment = Alignment.Bottom
    ){
        Card (
            modifier = Modifier
                .size(width = 120.dp, height = 40.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFCF06F0)),
            shape = RoundedCornerShape(
                topEnd = 15.dp
            )
        ){}
    }
}
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyTripsTheme {
        Greeting()
    }
}

@Composable
fun Cadastro(){
    Surface (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ){

        Column {
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){
                Card (
                    modifier = Modifier
                        .size(width = 120.dp, height = 40.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFFCF06F0)),
                    shape = RoundedCornerShape(
                        bottomStart = 15.dp
                    )
                ){}
            }

            Column {
                Text(text = "Sign Up")
                Text(text = "Create a new account")
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CadastroPreview(){
    MyTripsTheme {
        Cadastro()
    }
}