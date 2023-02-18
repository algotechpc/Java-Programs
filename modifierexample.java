

//please copy and paste following url into browser to watch my utube videos of java programming datas tructure, Algorithms,machine learning lectures 
// https://www.youtube.com/@algotechprogrammingconcept9704/playlists

final class modifierexample {
static int i =50;
int x =60;
int x =78; //x is not final variable hence value of x is updated
public static void display()   // static method
{
System.out.println("static example demo");
System.out.println("value of i is"+" "+i);

}
static public void main(String args[]) {
 
//public static void main(String args[]) {
display();
System.out.println("value of x is"+" "+x);

	}


//compile
//javac modifierexample.java
//run 
// java modifierexample

//place all modifiers 1 by 1 and see which modifiers are allowed out of 12 modifiers in the output

//public class modifierexample {

//modifier public allowed

//abstract class modifierexample{ 
//modifier abstract allowed

//final class modifierexample{
//modifier final allowed

 //stictfp class modifierexample { 

//modifier stictfp allowed but interface ,enum required

//default class modifierexample{

//modifier default allowed but interface ,enum required 

//private class modifierexample { 

//private modifier not allowed


//native class modifierexample {

//native modifier not allowed
//transient class modifierexample {

//transient modifier not allowed


//volatile class modifierexample {

//volatile modifier not allowed

//static class modifierexample {

//modifier static not allowed


//protected class modifierexample {
// modifier protected not allowed

//synchronized class modifierexample {
// modifier synchronized not allowed














