package com.example.samplelistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // list表示の動作確認　下記URLより
    // https://howcang.com/2021/08/13/kt18/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Viewの取得＆表示させるデータ（配列）を用意
        val lv: ListView =findViewById(R.id.lv)
        val data = arrayOf(
            "ライオン","クマ","キリン","ゾウ","パンダ","コアラ","キリン","サル","ヒョウ",
            "ゴリラ","カバ","カピバラ","リス","ワニ","ハムスター","ヒツジ","ネコ"
        )

        // アダプターをセット
        val adapter= ArrayAdapter(
            this,
            // 今回は1段の表示なのでsimple_list_item_1
            // ２にすると２段で表示できる
            android.R.layout.simple_list_item_1,
            data
        )

        lv.adapter =adapter

        //　リストの要素を押下した時にそのリスト番号をトーストに表示する
        lv.setOnItemClickListener {  adapterView, view, i, l ->
            Toast.makeText(this,i.toString(),Toast.LENGTH_SHORT).show()
        }


    }
}