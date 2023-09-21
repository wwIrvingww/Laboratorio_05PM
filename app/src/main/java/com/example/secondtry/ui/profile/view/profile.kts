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