public class Tv {
  String color;
  boolean power;
  int channel;
  
  void power()        { power = !power; }
  void channelUp()    { ++channel; }
  void channelDown()  { ++channel; }
}

class SmartTv {
  boolean caption;
  int channel;

  void channelUp()    { ++channel; }
  void channelDown()  { ++channel; }

  void displayCaption(String text) {
      if (caption) {
         System.out.println(text);
      }
  }
}
