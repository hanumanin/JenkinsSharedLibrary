import com.hanuman.testGroovy.FirstGroovy



def call(String solutionPath) {
    echo " Hello World ${solutionPath}"
    
    def firstGroovy = new FirstGroovy()
    firstGroovy.testGroovyMethod()
    
    echo " After method Call"
    
    
    }
