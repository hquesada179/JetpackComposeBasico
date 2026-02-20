package co.edu.unab.helbert.jetpackcomposebasico


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.unab.helbert.jetpackcomposebasico.ui.theme.JetpackComposeBasicoTheme

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
fun MyPresentacion(){

    Column(modifier= Modifier.padding(all = 18.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ){


        val painter = painterResource(id = R.drawable.ferrari)

        Image(painter = painter, contentDescription = "Imagen de Ferrari",
            modifier = Modifier.width(150.dp).height(150.dp).clip(CircleShape),
            contentScale = ContentScale.Crop,


        )
        Text(
            text = "Mauricio Quesada",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp, start =25.dp, end = 25.dp ),
            textAlign = TextAlign.Center
        )
        Text(
            text = "tu velocidad al maximo",
            fontSize = 10.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start =25.dp, end = 25.dp, bottom =  25.dp),
            textAlign = TextAlign.Center
        )

    }


}

