class Play
{
    String title;
    String artist;
    int duration;

    void play()
    {
      System.out.println("Playing Song....");
    }
  
    void printDetails()
    {
      System.out.println("This is "+ title + " by " + artist);
    }
}
class StreamingSong
{
   public static void main(String[] args)
   {
      Play song = new Play();
      song.artist = "Glass Animal";
      song.title = "Heat waves";
      song.play();
      song.printDetails();
   }
}