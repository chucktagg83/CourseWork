package com.example.a103c11a3

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme{
                RestaurantScreen()
            }
        }
    }
}

// CHALLENGE 1 SESSION 3
@Composable
fun RestaurantScreen() {
    // CHALLENGE 2 SESSION 3
    val vipCustomers = arrayOf(
        "Julio",
        "Wendy",
        "Ryan",
        "Joseph",
        "Latrice"
    )
    // QUEUE
    val waitingList = remember { mutableStateListOf<String>() }
    // STACK
    val seatedHistory = remember { mutableStateListOf<String>() }
    // STATE VARIABLES
    var customerName by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("Welcome!") }
    val customersTime = remember { mutableStateMapOf<String, String>() }
    val seatedCustomersTime = remember { mutableStateMapOf<String, String>()}

// CHALLENGE 3 SESSION 3
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // CHALLENGE 4 SESSION 3
        Text(
            text = "Restaurant Waiting List",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        // CHALLENGE 5 SESSION 3
        OutlinedTextField(
            value = customerName,
            onValueChange = { customerName = it },
            label = { Text("Customer name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                if (customerName.isNotBlank()) {
                    val newCustomer = customerName
                    val currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"))

                    waitingList.add(customerName)
                    customersTime[newCustomer] = currentTime
                    message = "$customerName added to waiting list"
                    customerName = ""
                } else {
                    message = "Please enter a name"
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Add Customer")
        }

        Spacer(modifier = Modifier.height(8.dp))

        // CHALLENGE 6 SESSION 3
        Button(
            onClick = {
                //waitingList.addAll(vipCustomers)
                //message = "VIP customers added"

                val currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"))

                vipCustomers.forEach { vipCustomer ->
                    waitingList.add(vipCustomer)
                    customersTime[vipCustomer] = currentTime
                }

                message = "VIP customers added at $currentTime"
            },
            modifier = Modifier.fillMaxWidth()

        ) {
            Text("Load VIP Customers")
        }

        Spacer(modifier = Modifier.height(8.dp))
        // CHALLENGE 7 SESSION 3
        Button(
            onClick = {
                if (waitingList.isNotEmpty()) {
                    val nextCustomer = waitingList.removeAt(0) // QUEUE: FIFO
                    // EXTRA CHALLENGE
                    val currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"))
                    seatedHistory.add(nextCustomer) // STACK: PUSH
                    //EXTRA CHALLENGE
                    seatedCustomersTime[nextCustomer] = currentTime
                    message = "Now seating: $nextCustomer}"
                } else {
                    message = "No customers in line"
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Seat Next Customer")
        }

        // CHALLENGE 1 SESSION 4
        Spacer(modifier = Modifier.height(16.dp))

        Text("Message: $message")

        Spacer(modifier = Modifier.height(16.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            // CHALLENGE 2 SESSION 4
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Waiting List (Queue")

                Spacer(modifier = Modifier.height(8.dp))

                // CHALLENGE 3 SESSION 4
                if (waitingList.isEmpty()) {
                    Text("No customers waiting")
                } else {
                    //waitingList.forEachIndexed { index, customer ->
                    //    Text("${index +1}. $customer")
                    //}
                    waitingList.forEachIndexed { index, customer ->
                        val arrivalTime = customersTime[customer] ?: "Unknown"

                        Text("${index + 1}. $customer - Arrived at: $arrivalTime")
                    }
                }
            }
        }

            // CHALLENGE 4 SESSION 4
            Spacer(modifier = Modifier.height(16.dp))

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Seated History (Stack)")

                    Spacer(modifier = Modifier.height(8.dp))

                    // CHALLENGE 5 SESSION 4
                    if (seatedHistory.isEmpty()) {
                        Text("No customers seated yet")
                    } else {
                        seatedHistory.reversed().forEach { customer ->
                        //    Text("-$customer")
                        //}
                            val seatedTime = seatedCustomersTime[customer] ?: "Unknown"

                            Text("-$customer - Seated at: $seatedTime")
                        }
                    }
                }
            }
        }
    }

// CHALLENGE 1 SESSION 3
@Preview(showBackground = true)
@Composable
fun RestaurantScreenPreview(){
    MaterialTheme {
        RestaurantScreen()
    }

}