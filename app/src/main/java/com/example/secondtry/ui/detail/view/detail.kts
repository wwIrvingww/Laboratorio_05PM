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