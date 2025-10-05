package com.example.control

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons = listOf(
            R.id.btn_connected to "已连接",
            R.id.btn_disconnect to "断开",
            R.id.btn_fake_auto to "插卡假打",
            R.id.btn_fake_on to "全局假打",
            R.id.btn_connect to "接通",
            R.id.btn_hangup to "挂断",
            R.id.btn_reject to "拒接",
            R.id.btn_dead_move to "死卡移动",
            R.id.btn_dead_union to "死卡联通",
            R.id.btn_dead_signal to "死卡电信",
            R.id.btn_empty to "空号",
            R.id.btn_unreachable to "无法接通",
            R.id.btn_pause_service to "暂停服务",
            R.id.btn_shutdown to "停机",
            R.id.btn_poweroff to "关机",
            R.id.btn_not_exist to "不存在",
            R.id.btn_report to "上报雷号",
            R.id.btn_wifi_show to "显示WIFI",
            R.id.btn_wifi_hide to "隐藏WIFI",
            R.id.btn_wifi_connect to "连接WIFI"
        )

        buttons.forEach { (id, label) ->
            findViewById<Button>(id).setOnClickListener {
                Toast.makeText(this, "点击：$label", Toast.LENGTH_SHORT).show()
            }
        }

        val et = findViewById<EditText>(R.id.et_number)
        // 可扩展：读取号码进行业务逻辑
    }
}