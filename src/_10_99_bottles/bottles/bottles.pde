int beer = 99;
 void draw(){
   
  println( beer + " bottles of beer on the wall, " + beer + " bottles of beer.");
 beer --;

  println("Take one down and pass it around, " + beer + " bottles of beer on the wall.");
     if(beer == 0){
    println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall."  );
    exit();
   }
  
   
   
 }
