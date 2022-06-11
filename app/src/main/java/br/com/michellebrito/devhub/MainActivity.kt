package br.com.michellebrito.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.michellebrito.devhub.ui.theme.DevHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevHubTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SetupUserProfile()
                }
            }
        }
    }
}

@Composable
fun SetupUserProfile() {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Color.Gray, shape = RoundedCornerShape(
                        bottomStart = 16.dp,
                        bottomEnd = 16.dp
                    )
                )
                .height(150.dp)
        ) {
            Image(
                painterResource(id = R.drawable.ic_account_icon),
                contentDescription = "foto do usuário",
                modifier = Modifier
                    .offset(y = 80.dp)
                    .border(0.5.dp, MaterialTheme.colors.primary, CircleShape)
                    .size(150.dp)
                    .align(Alignment.BottomCenter)
            )
        }
        Spacer(modifier = Modifier.height(75.dp))
        ShowDetailsAccount(
            name = "Michelle Brito",
            userName = "michellebritoo",
            description = "Android dev"
        )
    }
}

@Composable
fun ShowDetailsAccount(name: String, userName: String, description: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(text = name, fontSize = 32.sp)
        Text(text = userName, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Text(text = description)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DevHubTheme {
        SetupUserProfile()
    }
}