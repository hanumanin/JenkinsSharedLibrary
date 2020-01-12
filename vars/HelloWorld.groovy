import com.hanuman.testGroovy.FirstGroovy
import com.haunman.testGroovy.SecondGroovy



def call(String solutionPath) {
    echo " Hello World ${solutionPath}"
    
    def firstGroovy = new FirstGroovy()
    firstGroovy.testGroovyMethod()
    
  //  def secondGroovy = new SecondGroovy()
   // secondGroovy.testGroovyMethod()
    
    
    echo " After method Call"
    
    
    }
