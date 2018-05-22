void setup() {
  size(700, 700);
  background(0, 0, 0);
}
void draw() {
  makeMagical();
  fill(0, 240, 0);
  ellipse(getWormX(54), getWormY(50), 20, 20);
  ellipse(getWormX(80), getWormY(69), 20, 20);
  ellipse(getWormX(10), getWormY(20), 20, 20);
  ellipse(getWormX(39), getWormY(26), 20, 20);
  ellipse(getWormX(67), getWormY(77), 20, 20);
  ellipse(getWormX(110), getWormY(84), 20, 20);
  ellipse(getWormX(104), getWormY(51), 20, 20);
  ellipse(getWormX(81), getWormY(82), 20, 20);
  ellipse(getWormX(30), getWormY(27), 20, 20);
  ellipse(getWormX(99), getWormY(108), 20, 20);
  ellipse(getWormX(97), getWormY(72), 20, 20);
  ellipse(getWormX(210), getWormY(54), 20, 20);
  if(mousePressed) {
  int r = (int)random(0, 200);
  fill(r/2, r, r * 2);
   ellipse(getWormX(r), getWormY(r/2), 20, 20);
}
   
}

float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
  fill( 0, 0, 0, 10 );
  rect(0, 0, width, height);
  noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency * 3), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency * 3), 0, 1, 0, height);
}