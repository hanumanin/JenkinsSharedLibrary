//import com.hanuman.testGroovy.FirstGroovy
import com.hanuman.testGroovy.SecondGroovy



def call(String solutionPath) {
    echo " Hello World ${solutionPath}"
    
  //  def firstGroovy = new FirstGroovy()
   // firstGroovy.testGroovyMethod()
    
   def secondGroovy = new SecondGroovy()
   secondGroovy.testGroovyMethod1()
    
    
    echo " After method Call"
    
    
    }
