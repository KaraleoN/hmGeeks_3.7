package com.geeks.hmgeeks_37

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChatActivity : AppCompatActivity() {

    private lateinit var chatTextView: TextView
    private lateinit var messageEditText: EditText
    private lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        chatTextView = findViewById(R.id.chatTextView)
        messageEditText = findViewById(R.id.messageEditText)
        sendButton = findViewById(R.id.sendButton)

        val contactName = intent.getStringExtra("contact_name")
        chatTextView.text = "Чат с: $contactName"

        sendButton.setOnClickListener {
            val message = messageEditText.text.toString()
            if (message.isNotBlank()) {
                // Обработка отправки сообщения
                // Здесь вы можете добавить логику для обработки и отображения сообщения
                // Например, обновить TextView или RecyclerView с сообщениями

                // Очистка поля ввода после отправки
                messageEditText.text.clear()
            }
        }
    }
}