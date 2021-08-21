package unit_conversion;
import java.util.Scanner;
public class Conversions {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int c;
         do
         {
        	 System.out.println("press 1 to convert currencies");
        	 System.out.println("press 2 to convert weight");
        	 System.out.println("press 3 to convert height");
        	 System.out.println("press 4 to convert tempreture");
        	 int A=sc.nextInt();
        	 if(A==1)
        	 {
        		 System.out.println("Press 1 to convert from Dollar to Rupee");
 				System.out.println("Press 2 to convert from  Rupee  to  Dollar");
 				System.out.println("Press 3 to convert from  Pounds to  Rupee");
 				System.out.println("Press 4 to convert from  Rupee  to Pound");
 				System.out.println("Press 5 to convert from Malaysian Ringgit to Rupee");
 				System.out.println("Press 6 to convert from Rupee to Malaysian Ringgit");
 				System.out.println("Press 7 to convert from Japanese Yen to  Rupee");
 				System.out.println("Press 8 to convert from Rupee to Japanese Yen");
 				int b=sc.nextInt();
 				double d;
 				switch(b)
 				{
 				case 1:
 					System.out.println("Enter the amount of Dollars");
 					d=sc.nextDouble();
 					System.out.println(d+"Dollars converted to Rupees"+(d*74.274977));
 					break;
 				case 2:
 					System.out.println("Enter the amount of Rupees");
 					d=sc.nextDouble();
 					System.out.println("Rupees converted to Dollars"+(d*0.013464206));
 					break;
 				case 3:
 					System.out.println("Enter the amount of Pounds");
					d=sc.nextDouble();
					System.out.println(d+"Pounds converted to Rupees "+(d*102.60852));
					break;
				case 4:
					System.out.println("Enter the amount of Rupees");
					d=sc.nextDouble();
					System.out.println(d+"Rupees converted to Pounds "+(d*0.0097458583));
					break;
				case 5:
					System.out.println("Enter the amount of Malaysian Ringgit ");
					d=sc.nextDouble();
					System.out.println(d+"Malaysian Ringgit converted to Rupees "+(d*17.51));
					break;
				case 6:
					System.out.println("Enter the amount of Rupees");
					d=sc.nextDouble();
					System.out.println(d+"Rupees converted to Malaysian Ringgit"+d*0.057);
					break;
				case 7:
					System.out.println("Enter the amount of Japanese Yen");
					d=sc.nextDouble();
					System.out.println(d+"Jpanese Yen converted to Rupees"+(d*0.68));
					break;
				case 8:
				System.out.println("Enter the amount of rupees ");
				d=sc.nextDouble();
				System.out.println(d+"Rupees converted to Japanese Yen"+(d*1.48));
				break;
				default:
					System.out.println("Wrong choice");
 				}
 				
        	 }
        	 else if(A==2)
 			{
 				System.out.println("Press 1 to convert from Kilograms to Grams");
 				System.out.println("Press 2 to convert from Grams to Kilograms");
 				System.out.println("Press 3 to convert from Kilograms to Tons");
 				System.out.println("Press 4 to convert from Tons to Kilograms");
 				System.out.println("Press 5 to convert from Kilograms to lbs");
 				System.out.println("Press 6 to convert from lbs to Kilograms");
 				System.out.println("Press 7 to convert from Kilograms to Stone");
 				System.out.println("Press 8 to convert from Stone to Kilograms");
 				int b=sc.nextInt();
 				double d;
 				switch(b)
 				{
 				case 1:
					System.out.println("Enter the weight in Kilograms");
					d=sc.nextDouble();
					System.out.println(d+" Kilograms converted to Grams  "+(d*1000));
					break;
				case 2:
					System.out.println("Enter the weight in Grams");
					d=sc.nextDouble();
					System.out.println(d+" Grams converted to Kilograms"+(d*0.001));
					break;
				case 3:
					System.out.println("Enter the weight in Kilograms");
					d=sc.nextDouble();
					System.out.println(d+" Kilograms converted to Ton "+(d*0.001));
					break;
				case 4:
					System.out.println("Enter the weight in Tons");
					d=sc.nextDouble();
					System.out.println(d+"Tons converted to Kilograms"+(d*1000));
					break;
				case 5:
					System.out.println("Enter the weight in Kilograms");
					d=sc.nextDouble();
					System.out.println(d+" Kilograms converted to lbs "+(d*2.205));
					break;
				case 6:
					System.out.println("Enter the weight in lbs");
					d=sc.nextDouble();
					System.out.println(d+" lbs converted to Kilograms "+(d*0.453592));
					break;				
					case 7:
					System.out.println("Enter the weight in Kilograms");
					d=sc.nextDouble();
					System.out.println(d+" Kilograms converted to Stone "+(d*0.157473));
					break;
				case 8:
					System.out.println("Enter the weight in Stone");
					d=sc.nextDouble();
					System.out.println(d+" Stone converted to Kilograms  "+(d*6.35029));
					break;
				default:
					System.out.println("Wrong choice");
				}
			}
        	 else if(A==3)
 			{
 				System.out.println("Press 1 to convert from Metres to CentiMetres");
 				System.out.println("Press 2 to convert from  CentiMetres to Metres");
 				System.out.println("Press 3 to convert from Metres to Inches");
 				System.out.println("Press 4 to convert from Inches to Metres");
 				System.out.println("Press 5 to convert from Metres to Foot");
 				System.out.println("Press 6 to convert from Foot to Metres");
 				System.out.println("Press 7 to convert from Metres to Miles");
 				System.out.println("Press 8 to convert from Miles to Metres");;
 				int b=sc.nextInt();
 				double d;
 				switch(b)
 				{
 				case 1:
 					System.out.println("Enter the height in Metres");
 					d=sc.nextDouble();
 					System.out.println(d+" Metres converted to CentiMetres is "+(d*100));
 					break;
 				case 2:
 					System.out.println("Enter the height in Metres");
 					d=sc.nextDouble();
 					System.out.println(d+" CentiMetres equivalent Metres is "+(d*0.01));
 					break;
 				case 3:
 					System.out.println("Enter the height in Metres");
 					d=sc.nextDouble();
 					System.out.println(d+" Metres converted to Inches is "+(d*39.3701));
 					break;
 				case 4:
 					System.out.println("Enter the height in Inches");
 					d=sc.nextDouble();
 					System.out.println(d+" Inches converted to Metres is "+(d*0.0254));
 					break;
 				case 5:
 					System.out.println("Enter the height in Metres");
 					d=sc.nextDouble();
 					System.out.println(d+" Metres converted to Foot  "+(d*3.28084));
 					break;
 				case 6:
 					System.out.println("Enter the height in Foot");
 					d=sc.nextDouble();
 					System.out.println(d+" Foot converted to Metres is "+(d*0.3048));
 					break;
 				case 7:
 					System.out.println("Enter the height in Metres");
 					d=sc.nextDouble();
 					System.out.println(d+" Metres converted to Miles "+(d*0.000621371));
 					break;
 				case 8:
 					System.out.println("Enter the height in Miles");
 					d=sc.nextDouble();
 					System.out.println(d+"Miles converted to Metres is"+(d*1609.34));
 					break;
 				default:
 					System.out.println("Wrong choice");
 				}
 			}
        	 else if(A==4)
 			{
 				System.out.println("Press 1 to convert from Celsius to Fahrenheit");
 				System.out.println("Press 2 to convert from Fahrenheit to Celsius");
 				System.out.println("Press 3 to convert from Celsius to Kelvin");
 				System.out.println("Press 4 to convert from Kelvin to Celsius");
 				System.out.println("Press 5 to convert from Celsius to Rankine");
 				System.out.println("Press 6 to convert from Rankine to Celsius");
 				System.out.println("Press 7 to convert from Fahrenheit to Kelvin");
 				System.out.println("Press 8 to convert from Kelvin to Fahrenheit");
 				int b=sc.nextInt();
 				double d;
 				switch(b)
 				{
 				case 1:
 					System.out.println("Enter temperature in Celsius");
 					d=sc.nextDouble();
 					System.out.println(d+" Celsius converted to Fahrenheit"+((d*1.8)+32));
 					break;
 				case 2:
 					System.out.println("Enter temperature in Fahrenheit");
 					d=sc.nextDouble();
 					System.out.println(d+" Fahrenheit converted to Celsius"+((d-32)*(1.8)));
 					break;
 				case 3:
 					System.out.println("Enter temperature in Celsius");
 					d=sc.nextDouble();
 					System.out.println(d+" Celsius converted to Kelvin"+(d+273.15));
 					break;
 				case 4:
 					System.out.println("Enter temperature in Kelvin");
 					d=sc.nextDouble();
 					System.out.println(d+"Kelvin converted to Celsius"+(d-273.15));
 					break;
 				case 5:
 					System.out.println("Enter temperature in Celsius");
 					d=sc.nextDouble();
 					System.out.println(d+" Celsius converted to Rankine is "+((d*1.8)+491.67));
 					break;
 				case 6:
 					System.out.println("Enter temperature in Rankine");
 					d=sc.nextDouble();
 					System.out.println(d+" Rankine converted to Celsius"+((d-491.67)*0.56));
 					break;
 				case 7:
 					System.out.println("Enter temperature in Fahrenheit");
 					d=sc.nextDouble();
 					System.out.println(d+" Fahrenheit converted to Kelvin is "+(((d-32)*0.56)+273.15));
 					break;
 				case 8:
 					System.out.println("Enter temperature in Kelvin");
 					d=sc.nextDouble();
 					System.out.println(d+" Kelvin converted to Fahrenheit is "+(((d-273.15)*1.8)+32));
 					break;
 				default:
 					System.out.println("Wrong choice");
 				}
 			}
 			else
 			{
 				System.out.println("Wrong choice");
 			}
 			System.out.println("Press 1 to convert to any other form of units else press any number to terminate");
 			c=sc.nextInt();
 		}while(c==1);
	}
	}
         
