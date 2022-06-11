package br.com.michellebrito.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    ShowDetailsAccount(
                        name = "Michelle Brito",
                        userName = "michellebritoo",
                        description = "Android dev"
                    )
                }
            }
        }
    }
}

@Composable
fun ShowDetailsAccount(name: String, userName: String, description: String) {
    Column {
        Image(
            painter = painterResource(R.drawable.ic_account_icon),
            contentDescription = "foto do usuário",
            modifier = Modifier
                .size(60.dp)
                .border(1.5.dp, MaterialTheme.colors.primary, CircleShape)
        )

        Text(text = name)
        Text(text = userName)
        Text(text = description)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DevHubTheme {
        ShowDetailsAccount(
            name = "Michelle Brito",
            userName = "michellebritoo",
            description = "Android dev"
        )
    }
}