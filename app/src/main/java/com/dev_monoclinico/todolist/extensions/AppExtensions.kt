package com.dev_monoclinico.todolist.extensions

import com.google.android.material.textfield.TextInputLayout
import java.text.SimpleDateFormat
import java.util.*

private val locale = Locale("pt","BR")

fun Date.format(): String{
    return SimpleDateFormat("dd/MM/yyyy", locale).format(this)
}

var TextInputLayout.text: String
    get() = this.editText?.text?.toString() ?: ""
    set(value) {
        this.editText?.setText(value)
    }