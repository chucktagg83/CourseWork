package com.example.a102c11a1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           UserProfileScreen()
        }
    }
}

@Composable
fun UserProfileScreen(){
    var name by remember {mutableStateOf(value = "Chuck")}
    var age by remember {mutableIntStateOf(value = 43)}
    val birthday = "1983-06-23"
    var address by remember {mutableStateOf(value = "Aurora, CO")}
    var username by remember {mutableStateOf(value = "bgtagg")}
    val isVerified = true
    var like by remember {mutableIntStateOf(value = 0)}

    // CHALLENGE 3
    val friends = remember {mutableStateListOf("Ricky","Mike", "Joe", "Anna", "Steve")}
    val ageGroup = getAgeGroup(age)

   Surface {
       ProfileContent(
            name,
            age,
            birthday,
            address,
            username,
            isVerified,
            likesCount = like,
            friends = friends,
            //CHALLENGE 4 SESSION 1
            onLike = { like++ },
            onChangeUsername = { username = "@newUser123" },
            ageGroup,
            onAddFriend = { addFriend( friends, "Sophia")},
            onRemoveFriend = { removeFriend( friends, "Mike")}
        )
    }
}

@Composable
fun ProfileContent(
    name: String,
    age: Int,
    birthday: String,
    address: String,
    username: String,
    isVerified: Boolean,
    likesCount: Int,
    friends: List<String>,
    //CHALLENGE 4 SESSION 1
    onLike: () -> Unit,
    onChangeUsername: () -> Unit,
    ageGroup: String,
    onAddFriend: () -> Unit,
    onRemoveFriend: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "User Profile",
            modifier = Modifier.padding(30.dp)
        )
        Text(
            text = "Name: $name",
            modifier = Modifier.padding(5.dp)
        )
        Text(
            text = "Username: $username",
            modifier = Modifier.padding(5.dp)
        )
        Text(
            text = "Age: $age",
            modifier = Modifier.padding(5.dp)
        )
        Text(text = "Age Group: $ageGroup",
            modifier = Modifier.padding(5.dp))
        Text(
            text = "Birthday: $birthday",
            modifier = Modifier.padding(5.dp)
        )
        Text(
            text = "Address: $address",
            modifier = Modifier.padding(5.dp)
        )
        Text(
            text = "Verified: ${if (isVerified) "Yes" else "No"}",
            modifier = Modifier.padding(5.dp)
        )
        Text(
            text = "Likes: $likesCount",
            modifier = Modifier.padding(5.dp)
        )
        Text(text = "Friends (${friends.size}):",
            modifier = Modifier.padding(5.dp))

        friends.forEach {
            Text(it, modifier = Modifier.padding(5.dp))
        }

        Row() {
            Button(onClick = onLike) {
                Text("Like",
                    modifier = Modifier.padding(2.dp))
            }
            // CHALLENGE 3 SESSION 2
            Button(onClick = onChangeUsername) {
                Text("Change Username",
                    modifier = Modifier.padding(2.dp))
            }
        }

        Row() {
            Button(onClick = onAddFriend) {
                Text("Add Friend",
                    modifier = Modifier.padding(2.dp))
            }

            Button(onClick = onRemoveFriend) {
                Text("Remove Friend",
                    modifier = Modifier.padding(2.dp))
            }
        }

    }
}
// CHALLENGE 5 SESSION 2
fun addFriend(friendList: MutableList<String>, newFriend: String) {
    if (!friendList.contains(newFriend))
        friendList.add(newFriend)
}

// CHALLENGE 6 SESSION 2
fun removeFriend(friendList: MutableList<String>, friendName: String) {
    friendList.remove(element = friendName)
}
// CHALLENGE 4 SESSION 2
fun getAgeGroup(age: Int): String {
    return when {
        age < 13 -> "Child"
        age in 13..17 -> "Teenager"
        age in 18..59 -> "Adult"
        else -> "Senior"
    }
}



