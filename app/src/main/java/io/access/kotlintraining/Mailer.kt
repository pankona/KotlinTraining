package io.access.kotlintraining

interface Mailer {
    fun sendMessage(email: String, message: String)
}