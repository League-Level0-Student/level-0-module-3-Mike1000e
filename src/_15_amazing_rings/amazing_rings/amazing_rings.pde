

void setup() {
  size(1600, 900);
}
void draw(){
  lol1();
  
}

void lol1(){
for (int i=600; i>0; i--) {
    stroke(0.1);
    ellipse(450,450,i,i);
    noFill();
    i-=16;
  }
}
