package com.binar.navsample2

import android.text.Editable
import java.io.Serializable


data class Person(
    val name: String,
    val age: String,
    val address: String,
    val job: String
): Serializable
