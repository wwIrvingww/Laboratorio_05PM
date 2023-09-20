package com.example.secondtry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secondtry.ui.theme.SecondTryTheme
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import coil.compose.rememberImagePainter
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.* // Esto importa todos los iconos llenos disponibles
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.*
import androidx.compose.material.TabRowDefaults.Divider
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SecondTryTheme {
                // A surface container using the 'background' color from the theme, si
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Conciertos()
                }
            }
        }
    }
}

/**
 * PANTALLA 1 - CONCIERTOS
 */

@Composable
fun Conciertos(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF976bb5))
                .padding(bottom = 16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            // Top Text
            Text(
                text = "Todo Eventos",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontSize = 20.sp,
                    color = Color.Black
                ),
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(16.dp)
            )
            androidx.compose.material3.Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "More Vert Icon",
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .size(40.dp)
            )
        }
        Text(
            text = "Your Favorites",
            style = MaterialTheme.typography.headlineMedium.copy(
                fontSize = 20.sp,
                color = Color.Black
            ),
            modifier = Modifier
                .align(Alignment.Start)
                .padding(16.dp)
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            BoxWithImageAndText(
                imageUrl = "https://www.guatemala.com/fotos/2023/05/Concierto-de-Eladio-Carrion-en-Guatemala-2023.jpg",
                title = "Eladio Carrion",
                supportingText = "Supporting Text 1"
            )
            BoxWithImageAndText(
                imageUrl = "https://www.guatemala.com/fotos/2023/05/Concierto-de-Young-Miko-en-Guatemala-2023.jpg",
                title = "Young Miko",
                supportingText = "Supporting Text 2"
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            BoxWithImageAndText(
                imageUrl = "https://eltimbresuena.com/wp-content/uploads/2023/01/322214676_1102270593858675_9010768076383236902_n-min.jpg",
                title = "Rels B",
                supportingText = "Supporting Text 3"
            )
            BoxWithImageAndText(
                imageUrl = "https://www.soy502.com/sites/default/files/styles/escalar_image_inline/public/2023/Ago/07/guatemala_mora_concierto.png",
                title = "Mora",
                supportingText = "Supporting Text 4"
            )
        }


    }
}

@Composable
fun BoxWithImageAndText(imageUrl: String, title: String, supportingText: String) {

    Box(
        modifier = Modifier
            .size(width = 180.dp, height = 210.dp)
            .background(Color.Black, shape = RoundedCornerShape(16.dp))
            .padding(4.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxHeight()
        ) {
            Image(
                painter = rememberImagePainter(imageUrl),
                contentDescription = "Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .width(140.dp)
                    .clip(RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
            )

            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = supportingText,
                color = Color.White,

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConciertosPreview() {
    SecondTryTheme() {
        Conciertos()
    }
}

/**
 * PANTALLA 2 - LISTADO DE LUGARES
 */

@Composable
fun Row(
    modifier: Modifier = Modifier,
    circleText: String,
    boldText: String,
    regularText: String
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color(0xFFc6a3d5))
        ) {
            Text(
                text = circleText,
                color = Color(0xFF191970),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(
                text = boldText,
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = regularText,
                color = Color.Gray
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        androidx.compose.material3.Icon(
            imageVector = Icons.Default.KeyboardArrowUp,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.size(16.dp)
        )
    }
}

@Composable
fun Places_list (modifier: Modifier = Modifier){
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(Modifier,"A", "Guns and Roses Denver", "Denver Hall")
        Row(Modifier,"A", "Guns and Roses LA", "LA HALL")
        Row(Modifier,"A", "Guns and Roses New York", "Maddison Square Garden")
    }


}

@Preview(showBackground = true)
@Composable
fun Places_ListPreview() {
    SecondTryTheme() {
        Places_list()
    }
}

@Composable
fun Details(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Imagen con esquina inferior izquierda "lugar"
        val imageUrl = "https://static.puntoticket.com/especiales/mul059_eladio-carrion-the-sauce-chile-tour/img/head__bg-v3.jpg" // Reemplaza con la URL de tu imagen
        Image(
            painter = rememberImagePainter(imageUrl),
            contentDescription = "Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
        )
        Text(
            text = "Explanada Cayala",
            modifier = Modifier
                .padding(start = 4.dp, bottom = 4.dp)
                .align(Alignment.Start),
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface
        )

        // Texto "Title"
        Text(
            text = "Eladio",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 8.dp)
                .align(Alignment.Start)
        )

        // Fila con icono de calendario, texto "fecha" y texto "hora"
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 4.dp)
                .fillMaxWidth()
        ) {
            androidx.compose.material3.Icon(
                imageVector = Icons.Default.DateRange,
                contentDescription = null,
                modifier = Modifier.size(18.dp)
            )
            Text(
                text = "09.09.2023",
                modifier = Modifier.padding(start = 4.dp)
            )
            Text(
                text = "8:00pm",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp),
                textAlign = TextAlign.End
            )
        }

        // Texto "About"
        Text(
            text = "About",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )

        // Párrafo de Lorem ipsum
        Text(
            text = loremIpsum,
            color = Color.Gray,
            modifier = Modifier.padding(top = 4.dp)
        )

        // Botones en la parte inferior
        // Espacio flexible para que los botones estén en la parte inferior
        Spacer(modifier = Modifier.weight(1f))

        // Botones en la parte inferior y centrados horizontalmente
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {  }, // en este caso el boton no tendrá ni una acción
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFc6a3d5)),
            ) {
                Text(text = "Favorite", color = Color.Black)
            }

            Spacer(modifier = Modifier.width(16.dp)) // Espacio entre botones

            Button(
                onClick = { }, // en este caso el boton no tendrá ni una acción
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFc6a3d5)),


            ) {
                Text(text = "Buy", color = Color.Black)
            }
        }
    }

}

// Texto Lorem ipsum
val loremIpsum = """
    Lorem ipsum dolor sit amet, consectetur adipiscing elit.
    Nullam tristique libero id justo bibendum, nec ultrices erat tincidunt.
    Sed id urna eu nunc vehicula laoreet.
    """.trimIndent()


@Preview(showBackground = true)
@Composable
fun Detail_Preview(){
    SecondTryTheme {
        Details()

    }
}


@Composable
fun Profile(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        val imageUrl = "https://images.pexels.com/photos/255379/pexels-photo-255379.jpeg?cs=srgb&dl=pexels-miguel-%C3%A1-padri%C3%B1%C3%A1n-255379.jpg&fm=jpg"
        Image(
            painter = rememberImagePainter(imageUrl),
            contentDescription = "Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
        )

        Box(
            modifier = Modifier
                .size(160.dp) // Ajusta el tamaño del círculo según tus necesidades
                .align(Alignment.CenterHorizontally)
                .offset(y = (-200).dp) // Ajusta el desplazamiento vertical según tus necesidades
        ) {
            Image(
                painter = rememberImagePainter("https://i.pinimg.com/564x/4f/31/b5/4f31b5653381c961595fbdb111c8e015.jpg"), // Reemplaza con la imagen deseada
                contentDescription = "Circle Image",
                modifier = Modifier
                    .size(300.dp) // Ajusta el tamaño del círculo según tus necesidades
                    .clip(CircleShape)
                    .background(Color.White)
                    .align(Alignment.Center)
            )
            Text(
                text = "Mapache34",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.BottomCenter)
                    .offset(y = 25.dp) // Ajusta el desplazamiento vertical para separar el texto
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Filas con iconos
        IconRow(Icons.Default.Person, "Edit Profile", Icons.Default.KeyboardArrowRight)
        IconRow(Icons.Default.Lock, "Edit Profile", Icons.Default.KeyboardArrowRight)
        IconRow(Icons.Default.Person, "Notificaciones", Icons.Default.Notifications)
        IconRow(Icons.Default.Star, "Favorites", Icons.Default.KeyboardArrowRight)
    }
}

@Composable
fun IconRow(startIcon: ImageVector, middleText: String, endIcon: ImageVector) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        androidx.compose.material3.Icon(
            imageVector = startIcon,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp)
        )
        Text(
            text = middleText,
            color = Color.Black,
            modifier = Modifier.weight(1f)
        )
        androidx.compose.material3.Icon(
            imageVector = endIcon,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.padding(start = 8.dp, end = 8.dp)
        )
    }
    Divider(modifier = Modifier.padding(vertical = 8.dp))
}

@Preview(showBackground = true)
@Composable
fun Profile_View() {
    SecondTryTheme() {
        Profile()
    }
}






