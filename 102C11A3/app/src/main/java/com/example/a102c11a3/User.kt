package com.example.a102c11a3

import androidx.compose.runtime.snapshots.SnapshotStateList

data class User (
    val fullName: String,
    val age: Int,
    val birthday: String,
    val address: String,
    val username: String,
    val isVerified: Boolean,
    val likesCount: Int
){
    //CHALLENGE 1 SESSION 3
    fun getAgeGroup (age: Int): String {
        return when (age) {
            in 0..12 -> "Child"
            in 13..17 -> "Teenager"
            in 18..56 -> "Adult"
            else -> "Senior"
        }
    }

    fun updateProfile(newUsername: String, newAge: Int): User {
        return copy(
            username = newUsername,
            age = newAge
        )
    }

    fun addFriend(friendList: SnapshotStateList<String>, newFriend: String){
        if (newFriend.isNotBlank() && !friendList.contains(newFriend)) {
            friendList.add(newFriend)
        }
    }

    //CHALLENGE 2 SESSION 3
    fun removeFriend(friendList: SnapshotStateList<String>, friendName: String){
        friendList.remove(friendName)
    }

}