/**
 * PANTALLA CONCIERTOS
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