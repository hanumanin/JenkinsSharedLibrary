package com.hanuman.testGroovy
import com.hanuman.testGroovy.SecondGroovy

class ThirdGroovy implements Serializable {
  

  void thridMethod(){
  println " Inside ThridGroovy Class"
    def secondGroovy = new SecondGroovy()
   secondGroovy.testGroovyMethod1()
    
  }
}
