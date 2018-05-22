int score = 0;
int rainDropY = 0;
int rainDropX = 300;
void setup() {
  size(600, 700);
}
void draw() {
  background(120, 100, 0);
  fill(20, 130, 10);
  rect(mouseX, 600, 100, 25);
  fill(0, 0, 240);
  stroke(0, 0, 0);
  ellipse(rainDropX, rainDropY, 15, 30);
  rainDropY += 7;
  if (rainDropY > 700) {
    rainDropY = 0;
    int randomNumber = (int) random(width);
    rainDropX = randomNumber;
  }
  if (rainDropY > 600 && rainDropY < 605) {
    checkCatch(rainDropX);
  }
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 10, 20);
}
void checkCatch(int x) {
  if (x > mouseX && x < mouseX+100  ) {
    score++;
  } else {
    if (score > 0) {
      score--;
    }
  }
  println("Your score is now: " + score);
}