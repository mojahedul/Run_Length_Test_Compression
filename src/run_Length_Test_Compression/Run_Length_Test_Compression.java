package run_Length_Test_Compression;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Run_Length_Test_Compression {

	
	public static void main(String[] args) throws IOException
	{
		ArrayList<Integer> list_Number = new ArrayList<Integer>();
//		List <Integer> list = new ArrayList <Integer>(); 
		
		
		File file = new File("RLT_Input.txt"); 
		  
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		
		String a = br.readLine();
		
		String[] input = a.split("");
		
//		System.out.println(input[0]);
		System.out.println("Input from text file length = " + input.length);
		
		int i = 0;
		int input_Length = input.length;
		int counter = 1;
		String str_NumberOfChar = "";
		String str_CharNames = "";
		String temp = "";
		
		
		System.out.println("\n\tEncoding::");
		System.out.println("   ------------------");
		
		for( i = 0; i < input_Length; i++)
		{
			counter = 1;
			while( i < input_Length-2 && input[i].equals(input[i+1]) )
			{
				counter = counter + 1;
				i++;
			}
			
			if(i >= input_Length-2)
			{
				if( input[input_Length-1].equals(input[input_Length-2]) )
				{
					counter = counter + 1;
					break;
				}
				
				else
				{
					counter = 1;
					break;
				}
			}
			
			System.out.print(input[i]);
			System.out.print(counter);
			list_Number.add(counter);
			temp = temp + input[i];
			temp = temp + counter;
			str_CharNames = str_CharNames + input[i];
			str_NumberOfChar = str_NumberOfChar + counter;
			
		}
		
		System.out.print(input[i]);
		System.out.print(counter);
		list_Number.add(counter);
		temp = temp + input[i];
		temp = temp + counter;
		
		str_CharNames = str_CharNames + input[i];
		str_NumberOfChar = str_NumberOfChar + counter;
		
		System.out.println();
//		System.out.println(list_Number);
		
		
	
		
		//Decoding
		
		String[] array_StrCharNames = str_CharNames.split("");
//		System.out.println("line: 91 = " + str_CharNames);
//		System.out.println("line: 91 = " + str_NumberOfChar);
		int[] int_Array_NumberOfChar = new int[str_NumberOfChar.length()];
		
		String[] str_ArrayNumberOfChar = str_NumberOfChar.split("");
//		System.out.println("line: 96 = " + str_ArrayNumberOfChar[0]);
		
		
		i = 0;
		for( String t: str_ArrayNumberOfChar)
		{
			int_Array_NumberOfChar[i] = Integer.parseInt(t);
//			System.out.println("102: " + int_Array_NumberOfChar[0]);
			++i;
		}
		
		//int_Array_NumberOfChar
		//array_StrCharNames
		
//		for(int k = 0; k < int_Array_NumberOfChar.length; k++)
//		{
//			System.out.println("109: " + int_Array_NumberOfChar[k]);
//			System.out.println(array_StrCharNames[k]);
//		
//		}
		
//		str_CharNames = str_CharNames + input[i];
//		str_NumberOfChar = str_NumberOfChar + counter;
		
//		String[] decode_Output = temp.split("");
//		System.out.println("Output length = " + temp.length() );
		
		
		System.out.println("\n\n\tDecoding::");
		System.out.println("   -------------------");
		
		for( int j = 0; j < array_StrCharNames.length; j++)
		{
			for(int k = 0; k < int_Array_NumberOfChar[j]; k++)
			{
				System.out.print(array_StrCharNames[j] );
			}
		}
		
	} //End of main()
	
	
} //End of public class
