import utility

def call(String name){

    object = new  utility()

    pipeline{
      stage('print'){
        script{
            object.print(name)
        }
      }





    }
     
    
}
