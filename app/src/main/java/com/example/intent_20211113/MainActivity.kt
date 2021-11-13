package com.example.intent_20211113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // 멤버변수
    val REQ_FOR_NICKNAME = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveToOther.setOnClickListener {
            val myIntent = Intent(this, SubActivity::class.java)
            startActivity(myIntent)
        }

        btnSendMessage.setOnClickListener {
            // ViewMessageActivity 화면으로 이동하기 + 입력한 문구도 가지고 이동하기
            // 1. 입력한 내용을 기록해두자. (변수에 담아두자)

            val inputMessage = edtMessage.text.toString()

            // 2. 화면 이동
            val myIntent = Intent(this, ViewMessageActivity::class.java)
            myIntent.putExtra("msg",inputMessage)
            startActivity(myIntent)

        }

        btnEditNickname.setOnClickListener {
            val intent = Intent(this,EditNicknameActivity::class.java)
            startActivityForResult(intent, REQ_FOR_NICKNAME)
        }
    }


}