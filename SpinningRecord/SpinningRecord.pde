  import ddf.minim.*;
  Minim minim;
  AudioPlayer song;
  PImage pictureOfRecord;
  int angle = 0;
void setup() {
pictureOfRecord = loadImage("record.png");
  minim = new Minim(this);
  song = minim.loadFile("Gaming Background Music (HD).mp3", 512);//in the setup method
  size(225, 225);
}
void draw() {
   if(mousePressed) {
  rotateImage(pictureOfRecord, angle);
   song.play();
 }
 else {
   song.pause();
 }
  image(pictureOfRecord, 0, 0);
  angle += 1;
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}