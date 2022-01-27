pipeline 
{
    agent any

     

    stages 
    {
        stage('checkout scm') {
            steps {
                git branch: 'main', url: 'https://github.com/kbhargavi123/groovy1.git'
                echo 'checkedout scm'
            }
        }
        stage('groovy script') 
        {
            steps {

              script
              {
                def a = Type
                if (a == "Google")
               {
                  def li=a as List
                  println li
               }
               else
               {
                  def map = [:]
                  def b=a.length();
                  println b
                  String[] sp= a.split("(?<=\\G....)");
                  def fname= sp.first()
                  def lname= sp.last()
                  map[fname] = lname
                  println map
                }
              }
            }
        }
   }
}






