/**
 * PANTALLA DETAIL
 */

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