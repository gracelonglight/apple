public class Ex7_1 {
  public static void main(String args[]){
      SmartTv stv;
      stv = new SmartTv();
      stv.channel = 10;
      stv.channelUp();
      System.out.println(stv.channel);
      stv.displayCaption("Hello, World");
      stv.caption = true;
      stv.displayCaption("Hello, World");
  }
}
