package LabProgram;

//Base class Sports
class Sports
{
 public void play()
 {
     System.out.println("Playing a sport...");
 }
}


//Subclass Football
class Football extends Sports {
 @Override
 public void play() {
     System.out.println("Playing football...");
 }
}

//Subclass Basketball
class Basketball extends Sports {
 @Override
 public void play() {
     System.out.println("Playing basketball...");
 }
}

//Subclass Rugby

class Rugby extends Sports {
 @Override
 public void play() {
     System.out.println("Playing rugby...");
 }
}

//Main class
public class Sport {
 public static void main(String[] args) {
     Sports sp = new Sports();
     Football ft = new Football();
     Basketball bk = new Basketball();
     Rugby rb = new Rugby();

     sp.play();
     ft.play();
     bk.play();
     rb.play();
 }
}
