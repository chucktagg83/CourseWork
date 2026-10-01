package com.example.a102c11a3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a102c11a3.ui.theme._102C11A3Theme

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
fun UserProfileScreen () {
    var user1 by remember {
        mutableStateOf(
            User(
                fullName = "John Lennon",
                age = 85,
                birthday = "10/09/1940",
                address = "Liverpool, UK",
                username = "@jlennon",
                isVerified = true,
                likesCount = 0
            )
        )
    }

    //CHALLENGE 3 SESSION 3
    val friends = remember {
        mutableStateListOf( "Rodney", "Nicole", "Sarah", "John", "Arthur")
    }


    //CHALLENGE 4 SESSION 3
    var newUsername by remember {
        mutableStateOf(user1.username)
    }
    var newAge by remember {
        mutableStateOf(user1.age.toString())
    }
    var newFriendName by remember {
        mutableStateOf("")
    }

    val backgroundColor = when (user1.getAgeGroup(user1.age)) {
        "Child" -> Color(0XFFD2D2D2)
        "Teenager" -> Color(0XFFCCFFCE)
        "Adult" -> Color(0XFFFFF3C0)
        "Senior" -> Color(0XFFBEEBFA)
        else -> Color.White
    }



    Surface(
        modifier = Modifier.fillMaxSize(),
        color = backgroundColor
    ) {
        ProfileContent(
            //VARIABLES
            user = user1,
            friends = friends,
            newUsername = newUsername,
            newAge = newAge,
            newFriendName = newFriendName,
            //ACTIONS
            onChangeUsername = { newUsername = it},
            onChangeAge = { newAge = it},
            onChangeFriendName = { newFriendName = it},
            onLike = { user1 = user1.copy(likesCount = user1.likesCount + 1)},
            onResetLikes = {user1 = user1.copy(likesCount = 0)},
            onUpdateProfile = {
                val ageInt = newAge.toIntOrNull()
                if (ageInt != null) {
                    user1 = user1.updateProfile(newUsername, ageInt)
                }
            },
            onAddFriend = {
                user1.addFriend(friends, newFriendName)
                newFriendName = ""
            },
            onRemoveFriend = {
                friendName -> user1.removeFriend(friends, friendName)
            }
        )
    }
}

@Composable
fun ProfileContent(
    user: User,
    friends: List<String>,
    newUsername: String,
    newAge: String,
    newFriendName: String,
    onChangeUsername: (String) -> Unit,
    onChangeAge: (String) -> Unit,
    onChangeFriendName: (String) -> Unit,
    onLike: () -> Unit,
    onUpdateProfile: () -> Unit,
    onAddFriend: () -> Unit,
    onRemoveFriend: (String) -> Unit,
    onResetLikes: () -> Unit
)   {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        UserProfileCard(user)

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = newUsername,
            onValueChange = onChangeUsername,
            label = { Text("Edit Username")},
            modifier = Modifier.fillMaxWidth()

        )
    // CHALLENGE 6 SESSION 4
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = newAge,
            onValueChange = onChangeAge,
            label = {Text("Edit Age") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = onUpdateProfile,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Update Profile")
        }

    // CHALLENGE 7 SESSION 4
        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = newFriendName,
            onValueChange = onChangeFriendName,
            label = {Text("Enter friend's name")},
            modifier = Modifier.fillMaxWidth()
        )

    // CHALLENGE 8 SESSION 4
        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = onAddFriend,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Add Friend")
        }

        FriendList(
            friends = friends,
            onRemoveFriend = onRemoveFriend
        )
        // CHALLENGE 9 SESSION 4
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // CHALLENGE 11 SESSION 4
            Button(
                onClick = onResetLikes,
                modifier = Modifier.weight(1f)
            ) {
                Text("Reset Likes")
            }

            // CHALLENGE 10 SESSION 4
            Button(
                onClick = onLike,
                modifier = Modifier.weight(1f)
            ){
                Text("Like")
            }
        }


    }
}

@Composable
fun FriendList (
    friends: List<String>,
    onRemoveFriend: (String) -> Unit
){
    Text(
        text = "Friends (${friends.size}",
        modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
    )

    if (friends.isEmpty()){
        Text("No friends added yet.")
    } else {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        ) {
            items(friends) {friend -> FriendItem(
                friendName = friend,
                onRemove = { onRemoveFriend(friend)}
            )}
        }
    }
}

@Composable
fun FriendItem(friendName: String, onRemove:() -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = friendName,
                modifier = Modifier.weight(1f)
            )

            Button(onClick = onRemove){
                Text("Remove")
            }
        }
    }
}

@Composable
fun UserProfileCard(user: User) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = user.fullName)
            Text(text = user.username)
            Spacer(modifier = Modifier.height(8.dp))
            //CHALLENGE 5 SESSION 3
            Text(text = "Age: ${user.age}")
            Text(text = "Birthday: ${user.birthday}")
            Text(text = "Verified: ${if (user.isVerified) "Yes" else "No"}")
            Text(text = "Like Count: ${user.likesCount}")
            Text(text = "Age Group: ${user.getAgeGroup(user.age)}")
        }
    }
}

