package com.example.auraapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.auraapp.ui.theme.AuraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContent {
//            AuraTheme {
//                AuraApp()
//                }
//            }
//        }
    }


//@Composable
//fun Greeting(name: String, detalhes: String, modifier: Modifier = Modifier) {
//
//    var ocultado by remember {
//        mutableStateOf(true)
//    }
//
//    Surface(
//        color = MaterialTheme.colorScheme.primary
//    ) {
//
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp)
//        ){
//            Column(modifier = Modifier
//                .weight(1f)
//            ){
//                Text(
//                    text = name,
//                    fontSize = 22.sp
//                )
//                AnimatedVisibility(visible = ocultado.not()) {
//                    Text(
//                        text = detalhes,
//                        fontWeight = FontWeight.Thin
//                    )
//                }
//            }
//
//            ElevatedButton(onClick = { ocultado = ocultado.not() }) {
//                val buttonText = if(ocultado) "Visualizar" else "Esconder"
//                Text(buttonText)
//            }
//        }
//
//    }
//}
//
//@Composable
//fun MyApp(){
//    val names = listOf("Kotlin", "Java", "C#")
//
//    Column() {
//        for(l in names){
//            Greeting(name = l, detalhes = "Mais detalhes")
//        }
//    }
//}
//
//@Composable
//fun HelloScreen(
//    onButtonClick: () -> Unit
//){
//
//    Surface(color = MaterialTheme.colorScheme.primary){
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ){
//            Text(
//                "Seja bem-vindo ao My App :)",
//                fontSize = 26.sp,
//            )
//            Spacer(modifier = Modifier.height(60.dp))
//            ElevatedButton(onClick = { onButtonClick() }) {
//                Text("Iniciar", fontSize = 22.sp)
//            }
//        }
//    }
//
//}
//
//@Preview(showBackground = true, widthDp = 280)
//@Composable
//fun GreetingPreview() {
//    MyApp()
////    var helloScreen by remember{
////        mutableStateOf(true)
////    }
//
////    if(helloScreen){
////        HelloScreen(onButtonClick = {
////            helloScreen = false
////        })
////    }
////    else{
////        MyApp()
////    }
//
//}

@Composable
fun GradientBackgroundBrush(
    isVerticalGradient : Boolean,
    colors:List<Color>
): Brush {

val endOffset = if(isVerticalGradient){
    Offset(0f, Float.POSITIVE_INFINITY)
} else {
    Offset(Float.POSITIVE_INFINITY, 0f)
}
    return Brush.linearGradient(
        colors = colors,
        start = Offset.Zero,
        end = endOffset
    )
}

@Composable
fun Greeting(
    userName: String,
    modifier: Modifier = Modifier

){
    Text("Seja bem vindo, $userName",
        color = Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = 17.sp,
        modifier = Modifier
            .padding(16.dp,20.dp)

    )
}

@Preview(showBackground = true, widthDp = 280)
@Composable
fun AuraPreview(){
    AuraApp()
}

@Composable
fun AuraApp(){
    Home()
}

@Composable
fun Home(
    modifier: Modifier = Modifier
){
    val gradientColors = listOf(
        Color(0xFF373737),
        Color(0xFF1C2128)

    )

    Box(

        modifier = modifier
            .fillMaxSize()
            .background(brush = GradientBackgroundBrush(
                isVerticalGradient = false,
                colors = gradientColors

            ))
    )
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 0.dp)
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp, 50.dp, 15.dp)

        ){
            showLogo()
            showSideBar()
        }
        Greeting("João")
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp), // Espaçamento entre o Greeting e a imagem
            contentAlignment = Alignment.Center // Centraliza a imagem horizontalmente
        ) {
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .height(150.dp)
            ) {
                showimg1(Modifier.fillMaxSize()) // Chama a imagem

                // Texto posicionado no canto inferior esquerdo da imagem
                Text(
                    text = "Grupos Musculares",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.BottomStart) // Texto no canto inferior esquerdo
                        .padding(8.dp, 35.dp) // Espaçamento do texto dentro da imagem
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp), // Espaçamento entre o Greeting e a imagem
            contentAlignment = Alignment.Center // Centraliza a imagem horizontalmente
        ) {
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .height(150.dp)
            ) {
                showimg2(Modifier.fillMaxSize()) // Chama a imagem

                // Texto posicionado no canto inferior esquerdo da imagem
                Text(
                    text = "Meus treinos",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.BottomStart) // Texto no canto inferior esquerdo
                        .padding(8.dp, 35.dp) // Espaçamento do texto dentro da imagem
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp), // Espaçamento entre o Greeting e a imagem
            contentAlignment = Alignment.Center // Centraliza a imagem horizontalmente
        ) {
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .height(150.dp)
            ) {
                showimg3(Modifier.fillMaxSize()) // Chama a imagem

                // Texto posicionado no canto inferior esquerdo da imagem
                Text(
                    text = "Mobilidade",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.BottomStart) // Texto no canto inferior esquerdo
                        .padding(8.dp, 35.dp) // Espaçamento do texto dentro da imagem
                )
            }
        }

        BottomNavigationBar()


    }

}
@Composable
fun BottomNavigationBar() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF79000))
                .padding(16.dp) // Padding para os ícones
                .align(Alignment.BottomCenter)
        ) {
            // Ícones SVG
            IconButton(onClick = { /* Ação para o primeiro ícone */ }) {
                SvgIcon(R.drawable.casa)
            }
            IconButton(onClick = { /* Ação para o segundo ícone */ }) {
                SvgIcon(R.drawable.lupa)
            }
            IconButton(onClick = { /* Ação para o terceiro ícone */ }) {
                SvgIcon(R.drawable.halter)
            }
            IconButton(onClick = { /* Ação para o quarto ícone */ }) {
                SvgIcon(R.drawable.user)
            }
        }
    }
}

// Função para carregar o SVG
@Composable
fun SvgIcon(@DrawableRes iconId: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = iconId),
        contentDescription = null,
        modifier = modifier
            .size(24.dp) // Tamanho do ícone
    )
}

@Composable
fun showLogo(
){
    Image(
        painter = painterResource(id = R.drawable.component_1),
        contentDescription = "logo",
        modifier = Modifier
            .width(38.dp)
            .height(38.dp)
    )
}
@Composable
fun showSideBar(
){
    Image(

        painter = painterResource(id = R.drawable.vector),
        contentDescription = "menu lateral",
        modifier = Modifier
            .width(22.dp)
            .height(22.dp)
    )
}
@Composable
fun showimg1(
    modifier: Modifier = Modifier
){
    Image(

        painter = painterResource(id = R.drawable.image),
        contentDescription = "imagem1",
        modifier = Modifier
            .width(250.dp)
            .height(150.dp)
    )
}
@Composable
fun showimg2(
    modifier: Modifier = Modifier
){
    Image(

        painter = painterResource(id = R.drawable.image__1_),
        contentDescription = "imagem2",
        modifier = Modifier
            .width(250.dp)
            .height(150.dp)
    )
}
@Composable
fun showimg3(
    modifier: Modifier = Modifier
){
    Image(

        painter = painterResource(id = R.drawable.image__2_),
        contentDescription = "imagem3",
        modifier = Modifier
            .width(250.dp)
            .height(150.dp)
    )
}
}

