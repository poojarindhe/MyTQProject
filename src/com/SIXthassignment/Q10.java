package com.SIXthassignment;

/*10.Write MusicalInstrument interface with play method. It also has common
behavior (static) learnInstrument. Create Abstract class Sound with abstract
method listenSound.Implement MusicalInstrument interface in
PercussionInstrument and StringedInstrument classes.Also extend Sound class
in both classes.Create object ‘Tabla’ of PercussionInstrument class and object
‘Violin’ of StringedInstrument class.call Paly, learnInstrument and listenSound
methods of both objects.*/

interface MusicalInstrument
{
	public abstract void play();
		
	
}
abstract class Sound 
{
	abstract void listenSound();
}
class PercussionInstrument extends Sound implements MusicalInstrument
{
	public void play()
	{
		System.out.println("Guitar");
	}
	public void listenSound()
	{
		System.out.println("Musical");
		
	}
	
}
class StringedInstrument extends Sound implements MusicalInstrument
{
	public void play()
	{
	 System.out.println("Piano");
	}
	public void listenSound()
	{
		System.out.println("Silent");
	}
	
}
public class Q10 {

	public static void main(String[] args)
	{
		MusicalInstrument obj = new PercussionInstrument();
		obj.play();
		
		MusicalInstrument obj1 = new  StringedInstrument();
		obj1.play();
		
	

	}

}
