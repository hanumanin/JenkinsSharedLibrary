import com.hanuman.testGroovy.FirstGroovy
import com.hanuman.testGroovy.SecondGroovy
import com.hanuman.testGroovy.ThirdGroovy

def call(String solutionPath) {
    echo " Hello World ${solutionPath}"
    
    def firstGroovy = new FirstGroovy()
    firstGroovy.testGroovyMethod()
    
   def secondGroovy = new SecondGroovy()
   secondGroovy.testGroovyMethod1()
    
    
    def thirdGroovy = new ThirdGroovy()
   thirdGroovy.thridMethod()
    
    echo " After method Call"
    
    // def thirdGroovy = new ThirdGroovy("Test")
    
    
    }
