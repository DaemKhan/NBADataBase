/**
 * @(#)NBADataBase.java
 *
 *
 * @author 
 * @version 1.00 2015/2/23
 */

import java.io.*;
import java.util.*;
public class NBADataBase
{
public static void main(String args[])
{
Scanner Keyboard = new Scanner(System.in);// allows the user to input from the key board
int x; // declares three variables that are used to get inputs from the keyboard
int y;
int q;
System.out.println("Welcome to the NBA Database");
System.out.println("");
System.out.println("This Database contains every starter currently playing and also includes their current statistics.");
System.out.println("");
System.out.println("The statistics that will be displayed are:");
System.out.println("Points Per Game(PPG)");
System.out.println("Assists Per Game(AST)");
System.out.println("Turnover Per Game(TO)");
System.out.println("Field Goal Percentage(FG%)");
System.out.println("Free Throw Percentage(FT%)");
System.out.println("");System.out.println("Please select the corresponding number of the team the player plays for.");// has the user pick the teamt he player is playing on
System.out.println("1.Atlanta");
System.out.println("2.Boston");
System.out.println("3.Brookyln");
System.out.println("4.Charlotte");
System.out.println("5.Chicago");
System.out.println("6.Cleveland");
System.out.println("7.Dallas");
System.out.println("8.Denver");
System.out.println("9.Detroit");
System.out.println("10.Golden State");
System.out.println("11.Houston");
System.out.println("12.Indiana");
System.out.println("13.LA Clippers");
System.out.println("14.LA Lakers");
System.out.println("15.Memphis");
System.out.println("16.Miami");
System.out.println("17.Milwaukee");
System.out.println("18.Minnesota");
System.out.println("19.New Orleans");
System.out.println("20.New York");
System.out.println("21.Oklahoma City");
System.out.println("22.Orlando");
System.out.println("23.Philadelphia");
System.out.println("24.Phoenix");
System.out.println("25.Portland");
System.out.println("26.Sacramento");
System.out.println("27.San Antonio");
System.out.println("28.Toronto");
System.out.println("29.Utah");
System.out.println("30.Washington");
System.out.print("Which team does the player play for?");
x = Keyboard.nextInt();// takes the input from the user
if(x == 1)// if this team is selected it goes inside this if statement
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("0.Jeff Teague");
System.out.println("26.Kyle Korver");
System.out.println("5.DeMarre Carrol");
System.out.println("4.Paul Millsap");
System.out.println("15.Al Horford");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 0)// if this player is selected it will print out his statistics
{
System.out.println("PPG:16.9");
System.out.println("AST:7.5");
System.out.println("TO:2.7");
System.out.println("FG%:46.5");
System.out.println("FT%:86.8");
}
if(y == 26)// does this repeatedly throuhout the whole program
{
System.out.println("PPG:12.7");
System.out.println("AST:2.5");
System.out.println("TO:1.5");
System.out.println("FG%:50.3");
System.out.println("FT%:90.4");
}
if(y == 5)
{
System.out.println("PPG:11.8");
System.out.println("AST:1.5");
System.out.println("TO:0.9");
System.out.println("FG%:46.5");
System.out.println("FT%:71.7");
}
if(y == 4)
{
System.out.println("PPG:16.7");
System.out.println("AST:3.0");
System.out.println("TO:2.3");
System.out.println("FG%:47.5");
System.out.println("FT%:74.8");
}
if(y == 15)
{
System.out.println("PPG:15.4");
System.out.println("AST:3.3");
System.out.println("TO:1.3");
System.out.println("FG%:54.1");
System.out.println("FT%:77.4");
}
}
if(x == 2)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("36.Marcus Smart");
System.out.println("0.Avery Bradley");
System.out.println("11.Evan Turner");
System.out.println("30.Brandon Bass");
System.out.println("7.Jared Sulllinger");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 36)
{
System.out.println("PPG:7.0");
System.out.println("AST:3.5");
System.out.println("TO:1.4");
System.out.println("FG%:36.6");
System.out.println("FT%:63.8");
}
if(y == 0)
{
System.out.println("PPG:13.7");
System.out.println("AST:1.6");
System.out.println("TO:1.3");
System.out.println("FG%:43.3");
System.out.println("FT%:81.4");
}
if(y == 11)
{
System.out.println("PPG:8.7");
System.out.println("AST:4.7");
System.out.println("TO:2.4");
System.out.println("FG%:41.8");
System.out.println("FT%:76.7");
}
if(y == 30)
{
System.out.println("PPG:9.6");
System.out.println("AST:1.1");
System.out.println("TO:0.9");
System.out.println("FG%:47.2");
System.out.println("FT%:78.7");
}
if(y == 7)
{
System.out.println("PPG:14.4");
System.out.println("AST:2.4");
System.out.println("TO:1.4");
System.out.println("FG%:44.7");
System.out.println("FT%:74.8");
}
}
if(x == 3)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("0.Jarret Jack");
System.out.println("6.Alan Anderson");
System.out.println("7.Joe Johnson");
System.out.println("30.Thaddeus Young");
System.out.println("1.Mason Plumlee");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 0)
{
System.out.println("PPG:12.6");
System.out.println("AST:5.0");
System.out.println("TO:2.6");
System.out.println("FG%:45.1");
System.out.println("FT%:86.2");
}
if(y == 6)
{
System.out.println("PPG:6.7");
System.out.println("AST:1.1");
System.out.println("TO:0.8");
System.out.println("FG%:43");
System.out.println("FT%:78.9");
}
if(y == 7)
{
System.out.println("PPG:15.7");
System.out.println("AST:3.6");
System.out.println("TO:1.9");
System.out.println("FG%:43.7");
System.out.println("FT%:80.8");
}
if(y == 30)
{
System.out.println("PPG:8.0");
System.out.println("AST:1.0");
System.out.println("TO:0.0");
System.out.println("FG%:50");
System.out.println("FT%:0.0");
}
if(y == 1)
{
System.out.println("PPG:10.2");
System.out.println("AST:0.9");
System.out.println("TO:1.4");
System.out.println("FG%:58.9");
System.out.println("FT%:49.8");
}
}
if(x == 4)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("22.Brian Roberts");
System.out.println("9.Gerald Henderson");
System.out.println("14.Michael Kidd-Gilichrist");
System.out.println("40.Cody Zeller");
System.out.println("25.Al Jefferson");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 22)
{
System.out.println("PPG:7.1");
System.out.println("AST:2.4");
System.out.println("TO:0.8");
System.out.println("FG%:40.4");
System.out.println("FT%:90");
}
if(y == 9)
{
System.out.println("PPG:11.2");
System.out.println("AST:2.5");
System.out.println("TO:1.2");
System.out.println("FG%:43.5");
System.out.println("FT%:87.5");
}
if(y == 14)
{
System.out.println("PPG:10.2");
System.out.println("AST:1.6");
System.out.println("TO:1.1");
System.out.println("FG%:45.2");
System.out.println("FT%:67.3");
}
if(y == 40)
{
System.out.println("PPG:7.5");
System.out.println("AST:1.6");
System.out.println("TO:1.0");
System.out.println("FG%:45.2");
System.out.println("FT%:74.4");
}
if(y == 25)
{
System.out.println("PPG:17.3");
System.out.println("AST:1.8");
System.out.println("TO:1.0");
System.out.println("FG%:48.7");
System.out.println("FT%:67.8");
}
}
if(x == 5)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("1.Derrick Rose");
System.out.println("21.Jimmy Butler");
System.out.println("34.Mike Dunleavy");
System.out.println("13.Joakim Noah");
System.out.println("16.Paul Gasol");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 1)
{
System.out.println("PPG:18.7");
System.out.println("AST:5.0");
System.out.println("TO:3.3");
System.out.println("FG%:41.3");
System.out.println("FT%:81");
}
if(y == 21)
{
System.out.println("PPG:20.6");
System.out.println("AST:3.3");
System.out.println("TO:1.4");
System.out.println("FG%:46.2");
System.out.println("FT%:83.8");
}
if(y == 34)
{
System.out.println("PPG:9.1");
System.out.println("AST:1.7");
System.out.println("TO:0.8");
System.out.println("FG%:43.3");
System.out.println("FT%:76.6");
}
if(y == 13)
{
System.out.println("PPG:7.8");
System.out.println("AST:3.7");
System.out.println("TO:1.8");
System.out.println("FG%:44.1");
System.out.println("FT%:64.6");
}
if(y == 16)
{
System.out.println("PPG:18.3");
System.out.println("AST:2.9");
System.out.println("TO:2.1");
System.out.println("FG%:49.1");
System.out.println("FT%:81.3");
}
}
if(x == 6)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("2.Kyrie Irving");
System.out.println("5.JR. Smith");
System.out.println("23.LeBron James");
System.out.println("0.Kevin Love");
System.out.println("20.Timothy Mozgov");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 2)
{
System.out.println("PPG:21.8");
System.out.println("AST:5.4");
System.out.println("TO:2.3");
System.out.println("FG%:46.6");
System.out.println("FT%:84.5");
}
if(y == 5)
{
System.out.println("PPG:12.8");
System.out.println("AST:2.5");
System.out.println("TO:1.1");
System.out.println("FG%:41.4");
System.out.println("FT%:83.3");
}
if(y == 23)
{
System.out.println("PPG:26.0");
System.out.println("AST:7.3");
System.out.println("TO:4.2");
System.out.println("FG%:49.1");
System.out.println("FT%:73.3");
}
if(y == 0)
{
System.out.println("PPG:16.8");
System.out.println("AST:2.4");
System.out.println("TO:1.7");
System.out.println("FG%:42.9");
System.out.println("FT%:80.6");
}
if(y == 20)
{
System.out.println("PPG:10.6");
System.out.println("AST:0.7");
System.out.println("TO:1.2");
System.out.println("FG%:58.8");
System.out.println("FT%:66.1");
}
}
if(x == 7)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("9.Rajon Rondo");
System.out.println("11.Monta Ellis");
System.out.println("25.Chandler Parsons");
System.out.println("41.Dirk Nowitzmki");
System.out.println("6.Tyson Chandler");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 9)
{
System.out.println("PPG:9.2");
System.out.println("AST:6.3");
System.out.println("TO:2.9");
System.out.println("FG%:40.7");
System.out.println("FT%:28.0");
}
if(y == 11)
{
System.out.println("PPG:19.4");
System.out.println("AST:4.5");
System.out.println("TO:2.5");
System.out.println("FG%:44.9");
System.out.println("FT%:77.0");
}
if(y == 25)
{
System.out.println("PPG:15.4");
System.out.println("AST:2.4");
System.out.println("TO:1.4");
System.out.println("FG%:45.1");
System.out.println("FT%:73.5");
}
if(y == 41)
{
System.out.println("PPG:18.1");
System.out.println("AST:1.9");
System.out.println("TO:1.1");
System.out.println("FG%:46.5");
System.out.println("FT%:89.0");
}
if(y == 6)
{
System.out.println("PPG:10.7");
System.out.println("AST:1.2");
System.out.println("TO:1.4");
System.out.println("FG%:67.2");
System.out.println("FT%:73.6");
}
}
if(x == 8)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("3.Ty Lawson");
System.out.println("4.Randy Foye");
System.out.println("21.Wilson Chandler");
System.out.println("35.Kenneth Faried");
System.out.println("23.Jusuf Nurkic");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 3)
{
System.out.println("PPG:16.9");
System.out.println("AST:10.1");
System.out.println("TO:2.6");
System.out.println("FG%:44.7");
System.out.println("FT%:73.1");
}
if(y == 4)
{
System.out.println("PPG:5.5");
System.out.println("AST:1.6");
System.out.println("TO:1.0");
System.out.println("FG%:31.2");
System.out.println("FT%:81.5");
}
if(y == 21)
{
System.out.println("PPG:14.0");
System.out.println("AST:1.5");
System.out.println("TO:1.4");
System.out.println("FG%:41.9");
System.out.println("FT%:80.7");
}
if(y == 35)
{
System.out.println("PPG:11.7");
System.out.println("AST:1.2");
System.out.println("TO:1.6");
System.out.println("FG%:50.1");
System.out.println("FT%:67.8");
}
if(y == 23)
{
System.out.println("PPG:7.1");
System.out.println("AST:0.9");
System.out.println("TO:1.3");
System.out.println("FG%:44.9");
System.out.println("FT%:67.0");
}
}
if(x == 9)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("15.Reggie Jackson");
System.out.println("5.Kentavios Caldwell-Pope");
System.out.println("12.Tyshaun Prince");
System.out.println("10.Greg Monroe");
System.out.println("0.Andre Drummond");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 15)
{
System.out.println("PPG:12.8");
System.out.println("AST:4.3");
System.out.println("TO:1.8");
System.out.println("FG%:43.2");
System.out.println("FT%:86.1");
}
if(y == 5)
{
System.out.println("PPG:11.9");
System.out.println("AST:1.1");
System.out.println("TO:1.1");
System.out.println("FG%:39.7");
System.out.println("FT%:67.9");
}
if(y == 12)
{
System.out.println("PPG:8.4");
System.out.println("AST:2.0");
System.out.println("TO:0.4");
System.out.println("FG%:55.9");
System.out.println("FT%:83.3");
}
if(y == 10)
{
System.out.println("PPG:15.5");
System.out.println("AST:2.0");
System.out.println("TO:2.1");
System.out.println("FG%:49.5");
System.out.println("FT%:74.6");
}
if(y == 0)
{
System.out.println("PPG:12.7");
System.out.println("AST:0.6");
System.out.println("TO:1.5");
System.out.println("FG%:49.7");
System.out.println("FT%:40.1");
}
}
if(x == 10)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("30.Stephen Curry");
System.out.println("11.Klay Thompson");
System.out.println("40.Harrison Barnes");
System.out.println("23.Draymond Green");
System.out.println("12.Andrew Bogut");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 30)
{
System.out.println("PPG:23.6");
System.out.println("AST:7.9");
System.out.println("TO:3.1");
System.out.println("FG%:48.1");
System.out.println("FT%:90.1");
}
if(y == 11)
{
System.out.println("PPG:22.0");
System.out.println("AST:2.9");
System.out.println("TO:2.2");
System.out.println("FG%:47.0");
System.out.println("FT%:85.9");
}
if(y == 40)
{
System.out.println("PPG:10.4");
System.out.println("AST:1.4");
System.out.println("TO:0.8");
System.out.println("FG%:50.6");
System.out.println("FT%:72.4");
}
if(y == 23)
{
System.out.println("PPG:11.1");
System.out.println("AST:3,6");
System.out.println("TO:1.7");
System.out.println("FG%:43.1");
System.out.println("FT%:67.8");
}
if(y == 12)
{
System.out.println("PPG:6.5");
System.out.println("AST:2.8");
System.out.println("TO:1.7");
System.out.println("FG%:56.4");
System.out.println("FT%:55.9");
}
}
if(x == 11)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("2.Patrick Beverley");
System.out.println("13.James Harden");
System.out.println("1.Trevor Ariza");
System.out.println("20.Donatas Motiejunas");
System.out.println("8.Joey Dorsey");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 2)
{
System.out.println("PPG:10.5");
System.out.println("AST:3.4");
System.out.println("TO:1.4");
System.out.println("FG%:38.2");
System.out.println("FT%:72.5");
}
if(y == 13)
{
System.out.println("PPG:27.4");
System.out.println("AST:6,8");
System.out.println("TO:4.0");
System.out.println("FG%:45.4");
System.out.println("FT%:87.0");
}
if(y == 1)
{
System.out.println("PPG:12.7");
System.out.println("AST:2.4");
System.out.println("TO:1.6");
System.out.println("FG%:37.7");
System.out.println("FT%:86.6");
}
if(y == 20)
{
System.out.println("PPG:11.5");
System.out.println("AST:1.6");
System.out.println("TO:1.8");
System.out.println("FG%:51.6");
System.out.println("FT%:61.8");
}
if(y == 8)
{
System.out.println("PPG:2.2");
System.out.println("AST:0.3");
System.out.println("TO:0.6");
System.out.println("FG%:50.0");
System.out.println("FT%:29.5");
}
}
if(x == 12)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("3.George Hill");
System.out.println("2.Rodney Stuckey");
System.out.println("0.CJ Miles");
System.out.println("21.David West");
System.out.println("55.Roy Hibbert");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 3)
{
System.out.println("PPG:13.6");
System.out.println("AST:3.8");
System.out.println("TO:1.3");
System.out.println("FG%:45.6");
System.out.println("FT%:75.5");
}
if(y == 2)
{
System.out.println("PPG:12.0");
System.out.println("AST:3.0");
System.out.println("TO:1.6");
System.out.println("FG%:44.6");
System.out.println("FT%:83.3");
}
if(y == 0)
{
System.out.println("PPG:12.5");
System.out.println("AST:1.2");
System.out.println("TO:1.1");
System.out.println("FG%:37.5");
System.out.println("FT%:80.4");
}
if(y == 21)
{
System.out.println("PPG:13.0");
System.out.println("AST:3.5");
System.out.println("TO:2.0");
System.out.println("FG%:48.0");
System.out.println("FT%:80.5");
}
if(y == 55)
{
System.out.println("PPG:11.1");
System.out.println("AST:1.2");
System.out.println("TO:1.6");
System.out.println("FG%:45.6");
System.out.println("FT%:82.5");
}
}
if(x == 13)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("3.Chris Paul");
System.out.println("4.JJ Redick");
System.out.println("22.Matt Barnes");
System.out.println("10.Spencer Hawes");
System.out.println("6.Deandre Jordan");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 3)
{
System.out.println("PPG:17.8");
System.out.println("AST:9.8");
System.out.println("TO:2.2");
System.out.println("FG%:47.0");
System.out.println("FT%:86.9");
}
if(y == 4)
{
System.out.println("PPG:14.6");
System.out.println("AST:1.6");
System.out.println("TO:1.2");
System.out.println("FG%:46.8");
System.out.println("FT%:86.9");
}
if(y == 22)
{
System.out.println("PPG:9.8");
System.out.println("AST:1.4");
System.out.println("TO:1.1");
System.out.println("FG%:46.2");
System.out.println("FT%:79.7");
}
if(y == 10)
{
System.out.println("PPG:6.4");
System.out.println("AST:1.2");
System.out.println("TO:0.7");
System.out.println("FG%:43.0");
System.out.println("FT%:64.0");
}
if(y == 6)
{
System.out.println("PPG:11.0");
System.out.println("AST:0.6");
System.out.println("TO:1.2");
System.out.println("FG%:72.5");
System.out.println("FT%:40.8");
}
}
if(x == 14)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("6.Jordan Clarkson");
System.out.println("2.Wayne Ellington");
System.out.println("4.Ryan Kelly");
System.out.println("28.Tariq Black");
System.out.println("50.Robert Sacre");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 6)
{
System.out.println("PPG:7.8");
System.out.println("AST:1.8");
System.out.println("TO:0.9");
System.out.println("FG%:39.8");
System.out.println("FT%:81.6");
}
if(y == 2)
{
System.out.println("PPG:9.3");
System.out.println("AST:1.3");
System.out.println("TO:0.6");
System.out.println("FG%:44.2");
System.out.println("FT%:81.8");
}
if(y == 4)
{
System.out.println("PPG:4.9");
System.out.println("AST:8.8");
System.out.println("TO:0.7");
System.out.println("FG%:33.3");
System.out.println("FT%:81.8");
}
if(y == 28)
{
System.out.println("PPG:5.3");
System.out.println("AST:0.9");
System.out.println("TO:1.0");
System.out.println("FG%:57.4");
System.out.println("FT%:51.4");
}
if(y == 50)
{
System.out.println("PPG:4.5");
System.out.println("AST:0.8");
System.out.println("TO:0.5");
System.out.println("FG%:41.0");
System.out.println("FT%:63.8");
}
}
if(x == 15)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("11.Mike Conley");
System.out.println("5.Courtney Lee");
System.out.println("32.Jeff Green");
System.out.println("50.Zach Randolph");
System.out.println("33.Marc Gasol");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 11)
{
System.out.println("PPG:16.9");
System.out.println("AST:5.3");
System.out.println("TO:2.3");
System.out.println("FG%:45.5");
System.out.println("FT%:85.9");
}
if(y == 5)
{
System.out.println("PPG:10.7");
System.out.println("AST:2.1");
System.out.println("TO:1.0");
System.out.println("FG%:47.6");
System.out.println("FT%:84.9");
}
if(y == 32)
{
System.out.println("PPG:12.3");
System.out.println("AST:1.8");
System.out.println("TO:0.9");
System.out.println("FG%:39.3");
System.out.println("FT%:83.3");
}
if(y == 50)
{
System.out.println("PPG:16.8");
System.out.println("AST:1.8");
System.out.println("TO:2.1");
System.out.println("FG%:49.2");
System.out.println("FT%:75.6");
}
if(y == 33)
{
System.out.println("PPG:18.3");
System.out.println("AST:3.7");
System.out.println("TO:2.2");
System.out.println("FG%:49.1");
System.out.println("FT%:81.9");
}
}
if(x == 16)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("7.Goran Dragic");
System.out.println("3.Dwayne Wade");
System.out.println("9.Loul Deng");
System.out.println("1.Chris Bosh");
System.out.println("21.Hassan Whiteside");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 7)
{
System.out.println("PPG:16.2");
System.out.println("AST:4.1");
System.out.println("TO:2.2");
System.out.println("FG%:50.1");
System.out.println("FT%:74.6");
}
if(y == 3)
{
System.out.println("PPG:21.2");
System.out.println("AST:5.3");
System.out.println("TO:3.3");
System.out.println("FG%:48.6");
System.out.println("FT%:74.1");
}
if(y == 9)
{
System.out.println("PPG:14.3");
System.out.println("AST:2.0");
System.out.println("TO:1.7");
System.out.println("FG%:48.5");
System.out.println("FT%:75.1");
}
if(y == 1)
{
System.out.println("PPG:21.1");
System.out.println("AST:2.2");
System.out.println("TO:2.2");
System.out.println("FG%:46.0");
System.out.println("FT%:77.2");
}
if(y == 21)
{
System.out.println("PPG:10.1");
System.out.println("AST:0.2");
System.out.println("TO:1.2");
System.out.println("FG%:63.9");
System.out.println("FT%:55.2");
}
}
if(x == 17)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("5.Michael Carter-Williams");
System.out.println("34.Giannes Antetokounmpo");
System.out.println("22.Khris Middleton");
System.out.println("9.Jared Dudley");
System.out.println("27.Zaza Pachulia");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 5)
{
System.out.println("PPG:15.0");
System.out.println("AST:7.4");
System.out.println("TO:4.2");
System.out.println("FG%:38.0");
System.out.println("FT%:64.3");
}
if(y == 34)
{
System.out.println("PPG:12.0");
System.out.println("AST:2.5");
System.out.println("TO:2.0");
System.out.println("FG%:50.0");
System.out.println("FT%:73.8");
}
if(y == 22)
{
System.out.println("PPG:11.5");
System.out.println("AST:1.9");
System.out.println("TO:1.2");
System.out.println("FG%:47.2");
System.out.println("FT%:84.9");
}
if(y == 9)
{
System.out.println("PPG:8.2");
System.out.println("AST:1.7");
System.out.println("TO:0.7");
System.out.println("FG%:50.6");
System.out.println("FT%:70.2");
}
if(y == 27)
{
System.out.println("PPG:7.8");
System.out.println("AST:2.2");
System.out.println("TO:1.8");
System.out.println("FG%:43.7");
System.out.println("FT%:77.9");
}
}
if(x == 18)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("9.Ricky Rubio");
System.out.println("23.Kevin Martin");
System.out.println("22.Andrew Wiggins");
System.out.println("2.Kevin Garnett");
System.out.println("14.Nikola Pekovic");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 9)
{
System.out.println("PPG:10.7");
System.out.println("AST:8.4");
System.out.println("TO:3.3");
System.out.println("FG%:39.8");
System.out.println("FT%:77.4");
}
if(y == 23)
{
System.out.println("PPG:20.6");
System.out.println("AST:2.0");
System.out.println("TO:2.0");
System.out.println("FG%:45.6");
System.out.println("FT%:86.0");
}
if(y == 22)
{
System.out.println("PPG:15.3");
System.out.println("AST:1.9");
System.out.println("TO:2.0");
System.out.println("FG%:43.5");
System.out.println("FT%:73.9");
}
if(y == 2)
{
System.out.println("PPG:6.8");
System.out.println("AST:1.6");
System.out.println("TO:1.1");
System.out.println("FG%:45.5");
System.out.println("FT%:82.9");
}
if(y == 14)
{
System.out.println("PPG:13.6");
System.out.println("AST:1.0");
System.out.println("TO:1.4");
System.out.println("FG%:44.2");
System.out.println("FT%:84.3");
}
}
if(x == 19)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("1.Tyreke Evans");
System.out.println("10.Eric Gordon");
System.out.println("44.Dante Cunningham");
System.out.println("23.Anthony Davis");
System.out.println("3.Omer Asik");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 1)
{
System.out.println("PPG:16.8");
System.out.println("AST:6.2");
System.out.println("TO:2.9");
System.out.println("FG%:43.4");
System.out.println("FT%:69.0");
}
if(y == 10)
{
System.out.println("PPG:12.5");
System.out.println("AST:3.8");
System.out.println("TO:2.1");
System.out.println("FG%:42.3");
System.out.println("FT%:82.5");
}
if(y == 44)
{
System.out.println("PPG:4.9");
System.out.println("AST:0.7");
System.out.println("TO:0.5");
System.out.println("FG%:46.5");
System.out.println("FT%:65.0");
}
if(y == 23)
{
System.out.println("PPG:24.3");
System.out.println("AST:1.7");
System.out.println("TO:1.4");
System.out.println("FG%:45.7");
System.out.println("FT%:83.0");
}
if(y == 3)
{
System.out.println("PPG:7.0");
System.out.println("AST:0.9");
System.out.println("TO:1.2");
System.out.println("FG%:49.8");
System.out.println("FT%:57.8");
}
}
if(x == 20)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("3.Jose Calderon");
System.out.println("2.Langston Galloway");
System.out.println("17.Cleanthony Early");
System.out.println("21.Lou Amundson");
System.out.println("14.Jason Smith");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 3)
{
System.out.println("PPG:9.3");
System.out.println("AST:4.7");
System.out.println("TO:1.7");
System.out.println("FG%:42.6");
System.out.println("FT%:90.0");
}
if(y == 2)
{
System.out.println("PPG:11.6");
System.out.println("AST:3.1");
System.out.println("TO:1.0");
System.out.println("FG%:38.1");
System.out.println("FT%:75.7");
}
if(y == 17)
{
System.out.println("PPG:3.8");
System.out.println("AST:0.7");
System.out.println("TO:0.7");
System.out.println("FG%:33.7");
System.out.println("FT%:50.0");
}
if(y == 21)
{
System.out.println("PPG:5.9");
System.out.println("AST:1.7");
System.out.println("TO:0.9");
System.out.println("FG%:46.8");
System.out.println("FT%:38.1");
}
if(y == 14)
{
System.out.println("PPG:8.0");
System.out.println("AST:1.6");
System.out.println("TO:1.0");
System.out.println("FG%:44.7");
System.out.println("FT%:83.1");
}
}
if(x == 21)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("0.Russel Westbrook");
System.out.println("21.Andre Roberson");
System.out.println("35.Kevin Durant");
System.out.println("9.Serge Ibaka");
System.out.println("33.Mitch McGary");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 0)
{
System.out.println("PPG:26.0");
System.out.println("AST:7.7");
System.out.println("TO:3.8");
System.out.println("FG%:43.3");
System.out.println("FT%:83.7");
}
if(y == 21)
{
System.out.println("PPG:3.8");
System.out.println("AST:1.2");
System.out.println("TO:0.7");
System.out.println("FG%:45.5");
System.out.println("FT%:45.7");
}
if(y == 35)
{
System.out.println("PPG:25.4");
System.out.println("AST:4.1");
System.out.println("TO:2.7");
System.out.println("FG%:51.0");
System.out.println("FT%:85.4");
}
if(y == 9)
{
System.out.println("PPG:13.9");
System.out.println("AST:0.8");
System.out.println("TO:1.5");
System.out.println("FG%:46.3");
System.out.println("FT%:83.5");
}
if(y == 33)
{
System.out.println("PPG:7.2");
System.out.println("AST:0.0");
System.out.println("TO:1.2");
System.out.println("FG%:54.8");
System.out.println("FT%:64.3");
}
}
if(x == 22)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("4.Elfrid Payton");
System.out.println("5.Victor Oladipo");
System.out.println("0.Aaron Gordon");
System.out.println("12.Tobais Harris");
System.out.println("9.Nikola Vucevic");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 4)
{
System.out.println("PPG:7.9");
System.out.println("AST:5.8");
System.out.println("TO:2.4");
System.out.println("FG%:42.5");
System.out.println("FT%:54.5");
}
if(y == 5)
{
System.out.println("PPG:16.7");
System.out.println("AST:3.8");
System.out.println("TO:2.7");
System.out.println("FG%:44.8");
System.out.println("FT%:81.5");
}
if(y == 0)
{
System.out.println("PPG:5.7");
System.out.println("AST:0.6");
System.out.println("TO:1.0");
System.out.println("FG%:53.7");
System.out.println("FT%:66.7");
}
if(y == 12)
{
System.out.println("PPG:17.4");
System.out.println("AST:2.0");
System.out.println("TO:1.8");
System.out.println("FG%:46.5");
System.out.println("FT%:78.5");
}
if(y == 9)
{
System.out.println("PPG:19.6");
System.out.println("AST:1.9");
System.out.println("TO:2.0");
System.out.println("FG%:53.5");
System.out.println("FT%:77.6");
}
}
if(x == 23)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("0.Isaiah Canaan");
System.out.println("9.JaKarr Sampson");
System.out.println("33.Robert Covington");
System.out.println("12.Luc Richard Mbah a Moute");
System.out.println("4.Nerlens Noel");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 0)
{
System.out.println("PPG:6.2");
System.out.println("AST:1.2");
System.out.println("TO:0.9");
System.out.println("FG%:40.5");
System.out.println("FT%:77.2");
}
if(y == 9)
{
System.out.println("PPG:4.5");
System.out.println("AST:0.8");
System.out.println("TO:1.0");
System.out.println("FG%:45.7");
System.out.println("FT%:58.5");
}
if(y == 33)
{
System.out.println("PPG:13.1");
System.out.println("AST:1.5");
System.out.println("TO:1.7");
System.out.println("FG%:39.1");
System.out.println("FT%:84.0");
}
if(y == 12)
{
System.out.println("PPG:10.2");
System.out.println("AST:1.4");
System.out.println("TO:1.6");
System.out.println("FG%:41.9");
System.out.println("FT%:62.4");
}
if(y == 4)
{
System.out.println("PPG:8.3");
System.out.println("AST:1.6");
System.out.println("TO:1.9");
System.out.println("FG%:44.8");
System.out.println("FT%:55.9");
}
}
if(x == 24)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("2.Eric Bledsoe");
System.out.println("3.Brandon Knight");
System.out.println("17.PJ Tucker");
System.out.println("11.Markieff Morris");
System.out.println("21.Alex Len");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 2)
{
System.out.println("PPG:17.1");
System.out.println("AST:5.9");
System.out.println("TO:3.1");
System.out.println("FG%:44.9");
System.out.println("FT%:81.9");
}
if(y == 3)
{
System.out.println("PPG:17.8");
System.out.println("AST:5.4");
System.out.println("TO:3.2");
System.out.println("FG%:43.5");
System.out.println("FT%:88.1");
}
if(y == 17)
{
System.out.println("PPG:8.0");
System.out.println("AST:1.6");
System.out.println("TO:1.0");
System.out.println("FG%:44.3");
System.out.println("FT%:73.9");
}
if(y == 11)
{
System.out.println("PPG:15.4");
System.out.println("AST:2.0");
System.out.println("TO:2.0");
System.out.println("FG%:47.1");
System.out.println("FT%:77.7");
}
if(y == 21)
{
System.out.println("PPG:6.3");
System.out.println("AST:0.4");
System.out.println("TO:1.0");
System.out.println("FG%:54.9");
System.out.println("FT%:72.2");
}
}
if(x == 25)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("0.Damien Lillard");
System.out.println("2.Wesley Matthews");
System.out.println("88.Nicolas Batum");
System.out.println("12.Lamarcus Aldridge");
System.out.println("42.Robin Lopez");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 0)
{
System.out.println("PPG:21.4");
System.out.println("AST:6.2");
System.out.println("TO:2.6");
System.out.println("FG%:43.3");
System.out.println("FT%:86.2");
}
if(y == 2)
{
System.out.println("PPG:16.3");
System.out.println("AST:2.3");
System.out.println("TO:1.4");
System.out.println("FG%:45.3");
System.out.println("FT%:73.3");
}
if(y == 88)
{
System.out.println("PPG:8.9");
System.out.println("AST:4.6");
System.out.println("TO:1.8");
System.out.println("FG%:37.7");
System.out.println("FT%:83.8");
}
if(y == 12)
{
System.out.println("PPG:23.4");
System.out.println("AST:1.8");
System.out.println("TO:1.9");
System.out.println("FG%:46.0");
System.out.println("FT%:87.1");
}
if(y == 42)
{
System.out.println("PPG:9.8");
System.out.println("AST:1.1");
System.out.println("TO:1.4");
System.out.println("FG%:51.2");
System.out.println("FT%:76.9");
}
}
if(x == 26)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("7.Darren Collison");
System.out.println("23.Ben McLemore");
System.out.println("8.Rudy Gay");
System.out.println("34.Jason Thompson");
System.out.println("15.Demarcus Cousions");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 7)
{
System.out.println("PPG:16.1");
System.out.println("AST:5.6");
System.out.println("TO:2.5");
System.out.println("FG%:47.3");
System.out.println("FT%:78.8");
}
if(y == 23)
{
System.out.println("PPG:11.7");
System.out.println("AST:1.5");
System.out.println("TO:1.7");
System.out.println("FG%:43.9");
System.out.println("FT%:83.1");
}
if(y == 8)
{
System.out.println("PPG:20.1");
System.out.println("AST:3.9");
System.out.println("TO:2.6");
System.out.println("FG%:44.5");
System.out.println("FT%:86.9");
}
if(y == 34)
{
System.out.println("PPG:5.6");
System.out.println("AST:0.9");
System.out.println("TO:1.0");
System.out.println("FG%:47.2");
System.out.println("FT%:62.5");
}
if(y == 15)
{
System.out.println("PPG:23.9");
System.out.println("AST:3.3");
System.out.println("TO:4.5");
System.out.println("FG%:46.9");
System.out.println("FT%:80.0");
}
}
if(x == 27)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("9.Tony Parker");
System.out.println("14.Danny Green");
System.out.println("2.Kawhi Leonard");
System.out.println("15.Matt Bonner");
System.out.println("21.Tim Duncan");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 9)
{
System.out.println("PPG:14.3");
System.out.println("AST:5.0");
System.out.println("TO:2.4");
System.out.println("FG%:47.2");
System.out.println("FT%:81.9");
}
if(y == 14)
{
System.out.println("PPG:11.8");
System.out.println("AST:1.9");
System.out.println("TO:1.2");
System.out.println("FG%:42.4");
System.out.println("FT%:83.3");
}
if(y == 2)
{
System.out.println("PPG:15.0");
System.out.println("AST:2.5");
System.out.println("TO:1.6");
System.out.println("FG%:43.8");
System.out.println("FT%:79.1");
}
if(y == 15)
{
System.out.println("PPG:4.5");
System.out.println("AST:0.8");
System.out.println("TO:0.2");
System.out.println("FG%:39.1");
System.out.println("FT%:82.8");
}
if(y == 21)
{
System.out.println("PPG:14.6");
System.out.println("AST:2.9");
System.out.println("TO:1.9");
System.out.println("FG%:49.5");
System.out.println("FT%:72.7");
}
}
if(x == 28)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("7.Kyle Lowery");
System.out.println("21.Greivis Vasquez");
System.out.println("10.Demar DeRozan");
System.out.println("15.Amir Johnson");
System.out.println("17.Jonas Valanciunas");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 7)
{
System.out.println("PPG:18.5");
System.out.println("AST:7.2");
System.out.println("TO:2.5");
System.out.println("FG%:42.3");
System.out.println("FT%:80.2");
}
if(y == 21)
{
System.out.println("PPG:9.6");
System.out.println("AST:3.6");
System.out.println("TO:1.4");
System.out.println("FG%:40.6");
System.out.println("FT%:72.5");
}
if(y == 10)
{
System.out.println("PPG:18.4");
System.out.println("AST:3.2");
System.out.println("TO:2.1");
System.out.println("FG%:39.9");
System.out.println("FT%:80.2");
}
if(y == 15)
{
System.out.println("PPG:10.0");
System.out.println("AST:1.5");
System.out.println("TO:1.5");
System.out.println("FG%:59.5");
System.out.println("FT%:63.3");
}
if(y == 17)
{
System.out.println("PPG:12.0");
System.out.println("AST:0.4");
System.out.println("TO:1.3");
System.out.println("FG%:55.4");
System.out.println("FT%:80.6");
}
}
if(x == 29)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("11.Dante Exum");
System.out.println("2.Joe Ingles");
System.out.println("20.Gordan Hayward");
System.out.println("15.Derrick Favors");
System.out.println("27.Rudy Gobert");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 11)
{
System.out.println("PPG:4.7");
System.out.println("AST:2.3");
System.out.println("TO:1.2");
System.out.println("FG%:35.1");
System.out.println("FT%:62.1");
}
if(y == 2)
{
System.out.println("PPG:4.1");
System.out.println("AST:2.5");
System.out.println("TO:1.0");
System.out.println("FG%:39.7");
System.out.println("FT%:72.4");
}
if(y == 20)
{
System.out.println("PPG:19.7");
System.out.println("AST:4.3");
System.out.println("TO:2.7");
System.out.println("FG%:46.1");
System.out.println("FT%:80.4");
}
if(y == 15)
{
System.out.println("PPG:15.9");
System.out.println("AST:1.5");
System.out.println("TO:1.5");
System.out.println("FG%:53.8");
System.out.println("FT%:65.6");
}
if(y == 27)
{
System.out.println("PPG:6.8");
System.out.println("AST:1.1");
System.out.println("TO:1.1");
System.out.println("FG%:63.0");
System.out.println("FT%:61.2");
}
}
if(x == 30)
{
System.out.println("");
System.out.println("Please select the desired player's corresponding jersey number:");
System.out.println("2.John Wall");
System.out.println("3.Bradley Beal");
System.out.println("34.Paul Pierce");
System.out.println("42.Nene Hilario");
System.out.println("4.Marcin Gortat");
System.out.print("Which player?");
System.out.print("");
y = Keyboard.nextInt();
System.out.println("");
if(y == 2)
{
System.out.println("PPG:17.4");
System.out.println("AST:10.1");
System.out.println("TO:3.7");
System.out.println("FG%:46.1");
System.out.println("FT%:76.7");
}
if(y == 3)
{
System.out.println("PPG:15.0");
System.out.println("AST:3.0");
System.out.println("TO:2.0");
System.out.println("FG%:42.3");
System.out.println("FT%:81.1");
}
if(y == 34)
{
System.out.println("PPG:12.5");
System.out.println("AST:2.0");
System.out.println("TO:1.4");
System.out.println("FG%:44.8");
System.out.println("FT%:78.4");
}
if(y == 42)
{
System.out.println("PPG:11.5");
System.out.println("AST:2.0");
System.out.println("TO:1.7");
System.out.println("FG%:53.3");
System.out.println("FT%:61.2");
}
if(y == 4)
{
System.out.println("PPG:11.5");
System.out.println("AST:1.0");
System.out.println("TO:1.4");
System.out.println("FG%:53.7");
System.out.println("FT%:70.5");
}
}

System.out.println("Would you like to compare the player to another player?");
System.out.println("1 = Yes");
System.out.println("2 = No");
q = Keyboard.nextInt();
if(q == 1)
{
new ComparetoMethod().comparePlayer();//calls a method that compares the two players
}
if(q == 2)
{
System.out.println("Thank you for using the NBA Data Base!");
}
}
}