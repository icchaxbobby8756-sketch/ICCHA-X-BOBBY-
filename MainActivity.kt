package com.icchaxbobby.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IcchaXBobbyApp()
        }
    }
}

@Composable
fun IcchaXBobbyApp() {
    val gradientBackground = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF0F172A), // Dark slate
            Color(0xFF1E1B4B), // Indigo tone
            Color(0xFF31103F)  // Deep magenta
        )
    )

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF090D16)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(gradientBackground)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Card(
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0x33FFFFFF)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Column(
                    modifier = Modifier.padding(28.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "ICCHA X BOBBY",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Official Android Application",
                        fontSize = 16.sp,
                        color = Color(0xFFE2E8F0),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = Color(0xFF4F46E5)
                    ) {
                        Text(
                            text = "Version 1.0.0 (Build 1)",
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp),
                            color = Color.White,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { /* Action handler */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF6366F1)
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
            ) {
                Text(
                    text = "Launch ICCHA X BOBBY Experience",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
