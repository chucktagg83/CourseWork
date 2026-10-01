package com.example.a103c11a1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BakeryRevenueScreen()

        }
    }
}
// CHALLENGE 3 SESSION 1
@Composable
fun BakeryRevenueScreen() {
    val currencySymbol = "$"
    var cookiesSold by remember { mutableStateOf("") }
    var cookiePrice by remember { mutableStateOf("") }
    // CHALLENGE 6 SESSION 1
    var muffinsSold by remember { mutableStateOf("") }
    var muffinPrice by remember { mutableStateOf("") }
    var cakeSold by remember { mutableStateOf("") }
    var cakePrice by remember { mutableStateOf("") }

    // DATA STRUCTURE
    val bakeryItems = remember { mutableStateListOf<BakeryItem>() }
    var totalRevenue by remember { mutableDoubleStateOf(0.0) }
    var bestSellingItem by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Bakery Revenue Calculator",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "Enter the sales information for each product",
            modifier = Modifier.padding(bottom = 16.dp),
            style = MaterialTheme.typography.bodyMedium
        )

        //CHALLENGE 7 SESSION 1
        //COOKIES
        OutlinedTextField (
            value = cookiesSold,
            onValueChange = { cookiesSold = it },
            label = { Text("Cookies Sold") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = cookiePrice,
            onValueChange = { cookiePrice = it },
            label = { Text("Price per cookie") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        // CHALLENGE 8 SESSION 1
        OutlinedTextField(
            value = muffinsSold,
            onValueChange = { muffinsSold = it },
            label = { Text("Muffins Sold") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = muffinPrice,
            onValueChange = { muffinPrice = it },
            label = { Text("Price per muffin") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        //CHALLENGE 9 SESSION 1
        OutlinedTextField(
            value = cakePrice,
            onValueChange = { cakePrice = it },
            label = { Text("Price per cake") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = cakeSold,
            onValueChange = { cakeSold = it },
            label = { Text("Cakes sold") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        // CHALLENGE 1 SESSION 2
        Button(
            onClick = {
                val cookieP = cookiePrice.toDoubleOrNull()
                val cookies = cookiesSold.toDoubleOrNull()
        // CHALLENGE 2 SESSION 2
                val muffinP = muffinPrice.toDoubleOrNull()
                val muffins = muffinsSold.toDoubleOrNull()
                val cakesP = cakePrice.toDoubleOrNull()
                val cakes = cakeSold.toDoubleOrNull()

                if (
                    cookies == null || cookieP == null ||
                    muffins == null || muffinP == null ||
                    cakes == null || cakesP == null
                ) {
                    errorMessage = "Please enter valid numeric values"
                } else {
                    errorMessage = ""
                    bakeryItems.clear()

                    bakeryItems.add(BakeryItem("Cookies", cookies, cookieP))
        // CHALLENGE 3 SESSION 2
                    bakeryItems.add(BakeryItem("Muffins", muffins, muffinP))
                    bakeryItems.add(BakeryItem("Cakes", cakes, cakesP))

                    totalRevenue = bakeryItems.sumOf { it.revenue() }

                    val topItem = bakeryItems.maxByOrNull { it.revenue() }

                    bestSellingItem = topItem?.name ?: ""
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Calculate Revenue")
        }

        Spacer(modifier = Modifier.height(16.dp))

        if(errorMessage.isNotEmpty()) {
            Text(
                text = errorMessage,
                color = Color.Red
            )
            Spacer(modifier = Modifier.height(8.dp))
        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
    // CHALLENGE 4 SESSION 2
                Text(
                    text = "Daily Revenue Report",
                    style = MaterialTheme.typography.titleLarge
                )

                Spacer(modifier = Modifier.height(8.dp))

                if (bakeryItems.isEmpty()){
                    Text("No report available yet.")
                } else {
                    LazyColumn(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(bakeryItems) { item ->
                            Text(
                                text = "${item.name}: $currencySymbol${"%2f".format(item.revenue())}"
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                        }
                    }
    // CHALLENGE 5 SESSION 2
                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Best revenue item: $bestSellingItem",
                        style = MaterialTheme.typography.bodyLarge
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Total: $currencySymbol${"%2f".format(totalRevenue)}",
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }
        }
    }
}
// CHALLENGE 5 SESSION 1
@Preview(showBackground = true)
@Composable
fun BakeryRevenueScreenPreview() {
    BakeryRevenueScreen()
}


