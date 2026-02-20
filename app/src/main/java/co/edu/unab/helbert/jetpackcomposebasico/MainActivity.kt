package co.edu.unab.helbert.jetpackcomposebasico

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MyPresentacion()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyPresentacion() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 18.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val painter = painterResource(id = R.drawable.ferrari)

        Image(
            painter = painter,
            contentDescription = "Imagen de perfil",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Mauricio Quesada",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            textAlign = TextAlign.Center
        )

        Text(
            text = "tu velocidad al máximo",
            fontSize = 12.sp,
            color = Color.DarkGray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp),
            textAlign = TextAlign.Center
        )

        // ✅ Datos personales
        Spacer(modifier = Modifier.height(18.dp))
        Text(
            text = "Edad: 23 años\nCorreo: hquesada179@unab.edu.co\nCiudad: Bucaramanga, Santander",
            fontSize = 14.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        // ✅ Párrafo de intereses
        Spacer(modifier = Modifier.height(18.dp))
        Text(
            text = "Me interesa el desarrollo móvil con Kotlin y Jetpack Compose, la programación y el aprendizaje de nuevas tecnologías. " +
                    "Disfruto crear interfaces limpias y funcionales, y me motiva seguir mejorando mis habilidades en desarrollo de software.",
            fontSize = 14.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        // ✅ Botón
        Spacer(modifier = Modifier.height(22.dp))
        Button(
            onClick = { /* Por ahora no hace nada */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1E88E5)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Contactar conmigo",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

