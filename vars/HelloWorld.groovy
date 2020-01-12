import com.hanuman.package1.FirstGroovy



def call(String solutionPath) {
    echo " Hello World ${solutionPath}"
    
    def firstGroovy = new FirstGroovy()
    firstGroovy.testGroovyMethod()
    
    echo " After method Call"
    
    
    }
