package com.dami.bus

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var intertv:TextView
 lateinit var intertv2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val df = SimpleDateFormat("HH:mm")
     val list_item = mutableListOf<String>()
       intertv = findViewById(R.id.intertv)
     intertv2 = findViewById(R.id.intertv2)
     val list_item3 = mutableListOf<Int>()

       list_item.add("9:00")
       list_item.add("9:20")
       list_item.add("9:50")

       list_item.add("10:10")
       list_item.add("10:25")
       list_item.add("10:45")

       list_item.add("11:00")
       list_item.add("11:20")
       list_item.add("11:40")

       list_item.add("12:00")
       list_item.add("12:22")
       list_item.add("12:45")

       list_item.add("13:02")
       list_item.add("13:15")
       list_item.add("13:25")
       list_item.add("13:45")

       list_item.add("14:07")
       list_item.add("14:30")
       list_item.add("14:50")

       list_item.add("15:10")
       list_item.add("15:20")
       list_item.add("15:30")
       list_item.add("15:45")

       list_item.add("16:05")
       list_item.add("16:20")
       list_item.add("16:30")
       list_item.add("16:45")

       list_item.add("17:05")
       list_item.add("17:25")
       list_item.add("17:45")

       list_item.add("18:05")
       list_item.add("18:25")
       list_item.add("18:45")

       list_item.add("19:05")
       list_item.add("19:25")
       list_item.add("19:45")

       list_item.add("20:10")

      list_item3.add(9*60)
      list_item3.add(9*60+20)
      list_item3.add( 9*60+50 )

      list_item3.add( 10*60+10 )
      list_item3.add( 10*60+25 )
      list_item3.add( 10*60+45 )

      list_item3.add( 11*60+0 )
      list_item3.add( 11*60+20 )
      list_item3.add( 11*60+40 )

      list_item3.add( 12*60+0 )
      list_item3.add( 12*60+22 )
      list_item3.add( 12*60+45 )

      list_item3.add( 13*60+2 )
      list_item3.add( 13*60+15 )
      list_item3.add( 13*60+25 )
      list_item3.add( 13*60+45 )

      list_item3.add( 14*60+7 )
      list_item3.add( 14*60+30 )
      list_item3.add( 14*60+50 )

      list_item3.add( 15*60+10 )
      list_item3.add( 15*60+20 )
      list_item3.add( 15*60+30 )
      list_item3.add( 15*60+45 )

      list_item3.add( 16*60+5 )
      list_item3.add( 16*60+20 )
      list_item3.add( 16*60+30 )
      list_item3.add( 16*60+45 )

      list_item3.add( 17*60+5 )
      list_item3.add( 17*60+25 )
      list_item3.add( 17*60+45 )

      list_item3.add( 18*60+5 )
      list_item3.add( 18*60+25 )
      list_item3.add( 18*60+45 )

      list_item3.add( 19*60+5 )
      list_item3.add( 19*60+25 )
      list_item3.add( 19*60+45 )

      list_item3.add( 20*60+10 )

     val list_item2 = mutableListOf<String>()
     val list_item4 = mutableListOf<Int>()

     list_item2.add("8:41")
     list_item2.add("8:59")

     list_item2.add("9:5")
     list_item2.add("9:15")
     list_item2.add("9:20")
     list_item2.add("9:35")
     list_item2.add("9:50")

     list_item2.add("10:05")
     list_item2.add("10:20")
     list_item2.add("10:35")
     list_item2.add("10:55")

     list_item2.add("11:10")
     list_item2.add("11:30")
     list_item2.add("11:50")

     list_item2.add("12:10")
     list_item2.add("12:32")
     list_item2.add("12:55")

     list_item2.add("13:12")
     list_item2.add("13:25")
     list_item2.add("13:35")
     list_item2.add("13:55")

     list_item2.add("14:17")
     list_item2.add("14:40")

     list_item2.add("15:00")
     list_item2.add("15:20")
     list_item2.add("15:30")
     list_item2.add("15:40")
     list_item2.add("15:55")

     list_item2.add("16:15")
     list_item2.add("16:30")
     list_item2.add("16:40")
     list_item2.add("16:55")
list_item4.add(8*60+41)
list_item4.add( 8*60+59 )

list_item4.add( 9*60+5 )
list_item4.add( 9*60+15 )
list_item4.add( 9*60+20 )
list_item4.add( 9*60+35 )
list_item4.add( 9*60+50 )

list_item4.add( 10*60+5 )
list_item4.add( 10*60+20 )
list_item4.add( 10*60+35 )
list_item4.add( 10*60+55 )

list_item4.add( 11*60+10 )
list_item4.add( 11*60+30 )
list_item4.add( 11*60+50 )

list_item4.add( 12*60+10 )
list_item4.add( 12*60+32 )
list_item4.add( 12*60+55 )

list_item4.add( 13*60+12 )
list_item4.add( 13*60+25 )
list_item4.add( 13*60+35 )
list_item4.add( 13*60+55 )

list_item4.add( 14*60+17 )
list_item4.add( 14*60+40 )

list_item4.add( 15*60+0 )
list_item4.add( 15*60+20 )
list_item4.add( 15*60+30 )
list_item4.add( 15*60+40 )
list_item4.add( 15*60+55 )

list_item4.add( 16*60+15 )
list_item4.add( 16*60+30 )
list_item4.add( 16*60+40 )
list_item4.add( 16*60+55 )

/*list_item.add("9:00")
       list_item.add("9:20")
       list_item.add("9:50")

       list_item.add("10:10")
       list_item.add("10:25")
       list_item.add("10:45")

       list_item.add("11:00")
       list_item.add("11:20")
       list_item.add("11:40")

       list_item.add("12:00")
       list_item.add("12:22")
       list_item.add("12:45")

       list_item.add("13:02")
       list_item.add("13:15")
       list_item.add("13:25")
       list_item.add("13:45")

       list_item.add("14:07")
       list_item.add("14:30")
       list_item.add("14:50")

       list_item.add("15:10")
       list_item.add("15:20")
       list_item.add("15:30")
       list_item.add("15:45")

       list_item.add("16:05")
       list_item.add("16:20")
       list_item.add("16:30")
       list_item.add("16:45")

       list_item.add("17:05")
       list_item.add("17:25")
       list_item.add("17:45")

       list_item.add("18:05")
       list_item.add("18:25")
       list_item.add("18:45")

       list_item.add("19:05")
       list_item.add("19:25")
       list_item.add("19:45")

       list_item.add("20:10")

       val list_item2 = mutableListOf<String>()

       list_item2.add("8:41")
       list_item2.add("8:59")

       list_item2.add("9:5")
       list_item2.add("9:15")
       list_item2.add("9:20")
       list_item2.add("9:35")
       list_item2.add("9:50")

       list_item2.add("10:05")
       list_item2.add("10:20")
       list_item2.add("10:35")
       list_item2.add("10:55")

       list_item2.add("11:10")
       list_item2.add("11:30")
       list_item2.add("11:50")

       list_item2.add("12:10")
       list_item2.add("12:32")
       list_item2.add("12:55")

       list_item2.add("13:12")
       list_item2.add("13:25")
       list_item2.add("13:35")
       list_item2.add("13:55")

       list_item2.add("14:17")
       list_item2.add("14:40")

       list_item2.add("15:00")
       list_item2.add("15:20")
       list_item2.add("15:30")
       list_item2.add("15:40")
       list_item2.add("15:55")

       list_item2.add("16:15")
       list_item2.add("16:30")
       list_item2.add("16:40")
       list_item2.add("16:55")*/
   var listview = findViewById<ListView>(R.id.mainListview)

   var listAdapter = ListViewAdapter(list_item)
   listview.adapter = listAdapter

   var listview2 = findViewById<ListView>(R.id.mainListview2)
   var listAdapter2 = ListViewAdapter2(list_item2)
   listview2.adapter = listAdapter2


   var current = System.currentTimeMillis() //long타입의 초

list_item
   var calToday: Calendar = Calendar.getInstance()
   var calDDay: Calendar = Calendar.getInstance()


   //현재시간 -->-->millionseconds로 변화
//calToday.set(Calendar.HOUR_OF_DAY,Calendar.HOUR_OF_DAY.toInt())
//calToday.set(Calendar.MINUTE,Calendar.MINUTE.toInt())
var caltoday = Calendar.HOUR_OF_DAY.toInt()*60 +Calendar.MINUTE.toInt() //시간과 분을 int로 바꿔서 분으로 합치기 int형 분


//버스시간-현재시간 0보다 크거나 같을때 그값을 var neartime으로 지정
     var nearschooltime:Int?=0
     val schoolinter:String

     var str1:String
     var str2:String
     for(i in list_item3){
      if(caltoday<=i){
       nearschooltime =i
       }
     str1 = convertSecondsToHMmSs(i).toString()
      intertv.text =str1
      var num=list_item.indexOf(str1)
     if( list_item[list_item.indexOf(str1)]==str1)
     // list_item[list_item.indexOf(str1)].
      //listview.setBackgroundColor(Color.RED)

       break
}



     var nearjeongtime:Int?=0

     for(i in list_item4){
      if(caltoday<=i){
       nearjeongtime =i
      }
      intertv2.text=convertSecondsToHMmSs(i).toString()
      break

     }
      



}

    fun convertSecondsToHMmSs(seconds: Int): String? {

val m = seconds % 60
val h = seconds/60
return String.format("%d:%02d", h, m)
}
}
