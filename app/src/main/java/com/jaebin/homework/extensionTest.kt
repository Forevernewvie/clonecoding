package com.jaebin.homework

import com.jaebin.homework.data.Tag
import com.jaebin.homework.data.TagX
import java.text.SimpleDateFormat
import java.util.*

object extensionTest {

    fun List<Tag>.makeString():String{
        var str =""
        var cnt = 0
        for (i in this.indices){
            if(cnt==4){
                str+="#"+this[i].name+"\n"
                cnt=0
            }
            str+="#"+this[i].name+" "
            cnt+=1
        }
        return str
    }

    fun List<TagX>.makeStringX():String{
        var str =""
        for (i in this.indices){
            str+="#"+this[i].name+" "
        }
        return str
    }


    fun  Long.longtoDateTime(): String {
        val date = Date(this)
        val realTime = SimpleDateFormat("YYYY-MM-dd")
        return realTime.format(date)
    }

}