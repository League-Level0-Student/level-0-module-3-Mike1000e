int s1 = 3;
int s2 = 3;
int x1 = 450;
int x2 = 1350;
void setup() {
  size(1800, 900);
}
void draw(){
  background(255,255,255);
  lol1();
  lol2();
}

void lol1(){
for (int i=900; i>0; i--) {
  
    stroke(0.1);
      noFill();
    ellipse(x1,450,i,i);
  
    i-=16;
    
  }
  x1+=s1;
   if(x1>1800 || x1<0){
     s1=-s1;
     
    }
}
void lol2(){
for (int e=900; e>0; e--) {
  
    stroke(0.1);
      noFill();
    ellipse(x2,450,e,e);
  
    e-=16;
   
  }
  x2-=s2;
   if(x2<0 || x2> 1800){
     s2=-s2;
    }
}
