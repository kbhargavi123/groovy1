def a="Facebook"
if (a=Google){
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