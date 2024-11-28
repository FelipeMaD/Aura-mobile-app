package com.example.auraapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
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
       // enableEdgeToEdge()
//        setContent {
////            AuraTheme {
////                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
////                    Greeting(
////                        name = "Android",
////                        modifier = Modifier.padding(innerPadding)
////                    )
////                }
//            }
        }
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
        .padding(16.dp, 8.dp)

){
    Text("Seja bem vindo, $userName")
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

    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp, 8.dp)


        ){
            showLogo()
            showSideBar()
        }

        Greeting("João")
    }

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