package com.hanuman.testGroovy
import com.hanuman.testGroovy.SecondGroovy
import hudson.model.*

    // Get the out variable
def out = getBinding().out;
  
class ThirdGroovy implements Serializable {


  void thridMethod(){
  out.println " Inside ThridGroovy Class"
    def secondGroovy = new SecondGroovy()
   secondGroovy.testGroovyMethod1()
    
  }
}
