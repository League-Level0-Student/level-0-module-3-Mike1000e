void setup() {
  size(600, 600);
}

void draw() {
  for (int i = 9; i > 0; i--) {
    if (i%2==1) {
      fill(#FF0000);
    } else {
      fill(#2E1B1B);
    }
    ellipse(300, 300, i*30, i*30);

  }
}
